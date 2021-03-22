package by.academy.homework.homework6.Task3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> list = new ArrayList<>();
		File folder = new File("src/by/academy/homework/homework6/Task3/users");

		if (!folder.exists()) {
			folder.mkdirs();
		}

		for (int i = 1; i < 12; i++) {
			list.add(new User("name" + i, "surname" + i, i));
		}

		for (User k : list) {
			File userData = new File(folder, k.getName() + "_" + k.getSurname());
			try (ObjectOutputStream ous = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(userData)))) {
				ous.writeObject(k);
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
	}

}
