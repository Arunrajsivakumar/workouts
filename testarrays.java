package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class testarrays {

	public void arrays() {

		// TODO Auto-generated method stub
		int[] ar = { 0, 1, 2, 3, 4, 35, 40, 45, 50, 100, 150, 200, 400, 800, 1600, 1700, 1800, 1900, 2000 };
		for (int i = 0; i < ar.length; i++) {
			System.out.println("length  -" + i + " value " + ar[i]);
			System.out.println("--------------------");
			if (ar[i] % 2 == 0 && ar[i] != 0) {
				System.out.println("multiple by 2 - " + ar[i]);
				break;

			} else {
				System.out.println("not multiple by 2 - " + ar[i]);
			}
		}
		System.out.println("--------------------");

		System.out.println(ar.length);

	}

	public static void startArrays() {

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 15;
		System.out.println(arr[3]);

		int[] arr1 = { 0, 1, 2, 3, 4, 35, 40, 45, 50, 10 };
		System.out.println(arr1[5]);

	}

	public static void revarrays() {

		// TODO Auto-generated method stub
		int[] ar = { 0, 1, 2, 3, 4, 35, 40, 45, 50, 100, 150, 200, 400, 800, 1600, 1700, 1800, 1900, 2000 };
		for (int i = ar.length - 1; i >= 0; i--) {

			System.out.println("--------------------");
			if (ar[i] % 2 == 0 && ar[i] != 0) {
				System.out.println("multiple by 2 - " + ar[i]);

			} else {
				System.out.println("not multiple by 2 - " + ar[i]);
			}
		}
		System.out.println("--------------------");

		System.out.println(ar.length);

	}

	public static void listarr() {

		ArrayList<String> test = new ArrayList<String>();
		test.add("test");
		test.add("the");
		test.add("patience");
		// System.out.println(test.get(2));
//		for (int i = test.size()-1; i >= 0; i--) {
//			System.out.println(test.get(i));
//		}

		for (String value : test) {
			System.out.println(value);
		}

	}

	public static void list() {

		String[] names = { "arunraj", "satheeswaran", "tina", "sankar", "ks", "rk", "sk" };

		List<String> backendTeam = Arrays.asList(names);

		backendTeam.contains("arunraj");
	}

	public static void numrev() {

		// int[] a = { 0, 1, 2, 2, 25, 26, 30, 30, 45, 50, 65, 99, 99, 100 };

		int a[] = { 1, 3, 3, 4, 2, 1, 5, 6, 7, 7, 8, 10 };
		Arrays.sort(a);
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;
			}
		}
		a[j] = a[a.length - 1];
		for (int i = 0; i <= j; i++) {
			System.out.println(a[i]);
		}

	}

	public static void strrev() {

		String a = "em tset jarnura";
		char[] ch = a.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			// char c=a.charAt(i);//returns h

			System.out.print(ch[i]);
		}

	}

	public static void pattern1() {

		int stars = 5;

		for (int i = 0; i < stars; i++) {
			System.out.print("* ");
		}
		for (int j = 0; j < stars; j++) {
			System.out.println("#");
		}
	//	System.out.print("*");

	}

	public static void main(String[] args) {
		// startArrays();
		// revarrays();
		// listarr();
//		list();
//		numrev();
//		strrev();
		pattern1();

	}

}
