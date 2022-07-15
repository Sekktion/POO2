package questao1;

public class Produto {
    private String nomeProduto;
    private Estado estado;
    private int quantidadeEmEstoque;

    public Produto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        this.estado = new EstadoIndisponivel(this);
        this.quantidadeEmEstoque = 0;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void reporEstoque(int quantidadeReposta){
        getEstado().reporEstoque(quantidadeReposta);
        getEstado().verificaEstado();
    }

    public void venderEstoque(int quantidadeVendida){
        getEstado().venderEstoque(quantidadeVendida);
        getEstado().verificaEstado();
    }
}
