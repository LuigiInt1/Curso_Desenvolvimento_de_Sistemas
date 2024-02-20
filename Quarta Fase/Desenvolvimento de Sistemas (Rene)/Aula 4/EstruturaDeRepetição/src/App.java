import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor Inteiro");
        Integer num =  scan.nextInt();
        Integer resultado;
        for(int i = 0; i<11; i++){

            resultado = num * i;
            System.out.println(num +" x "+ i + " = " + resultado);

        }
        scan.close();
    }
}
