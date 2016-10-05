
package boletin2_11y12;

import javax.swing.JOptionPane;


public class Boletin2_11y12 {

    
    public static void main(String[] args) {
       Double SoldoFixo, Ventas, km, diasDieta, retencion, SoldoLiquido,SoldoBruto;
       final int COMISION=5/100; 
       SoldoFixo=Double.parseDouble(JOptionPane.showInputDialog("Introduza o seu soldo fixo"));
       Ventas=Double.parseDouble(JOptionPane.showInputDialog("Introduza o total de ventas"));
       km=Double.parseDouble(JOptionPane.showInputDialog("Introduza os km que fai ó mes"));
       diasDieta=Double.parseDouble(JOptionPane.showInputDialog("Introduza os días de dieta"));
       SoldoBruto=30* diasDieta+ 2*km+ Ventas*COMISION+SoldoFixo; 
       retencion=SoldoBruto*0.18;
       SoldoLiquido=SoldoBruto-retencion-36;
       
       JOptionPane.showMessageDialog(null,"O seu soldo líquido é=" + SoldoLiquido);
       
       
       
         
    }
    
}
