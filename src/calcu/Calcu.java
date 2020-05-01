/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Calcu extends JFrame implements ActionListener{
	JTextField pantalla;
	JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, calcular, suma, resta, multiplicacion, division, borrar;
        String L="",num,num1,signo;
	public Calcu(){
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		//setIconImage(new ImageIcon(getClass().getResource("images/calculadora.png")).getImage());
                
                pantalla = new JTextField();
		pantalla.setBounds(40,40,520,80);
		pantalla.setFont(new Font("Andale Mono", 0, 18));
		add(pantalla);
                
                siete = new JButton("7");
                siete.setBounds(40,160,110,70);
                siete.addActionListener(this);
                siete.setFont(new Font("Andale Mono", 0, 18));
                add(siete);
                
                ocho = new JButton("8");
                ocho.setBounds(175,160,110,70);
                ocho.addActionListener(this);
                ocho.setFont(new Font("Andale Mono", 0, 18));
                add(ocho);
                
                nueve = new JButton("9");
                nueve.setBounds(310,160,110,70);
                nueve.addActionListener(this);
                nueve.setFont(new Font("Andale Mono", 0, 18));
                add(nueve);
                
                suma = new JButton("+");
                suma.setBounds(445,160,110,70);
                suma.addActionListener(this);
                suma.setFont(new Font("Andale Mono", 0, 18));
                add(suma);
                
                cuatro = new JButton("4");
                cuatro.setBounds(40,255,110,70);
                cuatro.addActionListener(this);
                cuatro.setFont(new Font("Andale Mono", 0, 18));
                add(cuatro);
                
                cinco = new JButton("5");
                cinco.setBounds(175,255,110,70);
                cinco.addActionListener(this);
                cinco.setFont(new Font("Andale Mono", 0, 18));
                add(cinco);
                
                seis = new JButton("6");
                seis.setBounds(310,255,110,70);
                seis.addActionListener(this);
                seis.setFont(new Font("Andale Mono", 0, 18));
                add(seis);
                
                resta = new JButton("-");
                resta.setBounds(445,255,110,70);
                resta.addActionListener(this);
                resta.setFont(new Font("Andale Mono", 0, 18));
                add(resta);
                
                uno = new JButton("1");
                uno.setBounds(40,350,110,70);
                uno.addActionListener(this);
                uno.setFont(new Font("Andale Mono", 0, 18));
                add(uno);
                
                dos = new JButton("2");
                dos.setBounds(175,350,110,70);
                dos.addActionListener(this);
                dos.setFont(new Font("Andale Mono", 0, 18));
                add(dos);
                
                tres = new JButton("3");
                tres.setBounds(310,350,110,70);
                tres.addActionListener(this);
                tres.setFont(new Font("Andale Mono", 0, 18));
                add(tres);
                
                multiplicacion = new JButton("*");
                multiplicacion.setBounds(445,350,110,70);
                multiplicacion.addActionListener(this);
                multiplicacion.setFont(new Font("Andale Mono", 0, 18));
                add(multiplicacion);
                
                
                cero = new JButton("0");
                cero.setBounds(40,450,110,70);
                cero.addActionListener(this);
                cero.setFont(new Font("Andale Mono", 0, 18));
                add(cero);
                
                division = new JButton("/");
                division.setBounds(175,450,110,70);
                division.addActionListener(this);
                division.setFont(new Font("Andale Mono", 0, 18));
                add(division);
                
                borrar = new JButton("C");
                borrar.setBounds(310,450,110,70);
                borrar.addActionListener(this);
                borrar.setFont(new Font("Andale Mono", 0, 18));
                add(borrar);
                
                calcular = new JButton("=");
                calcular.setBounds(445,450,110,70);
                calcular.addActionListener(this);
                calcular.setFont(new Font("Andale Mono", 0, 18));
                add(calcular);
                    
                
	}
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calcular){
            String resultado;
            num1=pantalla.getText(); 
      
            if (!num1.equals("")) {
                resultado=op(num1,num,signo);
                pantalla.setText(resultado);
            }
        
            
        }
        if(e.getSource() == suma){
            if (!pantalla.getText().equals("")) {
                num = pantalla.getText();
                signo="+";
                pantalla.setText("");
            }
        }
        if(e.getSource() == resta){
            if (!pantalla.getText().equals("")) {
            num =pantalla.getText();
            signo="-";
            pantalla.setText("");
            }
        }
        if(e.getSource() == multiplicacion){
           
            if (!pantalla.getText().equals("")) {
            num =pantalla.getText();
            signo="*";
            pantalla.setText("");
            }
        }
        if(e.getSource() == division){
            if (!pantalla.getText().equals("")) {
            num =pantalla.getText();
            signo="/";
            pantalla.setText("");
            }
        }
        //
        if(e.getSource() == uno){
                L +="1";
                pantalla.setText(L);
            }
        if(e.getSource() == dos){
                L +="2";
                pantalla.setText(L);
            }
        if(e.getSource() == tres){
                L +="3";
                pantalla.setText(L);
            }
        if(e.getSource() == cuatro){
                L +="4";
                pantalla.setText(L);
            }
        if(e.getSource() == cinco){
                L +="5";
                pantalla.setText(L);
            }
        if(e.getSource() == seis){
                L +="6";
                pantalla.setText(L);
            }
        if(e.getSource() == siete){
                L +="7";
                pantalla.setText(L);
            }
        if(e.getSource() == ocho){
                L +="8";
                pantalla.setText(L);
            }
        if(e.getSource() == nueve){
                L +="9";
                pantalla.setText(L);
            }
        
    }
    public static String op(String num,String num1,String signo){
        float resul = 0 ;
        String resultado;
        if(signo.equals("+")){
            resul=Float.parseFloat(num)+Float.parseFloat(num1);
        }
        if(signo.equals("-")){
            resul=Float.parseFloat(num)-Float.parseFloat(num1);
        }
        if(signo.equals("*")){
            resul=Float.parseFloat(num)*Float.parseFloat(num1);
        }
        if(signo.equals("/")){
            resul=Float.parseFloat(num)/Float.parseFloat(num1);
        }
        resultado = Float.toString(resul);
        return resultado;
    }
	public static void main(String[] args) {
		Calcu principal = new Calcu();
		principal.setBounds(0,0,600,600);
		principal.setVisible(true);
		principal.setLocationRelativeTo(null);
		principal.setResizable(false);
	}

    


}
