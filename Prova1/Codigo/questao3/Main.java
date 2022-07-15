package questao3;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica triangulo = new Triangulo();

        triangulo = new ColoridoDecorator(triangulo);
        triangulo = new SombreadoDecorator(triangulo);
        triangulo = new TresDDecorator(triangulo);

        FormaGeometrica quadrado = new Quadrado();

        quadrado = new ColoridoDecorator(quadrado);
        quadrado = new TresDDecorator(quadrado);

        System.out.println(triangulo.desenhar());
        System.out.println(quadrado.desenhar());
    }
}
