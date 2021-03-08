
public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
       double Ax,Ay,Bx,By,dab;

       Ax=3.0;
       Ay=2.0;
       Bx=2.1;
       By=7.2;      
       dab=(Math.sqrt(Math.pow(Bx-Ax,2)+(Math.pow(By-Ay,2))));
       
       System.out.printf("A distancia entre os dois pontos é= %.2f %n",dab);  
       
    }
    
}
