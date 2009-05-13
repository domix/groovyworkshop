import groovy.swing.SwingBuilder
import javax.swing.*
import javax.swing.tree.DefaultMutableTreeNode as TreeNode

swing = new SwingBuilder()

salir = swing.action(
	name:'Salir',
	closure:this.&salirAction,
	mnemonic:'S',
	accelerator:'alt F4'
)

abrir = swing.action(
	name:'Abrir',
	closure:this.&abrirAction,
	mnemonic:'A',
	accelerator:'ctrl O'
)

def salirAction(event) {
	frame.dispose()
}

def abrirAction(event) {
	println "Abriendo"
}
trainnings = [
    [name: "Cursos", folders: [[name: "Spring"], [name: "Grails"]]],
    [name: "Talleres", folders: [[name: "Hibernate"], [name: "Groovy"]]]
]
JTree trainningTree


frame = swing.frame(title:"Ejemplo de SwingBuilder con Menus", defaultCloseOperation: JFrame.DISPOSE_ON_CLOSE,
    size: [800, 600], show: true, locationRelativeTo: null) {
	menuBar {
		menu('mnemonic':'A','Archivo') {
			menuItem(action:abrir)
			separator()
			menuItem(action:salir)
		}
		glue()
		menu('Edicion') {
			menuItem('Copiar')
			menuItem('Pegar')
		}
	}
	splitPane {
	        scrollPane(constraints: "left", preferredSize: [160, -1]) {
	            trainningTree = tree(rootVisible: false)
	        }
	        splitPane(orientation:JSplitPane.VERTICAL_SPLIT, dividerLocation:280) {
	            scrollPane(constraints: "top") { asistenteTable = table() }
	        }
	    }
	    ["Asistente", "Empresa"].each { asistenteTable.model.addColumn(it) }
	
}

trainningTree.model.root.removeAllChildren()
trainnings.each {course ->
    def node = new TreeNode(course.name)
    course.folders.each { folder -> node.add(new TreeNode(folder.name)) }
    trainningTree.model.root.add(node)
}
trainningTree.model.reload(trainningTree.model.root)