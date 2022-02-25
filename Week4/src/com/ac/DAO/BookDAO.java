package com.ac.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Book;

public class BookDAO {
	
	public int addBook(Book book) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = BookDB.getConnection();
			
			String ins_str = "insert into bookTable values(?,?,?,?)";
			
			pstmt = con.prepareStatement(ins_str);
			pstmt.setInt(1, book.getBookId());
			pstmt.setString(2, book.getBookTitle());
			pstmt.setFloat(3, book.getBookPrice());
			pstmt.setString(4, book.getGrade());
			
			int updateCount = pstmt.executeUpdate();
			
			con.close();
			return updateCount;
		}catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
			
	}

	public ArrayList getBookDetailsById(int bookId) throws Exception{
			Connection con =null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			con = BookDB.getConnection();
			
			String sel_str = "Select bookTitle,bookPrice from Book where bookId = ?";
			
			pstmt = con.prepareStatement(sel_str);
			pstmt.setInt(1, bookId);
			rs = pstmt.executeQuery();
			
			ArrayList result = new ArrayList();
			if(rs.next())
			{
				result.add(rs.getString(1));
				result.add(rs.getString(2));
			}
			else
			{
				result.add("Invalid id");
			}
			
			return null;
		}
		
		
	}
