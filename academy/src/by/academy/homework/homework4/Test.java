package by.academy.homework.homework4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		MyIterator<Integer> iter = new MyIterator<>(arr);
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
