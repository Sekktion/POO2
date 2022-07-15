package questao3;

public class SombreadoDecorator extends FormaGeometricaDecorator{

    public SombreadoDecorator(FormaGeometrica formaGeometrica){
        super(formaGeometrica);
        this.setDescricao("Sombreado");
    }
}
