package lesson9;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import lesson10.DeleteaNode.SinglyLinkedListNode;

public class DeleteaNode {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    	
//    	if(head == null) {
//            return head;
//        }
//
//        if (position == 0) {
//            head = head.next;
//            return head;
//        }
//
//        SinglyLinkedListNode curr = head;
//        SinglyLinkedListNode prev = null;
//        int pos = 0;
//
//        while (curr != null) {
//            if (pos == position) {
//                prev.next = curr.next;
//                break;
//            }
//            pos++;
//            prev = curr;
//            curr = curr.next;
//        }
//
//        return head;
//    }
//   方法一	
    	if(head != null && position == 0)
            return head = head.next;
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode prev = null;
        int count = 0;
        while(count < position && curr.next != null){
            prev = curr;
            curr = curr.next;
            count++;
        }
        if(curr.next == null)
            prev.next = null;
        else{
            prev.next = curr.next;
        }
        return head;
    	
//        方法二；老师改后的最佳做法
//        int i = 0;
//   	 	SinglyLinkedListNode node=head;
//   	    if (head == null)
//   	        return null;
//   	    if (position == 0) {
//   	    	SinglyLinkedListNode old_head = head;
//   	    	head = old_head.next;
//   	    	old_head = null;
//   	    	return head;
//   	    }
//   	        
//   	    while (i < position - 1)
//   	    {
//   	        head = head.next;
//   	        i++;
//   	    }
//   	    head.next = (head.next).next;
//   	    return node;
        
//        方法三；小媛做法
//        int i = 0;
//   	 SinglyLinkedListNode node=head;
//   	    if (head == null)
//   	        return null;
//   	    if (position == 0)
//   	        return head.next;
//   	    while (i < position - 1)
//   	    {
//   	        head = head.next;
//   	        i++;
//   	    }
//   	    head.next = (head.next).next;
//   	    return node;
        
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printSinglyLinkedList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
