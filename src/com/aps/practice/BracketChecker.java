package com.aps.practice;

public class BracketChecker {

	public static void main(String[] args) throws Exception {
		String str = "[{}}";
		StackImpl impl = new StackImpl(str.length());
		
		
		
		for (int i = 0; i < str.length(); i++) {

			System.out.println("PUSHING " + str.charAt(i) + " at " + i
					+ " position.");
			//impl.push(str.charAt(i));
			System.out.println("POPPING " + str.charAt(i) + " at " + i
					+ " position.");
		//	impl.pop();

			char c = str.charAt(i);
			switch (c) {
			case '{':
			case '[':
			case '(':
				impl.push(c);

			case '}':
			case ']':
			case ')':
				if (!impl.isEmpty()) {
					char popped = impl.pop();
					if ((c == '}' && popped != '{')
							|| (c == ']' && popped != '[')
							|| (c == ')' && popped != '(')) {
						System.out.println("Error at " + i + " in " + c);
					}

				}
				break;
			default:
				break;
			}

		}

	}
}

class StackImpl {
	char[] arr;
	int topOfStack;

	public StackImpl(int size) {
		arr = new char[size];
		System.out.println(arr.length);
		topOfStack = -1;
	}

	void push(char obj) throws Exception {
		if (!isFull()) {
			arr[++topOfStack] = obj;
		} else {
			throw new Exception("Stack is Full");
		}
	}

	boolean isFull() {
		return topOfStack == arr.length-1;
	}

	boolean isEmpty() {
		return topOfStack == -1;
	}

	char pop() throws Exception {
		if (!isEmpty()) {
			return arr[topOfStack--];
		} else {
			throw new Exception("STACK in empty");
		}
	}

	char peek() {
		return arr[topOfStack];
	}
}
