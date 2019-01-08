package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Max{

	public static <E extends Comparable<E> > E myMax(E p ,E is) {
		if(p.compareTo(is) > 0)
		return p;
		else return is; 
	}
	private static void print (List<?> list) {
		for(Object o:list)
		System.out.print(o);
		}
	public static void length (List <? extends CharSequence> list ) {
		for (CharSequence charSequence : list) {
			System.out.println("Longueur de l'objet "+list.indexOf(charSequence)
					+" est : "+charSequence.length());
		}
	}
	public static List<Integer> listLength(List<?> list) {
		ArrayList<Integer> length=new ArrayList <Integer>();
		for(int i=0;i<list.size();i++) {
		CharSequence seq=(CharSequence)list.get(i);
		length.add(seq.length());
		}
		return length;

	}
	public static<T> List <T> fusion(List <? extends T> list1,List<? extends T> list2){
		if(list1.size() !=list2.size()) throw new IllegalArgumentException("must be"
				+"same size") ;
		if(list1.isEmpty()) return Collections.<T>emptyList();
		if(list2.isEmpty()) return Collections.<T>emptyList();
		List<T> listFusion = new ArrayList<T>();
		Iterator<? extends T> t1 = list1.iterator();
		Iterator<? extends T> t2 = list2.iterator();
		while(t1.hasNext()) {
			listFusion.add(t1.next());
			listFusion.add(t2.next());
		}
		
		return listFusion;
	}
	public static <E> List<E> swap(List<E> list ,int i,int j){
		E o = list.get(i); 
		list.set(i,list.get(j));
		list.set(j,o);
		return list;
	}
	public static <E> List<E> melanger(List<E> list){
		Random rdm = new Random();
		Collections.shuffle(list);
		return list;
	}
	public static void main(String[] args) {
		System.out.println(myMax(42,1664)); //1664
		System.out.println(myMax(2014,86)); //2014
		System.out.println(myMax(8.6,16.64)); //16.64
		System.out.println(myMax("baa","aba")); //aba
		//System.out.println(myMax(8.6,"aba")); // ko !
		List<String> list=Arrays.asList("Makhlouf","Mohammedi");
		print(list);
		length(list);
		System.out.println("*******************************");
		List<String> l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
		System.out.println("*******************************");
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		print(r2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		print(r4);
		List<Integer> l5 = Arrays.asList(10,20,10,20,2,3);
		System.out.println(swap(l5,0,3));
		System.out.println(melanger(l5));

	}

}
