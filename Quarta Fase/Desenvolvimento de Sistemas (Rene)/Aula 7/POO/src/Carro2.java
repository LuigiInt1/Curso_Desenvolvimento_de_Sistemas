
public class Carro2 {
    private String cor;
    private String marca;
    private String modelo;
    private Integer velocidadeMaxima;
    
    public void setCor(String cor){
        this.cor = cor;
    };

    public void setMarca(String marca){
        this.marca = marca;
    };

    public void setModelo(String modelo){
        this.modelo = modelo;
    };

    public void setVelocidademaxima(Integer velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    };

    public String getCor(){
        return cor;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Integer getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    
    public boolean equals(Carro2 carro){
        if (
        carro.getMarca() == this.marca &&
        carro.getCor() == this.cor &&
        carro.getModelo() == this.modelo &&
        carro.getVelocidadeMaxima() == this.velocidadeMaxima) {
            return true;
        }else{
            return false;
        }
    }

}
