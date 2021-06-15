package Aspectos;

public aspect AspectoCambiarColor {
	
	 pointcut cambiocolo() : call(* btn*(..) );
	    after() : cambiocolo() {
	    	System.out.println("Se cambio de color la ventana");
	    }
	    

}
