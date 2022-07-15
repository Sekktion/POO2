package questao1;

import java.awt.color.ProfileDataException;

public class Loja {
    public static void main(String[] args) {
        Produto produto1 = new Produto("caneta");

        produto1.venderEstoque(129);
        produto1.reporEstoque(11);
        produto1.venderEstoque(1);
        produto1.venderEstoque(9);
        produto1.venderEstoque(1);
    }
}
