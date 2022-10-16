package org.tnsindia.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Character>list=new PriorityQueue<>();
		list.add('z');
		list.add('a');
		list.add('s');
		list.add('p');
		System.out.println(list);
		list.poll();
		System.out.println(list);
		list.remove();
		list.poll();
		list.poll();
		list.poll();
		System.out.println(list);
		System.out.println(list.peek());


	}

}
