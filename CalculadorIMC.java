import java.util.Scanner;
public class CalculadorIMC {
    public static void main (String args[]){
        Scanner Entrada= new Scanner(System.in);
        double h,p,metro,imc,imc1;
        
        System.out.println("Qual sua altura em Centimetros?");
        h=Entrada.nextDouble();

        System.out.println("Qual seu peso em Quilogramas?");
        p=Entrada.nextDouble();

        metro= h*(Math.pow(10,-2 ));
        imc= p/(metro*metro);                    

        if(imc<=18.5){
            System.out.println("magro");
        }       
                else if (imc<=25){
                    System.out.println("saudavel");
                }
                       else if(imc<=30.0){
                            System.out.println("Acima do peso");
                       }
                                 else if(imc<=35.0){
                                    System.out.println("Obeso"); 
                                 }
                                        else if(imc>35){
                                            System.out.println("Morbidez");
 }
 }
 }

     