package questao2;

public class EstadoS2 extends Estado{
    EstadoS2(Automato automato){
        super(automato);
    }

    @Override
    void verificaEstado(){
        if(this.getAutomato().getCadeia().length() == 0) {
            System.out.println("Cadeia rejeitada!");
            return;
        } else
        if(this.getAutomato().getCadeia().charAt(0) == 'a'){
            this.getAutomato().setEstado(new EstadoS2(this.getAutomato()));
            String novaCadeia = this.getAutomato().getCadeia().substring(1);
            this.getAutomato().setCadeia(novaCadeia);
            this.getAutomato().getEstado().verificaEstado();
        } else if(this.getAutomato().getCadeia().charAt(0) == 'b'){
            this.getAutomato().setEstado(new EstadoS1(this.getAutomato()));
            String novaCadeia = this.getAutomato().getCadeia().substring(1);
            this.getAutomato().setCadeia(novaCadeia);
            this.getAutomato().getEstado().verificaEstado();
        } else if(this.getAutomato().getCadeia().charAt(0) == 'c'){
            this.getAutomato().setEstado(new EstadoS4(this.getAutomato()));
            String novaCadeia = this.getAutomato().getCadeia().substring(1);
            this.getAutomato().setCadeia(novaCadeia);
            this.getAutomato().getEstado().verificaEstado();
        } else {
            System.out.println("Cadeia rejeitada!");
            return;
        }
    }
}
