import java.util.Scanner;

public class Somar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        Integer a = scan.nextInt();

        System.out.println("Digite o primeiro valor");
        Integer b = scan.nextInt();

        Integer soma = a + b;

        System.out.println("a + b " + "= " + soma  );

        scan.close();


    }
}
