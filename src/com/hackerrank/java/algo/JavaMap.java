package com.hackerrank.java.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	public static void main(String[] argh) {/*
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> map = new HashMap<>();
		try {
			for (int i = 0; i < n; i++) {
				String name = in.nextLine();
				int phone = in.nextInt();
				map.put(name, phone);
				in.nextLine();

			}
			while (in.hasNext()) {
				String s = in.nextLine();
				if (null != s && !s.isEmpty()) {

					if (map.containsKey(s)) {
						for (Entry<String, Integer> entry : map.entrySet()) {
							if (entry.getKey().equals(s)) {
								System.out.println(entry.getKey() + "=" + entry.getValue());
								break;
							}
						}
					} else {
						System.out.println("Not found");
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

	*/
		
	

	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	       Map<String, Integer> map = new HashMap<>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	          map.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	           try{
	            int temp = map.get(s);
	            System.out.println(s+"="+temp);
	         }catch(NullPointerException e){
	            System.out.println("Not found");
	         }    
	      }
	   
	
	
	
	
	
	}
}
