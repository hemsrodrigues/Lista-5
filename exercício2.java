
package ldp6While;

import javax.swing.JOptionPane;

public class exercício2 {
    
    public static void main(String[] args) {
          
          int i ;
          i=1;
          while ( i !=0){
            i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
          }
         JOptionPane.showMessageDialog(null, "Seu zero é inválido aqui!");
    }
}