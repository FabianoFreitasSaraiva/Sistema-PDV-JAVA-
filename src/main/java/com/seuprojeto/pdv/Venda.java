import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Produto> produtosVendidos;
    private double totalVenda;
    private double desconto;

    public Venda() {
        produtosVendidos = new ArrayList<>();
        totalVenda = 0.0;
        desconto = 0.0;
    }

    public void adicionarProduto(Produto produto) {
        produtosVendidos.add(produto);
        totalVenda += produto.getPreco();
    }

    public double aplicarDesconto() {
        return totalVenda * (1 - desconto);
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void limparVenda() {
        produtosVendidos.clear();
        totalVenda = 0.0;
        desconto = 0.0;
    }
}
