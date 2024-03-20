
package Prodee1;
import javax.swing.JOptionPane;

public class Calculo {
 // int monto, plazo;
  //double tasa,cuota, interes, total;  
double cuota, interes, total;

public void DiarioCalculo(int monto, int plazo, double tasa){
 if(plazo<=30){
       if(plazo>0){
             cuota=(monto*tasa+monto)/plazo;
             interes=monto*tasa;
             total=monto*tasa+monto;             
       }else{
              JOptionPane.showMessageDialog(null, "Ingrese un plazo mayor a 0");
             }
 }else{
       if (plazo>=31 & plazo<=45 ){
           cuota = (monto*tasa+monto*tasa/2 +monto)/plazo;
           interes = monto * tasa + monto * tasa / 2;
           total=monto * tasa + monto * tasa / 2 + monto;
       }else{
           if(plazo>=46 & plazo<=60){
                cuota = (monto * tasa * 2 + monto) / plazo;
                interes = monto * tasa * 2;
                total = monto * tasa * 2 + monto;
           }else{
                 JOptionPane.showMessageDialog(null, "Ingrese un plazo menor o igual a 60 ");
                }
            }       
      }     
} //fin diario

public void SemanalCalculo(int monto, int plazo, double tasa){
  if(plazo<=4){
       if(plazo>0){
             cuota=(monto*tasa+monto)/plazo;
             interes=monto*tasa;
             total=monto*tasa+monto;
       }else{
              JOptionPane.showMessageDialog(null, "Ingrese un plazo mayor a 0");
             }
 }else{
       if (plazo>=5 & plazo<=6 ){
           cuota = (monto*tasa+monto*tasa/2 +monto)/plazo;
           interes = monto * tasa + monto * tasa / 2;
           total=monto * tasa + monto * tasa / 2 + monto;
       }else{
           if(plazo>=7 & plazo<=60){
                cuota = (monto * tasa * 2 + monto) / plazo;
                interes = monto * tasa * 2;
                total = monto * tasa * 2 + monto;
           }else{
                 JOptionPane.showMessageDialog(null, "Ingrese un plazo menor o igual a 60 ");
                }
            }       
      } 

}//fin semanal

public void QuincenalCalculo(int monto, int plazo, double tasa){
  if(plazo<=2){
       if(plazo>0){
             cuota=(monto*tasa+monto)/plazo;
             interes=monto*tasa;
             total=monto*tasa+monto;
       }else{
              JOptionPane.showMessageDialog(null, "Ingrese un plazo mayor a 0");
             }
 }else{
       if (plazo>=3 & plazo<4 ){
           cuota = (monto*tasa+monto*tasa/2 +monto)/plazo;
           interes = monto * tasa + monto * tasa / 2;
           total=monto * tasa + monto * tasa / 2 + monto;
       }else{
           if(plazo>=4 & plazo<=60){
                cuota = (monto * tasa * 2 + monto) / plazo;
                interes = monto * tasa * 2;
                total = monto * tasa * 2 + monto;
           }else{
                 JOptionPane.showMessageDialog(null, "Ingrese un plazo menor o igual a 60 ");
                }
            }       
      } 
}//fin quinceanl

public void MensualCalculo(int monto, int plazo, double tasa){
      if(plazo<=1){
       if(plazo>0){
             cuota=(monto*tasa+monto)/plazo;
             interes=monto*tasa;
             total=monto*tasa+monto;             
             
       }else{
              JOptionPane.showMessageDialog(null, "Ingrese un plazo mayor a 0");
             }
 }else{     
       if(plazo>=2 & plazo<=60){
            cuota = (monto * tasa * 2 + monto) / plazo;
            interes = monto * tasa * 2;
            total = monto * tasa * 2 + monto;
       }else{
             JOptionPane.showMessageDialog(null, "Ingrese un plazo menor o igual a 60 ");
            }
      } 
 }

}//fin clase 
