//1. ����� � ������ �� ������ �������, �� � ������ ����� ����������. ����������
//����� �� ����������
package by.academy.classwork.lesson6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1 {

	public static void main(String[] args) {
		String text = "2. ������� ������ � �������! ���������� ���������� ���� � ������. ���������� "
				+ "������, ��� ����� ����� ����������� ����������� ���������, � ������ � ����� "
				+ "������ ����� ����� ���� �������, �� ����� � �������������?";
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
