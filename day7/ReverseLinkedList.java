package day7;

import org.junit.Test;

public class ReverseLinkedList {
	
	@Test
	public void testReverse() {
		Node head = addNode(10);
		head.next = addNode(24); 
		head.next.next = addNode(33);
		head.next.next.next = addNode(40);
		printAllNodes(head);
		System.out.println("****************");
		Node tail = reverseNodes(head);
		printAllNodes(tail);
	}
	
	private void printAllNodes(Node node) {
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	private Node reverseNodes(Node node) {
		Node curr = node, prev = null, next = null; 
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public class Node{
		
		int data;
		Node next;
		//Node prev;
		
		Node(int key){
			this.data = key;
			next = null;
		}
	}
	public Node addNode(int data) {
		return new Node(data);
	}

}
