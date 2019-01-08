package shapesR;

import java.util.ArrayList;
import java.util.List;

public class LigneBrise {
	int NbPoints;
	int pointCapacity;
	Point [] ligne;
	
	public LigneBrise(int NbPoint) {
		this.NbPoints=NbPoint;
		ligne = new Point [NbPoint];
		pointCapacity = 0;
		for (int i = 0; i < NbPoint; i++) {
			this.add(new Point(i,i+1));
		}
	}
	public void add(Point p) {
		ligne[pointCapacity++] = p;
	}
	public boolean contains(Point p) {
		boolean trouve = false;
		for (Point point : ligne) {
			if (point.equals(point)) trouve = true;
		}
		return trouve;
	}

}
