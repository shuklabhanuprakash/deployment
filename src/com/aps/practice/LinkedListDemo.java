/**
 *
 */
package com.aps.practice;

/**
 * @author bhanu.shukla
 *
 */
public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode node;
		ListNode head = null;
		node = new ListNode();
		node.setData(90);
		System.out.println("Going to add " + node.getData() + " at beginning");
		head = LinkedListDemo.addToBeginning(head, node);
		System.out.println("Traversing -----------");
		LinkedListDemo.traverseList(head);
		node = new ListNode();
		node.setData(50);
		System.out.println("Going to add " + node.getData() + " at beginning");
		head = LinkedListDemo.addToBeginning(head, node);
		System.out.println("Traversing -----------");
		LinkedListDemo.traverseList(head);
		node = new ListNode();
		node.setData(20);
		System.out.println("Going to add " + node.getData() + " at end");
		head = LinkedListDemo.addToEnd(head, node);
		System.out.println("Traversing -----------");
		LinkedListDemo.traverseList(head);

		node = new ListNode();
		node.setData(150);
		System.out.println("Going to add " + node.getData() + " at beginning");
		head = LinkedListDemo.addToBeginning(head, node);
		System.out.println("Traversing -----------");
		LinkedListDemo.traverseList(head);

		node = new ListNode();
		node.setData(22);
		int addBefore = 20;
		System.out.println("Going to add " + node.getData() + " before"
				+ addBefore);
		head = LinkedListDemo.addBefore(head, node, addBefore);
		System.out.println("Traversing -----------");
		LinkedListDemo.traverseList(head);

		node = new ListNode();
		node.setData(55);
		int addAfter = 150;
		System.out.println("Going to add " + node.getData() + " after"
				+ addAfter);
		head = LinkedListDemo.addAfter(head, node, addAfter);
		System.out.println("Traversing -----------");
		LinkedListDemo.traverseList(head);

	}

	public static void traverseList(ListNode head) {

		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public static ListNode addToBeginning(ListNode head, ListNode nodeToInsert) {
		if (head == null) {
			return nodeToInsert;
		} else {
			nodeToInsert.setNext(head);
			head = nodeToInsert;
			return nodeToInsert;
		}
	}

	public static ListNode addToEnd(ListNode head, ListNode nodeToInsert) {
		ListNode temp = head;
		if (head == null) {
			return nodeToInsert;
		} else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nodeToInsert);
			return head;
		}

	}

	public static ListNode addBefore(ListNode head, ListNode nodeToInsert,
			int insertBefore) {
		ListNode temp = head;
		ListNode prevNode = null;
		if (head == null) {
			return nodeToInsert;
		}
		while (temp != null && temp.getData() != insertBefore) {
			prevNode = temp;
			temp = temp.getNext();
		}
		if (temp == null) {
			System.out.println("DATA NOT FOUND");
			return head;
		}

		if (nodeToInsert.getData() == head.getData()) {
			nodeToInsert.setNext(head);
			head = nodeToInsert;
			return head;
		} else {
			prevNode.setNext(nodeToInsert);
			nodeToInsert.setNext(temp);
			return head;
		}
	}

	public static ListNode addAfter(ListNode head, ListNode nodeToinsert,
			int insertAfter) {
		ListNode temp = head;
		if (head == null) {
			return nodeToinsert;
		}
		while (temp != null && temp.getData() != insertAfter) {
			temp = temp.getNext();
		}
		if (temp == null) {
			System.out.println("DATA NOT FOUBND");
			return head;
		}
		if (temp.getNext() == null) {
			temp.setNext(nodeToinsert);
			return head;

		} else {
			nodeToinsert.setNext(temp.getNext());
			temp.setNext(nodeToinsert);
			return head;
		}

	}
}
