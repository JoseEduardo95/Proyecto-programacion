package demo;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Botones implements ActionListener{
    JButton acep;
    JButton cancel;
    JTextField texto;
    
    
    
    public Botones(JButton acep, JButton cancel, JTextField texto){
        this.acep = acep;
        this.cancel = cancel;
        this.texto = texto;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="Aceptar"){
        JOptionPane.showMessageDialog(null, "Se dio click en aceptar");
        System.out.println(texto.getText());
        texto.setText("");
        }
        else 
        JOptionPane.showMessageDialog(null, "Se dio click en cancelar");
        if(acep.getBackground() == Color.RED)
            acep.setBackground(Color.CYAN);
        else
            acep.setBackground(Color.RED);
        //JOptionPane.showInputDialog(null,"Escribe la pelicula")
        //System.out.println(e.getActionCommand());
        
    }
}
