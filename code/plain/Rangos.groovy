rango = (0..10)

println rango
println rango.getClass().getName()

hoy = new Date()
ayer = hoy-1
antier = ayer-1
maniana = hoy + 1
println "Un rango de fechas"
dias = (antier..maniana)
println dias

println "Recorriendo el rango con el for"
for(dia in dias) {
	println "\t $dia"
}
println "Recorriendo el rango con el each"
dias.each { dia ->
	println "\t $dia"
}