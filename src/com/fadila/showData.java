package com.fadila;

import java.util.ArrayList;
import java.util.Iterator;
public class showData {
    public static void main(String[] args) {

        // instantiation of the AddDataToArrayList class
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookDetails(); // Corrected method name
        for (Book showValue : mybooklist) {
            // invoking getter method to get data
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " " + showValue.getAuthor());
        }
    }
}
