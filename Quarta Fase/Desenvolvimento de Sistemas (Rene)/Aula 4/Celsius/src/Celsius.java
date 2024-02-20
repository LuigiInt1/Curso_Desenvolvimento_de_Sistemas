import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um temperatura em Graus Celsius");
        Float Celcius = scan.nextFloat();
        Float fahrenheit = 32+ ( Celcius * 9/5  );
        System.out.println(fahrenheit);
        scan.close();
    }
}
