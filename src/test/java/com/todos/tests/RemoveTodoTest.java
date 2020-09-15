package com.todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class RemoveTodoTest extends Setup {
	
	public RemoveTodoTest() throws IOException {
		super();	
	}
	
	TodoPage todoPage ; 
	
	@Test()
	public void iCanRemoveTodo() throws IOException {
		todoPage = new TodoPage();
		
	}	

}
