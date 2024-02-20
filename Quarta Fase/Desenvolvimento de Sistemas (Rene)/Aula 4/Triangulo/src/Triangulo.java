import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado");
        Integer a =  scan.nextInt();

        System.out.println("Digite o valor do segundo lado");
        Integer b =  scan.nextInt();

        System.out.println("Digite o valor do terceiro lado");
        Integer c =  scan.nextInt();
        

        if (a+b > c && b+c > a && c+a > b) {
            System.out.println("É possivel formar um triângulo");
        } else{
            System.out.println("Não é possivel formar um triângulo");
        }
           

        scan.close();
    }
}
