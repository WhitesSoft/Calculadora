/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;
import javax.swing.*;


public class Calcu extends JFrame{
        // asdadsada perra perrita
	JTextField marco;
	JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, calcular;
        // oliwis
	public Calcu(){
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		//setIconImage(new ImageIcon(getClass().getResource("images/calculadora.png")).getImage());
	}

	public static void main(String[] args) {
		Calcu principal = new Calcu();
		principal.setBounds(0,0,600,600);
		principal.setVisible(true);
		principal.setLocationRelativeTo(null);
		principal.setResizable(false);
	}
}