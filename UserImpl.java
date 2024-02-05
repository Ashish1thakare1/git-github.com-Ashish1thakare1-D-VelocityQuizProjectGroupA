package com.velocity.quiz.group.a.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserImpl implements User {
	String name;
	String lName;
	String mobileNumber;
	String email;
	String uName;
	String pass;
	Scanner scanner = null;

	@Override
	public void getRegister() {
		scanner = new Scanner(System.in);
		System.out.println("enter name");
		name = scanner.next();
		System.out.println("enter lName");
		lName = scanner.next();
		System.out.println("enter mobile");
		mobileNumber = scanner.next();
		System.out.println("enter email");
		email = scanner.next();
		System.out.println("enter uName");
		uName = scanner.next();
		System.out.println("enter pass");
		pass = scanner.next();
		System.out.println("successfully Register...");
		System.out.println("Enter login  detail for quiz");
		System.out.println("********************************************************");
		System.out.println("Enter login details");
		getLogin(scanner.next(), scanner.next());

	}

	@Override
	public void getLogin(String userName, String password) {

		if (userName.contains(uName) && password.contains(pass)) {
			System.out.println("loginSuccessful");

		}

		System.out.println("wrong credential please try again");

		getDisplayListOfQue();

	}

	@Override
	public void getDisplayListOfQue() {
		

	}

	@Override
	public void storeQuizResult() {

	}

	@Override
	public void getQuizResult() {

	}

}
