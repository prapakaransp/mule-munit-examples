package com.wml.test.customassertion;

import org.mule.munit.assertion.api.MunitAssertion;
import org.mule.munit.assertion.api.TypedValue;

public class HelloWorldAsser implements MunitAssertion{
	 @Override
	    public void execute(TypedValue expression, Object params) throws AssertionError { 
	        if (!"Hello World".equals(expression.getValue())) { 
	            throw new AssertionError("Error the payload is incorrect");
	        }
	     }

}
