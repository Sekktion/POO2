package questao1;

public class EstadoIndisponivel extends Estado{
    EstadoIndisponivel(Produto produto){
        super(produto);
    }

    public void venderEstoque(int quantidadeVendida){
        System.out.println("Não há mais estoque deste produto para venda.");
    }
}
