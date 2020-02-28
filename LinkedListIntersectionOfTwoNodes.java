package io.dowlath.datastructure.practice.linkedlist;
/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class LinkedListIntersectionOfTwoNodes {
    static ListNode head1,head2;
    static class ListNode{
    	int data;
    	ListNode next;
    	ListNode(int data){
    		this.data = data;
    	}
    }
    
    public static int interSection() {
    	int c1 = getNode(head1);
    	int c2 = getNode(head2);
    	int d = 0;
    	if( c1 > c2) {
    		d = c1 - c2;
    		return getInterSectionOfNode(d,head1,head2);
    	}
    	else {
    		d = c2 - c1;
    		return getInterSectionOfNode(d,head2,head1);
    	}
    }
    
    public static int getNode(ListNode node) {
    	int count = 0;
    	ListNode current = node;
    	while(current != null) {
    		count++;
    		current = current.next;
    	}
    	return count;
    }
    
    public static int getInterSectionOfNode(int c , ListNode first, ListNode second) {
    	ListNode current1 = first;
    	ListNode current2 = second;
    	for(int i=0;i<c;i++) {
    		if(current1 == null) {
    			return -1;
    		}
    		current1 = current1.next;
    	}
    	while(current1 != null && current2 != null) {
    		if( current1.data == current2.data) {
    			return current1.data;
    		}
    		current1 = current1.next;
    		current2 = current2.next;
    	}
    	return -1;
    }
    
    public static void main(String args[]) {
    	LinkedListIntersectionOfTwoNodes list = new LinkedListIntersectionOfTwoNodes();
    	list.head1 = new ListNode(10);
    	list.head1.next = new ListNode(15);
    	list.head1.next.next = new ListNode(20);
    	
    	list.head2 = new ListNode(5);
    	list.head2.next = new ListNode(15);
    	list.head2.next.next = new ListNode(20);
    	System.out.println("The InterSection of Node is .... : "+list.interSection());
    }
    
}
