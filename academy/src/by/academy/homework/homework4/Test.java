package by.academy.homework.homework4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[][] arr = {{1,2,3,0,10,11},{4,5,6},{7,8,9}};
//		MyIterator<Integer> iter = new MyIterator<>(arr);
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//	}
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		MyArrayList<Integer> list = new MyArrayList<>();
		
		for (Integer k: arr) {
			list.add(k);
		}
		
		System.out.println(list.getLastElementIndex());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeByElment(10));
		System.out.println(list.removeByElment(5));
		System.out.println(list.getLast());
		System.err.println(list.get(9));
		System.err.println(list.get(10));
		int i = 0;
		while(list.get(i) != null) {
			System.out.println(list.get(i));
			i++;
		}
		
		
	}

}
