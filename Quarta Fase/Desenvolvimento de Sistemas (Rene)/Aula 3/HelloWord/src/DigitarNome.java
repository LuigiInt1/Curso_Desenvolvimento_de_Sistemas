import java.util.Scanner;

public class DigitarNome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        System.out.println("Hello, " + nome);
        
        scan.close();
    }
}
