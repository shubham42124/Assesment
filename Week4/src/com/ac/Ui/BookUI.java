package com.ac.Ui;

import java.util.Scanner;

import com.ac.service.BookServices;

public class BookUI {
	public static void main(String args []) 
	{
		int bookId = 0;
		String bookTitle = "";
		float bookPrice = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book Id ");
		bookId =s.nextInt();
		System.out.println("Enter book Title");
		bookTitle = s.next();
		System.out.println("enter Book Price");
		bookPrice = s.nextFloat();
		BookServices  bookservice = new BookServices();
		
		int updateCount = bookservice.addBookSerice(bookId, bookTitle, bookPrice);
		
		System.out.println("inserted"+updateCount+"record Succesfully");
	}

}
