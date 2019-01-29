package com.todo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.todo.bean.TodoBean;
import com.todo.entidades.Todo;

import javax.persistence.*;

@Controller
public class AddTodoController {

	@RequestMapping(value = "/add")
	public String execute(@RequestParam("input_todo") String todo) {
		Todo t= new Todo();
		t.setDescricao(todo);
		TodoBean tb = new TodoBean();
		tb.setTodo(t);
		tb.salvar();
		return "template";
			
	}
	@RequestMapping(value = "/add-1")
	public String execute1(@RequestParam("input_todo") String todo) {
		Todo t= new Todo();
		t.setDescricao(todo);
		TodoBean tb = new TodoBean();
		tb.setTodo(t);
		tb.salvar();
		return  "template_finalizados";
	}
	@RequestMapping(value = "/add-2")
	public String execute2(@RequestParam("input_todo") String todo) {
		Todo t= new Todo();
		t.setDescricao(todo);
		TodoBean tb = new TodoBean();
		tb.setTodo(t);
		tb.salvar();
		return "template_andamento";
	}
	@RequestMapping(value = "/finalizados")
	public String execute_end() {
	    return "template_finalizados";	
	}
	
	@RequestMapping(value = "/andamento")
	public String execute_active() {
	    return "template_andamento";	
	}
	@RequestMapping(value = "/delete")
	public String execute_delete() {
		TodoBean tb = new TodoBean();
		tb.deletarStatusConcluido();
		return "template";
			
	}
	
	

}
