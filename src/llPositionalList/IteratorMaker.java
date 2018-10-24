package llPositionalList;

import java.util.Iterator;

import interfaces.PLIteratorMaker;
import interfaces.Position;
import interfaces.PositionalList;



public class IteratorMaker<E> implements  PLIteratorMaker <E>{

	//@Override
	//public Iterator <E> makeIterator(PositionList<E> pl) {
		// TODO Auto-generated method stub
	//	return pl.iterator();
	//}

	@Override
	public Iterator<Position<E>> makeIterator(PositionalList<E> pl) {
		// TODO Auto-generated method stub
		return (Iterator<Position<E>>) pl.iterator();
	}

	
}