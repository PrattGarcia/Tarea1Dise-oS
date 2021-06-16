package Aspectos;

import observerimplementation.Observer1;
import observerimplementation.Subject;

public aspect AspectoObserver {
	pointcut runObserver() : call (* btnAMousePressed*(..) );
	after() : runObserver() {
		
		Subject sub = new Subject();
		System.out.println("Se ha cambiado el color a amarillo");
		
        new Observer1(sub);
        sub.setState("Se ha modificado la ventana");
        
	}
	
	pointcut runObserver2() : call (* btnRMousePressed*(..) );
	after() : runObserver2() {
		
		Subject sub = new Subject();
		System.out.println("Se ha cambiado el color a rojo");
		
		new Observer1(sub);
		sub.setState("Se ha modificado la ventana");
        
        
	}
	
	pointcut runObserver3() : call (* btnVMousePressed*(..) );
	after() : runObserver3() {
		
		Subject sub = new Subject();
		System.out.println("Se ha cambiado el color a verde");
		new Observer1(sub);
		sub.setState("Se ha modificado la ventana");
	}
	pointcut salida() : call(* jButton1*(..) );
	
    before() : salida() {
    	
    	Subject sub = new Subject();
    	System.out.println("Se ha salido del sistema!!");
    	new Observer1(sub);
    	sub.setState("Cerro ventana");
    	
    }
	
	/*
	 * pointcut cambiocolo() : call(* btn*(..) );
	    after() : cambiocolo() {
	    	System.out.println("Me funciona :0");
	    }
	    
	 */
}
