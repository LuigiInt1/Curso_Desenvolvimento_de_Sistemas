import java.util.Scanner;

public class FormatacaoTexto {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Digite um valor númerico");
            Integer numero = scan.nextInt();
            System.out.printf("Numero inteiro: %d \nNumero em hexadecimal: %x \nNumero em octal: %o \nNumero em caractere: %c" , numero, numero, numero, numero);

        }catch(Exception erro){
            System.out.println("Valor Inválido");
        }

        scan.close();
    }
}