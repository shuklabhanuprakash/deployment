package com.aps.test;

public class StackExchange {

	Object[] objArray;
	int topOfStack;

	public StackExchange(int size) {
		objArray = new Object[size];
		topOfStack = -1;
	}

	/**
	 * @param objArr
	 * @return
	 */
	public String push(Object objArr) {
		if (isFull()) {
			try {
				throw new Exception("STACK is Full");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			objArray[++topOfStack] = objArr;
		}

		return "Added";
	}

	public boolean isFull() {
		return topOfStack == (objArray.length -1);
	}

	public boolean isEmpty() {
		return topOfStack == -1;
	}

	public Object pop() {
		if (isEmpty()) {
			try {
				throw new Exception("STACK EMPTY");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Object currentObj = objArray[topOfStack];

		objArray[topOfStack--] = null;
		return currentObj;
	}

	public void printArray() {
		if (topOfStack > 0) {
			for (int i = 0; i <= topOfStack; i++) {
				System.out.print(objArray[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String arg[]) {
		StackExchange exchange = new StackExchange(12);
		System.out.println("GOING TO PUSH ARRAY");
		for (int i = 0; i < 10; i++) {
			exchange.push("A" + i);
		}
		System.out.println("GOING TO PRINT PUSHED ARRAY ");
		exchange.printArray();

		System.out.println("GOING TO POP ARRAY");
		System.out.println(exchange.topOfStack);
		for (int i = 0; i <= 9; i++) {
			System.out.print(exchange.pop() + "-Popped ");
		}
		System.out.println();
		System.out.println("GOING TO Print ARRAY");
		exchange.printArray();

	}
}
