import java.time.LocalDate;

public class Registro {

    private LocalDate data_registro;
    private String localizacao;
    private Biologo biologo;
    private Especie especie;
    private MetodoColeta metodoColeta;

    public Registro(){

    }

    public Registro(LocalDate data_registro, String localizacao, Biologo biologo, Especie especie,
            MetodoColeta metodoColeta) {
        this.data_registro = data_registro;
        this.localizacao = localizacao;
        this.biologo = biologo;
        this.especie = especie;
        this.metodoColeta = metodoColeta;
    }

    public LocalDate getData_registro() {
        return data_registro;
    }

    public void setData_registro(LocalDate data_registro) {
        this.data_registro = data_registro;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Biologo getBiologo() {
        return biologo;
    }

    public void setBiologo(Biologo biologo) {
        this.biologo = biologo;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public MetodoColeta getMetodoColeta() {
        return metodoColeta;
    }

    public void setMetodoColeta(MetodoColeta metodoColeta) {
        this.metodoColeta = metodoColeta;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data_registro == null) ? 0 : data_registro.hashCode());
        result = prime * result + ((localizacao == null) ? 0 : localizacao.hashCode());
        result = prime * result + ((biologo == null) ? 0 : biologo.hashCode());
        result = prime * result + ((especie == null) ? 0 : especie.hashCode());
        result = prime * result + ((metodoColeta == null) ? 0 : metodoColeta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Registro other = (Registro) obj;
        if (data_registro == null) {
            if (other.data_registro != null)
                return false;
        } else if (!data_registro.equals(other.data_registro))
            return false;
        if (localizacao == null) {
            if (other.localizacao != null)
                return false;
        } else if (!localizacao.equals(other.localizacao))
            return false;
        if (biologo == null) {
            if (other.biologo != null)
                return false;
        } else if (!biologo.equals(other.biologo))
            return false;
        if (especie == null) {
            if (other.especie != null)
                return false;
        } else if (!especie.equals(other.especie))
            return false;
        if (metodoColeta != other.metodoColeta)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Registro [data_registro=" + data_registro + ", localizacao=" + localizacao + ", biologo=" + biologo
                + ", especie=" + especie + ", metodoColeta=" + metodoColeta + "]";
    }

    
    



    
     
    
}
