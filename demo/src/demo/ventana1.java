package demo;
import javax.swing.*;
import java.awt.FlowLayout;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ventana1 extends JFrame {
    JButton botonAceptar;
    JButton botonCancelar;
    JLabel etiqueta;
    JTextField campoTexto;
    //JButton raton;
    //JComboBox combo;
    
    public ventana1(){
        super("Ejemplo con Jaxax.swing");
        
     
        
        setLayout(new FlowLayout());
        botonAceptar = new JButton("Aceptar");
        botonCancelar = new JButton("Cancelar");
        campoTexto = new JTextField(10);
        
        //Agregar  el action Listener al boton aceptar
        Botones eb = new Botones(botonAceptar, botonCancelar, campoTexto);
        botonAceptar.addActionListener(eb);
        
      
        botonCancelar.addActionListener(eb);
        
        etiqueta = new JLabel("Nombre del alumno");
       
        
        //JButton raton = new JButton("Evento raton");
       
       
       /* combo = new JComboBox();
        combo.addItem("Soltero");
        combo.addItem("Casado");
        combo.addItem("Viudo");
        combo.addItem("Divorciado");
        combo.addItem("Juntado");
        //combo.getSelectedItem();
       // EventoRaton er = new EventoRaton(raton, combo);
        //raton.addMouseListener(er);*/
        
        add(etiqueta);
        add(campoTexto);
        add(botonAceptar);
        add(botonCancelar);
        //add(raton);
        //add(combo);
        
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            
}
