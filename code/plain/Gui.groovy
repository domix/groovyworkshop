import javax.swing.*

JFrame.setDefaultLookAndFeelDecorated(true);

button = new JButton('Dame click') 
button.actionPerformed = { 
    println "Click en el boton"
}
 
panel = new JPanel() 
panel.add(button) 

frame = new JFrame() 
frame.add(panel) 
frame.pack()
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
frame.setTitle("Gui en Groovy")
frame.setVisible(true)