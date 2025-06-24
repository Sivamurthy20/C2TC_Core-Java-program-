package com.tnsif.day8.interfaces.nestedinterfaces;

public interface MyInterface {
	void calculateArea();
    interface MyInnerInterface {
       int  id = 1000000;
       void print();     
    }
}
