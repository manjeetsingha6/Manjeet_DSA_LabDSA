package com.greatlearning.service;
import java.util.Stack;

//Balance Bracket Service Class
public class BalanceBracketService {
    
	public boolean balancebracket(String bracketsExpression) {
	
		//Stack Variable
		Stack<Character> stack = new Stack<>();
		
		//Looping through the user  string
		for (int i = 0; i < bracketsExpression.length(); i++) {
			char currenbracket = bracketsExpression.charAt(i);
			
			//Checking for opening brackets to be entered into the stack
			if (currenbracket == '('|| currenbracket == '{' || currenbracket == '[') 
			{
				 stack.push(currenbracket);
				 continue;
			}
			
			//If no input brackets present
			if(stack.isEmpty()) {
				return false;
			}
			
			char bracketcheck;
			
			//Checking for closed brackets
			switch(currenbracket) {
			
			case ')':
				bracketcheck = stack.pop();
				if(bracketcheck =='[' || bracketcheck == '{' ) {
					return false;
					}
				break;
			
			case '}':
				bracketcheck = stack.pop();
				if(bracketcheck =='('|| bracketcheck == '[' ) {
					return false;
					}
				break;
				
			case ']':
				bracketcheck = stack.pop();
				if(bracketcheck =='('|| bracketcheck == '{' ) {
					return false;
					}
				break;
			}
		}
		
		//returning true if all the closed brackets have been popped out
		return(stack.isEmpty());
	}			
				
}
