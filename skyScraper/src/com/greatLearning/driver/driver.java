package com.greatLearning.driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class driver {
	public void getinputsAndPrintOrderOfConstruction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number floors in the building : ");
		int n = sc.nextInt();

		ArrayList<Integer> collect = new ArrayList<Integer>(n + 1);

		for (int i = 0; i <= n; i++) {

			collect.add(0);
		}

//Implementation and processing done using linked list 

		LinkedList<Integer> FloorList = new LinkedList<Integer>();

		for (int i = 1; i < n + 1; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int m = sc.nextInt();
			collect.set(m, i);
		}
		// adding all the floor sizes in a linked list
		FloorList.addAll(collect);
		// System.out.println("The new linked list is: " +collect);
		 
		 

		int j = n;
		boolean flag;
		System.out.println("The order of construction is as follows ");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			flag = false;
			System.out.println("Day :" + i);
			// processing floor size wise using linked list
			while (j >= 1 && FloorList.get(j) <= i) {
				flag = true;
				System.out.print(j + " ");
				j--;
			}
			if (flag == true) {
				System.out.println();

			} else {
				System.out.println();
			}
		}
	}

	}

