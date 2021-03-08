
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner Entrada= new Scanner(System.in);
        int ano,x,y,z;

        System.out.println("Digite um ano:");
        ano= Entrada.nextInt();

        x=(ano%400);
        y=(ano%4);
        z=(ano%100);
        
        if (x==0){
            System.out.println("Sim");
        }
            else if (y==0){
                if(z!=0){
                    System.out.println("Sim");   
                }
            }
            else {
                System.out.println("Nao");
        
            }    
    }
    
}

    
    

