
package kalkulatorjava;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class KalkulatorJava {

   
    public static void main(String[] args) {
        
        int dod = 0;
        
        int width = 40;
        int height = 40;
        
        int x1 = 10;
        int x2 = 70;
        int x3 = 130;
        
        int x4 = 190;
        
        int y1 = 70;
        int y2 = 120;
        int y3 = 170;
        int y4 = 220;
        
        //window size
        int xWin = 300;
        int yWin = 350;
     ///
        //tworzenie okna
        JFrame frame = new JFrame("Kalkulator");//tworzenia nazwy okna
        frame.setSize(xWin, yWin);
        frame.setLocation(300, 300);
        frame.setResizable(false);//brak możliwości rozszerzania
        
        frame.setLayout(null);
        
       //pole tekstowe
        JTextField textField = new JTextField();
        textField.setBounds(10, 10, 275, 50);
        //czcionka
        Font font = new Font("New Times Roman", Font.BOLD, 26);
        textField.setFont(font);
        textField.setHorizontalAlignment(JTextField.RIGHT);
         //
        frame.add(textField);
       //
        //przyciski
        JButton button1 = new JButton("1");
        button1.setBounds(x1, y1, height, width);
        button1.setBorder(null);
        frame.add(button1);
        
        //funkcjonalność - zapis
        button1.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "1");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
           JButton button2 = new JButton("2");
        button2.setBounds(x2, y1, height, width);
        button2.setBorder(null);
        frame.add(button2);
        
        //funkcjonalność - zapis
        button2.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "2");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton button3 = new JButton("3");
        button3.setBounds(x3, y1, height, width);
        button3.setBorder(null);
        frame.add(button3);
        
        //funkcjonalność - zapis
        button3.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "3");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton button4 = new JButton("4");
        button4.setBounds(x1, y2, height, width);
        button4.setBorder(null);
        frame.add(button4);
        
           button4.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "4");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
           JButton button5 = new JButton("5");
        button5.setBounds(x2, y2, height, width);
        button5.setBorder(null);
        frame.add(button5);
        
        //funkcjonalność - zapis
        button5.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "5");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
           JButton button6 = new JButton("6");
        button6.setBounds(x3, y2, height, width);
        button6.setBorder(null);
        frame.add(button6);
        
        //funkcjonalność - zapis
        button6.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "6");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton button7 = new JButton("7");
        button7.setBounds(x1, y3, height, width);
        button7.setBorder(null);
        frame.add(button7);
        
           button7.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "7");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton button8 = new JButton("8");
        button8.setBounds(x2, y3, height, width);
        button8.setBorder(null);
        frame.add(button8);
        
        //funkcjonalność - zapis
        button8.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "8");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton button9 = new JButton("9");
        button9.setBounds(x3, y3, height, width);
        button9.setBorder(null);
        frame.add(button9);
        
        //funkcjonalność - zapis
        button9.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "9");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton buttonC = new JButton("C");
        buttonC.setBounds(x1, y4, height, width);
        buttonC.setBorder(null);
        frame.add(buttonC);
        
           buttonC.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(null);
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton button0 = new JButton("0");
        button0.setBounds(x2, y4, height, width);
        button0.setBorder(null);
        frame.add(button0);
        
        //funkcjonalność - zapis
        button0.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "0");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton buttonCom = new JButton(".");
        buttonCom.setBounds(x3, y4, height, width);
        buttonCom.setBorder(null);
        frame.add(buttonCom);
        
        //funkcjonalność - zapis
        buttonCom.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + ".");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(x4, y1, height, width);
        buttonPlus.setBorder(null);
        frame.add(buttonPlus);
        
        //funkcjonalność - zapis
        buttonPlus.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "+");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(x4, y2, height, width);
        buttonMinus.setBorder(null);
        frame.add(buttonMinus);
        
        //funkcjonalność - zapis
        buttonMinus.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "-");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton buttonMul = new JButton("*");
        buttonMul.setBounds(x4, y3, height, width);
        buttonMul.setBorder(null);
        frame.add(buttonMul);
        
        //funkcjonalność - zapis
        buttonMul.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "*");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton buttonDiv = new JButton("/");
        buttonDiv.setBounds(x4, y4, height, width);
        buttonDiv.setBorder(null);
        frame.add(buttonDiv);
        
        //funkcjonalność - zapis
        buttonDiv.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent agr0){
                textField.setText(textField.getText() + "/");
                //metoda pobierająca poprzedni tekst i zpisująca liczbę
            }
 
        });
        
        JButton buttonEqu = new JButton("=");
        buttonEqu.setBounds(x4+60, y4, height, width);
        buttonEqu.setBorder(null);
        frame.add(buttonEqu);
        
        //funkcjonalność - zapis
        buttonEqu.addActionListener(new ActionListener(){
            //tworyenie wartođci rwna si dal odpowiednich
            @Override
            public void actionPerformed(ActionEvent agr0){
               
                String str = textField.getText();
                
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String foo = str;
                try {
                    textField.setText(String.valueOf(engine.eval(foo)));
                    
                } catch (ScriptException ex) {
                   
                    JFrame error = new JFrame("Błąd!");
                    error.setSize(100, 100);
                    error.setLocation(xWin, yWin);
                    error.setResizable(false);//brak możliwości rozszerzania
                    JLabel label = new JLabel("Zła wartość!");
                    error.add(label);
                    error.setVisible(true);
                    textField.setText(null);
                }
            }
 
        });
        
        
        //
        
        
        frame.setVisible(true);//ustawiam widzialność
     ///
        
    }
}
