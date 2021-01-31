//ƒана строка:
//" Hey      There!     How      Are you doing"   ;
//оставить лишь 1 пробел между слов.

package by.academy.classwork.lesson6;

public class Task5 {

	public static void main(String[] args) {
		String text = " Hey      There!     How      Are you doing";
		System.out.println(text.replaceAll("\\s+", " ").trim());
		
		

	}

}
