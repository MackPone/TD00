package iterables2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Mult {

	public Mult() {
		
	}
	public static List<Integer> mult(final List<Integer> list , final int m){
		return new AbstractList<Integer>(){
			
			@Override
			public int size() {
				
				return list.size();
			}

			@Override
			public Integer get(int index) {
				
				return list.get(index)*m;		
			}
		};
	}
	
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
		al.add(i);
		}
		System.out.print(mult(al,2));

	}

}
