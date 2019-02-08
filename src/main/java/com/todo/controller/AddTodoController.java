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
	public String addTodoFiltroTudo(@RequestParam("input_todo") String todo) {
		Todo t= new Todo();
		t.setDescricao(todo);
		TodoBean tb = new TodoBean();
		tb.setTodo(t);
		tb.salvar();
		return "template";
			
	}
	@RequestMapping(value = "/add-1")
	public String addTodoFiltroFinalizado(@RequestParam("input_todo") String todo) {
		Todo t= new Todo();
		t.setDescricao(todo);
		TodoBean tb = new TodoBean();
		tb.setTodo(t);
		tb.salvar();
		return  "template_finalizados";
	}
	@RequestMapping(value = "/add-2")
	public String addTodoFiltroAndamento(@RequestParam("input_todo") String todo) {
		Todo t= new Todo();
		t.setDescricao(todo);
		TodoBean tb = new TodoBean();
		tb.setTodo(t);
		tb.salvar();
		return "template_andamento";
	}
	@RequestMapping(value = "/finalizados")
	public String exibirFinalizados() {
	    return "template_finalizados";	
	}
	
	@RequestMapping(value = "/andamento")
	public String exibirAndamento() {
	    return "template_andamento";	
	}
	@RequestMapping(value = "/delete")
	public String deletarTodoFinalizados() {
		TodoBean tb = new TodoBean();
		tb.deletarStatusConcluido();
		return "template";
			
	}
	
	

}
