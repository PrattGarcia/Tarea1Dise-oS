package Aspectos;

public aspect AspectoCambiarColor {
	
	 pointcut cambiocolo() : call(* btn*(..) );
	    after() : cambiocolo() {
	    	System.out.println("Me funciona :0");
	    }
	    

}
