package day7;

import org.junit.Test;

import day7.OddLinkedList.Node;

public class MergeLInkedLists {
	
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
	public void testMerge() {
		Node head1 = addNode(1);
		
		Node head2 = addNode(2);
		head2.next = addNode(4); 
		head2.next.next = addNode(6);
		head2.next.next.next = addNode(8);
		
		// Merge both linked list --> sorted linked list
		// Each Linked list is already sorted !! 
		
		Node merged = mergedLinkedList(head1, head2);
		printNodes(merged);
				
	}
	
	@Test
	public void testMerge1() {
		Node head1 = null;
		
		Node head2 = addNode(2);
		head2.next = addNode(4); 
		head2.next.next = addNode(6);
		head2.next.next.next = addNode(8);
		
		// Merge both linked list --> sorted linked list
		// Each Linked list is already sorted !! 
		
		Node merged = mergedLinkedList(head1, head2);
		printNodes(merged);
				
	}
	
	@Test
	public void testMerge2() {
		Node head1 = addNode(1);
		head1.next = addNode(3); 
		head1.next.next = addNode(5);
		head1.next.next.next = addNode(7);
		
		Node head2 = null ;
		
		// Merge both linked list --> sorted linked list
		// Each Linked list is already sorted !! 
		
		Node merged = mergedLinkedList(head1, head2);
		printNodes(merged);
				
	}
	
	@Test
	public void testMerge3() {
		Node head1 = null;
		
		Node head2 = null;
		
		// Merge both linked list --> sorted linked list
		// Each Linked list is already sorted !! 
		
		Node merged = mergedLinkedList(head1, head2);
		printNodes(merged);
				
	}

	private Node mergedLinkedList(Node node1, Node node2) {
		Node merged = new Node();
		Node curr = merged;
		while(node1 != null && node2 != null) {
			if(node1.data < node2.data) {
				curr.next = node1;
				node1 = node1.next;
			} else {
				curr.next = node2;
				node2 = node2.next;
			}
			curr = curr.next;
		}
		
		curr.next = node1 != null ? node1 : node2;
		return merged.next;
	}
	

	
	
	
	
	
	
	
	
	
	

}
