// Asi o mas sencillo el I/O
new File("JavaIO.groovy").eachLine{linea->
	println linea
}

def codigo = new File("JavaIO.groovy").text
println codigo

def destination = new File("Desti.txt")
destination.write("Este es el mensaje que voy a guardar")
println destination.text