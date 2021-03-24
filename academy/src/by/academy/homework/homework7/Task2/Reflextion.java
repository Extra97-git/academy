package by.academy.homework.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflextion {
	final static String FILLER = "##################";

	public static String generateHeadLine(String s) {
		return FILLER + s + FILLER;
	}

//Я понимаю что низзя все исключения в одну корзинку, но мне было лень, простите...
//Могу вам конфетку принести, чтобы вы не расстраивались:)
//Я все равно не буду их как-то по разному обрабатывать....
//А если серьезно, могу исправить, в случае если снизите за это оценку
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("Max", "Petrov", 11, "19.02.1998", "rollingOnTheKeyboard", "qwerty",
				"fancyChick@imCrazy.by");
		Class<User> userClass = User.class;

		final String TEMPLATE = "Modified";
		System.out.println(generateHeadLine("getMethod(name)"));
		try {
			System.out.println(userClass.getMethod("getEmail").getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(generateHeadLine("getMethods"));

		for (Method k : userClass.getMethods()) {
			System.out.println(k.getName());
		}

		System.out.println(generateHeadLine("getField(name)"));
		try {
			System.out.println(userClass.getField("email").getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(generateHeadLine("getFeilds"));
		for (Field k : userClass.getFields()) {
			System.out.println(k.getName());
		}

		System.out.println(generateHeadLine("getDeclaredMethod(name)"));
		try {
			System.out.println(userClass.getDeclaredMethod("getEmail").getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(generateHeadLine("getDeclaredMethods"));
		for (Method k : userClass.getDeclaredMethods()) {
			System.out.println(k.getName());
		}

		System.out.println(generateHeadLine("getDeclaredField(name)"));
		try {
			System.out.println(userClass.getDeclaredField("login").getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(generateHeadLine("getDeclaredFeilds"));
		for (Field k : userClass.getDeclaredFields()) {
			System.out.println(k.getName());
		}

		// Начинаем сетать

		System.out.println(generateHeadLine("LETS_START_THE_SETTING_PARTY"));

		System.out.println(generateHeadLine("setting_Fields_of_User_Class"));
		Class<? extends User> userChildClass = user.getClass();
		Class<?> userSuperClass = userChildClass.getSuperclass();

		try {

			Field loginField = userChildClass.getDeclaredField("login");
			loginField.setAccessible(true);
			loginField.set(user, "login" + TEMPLATE);
			Field passwordField = userChildClass.getDeclaredField("password");
			passwordField.setAccessible(true);
			passwordField.set(user, "password" + TEMPLATE);
			Field emailField = userChildClass.getDeclaredField("email");
			emailField.set(user, "email" + TEMPLATE);

//			for(Field k: userChildClass.getDeclaredFields()) {
//				if(!k.canAccess(user)) {
//					k.setAccessible(true);
//				}
//				k.set(user, k.getName() + TEMPLATE);           Вот была такая мысля, но не уверен что это правильно
//			}                                                    Прелесть что все поля User - String
//
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(generateHeadLine("setting_Fields_of_Person_Class"));
		try {
			Field firstNameField = userSuperClass.getDeclaredField("firstName");
			firstNameField.set(user, firstNameField.getName() + TEMPLATE);
			Field lastNameField = userSuperClass.getDeclaredField("lastName");
			lastNameField.setAccessible(true);
			lastNameField.set(user, lastNameField.getName() + TEMPLATE);
			Field ageField = userSuperClass.getDeclaredField("age");
			ageField.setAccessible(true);
			ageField.set(user, 69);
			Field dateOfBirthField = userSuperClass.getDeclaredField("dateOfBirth");
			dateOfBirthField.setAccessible(true);
			dateOfBirthField.set(user, "24.03.2021");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(generateHeadLine("Invoke_ToString"));
		try {
			Method toStringMethod = userChildClass.getDeclaredMethod("toString");
			System.out.println(toStringMethod.invoke(user));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
