package com.hackerrank.java.algo;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceBracketFinder {

	public static void main(String[] args) throws Exception {
	
		String s="()[{{(){}}}{}()]";
		
	System.out.println(isBalanced(s));
		 //String input=sc.next();
		 /*   while(s.length() != (s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
		    System.out.println(s.isEmpty());
		StackData<Character> stack=new StackData<Character>(s.length());*/
		
		//checkBracket(stack,s);
		
		
		
		
	}
	
	private static final Deque<Character> sQueue = new ArrayDeque<>();

	private static boolean isBalanced(String str) {
	        sQueue.clear();
	        int len = str.length();
	        boolean failed = false;
	        for (int ix = 0; !failed && ix < len; ++ix) {
	            char currChar = str.charAt(ix);
	            switch (currChar) {
	                case '(':
	                case '[':
	                case '{':
	                    sQueue.addFirst(currChar);
	                    break;
	                case ']':
	                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '[');
	                    break;
	                case ')':
	                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '(');
	                    break;
	                case '}':
	                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '{');
	                    break;
	                default:
	                    failed = true;
	                    break;
	            }
	        }
	        failed |= (sQueue.size() != 0);
	        return !failed;
	    }
	

	private static void checkBracket(StackData<Character> stack, String s) throws Exception {
		
		for(int i=0;i<s.length();i++){
			
			Character c=s.charAt(i);
			switch(c){
			
			case '[':
			case '{':
			case '(':
				
			case ')':
			case '}':
			case ']':
			{
				stack.push(c);
				Character pop = stack.peek();
				if(pop == ')'){
					reverseCheck(stack, i,'(',new Character[]{'{','['});
				}else if(pop == '}'){
					reverseCheck(stack, i,'{',new Character[]{'(','['});
				}else if(pop == ']'){
					reverseCheck(stack, i,'[',new Character[]{'(','{'});
				}
				
				
			}
			
				
			
			
			}
			
			
		}
		
		
	}

	/**
	 * @param stack
	 * @param i
	 * @param characters 
	 * @param c 
	 * @throws Exception
	 */
	private static void reverseCheck(StackData<Character> stack, int i, char c, Character[] characters) throws Exception {
		for(int k = i ;k >=0;k--){
			Character newPop=stack.search(k);
			if(newPop == c){return;}
			if(newPop ==characters[0] || newPop == characters[1]){
				throw new Exception("Illegle brackets for index"+i);
			}
		}
	}

}

class StackData<E>{
	
	Object[] objArray;
	int topOfStack ;
	public StackData(int length) {
		objArray=new Object[length];
		topOfStack=-1;
	}
	
	E push(E c) throws Exception{
		
		if(isFull()){throw new Exception("STACK is full");}
		return (E) (objArray[++topOfStack]=c);
	}
	E pop() throws Exception{
		
		if(isEmpty()){
			throw new Exception("STACK is empty");
			}
		return (E) objArray[topOfStack--];
	}
	
	Boolean isEmpty(){
		return objArray.length == 0 || topOfStack ==-1;
	}
	Boolean isFull(){
		return objArray.length - 1== topOfStack;
	}
	
	E peek(){
		return (E) objArray[topOfStack];
	}
	
	E search(int index){
		return (E) objArray[index];
	}
	
}
