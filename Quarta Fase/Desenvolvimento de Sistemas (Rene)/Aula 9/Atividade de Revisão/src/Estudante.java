public class Estudante extends Usuario {
    private String universidade;

    public Estudante(String nome, String email, String senha, Boolean is_admin, String universidade) {

        super(nome, email, senha, is_admin);
        
        this.universidade = universidade;

    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((universidade == null) ? 0 : universidade.hashCode());
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
        Estudante other = (Estudante) obj;
        if (universidade == null) {
            if (other.universidade != null)
                return false;
        } else if (!universidade.equals(other.universidade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Estudante [universidade=" + universidade + "]";
    }

    
}
