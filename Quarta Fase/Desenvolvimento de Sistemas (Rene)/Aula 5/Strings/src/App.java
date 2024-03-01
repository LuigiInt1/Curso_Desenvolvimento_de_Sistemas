import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        String string1 = scan.nextLine();
        String string2 = scan.nextLine();

        // concatenação usando o concat
        String string3 = string1.concat(string2);
        System.out.println(string3);

        // remove os espaços no começo e no fim da string
        string3 = string3.trim();


        string3 = string1 + " " + string2;
        // Método de Comparação padrão, compara o dado da String
        if (string1 == string2) {
            System.out.println("São Iguais");
        }

        // Para Classes, compara o dado da String e o local da memória
        if (string1.equals(string2)) {
            System.out.println("São Iguais");
        }

        // Compara ignorando se é maiusculo ou minusculo
        if (string1.compareToIgnoreCase(string2) == 0) {
            System.out.println("São iguais");
        }

        
        String ucs = "uc1, uc2, uc3";

        String[] listaUcs = ucs.split(",");

        for(String uc: listaUcs){
            System.out.println(uc);
        }
        System.out.println(listaUcs.length);
        scan.close();
    }
}
