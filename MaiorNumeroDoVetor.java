import java.util.Scanner;
public class MaiorNumeroDoVetor {


    public static void vetor (int tamanhoVetor){
        
       Scanner leitor = new Scanner(System.in);
       int maior=0;  

      float vetor[] = new float [tamanhoVetor];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição "+i);
            vetor[i]= leitor.nextFloat();
        }


        for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] > maior) {
           maior = (int) vetor [i];
        }
        }
        
        System.out.println("O maior valor encontrado foi "+maior);
        
       
    }
    
    
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         System.out.println("Digite o quantidade de números do vetor:");
         
             int tamanhoVetor = leitor.nextInt();
             vetor(tamanhoVetor);
             
        }
            
}