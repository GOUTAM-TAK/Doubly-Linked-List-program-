package tester;

import java.util.Scanner;

import doubleLinkedList.DoubleLinkedList;

public class DoubleLinkedListTest {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			DoubleLinkedList doublyList = new DoubleLinkedList();

			while (!exit) {
				System.out.println("Choose any : \n" + "1)Add element at First in list\n"
						+ "2)Add element at given position\n" + "3)Add element at Last of list\n" + "4)Display list\n"
						+ "5)Is list empty\n" + "6)Replace element at given position\n" + "7)Delete first node\n"
						+ "8)Delete at Last\n"
						+ "9)Delete at given position\n"
						+ "10)Delete all\n" + "0)Exit");

				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter element to add");
						doublyList.addAtFirst(sc.nextInt());
						break;
					case 2:
						System.out.println("enter element and position where to be added");
						doublyList.addAtPosition(sc.nextInt(), sc.nextInt());
						break;
					case 3:
						System.out.println("enter element");
						doublyList.addAtLast(sc.nextInt());
						break;
					case 4:
						doublyList.display();
						break;
					case 5:
						System.out.println("Is list empty : " + doublyList.isEmpty());
						break;
					case 6:
						System.out.println("enter element and position where to be replace");
						System.out.println(
								"remove element is : " + doublyList.replaceNodeAtPosition(sc.nextInt(), sc.nextInt()));
						break;
					case 7:
						System.out.println("delete element is : " + doublyList.deleteFirst());
						break;
					case 8:
						System.out.println("delete element is : " + doublyList.deleteAtLast());
						break;
					case 9:
						System.out.println("enter position to be deleted");
						System.out.println(
								"delete at position ,element is : " + doublyList.deleteAtPosition(sc.nextInt()));
						break;
					case 10:
						doublyList.deleteAll();
						System.out.println("delete All ");
						break;
					case 0:
						System.out.println("Thank you!!");
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
