public class Main {
    public static void main(String[] args){

        Carro2 corsa = new Carro2();
        corsa.setCor("Amarelo");
        corsa.setModelo("Corsa");
        corsa.setVelocidademaxima(100);
        System.out.printf("Cor: %s --- Modelo: %s --- Velocidade Máxima: %s\n", corsa.getCor(), corsa.getModelo(), corsa.getVelocidadeMaxima());

        Carro2 celta = new Carro2();
        celta.setCor("Amarelo");
        celta.setModelo("Corsa");
        celta.setVelocidademaxima(100);
        System.out.printf("Cor: %s --- Modelo: %s --- Velocidade Máxima: %s\n", celta.getCor(), celta.getModelo(), celta.getVelocidadeMaxima());
        
        if (corsa.equals(celta)) {
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }
    }
}
