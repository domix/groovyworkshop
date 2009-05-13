
//un ciclo for a la manera Java
System.out.println("Ciclo a la manera Java")

for(int i = 0; i< 5 ;i++ ) {
	System.out.println("Hola " + i);
}

//un ciclo for a la manera Groovy
//Truco #1
println """

Ciclo a la manera Groovy
¿A poco no rulea?
"""

//Truco #2
5.times {
	println "Hola $it"
}

/*
Truco 1: Observen como puedo escribir un java.lang.String de varias lineas sin hacer concatenaciones
Truco 2: ¿?   pista.... 5 es una clase de tipo java.lang.Integer  ¿Esa clase no tiene el metodo times?
		Es mas, times no es metodo ¿Que rayos es entonces?.....   Un closure
 */