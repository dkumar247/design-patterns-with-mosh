package com.deepa.dp.state;

public class Canvas {

//	ToolType currentTool;
	Tool currentTool;
	
	public void mouseDown() {
//		if(currentTool == ToolType.SELECTION) {
//			System.out.println("Selection icon");
//		}
//		else 
//			if(currentTool == ToolType.ERASER) {
//				System.out.println("Eraser icon");
//		}
//		else 
//			if(currentTool == ToolType.BRUSH) {
//				System.out.println("Brush icon");
//			}
		
		currentTool.mouseDown();
	}
	
	public void mouseUp() {
//		if(currentTool == ToolType.SELECTION) {
//			System.out.println("Draw a dotted rectangle");
//		}
//		else 
//			if(currentTool == ToolType.ERASER) {
//				System.out.println("Erase something");
//		}
//		else 
//			if(currentTool == ToolType.BRUSH) {
//				System.out.println("Draw a line");
//			}
		currentTool.mouseUp();
	}

	public Tool getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(Tool currentTool) {
		this.currentTool = currentTool;
	}
	
}
