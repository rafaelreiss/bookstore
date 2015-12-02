package com.reis.controller;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.reis.beans.Book;
import com.reis.model.BookDAO;

//creates in the request scope
@Model
public class AdminBookBean {

	private Book book = new Book();
	
	@Inject
	private BookDAO dao;

	@Transactional
	public void save(){
		dao.save(book);
	}
	
	public Book getBook(){
		return book;
	}
}
