package iterables2;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer>{
	public int current,next;
	public MyIterator(int current , int next) {
		this.current = current;
		this.next= next;
	}
	public boolean hasNext() {
		return !(current>next);
		
	}
	public Integer next() {
		return current++;
	}

}
