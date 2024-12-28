public class Cliente {
    private String cpf;
    private double desconto;

    public Cliente(String cpf) {
        this.cpf = cpf;
        this.desconto = verificarDesconto(cpf);
    }

    public double verificarDesconto(String cpf) {
        // A lógica de desconto pode ser personalizada. Exemplo: CPF "123.456.789-00" tem 10% de desconto.
        if (cpf.equals("123.456.789-00")) {
            return 0.10;
        }
        return 0.0; 
    }

    public String getCpf() {
        return cpf;
    }

    public double getDesconto() {
        return desconto;
    }
}

// um novo comentario
