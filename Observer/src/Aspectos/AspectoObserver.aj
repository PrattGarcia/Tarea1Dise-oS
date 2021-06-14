package Aspectos;

import observerimplementation.Observer1;
import observerimplementation.Subject;

public aspect AspectoObserver {
	pointcut runObserver() : call (* btn*(..) );
	after() : runObserver() {
		//se puede poner como un print en el que muestre a qe color se cambio
		Subject sub = new Subject();
		System.out.println("Si funciona este");
        new Observer1(sub);
        sub.setState(10);
	}
	
	/*
	 * pointcut cambiocolo() : call(* btn*(..) );
	    after() : cambiocolo() {
	    	System.out.println("Me funciona :0");
	    }
	    
	 */
}
