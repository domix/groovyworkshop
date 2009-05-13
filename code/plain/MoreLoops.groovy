println """
Ciclo con rangos"""
//Truco 1: ¿Que rayos es 3..10?....
for(i in 3..10) {
	//Truco 2: El uso de parentesis es opcional, se prefiere no usarlos, a menos que ayuden a la lectura
	print(i)
	println " " + i
}

println """

Ciclo con upto"""


0.upto (10) {
	print "$it "
}

println """

Ciclo con step"""

0.step(10, 2) {
	print "$it "
}
println ""