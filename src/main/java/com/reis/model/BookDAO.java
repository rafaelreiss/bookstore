package com.reis.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.reis.beans.Book;

public class BookDAO {
	
	//inject the EntityManager inside the container
	@PersistenceContext
	private EntityManager em;
	
	public BookDAO() {
	}
	
	public BookDAO(EntityManager em){
		super();
		this.em = em;
	}
	
	public void save(Book book){
		em.persist(book);
	}
}
