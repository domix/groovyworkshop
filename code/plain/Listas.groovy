// Que facil se declaran las listas... Generics es bueno, pero demasiado verboso.
lista = []
// Necesitamos esencia no ceremonia

println lista.getClass().getName()

//Inicializando la lista
lista = ["Uno", "Dos", "Tres"]

println lista

println """
Iterando la lista con un each"""

lista.each {
	print "$it "
}

println """

Agregando elementos a la lista"""
lista += 4  //Agrego un solo elemento
lista += ["Cuatro", "Cinco"] //Agrego una lista
println """
Iterando la lista con un for"""
for(item in lista) {
	print "$item "
}
println("Agreego el Seis")
lista << "Seis"

println lista

println "Agrego Siete y Ocho"
lista << "Siete" << "Ocho"
println lista

println "Remuevo siete y Ocho"
lista = lista - ["Siete","Ocho"] //Puedo eliminar una coleccion
println lista

println "Remuevo el Seis"
lista = lista - "Seis" //Puedo borrar un elemento solamente
println lista

println "Intento buscar un elemento que no existe"
lista = lista - "Mil Ocho Mil" //no pasa nada si intento borrar algo que no existe
println lista

println "Mariguanadas, doblo la lista"
lista = lista * 2
println lista

