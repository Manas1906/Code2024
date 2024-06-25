package constructor;

public class Rectangle {
	private long length;
	private long breadth;

	public Rectangle(long l, long b) {
		this.length = l;
		this.breadth = b;
	}
	
	public Rectangle(){
		
	}

	public long calculateArea(long length, long breadth) {
		return length * breadth;
	}

	public long calculatePerimeter(long length, long breadth) {
		return 2*(length+breadth);
	}
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		long a1 = rectangle1.calculateArea(4, 5);
		System.out.println(a1);
		long a2= rectangle1.calculatePerimeter(3, 4);
		System.out.println(a2);
		
		Rectangle rectangle2 = new Rectangle();
		
		long per1 = rectangle2.calculatePerimeter(5, 6);
		System.out.println(per1);
	}
}