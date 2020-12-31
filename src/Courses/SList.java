package Courses;

public class SList {
	private SListNode head;
	private int size;
	
	private class SListNode {
		public Object item;
		public SListNode next;
		
		public SListNode(Object item, SListNode n) {
			this.item = item;
			this.next = next;
		}
	}
	public SList() {
		this.head = null;
		this.size = 0;
	}
	public void insertFront(Object item) {
		this.head = new SListNode(item, head);
		size++;
	}
}
