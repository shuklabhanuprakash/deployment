package geeksForGeeks;

public class RectangleOverLapping {

	public static void main(String[] args) {
	
		Point topLeft1 =new Point(1,3);
		Point bottomRight1 =new Point(4,0);
		Point topLeft2 =new Point(1,1);
		Point bottomRight2 =new Point(8,-4);
		
		Rectangle rectangle1 = new Rectangle(topLeft1, bottomRight1);

		Rectangle rectangle2 = new Rectangle(topLeft2, bottomRight2);
		
		if(isOverlap(rectangle1,rectangle2)) {
			System.out.println("OVERLAP");
		}else {
			System.out.println("NOT OVERLAP");
		}

	}

	private static boolean isOverlap(Rectangle rectangle1, Rectangle rectangle2) {
		
		if(rectangle1.topLeft.x > rectangle2.bottmRight.x || 
		   rectangle1.bottmRight.x < rectangle2.topLeft.x ||
		   rectangle1.topLeft.y < rectangle2.bottmRight.y ||
		   rectangle1.bottmRight.y > rectangle2.topLeft.y){
			   return false;
		   }
				
		
		return true;
	}

}

class Point {

	public int x;
	public int y;

	public Point(int x, int y) {
      this.x=x;
      this.y=y;
	}

}

class Rectangle {
	
	public Point topLeft;
	
	public Point bottmRight;
	
	public Rectangle(Point topLeft,Point bottmRight) {
		
		this.bottmRight=bottmRight;
		this.topLeft=topLeft;
		
		
	}
	
}
