package com.todos.tests;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();	
	}
	
	Actions actions;
	TodoPage todoPage ; 
	
	@Test()
	public void iCanAddTodo() throws IOException, InterruptedException {
		
		todoPage = new TodoPage();
		boolean elementText = todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String elementTodo = todoPage.checkElementContains(TodoPage.element1);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo1")));
		boolean cheackBox = todoPage.isCheckBoxSelected(TodoPage.checkBox);
		Assert.assertTrue(cheackBox);
		
	}	
		
	

}
