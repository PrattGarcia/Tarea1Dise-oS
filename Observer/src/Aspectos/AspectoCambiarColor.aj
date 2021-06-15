package Aspectos;

import colores.Colores_botones;

public aspect AspectoCambiarColor {
	int cont=0;
	 pointcut cambiocolo() : call(* btn*(..) );
	    after() : cambiocolo() {
	    	
	    	//System.out.println("Se cambio de color la ventana");
	    	Colores_botones.eti.setText("Cambios de colores realizados: "+cont);
	    	cont+=1;
	    }
	    
	    

}
