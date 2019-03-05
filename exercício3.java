
package ldp6While;

import javax.swing.JOptionPane;

public class exercício3 {
    
    public static void main(String[] args) {
          String d;
          int soma = 0;        
          int n ;
          n = 0;  
          
              d = JOptionPane.showInputDialog(null, "Digite um número:");
          while ( n>0){
              d = JOptionPane.showInputDialog(null, "Digite um número:");
              n =  Integer.parseInt(d);   
              soma=(n*(1+n)/2);
              
          }
         JOptionPane.showMessageDialog(null,"A soma dos números inseridos é:" +soma);
         
        }
}
