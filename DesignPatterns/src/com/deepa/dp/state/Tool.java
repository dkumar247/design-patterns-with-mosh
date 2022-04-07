package com.deepa.dp.state;

//Creating an interface here and not an abstract class because each tool does not have any common code which we need to define in the parent class.
public interface Tool {

	public void mouseDown();
	public void mouseUp();
	
}
