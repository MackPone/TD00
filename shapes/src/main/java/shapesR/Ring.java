package shapesR;

public class Ring extends Circle{
	int rayon2;
	public Ring(Point p,int rayon,int rayon2){
		super(p,rayon);
		this.rayon2=rayon2;
	}
	public String toString() {
		return "Cercle de centre "+super.getCentre()+" et de rayon 1 : "+super.getRayon()+
				" et de rayon 2 : "+rayon2;
	}
	public boolean contains(Point p) {
		return super.contains(p) ;
		
	}
	public boolean contains (Point p,Ring...ring) {
		boolean trouve = false;
		for (Ring ring2 : ring) {
			if(ring2.contains(p)) trouve = true;
		}
		return trouve;
	}
	
	public static void main(String[] args) {
		Ring ring = new Ring(new Point(1,2),2,3);
		System.out.println(ring);
	}

}
