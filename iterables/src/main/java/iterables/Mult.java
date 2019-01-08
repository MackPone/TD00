package iterables;

import java.awt.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class Mult {

	public Mult() {
		// TODO Auto-generated constructor stub
	}

	public static AbstractList<Integer> mult(final int m, final ArrayList<Integer> list) {
		return new AbstractList<Integer>(){

			@Override
			public Integer get(int arg0) {
				return get(list.get(arg0)*m);
			}

			@Override
			public int size() {
				return list.size();
			}
			
		};
	}

		public static void main(String[] args) {
			Mult multi = new Mult();
			final ArrayList list = new ArrayList<Integer>();
			list.add(3);
			list.add(4);
			list.add(5);
			final int i = 2;
			AbstractList<Integer> abs = multi.mult(i, list);
			Iterator it = abs.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}

	}
	


