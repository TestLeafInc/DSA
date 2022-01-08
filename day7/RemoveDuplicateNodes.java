package day7;

import org.junit.Test;

import day7.OddLinkedList.Node;

public class RemoveDuplicateNodes {
	
	public class Node{

		int data;
		Node next;
		
		Node(){
			next = null;
		}

		Node(int key){
			this.data = key;
			next = null;
		}
	}
	
	public Node addNode(int data) {
		return new Node(data);
	}
	
	
	public void printNodes(Node node) {
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	

	
	@Test
	public void testDups() {
		
		Node head = addNode(2);
		head.next = addNode(4); 
		head.next.next = addNode(4);
		head.next.next.next = addNode(8);
		
		Node unique = removeDups(head);	
		printNodes(unique);
	}


	private Node removeDups(Node node) {
		if(node == null || node.next == null ) return node;
		Node prev = node;
		Node curr = node.next;
		while(curr != null) {
			if(prev.data == curr.data) prev.next = curr.next;
			else prev = curr;
			curr = curr.next;
		}
		return node;
	}
	
	
	
	
	
	
	
	
	

}
