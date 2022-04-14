package com.revature.arrayexercise;

import java.util.Arrays;

public class MyArrayList <T> {
	
	private Object [] internalArray; 
	private int lastIndex;
	
		public MyArrayList() {
			internalArray = new Object[10];
			lastIndex = 0;
		}
	
		public void add(T object) {
			if(lastIndex <= internalArray.length-1) {
				internalArray[lastIndex] = object;
				lastIndex++;
			}
			else {
				resize(object);
			}
			
		}
		
		public T get(int index) {
			return (T) internalArray[index];
		}
		
		private void resize(T object) {
			Object[] newarray = new Object[internalArray.length+1];
			
			for(int i = 0; i < internalArray.length; i++) {
				newarray[i] = internalArray[i];
			}
			lastIndex = internalArray.length;
			newarray[lastIndex] = object;
			lastIndex++;
			internalArray = newarray;
		}
		
		@Override
		public String toString() {
			String elementsInArrayList = "Elements: [";
			for(Object s : internalArray) {
				elementsInArrayList += s + ", ";
			}
			elementsInArrayList += "]";
			return elementsInArrayList;
		}
		
		
}
