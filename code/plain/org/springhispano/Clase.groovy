//Groovy soporta paquetes
package org.springhispano

//el atributo de acceso por default al declarar una clase es 'public'
class Clase {
	//el atributo de acceso por default al declarar una variable de instancia es 'private'
	String cadena
	//el atributo de acceso por default al declarar un metodo es 'public'
	def metodo() {
		//¿WTF? ¿Cuando definimos el metodo getter de la propiedad cadena?
		//Groovy genera de manera automatica todos los setter y getter de las propiedades definidas.
		println getCadena()
	}
	
	def getSaludo(param) {
		// En Groovy la palabra return es opcional, 
		// si la ultima linea de un metodo se obtiene un valor, ese valor se regresa
		"Hola $param"
	}
	
	static void main(args) {
		// Nosotros no escribimos este constructor
		// ¿De que tipo es el parametro que le envio? Es un mapa
		def instancia = new Clase(cadena:"Inicializacion")
		instancia.metodo()
		println instancia.getSaludo("grails.org.mx")
	}
}

