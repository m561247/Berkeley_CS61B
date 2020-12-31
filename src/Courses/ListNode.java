package Courses;

public class ListNode {
	public int item;
	public ListNode next;
	
	public ListNode(int item, ListNode next) {
		this.item = item;
		this.next = next;
	}
	
	public void insertAfter(int item) {
		this.next = new ListNode(item, next);
	}
	
	public static void main(String[] args) {
		ListNode L3 = new ListNode(6, null);
		ListNode L2 = new ListNode(0, L3);
		ListNode L1 = new ListNode(7, L2);
		L2.insertAfter(3);
		
		/*超級簡化版*/
//		ListNode L1 = new ListNode(7, new ListNode(0, new ListNode(6, null)));
		
	}
}
