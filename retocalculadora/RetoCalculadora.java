package retocalculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class RetoCalculadora extends JFrame {

    //<editor-fold desc="Declaración de variables">
    DecimalFormat myFor = new DecimalFormat("0.00");
    int op = 0;
    String aux = "", aux2 = "";
    double aux3, aux4, aux5;
    JButton c, close, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, sum, res, mul, div, igual, cero, punto, borr, mm, raiz;
    JTextField resultado = new JTextField();
    //</editor-fold>
 
    public RetoCalculadora() {
        //<editor-fold desc="Atributos del objeto">
        //<editor-fold desc="Propiedades de la interfaz">
        JPanel C2 = new JPanel();
        C2.setLayout(new FlowLayout());
        resultado = new JTextField(25);
        C2.add(resultado);
        JPanel constructor = new JPanel();
        constructor.setLayout(new GridLayout(4, 4));
        resultado.setBackground(Color.DARK_GRAY);
        resultado.setForeground(Color.WHITE);
        c = new JButton("AC");
        c.setBackground(Color.DARK_GRAY);
        c.setForeground(Color.WHITE);
        borr = new JButton("DEL");
        borr.setBackground(Color.DARK_GRAY);
        borr.setForeground(Color.WHITE);
        close = new JButton("Close");
        close.setBackground(Color.DARK_GRAY);
        close.setForeground(Color.WHITE);
        uno = new JButton("1");
        uno.setBackground(Color.BLACK);
        uno.setForeground(Color.WHITE);
        dos = new JButton("2");
        dos.setBackground(Color.BLACK);
        dos.setForeground(Color.WHITE);
        tres = new JButton("3");
        tres.setBackground(Color.BLACK);
        tres.setForeground(Color.WHITE);
        cuatro = new JButton("4");
        cuatro.setBackground(Color.BLACK);
        cuatro.setForeground(Color.WHITE);
        cinco = new JButton("5");
        cinco.setBackground(Color.BLACK);
        cinco.setForeground(Color.WHITE);
        seis = new JButton("6");
        seis.setBackground(Color.BLACK);
        seis.setForeground(Color.WHITE);
        siete = new JButton("7");
        siete.setBackground(Color.BLACK);
        siete.setForeground(Color.WHITE);
        ocho = new JButton("8");
        ocho.setBackground(Color.BLACK);
        ocho.setForeground(Color.WHITE);
        nueve = new JButton("9");
        nueve.setBackground(Color.BLACK);
        nueve.setForeground(Color.WHITE);
        sum = new JButton("+");
        sum.setBackground(Color.DARK_GRAY);
        sum.setForeground(Color.WHITE);
        res = new JButton("-");
        res.setBackground(Color.DARK_GRAY);
        res.setForeground(Color.WHITE);
        mul = new JButton("*");
        mul.setBackground(Color.DARK_GRAY);
        mul.setForeground(Color.WHITE);
        div = new JButton("/");
        div.setBackground(Color.DARK_GRAY);
        div.setForeground(Color.WHITE);
        igual = new JButton("=");
        igual.setBackground(Color.DARK_GRAY);
        igual.setForeground(Color.WHITE);
        cero = new JButton("0");
        cero.setBackground(Color.BLACK);
        cero.setForeground(Color.WHITE);
        punto = new JButton(".");
        punto.setBackground(Color.DARK_GRAY);
        punto.setForeground(Color.WHITE);
        mm = new JButton("+/-");
        mm.setBackground(Color.DARK_GRAY);
        mm.setForeground(Color.WHITE);
        raiz = new JButton("√");
        raiz.setBackground(Color.DARK_GRAY);
        raiz.setForeground(Color.WHITE);
         //</editor-fold>        
         //<editor-fold desc="Agregar botones al Frame">
        constructor.add(c);
        constructor.add(borr);
        constructor.add(siete);
        constructor.add(ocho);
        constructor.add(nueve);
        constructor.add(sum);
        constructor.add(res);
        constructor.add(cuatro);
        constructor.add(cinco);
        constructor.add(seis);
        constructor.add(mul);
        constructor.add(div);
        constructor.add(uno);
        constructor.add(dos);
        constructor.add(tres);
        constructor.add(raiz);
        constructor.add(igual);
        constructor.add(mm);
        constructor.add(cero);
        constructor.add(punto);
         //</editor-fold>         
         //<editor-fold desc="Acciones de los botones">
        ButtonHandler handler = new ButtonHandler();
        c.addActionListener(handler);
        close.addActionListener(handler);
        uno.addActionListener(handler);
        dos.addActionListener(handler);
        tres.addActionListener(handler);
        cuatro.addActionListener(handler);
        cinco.addActionListener(handler);
        seis.addActionListener(handler);
        siete.addActionListener(handler);
        ocho.addActionListener(handler);
        nueve.addActionListener(handler);
        sum.addActionListener(handler);
        res.addActionListener(handler);
        mul.addActionListener(handler);
        div.addActionListener(handler);
        cero.addActionListener(handler);
        punto.addActionListener(handler);
        igual.addActionListener(handler);
        borr.addActionListener(handler);
        mm.addActionListener(handler);
        raiz.addActionListener(handler);
         //</editor-fold>         
         //<editor-fold desc="Caracteristicas de la ventana">
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(C2);
        C2.setPreferredSize(new Dimension(300, 30));
        add(constructor);
        constructor.setPreferredSize(new Dimension(300, 370));
        pack();
        setVisible(true);
        setSize(300, 400);
        setTitle("Calculadora");
        C2.setBackground(Color.DARK_GRAY);
        constructor.setBackground(Color.DARK_GRAY);
        setIconImage(new ImageIcon("calculator.png").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //</editor-fold>
        // </editor-fold>
    }
    
    public static void main(String[] args) {
        new RetoCalculadora();
    }
    //<editor-fold desc="Operaciones de la calculadora">
    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == mm) {
                if (aux != null) {
                    aux3 = Double.parseDouble(aux);
                    aux3 = aux3 * -1;
                    resultado.setText(String.valueOf(myFor.format(aux3)));
                    aux = String.valueOf(aux3);
                }
            }
            if (e.getSource() == raiz) {
                if (aux != null) {
                    aux3 = Double.parseDouble(aux);
                    aux4 = Math.sqrt(aux3);
                    resultado.setText(String.valueOf(myFor.format(aux4)));
                    aux = String.valueOf(aux4);
                }
            }
            if (e.getSource() == sum) {
                if (aux != null) {
                    aux2 = aux;
                    aux = "";
                    op = 1;
                    resultado.setText(aux);
                }
            }
            if (e.getSource() == res) {
                if (aux != null) {
                    aux2 = aux;
                    aux = "";
                    op = 2;
                    resultado.setText(aux);
                }
            }
            if (e.getSource() == mul) {
                if (aux != null) {
                    aux2 = aux;
                    aux = "";
                    op = 3;
                    resultado.setText(aux);
                }
            }
            if (e.getSource() == div) {
                if (aux != null) {
                    aux2 = aux;
                    aux = "";
                    op = 4;
                    resultado.setText(aux);
                }
            }
            if (e.getSource() == igual) {
                if (aux != null && aux2 != null) {
                    aux3 = Double.parseDouble(aux);
                    aux4 = Double.parseDouble(aux2);
                    switch (op) {
                        case 1:
                            aux5 = aux3 + aux4;
                            resultado.setText(String.valueOf(myFor.format(aux5)));
                            aux = String.valueOf(aux5);
                            break;
                        case 2:
                            aux5 = aux4 - aux3;
                            resultado.setText(String.valueOf(myFor.format(aux5)));
                            aux = String.valueOf(aux5);
                            break;
                        case 3:
                            aux5 = aux3 * aux4;
                            resultado.setText(String.valueOf(myFor.format(aux5)));
                            aux = String.valueOf(aux5);
                            break;
                        case 4:
                            aux5 = aux4 / aux3;
                            resultado.setText(String.valueOf(myFor.format(aux5)));
                            aux = String.valueOf(aux5);
                            break;
                    }
                }
            }
            if (e.getSource() == uno) {
                aux += "1";
                resultado.setText(aux);
            }
            if (e.getSource() == dos) {
                aux += "2";
                resultado.setText(aux);
            }
            if (e.getSource() == tres) {
                aux += "3";
                resultado.setText(aux);
            }
            if (e.getSource() == cuatro) {
                aux += "4";
                resultado.setText(aux);
            }
            if (e.getSource() == cinco) {
                aux += "5";
                resultado.setText(aux);
            }
            if (e.getSource() == seis) {
                aux += "6";
                resultado.setText(aux);
            }
            if (e.getSource() == siete) {
                aux += "7";
                resultado.setText(aux);
            }
            if (e.getSource() == ocho) {
                aux += "8";
                resultado.setText(aux);
            }
            if (e.getSource() == nueve) {
                aux += "9";
                resultado.setText(aux);
            }
            if (e.getSource() == cero) {
                aux += "0";
                resultado.setText(aux);
            }
            if (e.getSource() == punto) {
                aux += ".";
                resultado.setText(aux);
            }

            if (e.getSource() == c) {
                aux = "";
                resultado.setText(aux);
            }
            if (e.getSource() == borr) {
                if (aux.length() >= 1) {
                    aux = aux.substring(0, aux.length() - 1);
                    resultado.setText(aux);
                }

            }

            if (e.getSource() == close) {
                System.exit(0);
            }
        }
        // </editor-fold>
    }
}