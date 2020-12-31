package Courses;

/**
 * 滿陣列的作法
 * @param newItem
 * @param location
 */
public class ArrayBasedList {
	int[] a;
	int lastItem;
	public ArrayBasedList() {
		a = new int[10];
		lastItem = - 1;
	}
	
	public void insert(int newItem, int location) {
		for (int i = lastItem; i >= location; i--) {
			a[i + 1] = a[i];
		}
		a[location] = newItem;
		lastItem++;
	}
	
	
	
	public void insertItem(int newItem, int location) {
		int i;
		if (lastItem + 1 == a.length) {
			int[] b = new int[a.length * 2];
			for (i = 0; i < lastItem; i++) {
				b[i] = a[i];
			}
			a = b;
		}
		for (i = lastItem; i >= location; i--) {
			a[i + 1] = a[i];
		}
		a[location] = newItem;
		lastItem++;
	}

	public static void main(String[] args) {
		ArrayBasedList list = new ArrayBasedList();
		list.insert(5, 6);
		list.insert(10, 7);
		list.insert(12, 7);
		
	}

}
