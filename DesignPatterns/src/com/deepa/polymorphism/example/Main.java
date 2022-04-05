package com.deepa.polymorphism.example;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drawUIControl(new TextBox());
		drawUIControl(new CheckBox());
		
	}

//	An object can take many forms as can be seen in this parameter
	public static void drawUIControl(UIControl uiControl) {
		uiControl.draw();
	}
	
}
