//def sirve para definir variables, ojo, no estamos especificando tipo
//Groovy infiere en este caso, que param es de tipo java.lang.String
def param = "grails.org.mx"
println "Presentacion de $param"
println param.getClass().getName()

//En Java, esto no es posible, param era java.lang.String
//ahora cambiamos en tiempo de ejecucion su tipo a java.lang.Long
param = new Long(5)

println param
println param.getClass().getName()


param = 5

println param
println param.getClass().getName()