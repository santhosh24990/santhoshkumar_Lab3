package com.abc.check;
import java.util.*;
import com.abc.driver.*;
public class Check {


	public boolean checkbrackets(String brackets) {
		Stack<Character> stackforchecking = new Stack<Character>();
		for(int i=0;i<brackets.length();i++)
		{
			char x= brackets.charAt(i);
			 if (x == '(' || x == '[' || x == '{') 
			 {
				 stackforchecking.push(x);
				 continue;
			 }
			if(stackforchecking.isEmpty())
				return false;
			
			switch(x)
			{
			case '}':
				char check = stackforchecking.pop();
				if(check==')' || check==']')
					return false;
				break;
			case ']':
				 check = stackforchecking.pop();
				if(check==')' || check=='}')
					return false;
				break;
			case ')':
				 check = stackforchecking.pop();
				if(check=='}' || check==']')
					return false;
				break;	
			 
		
	}}
		return (stackforchecking.isEmpty());
	
}}


