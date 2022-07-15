package questao3;

public abstract class FormaGeometricaDecorator extends FormaGeometrica {
    private FormaGeometrica formaGeometrica;

    public FormaGeometricaDecorator(FormaGeometrica formaGeometrica){
        this.formaGeometrica = formaGeometrica;
    }

    public FormaGeometrica getFormaGeometrica() {
        return formaGeometrica;
    }

    public void setFormaGeometrica(FormaGeometrica formaGeometrica) {
        this.formaGeometrica = formaGeometrica;
    }

    public String desenhar(){
        return this.getFormaGeometrica().desenhar() + " " + super.desenhar();
    }
}
