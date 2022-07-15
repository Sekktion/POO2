package questao1;

public class EstadoEstoqueCritico extends Estado{
    EstadoEstoqueCritico(Produto produto){
        super(produto);
    }

    public void venderEstoque(int quantidadeVendida){
        if(getProduto().getQuantidadeEmEstoque() < quantidadeVendida)
            System.out.println("Não há estoque suficiente para esta venda, quantidade em estoque: " + getProduto().getQuantidadeEmEstoque());
        getProduto().setQuantidadeEmEstoque(getProduto().getQuantidadeEmEstoque() - quantidadeVendida);
        System.out.println("Estoque diminuído em: " + quantidadeVendida);
        System.out.println("Estoque total: " + getProduto().getQuantidadeEmEstoque());
        System.out.println("Alerta de baixo estoque!");
    }
}
