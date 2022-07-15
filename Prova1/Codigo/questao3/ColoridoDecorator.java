package questao3;

public class ColoridoDecorator extends FormaGeometricaDecorator{

    public ColoridoDecorator(FormaGeometrica formaGeometrica){
        super(formaGeometrica);
        this.setDescricao("Colorido");
    }
}
