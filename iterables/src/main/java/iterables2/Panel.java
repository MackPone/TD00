package iterables2;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel {

	public static Iterator<Integer> panel(int debut, int fin) {
		return new MyIterator(debut, fin);
	}

	public static Iterator<Integer> panel1(final int debut, final int fin) {

		return new Iterator<Integer>() {
			int current = debut;
			int end = fin;

			public boolean hasNext() {

				return !(current > end);
			}

			public Integer next() {

				return current++;
			}

		};
	}

	public static List<Integer> panel2(final int debut, final int fin) {

		return new AbstractList<Integer>() {
			int start = debut;
			int end = fin;

			@Override
			public Integer get(int index) {
				if (start <= fin)
					return start++;
				else
					return null;
			}

			@Override
			public int size() {
				return fin - debut + 1;
			}
		};

	}

	public static void main(String[] args) {
		Iterator<Integer> it = panel(1, 5);
		// for(;it.hasNext();)
		// System.out.println(it.next());
		List<Integer> l = panel2(3, 6);

		for (int i : l) {
			System.out.println(i);
		}
	}

}
