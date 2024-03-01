import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> lista = new ArrayList<>();

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) % 2 == 0)
            System.out.println(lista.get(i));
        }

        for(Integer valor: lista){
            if(valor % 2 != 0)
            System.out.println(valor);
        }

        lista.forEach(valor -> {
            if(valor % 2 != 0)
            System.out.println(valor);
        });

        lista.stream()
        .filter(valor -> (valor % 2 != 0))
        .forEach(valor -> System.out.println(valor));

    }
}
