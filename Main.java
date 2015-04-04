package viajante;

/**
 * 
 * @author Eddy Cuizaguana Cerpa
 *
 */
public class Main {

	/**
	 * @param args
	 */
	// las matrices que estan comentadas son casos de pruebas, si se quiere probar 
	//se debe descomentar y comentar las restantes
	public static void main(String[] args) {
			int inf = Integer.MAX_VALUE;
			 int [][] ciudad = {/*{inf,4,1},
					 				{3,inf,4},
					 				{6,2,inf}*/
		 				
		/* {2,7},
		 {5,6}*/
					 
					 {inf,20,30,inf,11},
					 {15,inf,16,inf,2},
					 {3,5,inf,2,4},
					 {inf,6,18,inf,3},
					 {inf,4,7,16,inf}
					 
					 
					/*
					 {inf,20,30,10,11,7},
					 {15,inf,16,4,2,9},
					 {3,5,inf,2,4,6},
					 {19,6,18,inf,3,3},
					 {16,4,7,16,inf,2},
					 {16,4,7,16,9,inf}*/
					 
					 /*
					 {inf,20,30,10,11,7,15},
					 {15,inf,16,4,2,9,20},
					 {3,5,inf,2,4,6,78},
					 {19,6,18,inf,3,3,6},
					 {6,4,7,16,inf,2,3},
					 {16,44,73,16,9,inf,22},
					 {10,4,71,16,9,22,inf}*/
					/*
					 {inf,20,30,10,11,7,15,13},
					 {15,inf,16,4,2,9,20,23},
					 {3,5,inf,2,4,6,78,13},
					 {19,6,18,inf,3,3,6,16},
					 {6,4,7,16,inf,2,3,14},
					 {16,44,73,16,9,inf,22,13},
					 {1,4,71,16,9,22,inf,32},
					 {1,4,71,16,9,22,32,inf}*/
					 
					 
					 /*
					 {inf,20,30,10,11,7,15,78,15,1},
					 {15,inf,16,4,2,9,20,36,1,13},
					 {3,5,inf,2,4,6,78,2,6,14},
					 {19,6,18,inf,3,3,6,20,96,15},
					 {16,4,73,16,inf,2,3,13,23,16},
					 {36,4,7,11,9,inf,22,96,32,17},
					 {20,4,71,19,93,22,inf,36,20,18},
					 {1,44,76,16,9,22,3,inf,3,19},
					 {3,5,66,2,4,6,78,96,inf,20},
					 {6,23,6,27,42,61,8,69,30,inf}*/
					 /*
					 {inf,20,30,10,11,7,15,78,15,31,1},
					 {15,inf,16,4,2,9,20,36,1,13,28},
					 {3,5,inf,2,4,6,78,2,6,14,76},
					 {19,6,18,inf,3,2,6,20,96,15,13},
					 {16,4,73,16,inf,2,3,13,23,16,20},
					 {36,4,7,11,9,inf,22,96,32,17,63},
					 {20,4,71,19,93,22,inf,36,20,18,39},
					 {1,44,76,16,9,22,3,inf,3,19,96},
					 {3,5,66,2,4,6,78,96,inf,20,101},
					 {6,23,6,27,42,61,8,69,30,inf,102},
					 {6,23,6,27,42,61,8,6,30,36,inf}*/
					 
					 /*
					 {inf,20,30,10,11,7,15,78,15,31,16,1},
					 {15,inf,16,4,2,9,20,36,1,13,28,7},
					 {3,5,inf,2,4,6,78,2,6,14,76,67},
					 {19,6,18,inf,3,2,6,20,96,15,13,31},
					 {16,4,73,16,inf,2,3,13,23,16,20,18},
					 {36,4,7,11,9,inf,22,96,32,17,63,3},
					 {20,4,71,19,93,22,inf,36,20,18,39,63},
					 {1,44,76,16,9,22,3,inf,3,19,96,2},
					 {3,5,66,2,4,6,78,96,inf,20,inf,39},
					 {6,23,6,27,42,61,8,69,30,inf,102,31},
					 {6,23,6,27,42,61,8,68,30,36,inf,33},
					 {inf,23,6,27,42,61,8,6,30,36,66,inf}
		 				*/
		 				};
			 
	int n = ciudad.length ;
	
	long startTime;
	long endTime;

	
	//descomentar si se quiere probar, estimacion Ajustada
	
	
	System.out.println("--------------Estimacion Ajustada----------------");
	Vendedor vendedor2 = new Vendedor(ciudad,n,Estimacion.AJUSTADA); 
	startTime = System.currentTimeMillis();
	vendedor2.inciaVenta();
	endTime =System.currentTimeMillis();	
	System.out.println("Estimacion: " + Estimacion.AJUSTADA);
	System.out.println("Numero de ciudade: " + n);
	System.out.println("coste mejor " + vendedor2.getCosteMejor());
	System.out.println("Mejor solucion " + "( " +vendedor2.getSolMejor()+ " )");
	System.out.println("nodos expandidos " + vendedor2.getNodo());
	System.out.println("TIEMPO TRANSCURRIDO:_\t" + (endTime -startTime)+ "_ms\n");
	System.out.println("Coste del camino encontrado:" + vendedor2.costeDelCaminoEncontrado());

	
	// comentar si se quiere probar lo de arriba
	//estimacion muy ajustada
	
	System.out.println("--------------Estimacion muy ajustada----------------");
	Vendedor vendedor = new Vendedor(ciudad,n,Estimacion.MUYAJUSTADA);
	startTime = System.currentTimeMillis();
	
	vendedor.inciaVenta();
	endTime =System.currentTimeMillis();
	
	System.out.println("Estimacion: " + Estimacion.MUYAJUSTADA);
	System.out.println("coste mejor " + vendedor.getCosteMejor());
	System.out.println("Mejor solucion " + "( " +vendedor.getSolMejor()+ " )");
	System.out.println("nodos expandidos " + vendedor.getNodo());
	System.out.println("TIEMPO TRANSCURRIDO:_\t" + (endTime -startTime)+ "_ms\n");
	System.out.println("Coste del camino encontrado:" + vendedor.costeDelCaminoEncontrado());
	
	
	
}

}
