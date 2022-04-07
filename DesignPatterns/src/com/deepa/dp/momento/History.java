package com.deepa.dp.momento;

import java.util.ArrayList;
import java.util.List;

public class History {

	private List<EditorState> listOfStates = new ArrayList<EditorState>();
	
	public void push(EditorState editorState) {
		listOfStates.add(editorState);
	}
	
	public EditorState pop() {
		int lastIndex = listOfStates.size()-1;
		return listOfStates.remove(lastIndex);
	}
	
}
