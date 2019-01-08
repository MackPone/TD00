package shapesR;

public class Circle {
	private Point centre;
	private int rayon;

	public Circle(Point p, int rayon) {
		this.centre=p;
		this.rayon=rayon;
	}
	public String toString(){
		
		return "Cercle de centre "+centre+" et de rayon "+rayon;
	}
	public void translate(int dx,int dy) {
		this.getCentre().translate(dx, dx);
	}
	public Point getCentre() {
		return centre;
	}
	public int getRayon() {
		return rayon;
	}
	public double surface() {
		return Math.pow(rayon,2)*Math.PI;
	}
	public boolean contains(Point p ) {
		int dx = this.getCentre().getX() - p.getX();
		int dy = this.getCentre().getY() - p.getY();
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy,2))== rayon;
		
	}
	public boolean contains(Point p,Circle...cicles) {
		boolean trouve = false;
		for (Circle circle : cicles) {
			if (circle.contains(p)) trouve = true;
		}
		return trouve;
		
	}
	public static void main(String[] args) {
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+"\t"+c2);
		System.out.println("*****************");
		c.getCentre().translate(1,1);
		System.out.println(c);
	}

}
