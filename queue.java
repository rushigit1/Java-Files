package com.java;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		
	Queue<Object> q = new LinkedList<Object>();
	
	q.offer("hello");
	q.offer("hi");
	q.offer(23);
	q.offer(23.22);
	System.out.println(q);
	
	System.out.println(q.element());
	System.out.println(q.poll());
    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q);
	}
}
