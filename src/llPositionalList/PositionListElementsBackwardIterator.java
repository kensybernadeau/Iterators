package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class PositionListElementsBackwardIterator <E> extends LinkedPositionalList<E> implements Iterator<Position<E>> {

	
	private Position<E> current,recent; 
	private PositionalList<E> theList; 
	
	public PositionListElementsBackwardIterator(PositionalList<E> list) { 
		theList = list; 		 
		current = theList.last(); 
	    recent = null;  
	}
	
	public boolean hasNext() {
		return current != null;
	}

	public Position<E> next() throws NoSuchElementException {
		if (!hasNext()) 
			throw new NoSuchElementException("Iterator has past the end.");
		
		recent= current; 
		current= theList.before(current);					
		return recent;
	}

	public void remove() {
		// TODO Auto-generated method stub
		if (recent == null)
			throw new IllegalStateException("Invalid state to apply remove."); 
		theList.remove(recent); 
		recent = null; 
	}
}
