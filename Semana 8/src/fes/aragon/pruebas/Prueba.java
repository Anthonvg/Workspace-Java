package fes.aragon.pruebas;

import fes.aragon.ConjuntoEntero;

public class Prueba {

	public static void main(String[] args) {
		int[] conjuntoA={0,2};
		int[] conjuntoB={1,2};
		
		ConjuntoEntero a = new ConjuntoEntero(conjuntoA);
		ConjuntoEntero b = new ConjuntoEntero(conjuntoB);
		
		a.imprimirElementos();
		b.imprimirElementos();
		
		ConjuntoEntero c = a.union(b);
		c.imprimirElementos();
		c=a.interseccion(b);
		c.imprimirElementos();
		c.eliminarElemento(2);
		c.imprimirElementos();
	}

}
