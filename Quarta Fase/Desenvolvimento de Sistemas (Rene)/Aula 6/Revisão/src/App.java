import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main (String[] args){

        //helloWord();
        //scanner();
        //operadores();
        //condicionais();
        //lista();

    }

    static void helloWord(){
        System.out.println("Hello Word");
    }

    static void scanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nomeUsuário = input.nextLine();

        System.out.println("Hello " + nomeUsuário);
        System.out.printf("Hello %s", nomeUsuário);
    }

    static void operadores(){
        
        System.out.println("Digite o primeiro valor");
        Scanner input = new Scanner(System.in);
        Integer numero1 = input.nextInt();

        System.out.println("Digite o segundo valor");
        Integer numero2 = input.nextInt();

        Integer soma = numero1 + numero2;
        Integer sub = numero1 - numero2;
        Integer div = numero1 / numero2;
        Integer mult = numero1 * numero2;
        Integer resto = numero1 % numero2;

        System.out.printf("Soma = %d \nSubtração = %d \nDivisão = %d \nMultiplicação = %d \nResto = %d, ",soma, sub, div, mult, resto);
        input.close();

    }

    static void condicionais(){

        System.out.println("Digite o primeiro valor");
        Scanner input = new Scanner(System.in);
        Integer numero1 = input.nextInt();

        if(numero1 % 2 == 0){
            System.out.printf("%d é par", numero1);
        }else{
            System.out.printf("%d é impar", numero1);
        }
    }

    static void lista(){

        Scanner input = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        System.out.println("Digite quantas palavras voce quer digitar: ");
        Integer numeroPalavras = input.nextInt();

        String palavra;

        for( int i = 0; i < numeroPalavras; i++){
            System.out.printf("Digite a palavra %d", i + 1);
            palavra = input.nextLine();
            lista.add(palavra);
        }

        lista.forEach(item -> System.out.println(item));

        for(String item : lista){
            System.out.println(item);
        }

        input.close();
    }

    static void tryCatch(){
        try{
            System.out.println("Digite o primeiro valor");
            Scanner input = new Scanner(System.in);
            Integer numero1 = input.nextInt();
    
            System.out.println("Digite o segundo valor");
            Integer numero2 = input.nextInt();
    
            Integer soma = numero1 + numero2;
            Integer sub = numero1 - numero2;
            Integer div = numero1 / numero2;
            Integer mult = numero1 * numero2;
            Integer resto = numero1 % numero2;
    
            System.out.printf("Soma = %d \nSubtração = %d \nDivisão = %d \nMultiplicação = %d \nResto = %d, ",soma, sub, div, mult, resto);
            input.close();
        }catch(InputMismatchException ex){
            System.out.println("O valor digitado não é um número");
        }
        

    }

}
