package shapesR;

import java.util.ArrayList;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public boolean isSameAS(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	@Override
	public boolean equals(Object o){
		if(!( o instanceof Point)) return false;
		else 
			return isSameAS((Point)o);
	}
	public void translate(int dx,int dy) {
		x += dx;
		y += dy;
	}



	public static void main(String[] args) {
		int compteur = 0;
		Point p = new Point(1, 2);
		Point p1 = new Point(p);
		System.out.println(p1);
		System.out.println(p);

		System.out.println("*******************");
		Point p2 = p;
		Point p3 = new Point(1, 2);

		System.out.println(p == p2);
		System.out.println(p == p3);
		System.out.println("*******************");
		System.out.println(p.isSameAS(p3));
		System.out.println("*******************");

		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
	}
}
