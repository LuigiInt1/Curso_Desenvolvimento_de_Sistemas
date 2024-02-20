import java.util.Scanner;

public class Par_Positivo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");

        Integer num =  scan.nextInt();
        Integer calculo = num * num; 

        boolean verificaçaoPositivo = num> 0;
        boolean verificaçaoPar = calculo%2 == 0;
        
        System.out.println("O número é par? " + verificaçaoPar);
        System.out.println("O número é positivo? " + verificaçaoPositivo);

        scan.close();
    }
}
