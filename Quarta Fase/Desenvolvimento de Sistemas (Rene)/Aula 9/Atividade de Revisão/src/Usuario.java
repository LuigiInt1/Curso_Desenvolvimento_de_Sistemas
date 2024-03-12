public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Boolean is_admin;

    public Usuario(String nome, String email, String senha, Boolean is_admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.is_admin = is_admin;
    }

    public Usuario() {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
        result = prime * result + ((is_admin == null) ? 0 : is_admin.hashCode());
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
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (senha == null) {
            if (other.senha != null)
                return false;
        } else if (!senha.equals(other.senha))
            return false;
        if (is_admin == null) {
            if (other.is_admin != null)
                return false;
        } else if (!is_admin.equals(other.is_admin))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", is_admin=" + is_admin + "]";
    }

    
    

}
