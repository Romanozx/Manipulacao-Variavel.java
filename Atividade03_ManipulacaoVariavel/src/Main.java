import java.text.DecimalFormat;
import java.util.Scanner;

class Atividade03_ManipulacaoVariavel {
    public static void main(String[] args) {
        // Criação de Variáveis
        String nomeProduto;
        double precoUnitario;
        int quantidadeComprada;
        double taxaImposto;
        double margemLucro;

        // Leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine();

        System.out.print("Digite o preço unitário do produto: ");
        precoUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade de produtos comprados: ");
        quantidadeComprada = scanner.nextInt();

        System.out.print("Digite a taxa de imposto sobre o produto (em percentual): ");
        taxaImposto = scanner.nextDouble() / 100; // converter percentual para decimal

        System.out.print("Digite a margem de lucro desejada (em percentual): ");
        margemLucro = scanner.nextDouble() / 100; // converter percentual para decimal

        scanner.close();

        // Operações Simples
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
        double precoVenda = valorTotalComImpostos * (1 + margemLucro);

        // Desafio Extra
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        valorTotalComImpostos = Double.parseDouble(df.format(valorTotalComImpostos).replace("R$ ", "").replace(",", "."));
        precoVenda = Double.parseDouble(df.format(precoVenda).replace("R$ ", "").replace(",", "."));

        // Exibição de Resultados
        System.out.println("\n--- Resultado da Análise ---");
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Valor Total com Impostos: " + df.format(valorTotalComImpostos));
        System.out.println("Preço de Venda Sugerido: " + df.format(precoVenda));
    }
}