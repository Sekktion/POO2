package questao1;

public abstract class Estado {
    private Produto produto;

    Estado(Produto produto){
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void reporEstoque(int quantidadeReposta){
        getProduto().setQuantidadeEmEstoque(getProduto().getQuantidadeEmEstoque() + quantidadeReposta);
        System.out.println("Estoque aumentado em: " + quantidadeReposta);
        System.out.println("Estoque total: " + getProduto().getQuantidadeEmEstoque());
    }

    public void venderEstoque(int quantidadeVendida){
        if(getProduto().getQuantidadeEmEstoque() < quantidadeVendida) {
            System.out.println("Não há estoque suficiente para esta venda, quantidade em estoque: " + getProduto().getQuantidadeEmEstoque());
            return;
        }
        getProduto().setQuantidadeEmEstoque(getProduto().getQuantidadeEmEstoque() - quantidadeVendida);
        System.out.println("Estoque diminuído em: " + quantidadeVendida);
        System.out.println("Estoque total: " + getProduto().getQuantidadeEmEstoque());
    }

    public void verificaEstado(){
        if(getProduto().getQuantidadeEmEstoque() > 10)
            getProduto().setEstado(new EstadoDisponivel(getProduto()));
        else if(getProduto().getQuantidadeEmEstoque() >= 1)
            getProduto().setEstado(new EstadoEstoqueCritico(getProduto()));
        else
            getProduto().setEstado(new EstadoIndisponivel(getProduto()));
    }
}
