package Aspectos;

import colores.Colores_botones;

public aspect ConteoCambios {
	
	 pointcut cambiocolo() : call(* btn*(..) );
	 int cont=0;
	    after() : cambiocolo() {
	    	
	    	//System.out.println("Se cambio de color la ventana");
	    	Colores_botones.eti.setText("Cambios realizados: "+cont);
	    	cont+=1;
	    }
	    
	    
	    
	    

}
