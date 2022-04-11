package com.deepa.dp.iterator;

public interface Iterator<T> {

	public boolean hasNext();
	
	public void next();
	
	public T current();
	
}
