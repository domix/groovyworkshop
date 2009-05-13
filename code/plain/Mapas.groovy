domix = new Persona(nickname:"domix", nombre:"Domingo Suarez", fechaDeNacimiento:new Date())
jj = new Persona(nickname:"jj", nombre:"Jose Juan Reyes")

mapa = ["domix":domix, "jj":jj]


println mapa
println mapa.getClass().getName()

println """
Buscando a JJ"""
println mapa.jj

println """
Buscando a domix $mapa.domix """



println """
Recorriendo el mapa"""

mapa.each {
	println "La persona ${it.value.nombre}.domix nacio en $it.value.fechaDeNacimiento"
}

println """
Recorriendo el mapa con entry"""

mapa.each { persona ->
	println "La persona $persona.value.nombre nacio en $persona.value.fechaDeNacimiento"
}

println """
Recorriendo el mapa con key y value"""
mapa.each { nickname, persona ->
	println "La persona $nickname nacio en $persona.fechaDeNacimiento"
}