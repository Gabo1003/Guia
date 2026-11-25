/*
[] = opcional

   Sintaxis:
   
      acceso static tipo_retorno nombre_modulo([lista_param]){
         //Cuerpo del modulo
      }
      
   lista_param:
      tipo_dato1 nombre_param1[tipo_dato2 nombre_param2,....]   
*/

//P02- Sumar 2 numeros utilizando los 4 tipos de mosulos 

import static javax.swing.JOptionPane.*;
public class P02Sumar2Numeros{
   //Modulo sin retorno(metodo) y sin parametros.
   public static void sumarSRSP(){
      int n1, n2, suma =0;
      //Entrada
      n1 = Integer.parseInt(showInputDialog("Valor de n1:"));
      n2 = Integer.parseInt(showInputDialog("Valor de n2:"));
      //Proceso
      suma = n1+n2;
      //Salida
      IO.println("La suma de " +n1+"+"+n2+"="+suma);
   }
   //Modulo sin retorno(metodo) y con parametros.
   public static void sumarSRCP(int n1, int n2){
      int suma =0;
      //Proceso
      suma = n1+n2;
      //Salida
      IO.println("La suma de " +n1+"+"+n2+"="+suma);
   }
   
   public static void main(String[] args){
      IO.println("Inicio main.....");
      //sumarSRSP();
      
      //Llamada al modulo sin retorno con paramettros 
      int n1,n2;
      n1 = Integer.parseInt(showInputDialog("Valor de n1:"));
      n2 = Integer.parseInt(showInputDialog("Valor de n2:"));

      sumarSRCP(n1,n2);
      IO.println("Inicio main.....");
   
   }

}