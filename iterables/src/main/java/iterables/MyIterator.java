package iterables;

import java.util.Iterator;

public class MyIterator implements Iterator <Integer> {
		public int current,fin;
		
	public MyIterator(int current,int fin) {
		this.current=current;
		this.fin=fin;
	}

	public boolean hasNext() {
		
		return !(current > fin);
	}

	public Integer next() {
		return current++;
		
	}

}
