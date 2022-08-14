package org.adhyan.hackerrank.LinkedList;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Reverse_A_Doubly_Linked_List {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

// class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts INTEGER_DOUBLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

 /**   public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here

    }

  } **/
public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
	
	DoublyLinkedListNode  previous = null;
	DoublyLinkedListNode  current = llist;
	DoublyLinkedListNode  nextList = llist;
	
	while(current!=null) {
		nextList = nextList.next;
		if(nextList!=null) {
			System.out.println(" nextList "+nextList.data);
		} else {
			System.out.println("Null");
		}
		
		current.next  = previous;
        if(current.next!=null) {
        	System.out.println("current.next " +current.next.data);
		} else {
			System.out.println("current.next = Null ");
		}
		previous = current;
        System.out.println(" previous =  "+previous!=null?previous.data:"Null");
		current = nextList;
        if(current!=null) {
        	 System.out.println("current = "+current.data);
		} else {
			 System.out.println("current = Null");
		}
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
	}
     return null;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            DoublyLinkedList llist = new DoublyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            DoublyLinkedListNode llist1 = reverse(llist.head);
            
            while(llist1!=null) {
            	System.out.println(llist1.data);
            	llist1 = llist1.next;
            }

       //     printDoublyLinkedList(llist1, " ", bufferedWriter);
       //     bufferedWriter.newLine();
        }

    //    bufferedWriter.close();

        scanner.close();
    }
}

