package com.dao;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter your choise");
		int key = new Scanner(System.in).nextInt();
		switch (key) {
		case 1:
			System.out.println("enter id");
			Scanner scanner = new Scanner(System.in);
			int id = Integer.parseInt(scanner.nextLine());
			String name = scanner.nextLine();
			Emp emp = new Emp(id, name);
			EmpDao.insert(emp);

			break;
		case 2:
			System.out.println("Enter id");
			id = new Scanner(System.in).nextInt();
			System.out.println("Enter name");
			name = new Scanner(System.in).nextLine();
			System.out.println("enter updated id ..");
			int updatedid = new Scanner(System.in).nextInt();
			if (1 == EmpDao.update(id, name, updatedid)) {
				System.out.println("update seccussfully.....");
			} else {
				System.out.println("not update......");
			}
			break;
		case 3:
			List<Emp> emps = EmpDao.getall();
			for (Emp emp2 : emps) {
				System.out.println(emp2);
			}
			break;
		case 4:
			
			break;
		default:
			break;
		}

	}

}
