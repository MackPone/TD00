package iterables;

import java.util.AbstractList;

public class MyAbstractList extends AbstractList<Integer> {
		public MyAbstractList(int debut ,int fin){
			for (int i = debut; i <= fin; i++) {
				this.add(i);
			}
		}

	@Override
	public Integer get(int index) {
		return null;
	}

	@Override
	public int size() {
		
		return 5;
	}

}
