package fes.aragon;

public class Operaciones {
	public Fraccion racionalUno;
	public Fraccion racionalDos;
	private Fraccion resultado;
	
	public Operaciones(){
		this.racionalUno = new Fraccion();
		this.racionalDos = new Fraccion();
		this.resultado = new Fraccion();
		
	}
	
	public Operaciones(Fraccion racionalUno, Fraccion RacionalDos){
		this.racionalUno = racionalUno;
		this.racionalDos = RacionalDos;
		this.resultado = new Fraccion();
	}
	
	public Fraccion getResultado() {
		return this.resultado;
	}

	public void suma(){
		this.resultado.numerador = (this.racionalUno.numerador*this.racionalDos.denominador)+
				(this.racionalDos.numerador*this.racionalUno.denominador);
		this.resultado.denominador=this.racionalUno.denominador*
				this.racionalDos.denominador;
	}
	
	public void suma(Fraccion uno, Fraccion dos){
		this.resultado.numerador = (uno.numerador*dos.denominador)+
				(dos.numerador*uno.denominador);
		this.resultado.denominador = uno.denominador*
				this.racionalDos.denominador;
	}
	
	public void resta(){
		this.resultado.numerador = (this.racionalUno.numerador*this.racionalDos.denominador)-
				(this.racionalDos.numerador*this.racionalUno.denominador);
		this.resultado.denominador=this.racionalUno.denominador*
				this.racionalDos.denominador;
	}
	
	public void resta(Fraccion uno, Fraccion dos){
		this.resultado.numerador = (uno.numerador*dos.denominador)-
				(dos.numerador*uno.denominador);
		this.resultado.denominador = uno.denominador*
				this.racionalDos.denominador;
	}
	
	public void multiplicacion(){
		this.resultado.numerador = (this.racionalUno.numerador*this.racionalDos.numerador);
		this.resultado.denominador= (this.racionalUno.denominador * this.racionalDos.denominador);				
	}
	public void multiplicacio(Fraccion uno, Fraccion dos){
		this.resultado.numerador = (this.racionalUno.numerador*this.racionalDos.numerador);
		this.resultado.denominador= (this.racionalUno.denominador * this.racionalDos.denominador);				
	}
	
	

}
