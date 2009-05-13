import groovy.xml.MarkupBuilder 

writer = new StringWriter() 

builder = new MarkupBuilder(writer) 


jj = new Persona(nombre:"Jose Juan")
juanelo = new Persona(nombre:"Juan Manuel")
jordi = new Persona(nombre:"Jorge Rodriguez")
domix = new Persona(nombre:"Domingo")

instructores = [ jj, juanelo, jordi,domix] 

builder.empresa() { 
	nombre("SynergyJ")
     giro("Capacitacion") 
     url("http://www.synergyj.com") 
     cursos  {
		curso("Groovy")
		curso("Spring")
		curso("EJB 3.0")
		curso("Grails")
	 }
   instructores() { 
     for (e in instructores) { instructor(e) } 
   } 
} 
println writer.toString() 
