package com.deepa.dp.iterator;

import java.util.ArrayList;

public class BrowseHistory {

	private ArrayList<String> urls = new ArrayList<String>();
	
	public void push(String url) {
		urls.add(url);
	}
	
	public String pop() {
		int lastIndex = urls.size()-1;
		return urls.remove(lastIndex);
	}
	
	public ArrayList<String> getUrls(){
		return urls;
	}
	
	public Iterator<String> createIterator(){
		return new ListIterator<String>(urls);
	}
	
	public class ListIterator<T> implements Iterator<T> {

		private ArrayList<T> objectsList;
		private int index;
		
		public ListIterator(ArrayList<T> objectList) {
			this.objectsList = objectList;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return objectsList.size() != index;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			++index;
		}

		@Override
		public T current() {
			// TODO Auto-generated method stub
			return objectsList.get(index);
		}
		
	}
	
}
