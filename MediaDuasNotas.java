
import java.util.Scanner;

public class MediaDuasNotas {
    public static void main(String[] args) {

    Scanner Entrada=new Scanner(System.in);
     double p1,p2,prec,media1,mediafinal,x;

    System.out.println("Qual a nota da p1?");
     p1= Entrada.nextDouble();

    System.out.println("Qual a nota da p2?");
     p2= Entrada.nextDouble();
    
    media1=(p1+p2)/2;
     System.out.printf("A media é= %.2f %n",media1);    

        if(media1>=5){
            System.out.println("Aprovado");
        }
         else{
            System.out.println("Qual a nota da prec?");
             prec= Entrada.nextDouble();
              mediafinal=(media1+prec)/2;
            System.out.printf("A media final é= %.2f %n",mediafinal);
                if(mediafinal>=5){
                    System.out.print("Aprovado");
                }
                else{
                    System.out.println("Reprovado");
                }     
    }
  }   
}


        

