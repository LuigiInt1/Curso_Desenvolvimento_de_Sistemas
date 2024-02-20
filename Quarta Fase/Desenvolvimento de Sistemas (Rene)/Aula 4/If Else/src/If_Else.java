import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");

        Integer num =  scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else{
            System.out.println("O número é Impar");
        }

        
        if (num > 0) {
            System.out.println("O número é positivo");
        } else if (num < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }

        scan.close();
    }
}
