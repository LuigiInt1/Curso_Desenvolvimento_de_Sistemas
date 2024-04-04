import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         Float divisor;
         Float dividendo;
         Float resultado;

            Scanner scan = new Scanner(System.in);

            try{
                System.out.println("Digite o divisor");
            divisor = scan.nextFloat();
            System.out.println("Digite o dividendo");
            dividendo = scan.nextFloat();

            resultado = dividendo / divisor;
                System.out.println(divisor + " / " +  dividendo + " = " + resultado);
            }catch(Exception erro){
                System.out.println("Valor Inválido");
            }
    
            scan.close();
        }
          

    }

