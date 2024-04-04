public class App {
    public static void main(String[] args) throws Exception {
       
        Pessoa Luigi1 = new Pessoa("Luigi",20,82,'M');
        Pessoa Luigi2 = new Pessoa("Luigi",20,82,'M');
        Pessoa Cesar = new Pessoa("Luigi",20,82,'M');

        System.out.println(Luigi1.toString());
        System.out.println(Luigi2.toString());
        System.out.println(Cesar.toString());

        if (Luigi1.equals(Cesar) && Luigi2.equals(Luigi1) && Luigi2.equals(Cesar)){

            System.out.println("Segundo o 'Equals' são iguais");
        }else{
            
            System.out.println("Segundo o 'Equals' não são iguais");

        }

        if (Luigi1 == Cesar && Luigi2 == Luigi1 && Luigi2 == Cesar){

            System.out.println("Segundo o '==' são iguais");
        }else{
            
            System.out.println("Segundo o '==' não são iguais");

        }
        
    }
}
