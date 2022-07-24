package com.abc.driver;

import com.abc.check.Check;

public class Main {

	public static void main(String[] args) {
		String brackets="( [ [ { } ] ] )";
		Check obj= new Check();
        if(obj.checkbrackets(brackets))
		{
			System.out.println("The entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}
