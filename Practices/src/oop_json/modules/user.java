package oop_json.modules;

import org.json.JSONObject;
import java.util.Scanner;

public class user {
	private int id;
	private String name;
	private String email;
	private int age;
	private boolean gender;
	private String address;
	private double salary;

	public user(int id, String name, String email, int age, boolean gender, String address, double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.salary = salary;
	}

	public static user input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("id: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("name: ");
		String name = sc.nextLine();

		System.out.print("email: ");
		String email = sc.nextLine();

		System.out.print("age: ");
		int age = sc.nextInt();

		System.out.print("gender (nam: true/nữ: false): ");
		boolean gender = sc.nextBoolean();
		sc.nextLine();

		System.out.print("address: ");
		String address = sc.nextLine();

		System.out.print("salary: ");
		double salary = sc.nextDouble();
		
		if (!Double.isFinite(salary)) {
			salary = 0.0;
		}
		return new user(id, name, email, age, gender, address, salary);
	}

	public JSONObject UserJson() {
		JSONObject json = new JSONObject();
		json.put("id", id);
		json.put("name", name);
		json.put("email", email);
		json.put("age", age);
		json.put("gender", gender);
		json.put("address", address);
		json.put("salary", salary);

		return json;
	}
}