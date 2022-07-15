package questao2;

public abstract class Estado {
    private Automato automato;

    Estado(Automato automato){
        this.automato = automato;
    }

    public Automato getAutomato() {
        return automato;
    }

    public void setAutomato(Automato automato) {
        this.automato = automato;
    }

    void verificaEstado(){
        System.out.println("Cadeia rejeitada!");
    }
}
