package fes.aragon;

public class ConjuntoEntero {
	
	private boolean[] conjunto = new boolean[101] ;
	
	public ConjuntoEntero(){
		for (int i = 0; i < conjunto.length; i++) {
			conjunto [i]= false;
		}
	}
	
	public ConjuntoEntero(int[] conjuntoB){
		for (int i = 0; i < conjuntoB.length; i++) {
			conjunto[conjuntoB[i]]=true;
		}
	}
	
	public ConjuntoEntero union(ConjuntoEntero conjuntoB){
		ConjuntoEntero conjuntoC = new ConjuntoEntero();
		for (int  i=0 ; i < conjunto.length; i++) {
			if (this.conjunto [i]==true||
				conjuntoB.conjunto[i]==true){
				conjuntoC.conjunto[i]=true;
				
			}
		}
		return conjuntoC;
	}
	
	public ConjuntoEntero interseccion(ConjuntoEntero conjuntoB){
		ConjuntoEntero conjuntoC = new ConjuntoEntero();
		for (int  i=0 ; i < conjunto.length; i++) {
			if (this.conjunto [i]==true &&
				conjuntoB.conjunto[i]==true){
				conjuntoC.conjunto[i]=true;
				
			}
		}
		return conjuntoC;
	}
	
	public void insertarElemento(int indice){
		this.conjunto[indice]=true;
		
	}
	
	public void eliminarElemento(int indice){
		this.conjunto[indice]=false;
	}
	
	public boolean esIgualA(ConjuntoEntero conjuntoB){
		boolean sonIguales=true;
		for (int i = 0; i < conjunto.length; i++) {
			if (this.conjunto[i]!=conjuntoB.conjunto[i]) {
				sonIguales=false;
				break;
			}
		}
		
		return sonIguales;
	}
	public void imprimirElementos(){
		System.out.print("{");
		for (int i = 0; i < conjunto.length; i++) {
			if (conjunto [i]){
				System.out.print(i + " ");	
			}
		}
		System.out.print("}");
		System.out.println();
	}
}
