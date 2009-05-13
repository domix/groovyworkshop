//No mam.... que facil
println new File("JavaIO.groovy").text

println """





"""

//Vamos a explorar lo archivos
home = new File(".")
println home.getClass().getName()
dirs = []
files = []

home.eachDir {
	dirs << it.name
}

home.eachFile {
	files << it.name
}

println "Directorios"
println dirs

println "Archivos"
println files

