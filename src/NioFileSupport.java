/*import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class NioFileSupport {
	*//** change this as appropriate for your file system structure. *//*
	public static final String DIRECTORY_TO_WATCH = "D:/workspace-new/Release";

	public static final String RELEASE_DIR = "D:/workspace-new/Release";

	public static final String SHARED_LIB_BASE = "D:/Project/ADCB";

	public static final String COMMON_DEPLOY_DIR = "C:/Program Files (x86)/IBM/WebSphere/AppServer/profiles/AppSrv01/installedApps/PC778Node01Cell/CommonsServices.ear";

	public static final String PAYPRO_DEPLOY_DIR = "C:/Program Files (x86)/IBM/WebSphere/AppServer/profiles/AppSrv01/installedApps/PC778Node01Cell/PayProServices.ear";

	public static final String CASHPRO_SERVICE_API_DEPLOY_DIR = "C:/Program Files (x86)/IBM/WebSphere/AppServer/profiles/AppSrv01/installedApps/PC778Node01Cell/cashProServiceAPI.ear/cashProServiceAPI.war";

	public static void main(String[] args) throws Exception {
		// get the directory we want to watch, using the Paths singleton class
		Path toWatch = Paths.get(DIRECTORY_TO_WATCH);
		if (toWatch == null) {
			throw new UnsupportedOperationException("Directory not found");
		}

		// make a new watch service that we can register interest in
		// directories and files with.
		WatchService myWatcher = toWatch.getFileSystem().newWatchService();

		// start the file watcher thread below
		MyWatchQueueReader fileWatcher = new MyWatchQueueReader(myWatcher);
		Thread th = new Thread(fileWatcher, "FileWatcher");
		th.start();

		// register a file
		toWatch.register(myWatcher, ENTRY_CREATE, ENTRY_MODIFY);
		th.join();
	}

	*//**
	 * This Runnable is used to constantly attempt to take from the watch queue,
	 * and will receive all events that are registered with the fileWatcher it
	 * is associated. In this sample for simplicity we just output the kind of
	 * event and name of the file affected to standard out.
	 *//*
	private static class MyWatchQueueReader implements Runnable {

		*//** the watchService that is passed in from above *//*
		private WatchService myWatcher;

		public MyWatchQueueReader(WatchService myWatcher) {
			this.myWatcher = myWatcher;
		}

		*//**
		 * In order to implement a file watcher, we loop forever ensuring
		 * requesting to take the next item from the file watchers queue.
		 *//*
		@Override
		public void run() {
			try {
				// get the first event before looping
				WatchKey key = myWatcher.take();
				while (key != null) {
					// we have a polled event, now we traverse it and
					// receive all the states from it
					for (WatchEvent event : key.pollEvents()) {
						if (event.kind().toString()
								.equals(ENTRY_CREATE.toString())
								|| event.kind().toString()
										.equals(ENTRY_MODIFY.toString())) {
							if (event.context().toString()
									.equalsIgnoreCase("CommonsServices.ear")) {
								processCommonBuild();
							} else if (event.context().toString()
									.equalsIgnoreCase("PayProServices.ear")) {
								processPayproBuild();
							} else if (event.context().toString()
									.equalsIgnoreCase("iCashProService.jar")) {
								processCashProModelBuild();
							} else if (event.context().toString()
									.equalsIgnoreCase("cashProServiceAPI.war")) {
								processCashProServiceAPIBuild();
							}

						}
					}
					key.reset();
					key = myWatcher.take();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Stopping thread");
		}

		public void extractZip(String zipFile, String destFolder,
				String specificFile) throws IOException {
			ZipInputStream zis = null;
			try {
				zis = new ZipInputStream(new BufferedInputStream(
						new FileInputStream(zipFile)));
				ZipEntry entry = zis.getNextEntry();
				while (entry != null) {
					int count;
					byte data[] = new byte[4096];
					if (null == specificFile
							|| entry.getName().equalsIgnoreCase(specificFile)) {
						System.out.println("Extracting: " + entry.getName());
						if (entry.isDirectory()) {
							new File(destFolder + "/" + entry.getName())
									.mkdirs();
							zis.closeEntry();
							entry = zis.getNextEntry();
							continue;
						} else {
							int di = entry.getName().lastIndexOf('/');
							if (di != -1) {
								new File(destFolder + "/"
										+ entry.getName().substring(0, di))
										.mkdirs();
							}
						}
						BufferedOutputStream dest = new BufferedOutputStream(
								new FileOutputStream(destFolder + "/"
										+ entry.getName()));
						while ((count = zis.read(data)) != -1) {
							dest.write(data, 0, count);
						}
						dest.close();
					}
					zis.closeEntry();
					entry = zis.getNextEntry();
				}
			} finally {
				if (null != zis) {
					try {
						zis.close();
					} catch (Exception e) {

					}
				}
			}
		}

		private boolean processCommonBuild() {
			try {
				System.out
						.println(" ############## Deploying Common Service Start #################### ");
				extractZip(
						RELEASE_DIR + File.separator + "CommonsServices.ear",
						COMMON_DEPLOY_DIR, "commons-distribution.jar");
				System.out
						.println(" ############## Deploying Common Service End #################### ");

				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		private boolean processPayproBuild() {
			try {
				System.out
						.println(" ############## Deploying Paypro Service Start #################### ");
				extractZip(RELEASE_DIR + File.separator + "PayProServices.ear",
						PAYPRO_DEPLOY_DIR, "paypro-distribution.jar");
				System.out
						.println(" ############## Deploying Paypro Service End #################### ");
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		private boolean processCashProModelBuild() {
			try {
				System.out
						.println(" ############## Deploying iCashProService.jar Start #################### ");
				File sourceFile = new File(RELEASE_DIR + File.separator
						+ "iCashProService.jar");
				File destFile = new File(SHARED_LIB_BASE + File.separator
						+ "RestModelLib" + File.separator
						+ "iCashProService.jar");
				copyFile(sourceFile, destFile);
				System.out
						.println(" ############## Deploying iCashProService.jar End #################### ");
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		private boolean processCashProServiceAPIBuild() {
			try {
				System.out
						.println(" ############## Deploying cashProServiceAPI Start #################### ");

				extractZip(RELEASE_DIR + File.separator
						+ "cashProServiceAPI.war",
						CASHPRO_SERVICE_API_DEPLOY_DIR, null);
				System.out
						.println(" ############## Deploying cashProServiceAPI End #################### ");

				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		private void copyFile(File sourceFile, File destFile)
				throws IOException {

			InputStream inStream = null;
			OutputStream outStream = null;

			try {

				inStream = new FileInputStream(sourceFile);
				outStream = new FileOutputStream(destFile);

				byte[] buffer = new byte[1024];

				int length;
				// copy the file content in bytes
				while ((length = inStream.read(buffer)) > 0) {
					outStream.write(buffer, 0, length);
				}

				inStream.close();
				outStream.close();

				System.out.println("File is copied successful!");

			} finally {
				if (inStream != null) {
					inStream.close();
				}
				if (outStream != null) {
					outStream.close();
				}
			}
		}
	}
}*/