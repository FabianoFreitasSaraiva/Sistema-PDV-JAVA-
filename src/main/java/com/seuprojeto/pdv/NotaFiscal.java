import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NotaFiscal {
    public static void gerarXML(List<Produto> produtosVendidos, double totalVenda, double desconto, double totalComDesconto, String caminhoArquivo) {
        try {
            String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
            xmlContent += "<notaFiscal>\n";
            xmlContent += "  <itens>\n";
            for (Produto produto : produtosVendidos) {
                xmlContent += "    <item>\n";
                xmlContent += "      <nome>" + produto.getNome() + "</nome>\n";
                xmlContent += "      <preco>" + produto.getPreco() + "</preco>\n";
                xmlContent += "    </item>\n";
            }
            xmlContent += "  </itens>\n";
            xmlContent += "  <totalVenda>" + totalVenda + "</totalVenda>\n";
            xmlContent += "  <desconto>" + (desconto * 100) + "%</desconto>\n";
            xmlContent += "  <totalComDesconto>" + totalComDesconto + "</totalComDesconto>\n";
            xmlContent += "</notaFiscal>";

            FileWriter writer = new FileWriter(caminhoArquivo);
            writer.write(xmlContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
