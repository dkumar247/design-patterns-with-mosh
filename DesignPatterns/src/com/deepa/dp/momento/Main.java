package com.deepa.dp.momento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var editor = new Editor();
		var history = new History();
		
		editor.setContent("A");
		history.push(editor.createState());
		
		editor.setContent("B");
		history.push(editor.createState());
		
		editor.setContent("C");
		editor.restoreState(history.pop());
		
		System.out.println(editor.getContent());
	}

}
