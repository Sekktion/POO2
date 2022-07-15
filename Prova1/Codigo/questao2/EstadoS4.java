package questao2;

public class EstadoS4 extends Estado{
    EstadoS4(Automato automato){
        super(automato);
    }

    @Override
    void verificaEstado(){
        if(this.getAutomato().getCadeia().length() == 0) {
            System.out.println("Cadeia aceita!");
            return;
        } else if(this.getAutomato().getCadeia().charAt(0) == 'd'){
            this.getAutomato().setEstado(new EstadoS3(this.getAutomato()));
            String novaCadeia = this.getAutomato().getCadeia().substring(1);
            this.getAutomato().setCadeia(novaCadeia);
            this.getAutomato().getEstado().verificaEstado();
        } else {
            System.out.println("Cadeia rejeitada!");
            return;
        }
    }
}
