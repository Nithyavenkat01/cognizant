package com.cognizant.factory;

public class ExcelDocument implements Document{
    
    @Override
    public void open()
    {
        System.err.println("Excel document opened");
    }
}
