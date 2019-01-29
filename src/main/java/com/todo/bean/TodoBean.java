package com.todo.bean;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.todo.dao.DAOGeneric;
import com.todo.entidades.Todo;

@ViewScoped
@ManagedBean(name = "todoBean")
public class TodoBean{
	private Todo todo = new Todo();
	private DAOGeneric<Todo> dao = new DAOGeneric<Todo>();
	private List<Todo> listTodo = new ArrayList<Todo>();
	public TodoBean() {
		
	}
	public void salvar() {
		dao.salvar(todo);
		
	}

	public Todo getTodo() {
		return todo;
	}

	public void setTodo(Todo todo) {
		this.todo = todo;
	}

	public DAOGeneric<Todo> getDao() {
		return dao;
	}

	public void setDao(DAOGeneric<Todo> dao) {
		this.dao = dao;
	}
	public List<Todo> getListTodo() {
		return listTodo;
	}
	public void carregarListaTodo() {
		listTodo= dao.getListEntity(Todo.class);
	}
	public void carregarListaTodoConcluido() {
		listTodo= dao.getListEntityStatusEnd(Todo.class);
	}
	public void carregarListaTodoAndamento() {
		listTodo= dao.getListEntityStatusActive(Todo.class);
	}
	public void deletarStatusConcluido() {
		dao.deleteStatusEnd(Todo.class);
	}
	public String remove() {
		dao.delete(todo);
		return "";
	}
	public void finalizarTodo(int id) {
		dao.changeStatusToTrue(Todo.class, id);
	}
	public void iniciarTodo(int id) {
		dao.changeStatusToFalse(Todo.class, id);
	}
}
