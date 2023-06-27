package aulaCollections.ex;

import java.util.Collection;
import java.util.LinkedList;

public class ArrayListVsLinkedListPerformance {

	public static void main(String[] args) {

		
		Collection<Long> lista = new LinkedList<Long>();
		
		long inicio = System.currentTimeMillis();
		
		for(long i = 0; i <= 500000; i++ ) {
			lista.add(i);	
			}
		
		long fim = System.currentTimeMillis();
		
		long tempoGasto = fim- inicio;
		System.out.println(tempoGasto);
		
	}

}
