import groovy.swing.SwingBuilder
import javax.swing.*

swing = new SwingBuilder()
frame = swing.frame(title:"Ejemplo de SwingBuilder", pack:true, show:true, defaultCloseOperation:JFrame.EXIT_ON_CLOSE) {
	button(text:"Dame click", actionPerformed : {
		println "Me diste click"
	})
}

