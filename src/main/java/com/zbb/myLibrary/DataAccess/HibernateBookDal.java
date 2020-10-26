package com.zbb.myLibrary.DataAccess;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zbb.myLibrary.Entities.Book;
@Repository
public class HibernateBookDal implements IBookDal
{
	private EntityManager entityManager;

	@Autowired
	public HibernateBookDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Book> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Book> books=session.createQuery("from Book",Book.class).getResultList();
		return books;
	}

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		
	}

}
