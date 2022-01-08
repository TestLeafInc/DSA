package day7;

import org.junit.Test;

public class OddLinkedList {

	@Test
	public void testOdd() {
		Node head = addNode(10);
		head.next = addNode(24); 
		head.next.next = addNode(33);
		head.next.next.next = addNode(40);
		printOddNodes(head);
	}

	private void printOddNodes(Node node) {
		while(node != null) {
			System.out.println(node.data);
			node = node.next.next;
		}
	}
	
	private void printOddValues(Node node) {
		while(node != null) {
			if(node.data %2 == 1)
				System.out.println(node.data);
			node = node.next;
		}
	}
	
	public class Node{

		int data;
		Node next;

		Node(int key){
			this.data = key;
			next = null;
		}
	}
	
	public Node addNode(int data) {
		return new Node(data);
	}

}
