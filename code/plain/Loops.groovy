def contador = 5

println contador.class.name

contador.times {
	println "Iteracion $it"
}


0.upto (10) {
	print "$it "
}

println """

Ciclo con step"""

0.step(10, 2) {
	print "$it "
}
