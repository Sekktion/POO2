package questao2;

public class Main {
    public static void main(String[] args) {
        String cadeia = "acd";
        Automato automato = new Automato(cadeia);

        automato.transicoes();
    }
}
