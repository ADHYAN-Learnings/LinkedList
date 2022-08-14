package org.adhyan.hackerrank.LinkedList;


public class LinkedList_Detect_A_cycle {

	static class Node {
		int data;
		Node next;
	}

	
	public static void main(String[] args) {
		Node head = null;
		boolean result = hasCycle(head);
	}


	private static boolean hasCycle(Node head) {
		
		if(head==null) return false;
		
		Node firstLoop = head;
		Node secondLoop = head.next;
		
		while(firstLoop!=secondLoop) {
			if(secondLoop == null || secondLoop.next==null) {
				return false;
			}
			firstLoop = firstLoop.next;
			secondLoop = secondLoop.next.next;
		}
		return true;
	}

}
