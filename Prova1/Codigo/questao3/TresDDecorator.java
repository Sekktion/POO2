package questao3;

public class TresDDecorator extends FormaGeometricaDecorator{

    public TresDDecorator(FormaGeometrica formaGeometrica){
        super(formaGeometrica);
        this.setDescricao("3D");
    }
}
