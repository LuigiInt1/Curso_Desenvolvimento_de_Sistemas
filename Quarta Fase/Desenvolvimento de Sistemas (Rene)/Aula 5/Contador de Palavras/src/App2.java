import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();
        String[] palavras = frase.split(" ");
        
        frase = frase.trim(); 

        for(String palavra: palavras){
            System.out.println(palavra);
        }

        System.out.println(palavras.length);
        scan.close();
    }
}
