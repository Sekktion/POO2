package questao2;

public class Automato {
    private Estado estado;
    private String cadeia;

    public Automato(String cadeia) {
        this.estado = new EstadoS1(this);
        this.cadeia = cadeia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCadeia() {
        return cadeia;
    }

    public void setCadeia(String cadeia) {
        this.cadeia = cadeia;
    }

    void transicoes() {
        this.getEstado().verificaEstado();
    }
}
