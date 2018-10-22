package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardArrayIterator<E> implements Iterator<E> {

	private E[] arr;    // the array to iterate over
	// other internal fields...
	private int current;
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr; 
		// initialize other internal fields as needed
		current=0;
	}
	
	public boolean hasNext() {
		// rewrite...
	
		return (current< arr.length&&current>=0);   
	}

	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new 
				NoSuchElementException("No more elements to iterate over."); 
		// rewrite
		E etr = arr[current];
		current++;
		
		return etr;
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove peration not implemented.");
		// do not implement
	}
}
