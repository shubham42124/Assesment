package com.ac.service;

import com.ac.DAO.*;
import com.ac.bean.*;

public class BookServices {

	public int addBookSerice(int bookId,String bookTitle, float bookPrice) {
		String bookGrade = "";
		if(bookPrice <= 500)
		{
			bookGrade = "C";
		}
		else if(bookPrice <= 700)
		{
			bookGrade = "B";
		}
		else
		{
			bookGrade = "A";
		}
		
		
		BookDAO bDAO = new BookDAO();
		Book book = new Book();
		// wrappig fields into bean
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setBookPrice(bookId);
		book.setGrade(bookGrade);
		
		int updateResult = 0;
		try
		{
			updateResult = bDAO.addBook(book);
			return updateResult;
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
			
		
	}
	
}
