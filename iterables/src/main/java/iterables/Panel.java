package iterables;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Panel {


	public static Iterator<Integer> panel(int debut , int end) {
		return new MyIterator(debut,end);
		 	
	}
	
	public static Iterator<Integer> panel1(final int debut,final int end) {
		return new Iterator<Integer>(){
			int current = debut;
			int fin = end;
			public boolean hasNext() {
				
				return !(current > fin);
			}

			public Integer next() {
				return current++;
				
			}
		};
		
	}
	public static List<Integer> panel2(final int debut,final int fin) {
		return new AbstractList <Integer>() {
			int start = debut;
			int end = fin;
			@Override
			public Integer get(int index) {
				if(start<=end)
				return start++;
				else  return null;
			}

			@Override
			public int size() {
				return end-start;
			}
			
		};
		
	}
	public static void main(String[] args) {
		Iterator<Integer> it=panel(1,5);
	for(;it.hasNext();)
	System.out.println(it.next());
	System.out.println("***************************");
	//for(int i:panel2(1,5))
		//System.out.println(i);
	List<Integer> l = panel2(3,6);

	 for(int i:l) {
	 System.out.println(i);
	}

	}
}
