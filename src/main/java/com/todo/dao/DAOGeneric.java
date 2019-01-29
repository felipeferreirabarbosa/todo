package com.todo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.jpautil.JPAUtil;
import com.todo.entidades.Todo;

public class DAOGeneric<T> {
	public void salvar(T todo_) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(todo_);
		et.commit();
		em.close();

	}
	public void delete(T todo_) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(todo_);
		et.commit();
		em.close();

	}

	public List<T> getListEntity(Class<T> todo_) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		List<T> retorno = em.createQuery(" from " + todo_.getName()+" order by id").getResultList();
		et.begin();
		et.commit();
		em.close();
		return retorno;

	}
	public List<T> getListEntityStatusEnd(Class<T> todo_) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		List<T> retorno = em.createQuery(" from " + todo_.getName()+" where status=true"+" order by id").getResultList();
		et.begin();
		et.commit();
		em.close();
		return retorno;

	}
	public List<T> getListEntityStatusActive(Class<T> todo_) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		List<T> retorno = em.createQuery(" from " + todo_.getName()+" where status=false"+" order by id").getResultList();
		et.begin();
		et.commit();
		em.close();
		return retorno;

	}
	public void deleteStatusEnd(Class<T> todo_) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.createQuery("delete from " + todo_.getName()+" where status=true").executeUpdate();
		 
		et.commit();
		em.close();
		

	}
	public void changeStatusToTrue(Class<T> todo_, int id) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.createQuery("update " + todo_.getName()+" set status = true where id="+id +"").executeUpdate();
		et.commit();
		em.close();
		
	}
	public void changeStatusToFalse(Class<T> todo_, int id) {
		EntityManager em = JPAUtil.getEntityManeger();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.createQuery("update " + todo_.getName()+" set status = false where id="+id +"").executeUpdate();
		et.commit();
		em.close();
		
	}

}
