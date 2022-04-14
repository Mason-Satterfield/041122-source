package com.revature.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {
		
		static Queue<String> stringqueue;
		public static void show() {
			
			//have to specify what type of queue you are using
			stringqueue = new ArrayDeque<String>();
			
			//to add to a queue...
			stringqueue.offer("1.Mason");
			
			stringqueue.offer("2.Catie");
			
			//to look at the front of the queue, ie the next element
			System.out.println(stringqueue.peek());
			
			//to pull the next item remove it from the queue and return it
			String next = stringqueue.poll(); //poll is moving the queue forward
			System.out.println("Removed:" +next);
			System.out.println("The next item is: " +stringqueue.peek());
		}
}
