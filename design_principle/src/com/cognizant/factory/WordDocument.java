
package com.cognizant.factory;

public class WordDocument implements Document{

    @Override
    public void open()
    {
        System.out.println("word document opened");
    }
}
