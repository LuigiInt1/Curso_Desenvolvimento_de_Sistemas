public class Especie {
    private String nome_cientifico;
    private String nome_comum;
    private Habitat habitat;
    private String distribuicao_geografica;
    private String caracteristicas_morfologicas;


    public Especie() {

    }


    public Especie(String nome_cientifico, String nome_comum, Habitat habitat, String distribuicao_geografica,
            String caracteristicas_morfologicas) {
        this.nome_cientifico = nome_cientifico;
        this.nome_comum = nome_comum;
        this.habitat = habitat;
        this.distribuicao_geografica = distribuicao_geografica;
        this.caracteristicas_morfologicas = caracteristicas_morfologicas;
    }


    public String getNome_cientifico() {
        return nome_cientifico;
    }


    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }


    public String getNome_comum() {
        return nome_comum;
    }


    public void setNome_comum(String nome_comum) {
        this.nome_comum = nome_comum;
    }


    public Habitat getHabitat() {
        return habitat;
    }


    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }


    public String getDistribuicao_geografica() {
        return distribuicao_geografica;
    }


    public void setDistribuicao_geografica(String distribuicao_geografica) {
        this.distribuicao_geografica = distribuicao_geografica;
    }


    public String getCaracteristicas_morfologicas() {
        return caracteristicas_morfologicas;
    }


    public void setCaracteristicas_morfologicas(String caracteristicas_morfologicas) {
        this.caracteristicas_morfologicas = caracteristicas_morfologicas;
    }


    @Override
    public String toString() {
        return "Especie [nome_cientifico=" + nome_cientifico + ", nome_comum=" + nome_comum + ", habitat=" + habitat
                + ", distribuicao_geografica=" + distribuicao_geografica + ", caracteristicas_morfologicas="
                + caracteristicas_morfologicas + "]";
    }

    


}
