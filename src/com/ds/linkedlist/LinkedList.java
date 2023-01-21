package com.ds.linkedlist;

class LinkedList {
	//Create a node
	Node head;
	
	static class Node{
		int value;
		Node next;
		
		Node(int data){
			value = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		// create all nodes with each value
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		//Connecting nodes
		linkedList.head.next = second;
		second.next = third;
		
		//iterating all conected nodes
		while(linkedList.head != null) {
			System.out.println(linkedList.head.value + " ");
			linkedList.head = linkedList.head.next;
		}
		
		

	}
}
