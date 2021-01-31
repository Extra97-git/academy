//1. Ќайти в строке не только зап€тые, но и другие знаки препинани€. ѕодсчитать
//общее их количество
package by.academy.classwork.lesson6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1 {

	public static void main(String[] args) {
		String text = "2. »меетс€ строка с текстом! ѕодсчитать количество слов в тексте. ∆елательно "
				+ "учесть, что слова могут раздел€тьс€ несколькими пробелами, в начале и конце "
				+ "текста также могут быть пробелы, но могут и отсутствовать?";
		String regex = "[\\.,!&;]";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);

		int counter = 0;
		while (m.find()) {
			counter++;
			System.out.println(text.substring(m.start(), m.end()));
		}
		System.out.println();
		System.out.println(counter);

	}

}
