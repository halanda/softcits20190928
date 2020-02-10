package lesson9;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrintinReverse {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {

//    	if (head == null) {
//            return;
//        }
//
//        SinglyLinkedListNode tip = new SinglyLinkedListNode(-1);
//        tip.next = head;
//        while (head.next != null) {
//            SinglyLinkedListNode next = head.next;
//            head.next = next.next;
//            next.next = tip.next;
//            tip.next = next;
//        }
//
//        head = tip.next;
//        while (head != null) {
//            System.out.println(head.data);
//            head = head.next;
//        }
//    	方法一：
    	
    	if(head == null)
            return;
        ArrayList list = new ArrayList();
        while(head != null){
            list.add(head.data);
            head = head.next;
        }
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }        
//    	方法二：老师的方法
        List<SinglyLinkedListNode> list = new ArrayList<>();
        SinglyLinkedListNode node = head;
        while(node!=null) {
        	list.add(node);
        	node=node.next;
        }
        for(int i=list.size()-1;i>=0;i--)
        	System.out.println(list.get(i).data);
        
//        方法三：老师的第二种integer方法
        List<Integer> list = new ArrayList<>();
SinglyLinkedListNode node = head;
    	
    	while(node!=null) {
    		list.add(node.data);
    		node=node.next;
    	}
    	for(int i=list.size()-1;i>=0;i--)
    		System.out.println(list.get(i));
        
//    	方法四：使用“栈”来做
    	Stack<Integer> stack = new Stack<>();
SinglyLinkedListNode node = head;
    	
    	while(node!=null) {
    		stack.push(node.data);
    		node=node.next;
    	}
        
    	while(!stack.isEmpty()) {
    		System.out.println(stack.pop());
    	}
    	
//    	方法五：迭代
    	if(head.next != null) reversePrint(head.next);
    	System.out.println(head.data);
    	
//        ArrayList<SinglyLinkedListNode> list = new ArrayList<>();
//        list.add(head);
//        if (head == null) {
//            return;
//        }
//        SinglyLinkedListNode current = head.next;
//        list.add(current);
//        while(current.next != null) {
//            current = current.next;
//            list.add(current);
//        }
//        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.println(list.get(i).data);
//        }
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            reversePrint(llist.head);
        }

        scanner.close();
    }
}
