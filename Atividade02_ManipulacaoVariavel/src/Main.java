// Criação do projeto: Atividade02_ManipulacaoVariavel
class Atividade02_ManipulacaoVariavel {
    public static void main(String[] args) {
        // 1. Declaração de variáveis
        String nome = "João";                // Nome da pessoa
        int idade = 25;                       // Idade da pessoa
        double salarioBrutoMensal = 2500.00;  // Salário bruto mensal
        int mesesTrabalhados = 12;            // Quantidade de meses trabalhados no ano
        int quantidadeProdutos = 5;           // Quantidade de produtos comprados
        double valorTotalCompras = 500.00;    // Valor total de compras

        // 2. Operações simples
        // Calcular o salário anual bruto
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados;

        // Subtrair um valor fixo de desconto do salário anual bruto
        double desconto = 2000.00;  // Valor fixo de desconto
        double salarioAnualLiquido = salarioAnualBruto - desconto;

        // Calcular a média do valor gasto por produto
        double mediaGastoPorProduto = valorTotalCompras / quantidadeProdutos;

        // Concatenação de uma string com o nome da pessoa e o salário anual líquido
        String mensagem = "Olá " + nome + ", seu salário anual líquido é R$ " + salarioAnualLiquido + ".";

        // 3. Exibição dos resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutos);
        System.out.println("Valor Total das Compras: R$ " + valorTotalCompras);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido após desconto: R$ " + salarioAnualLiquido);
        System.out.println("Média Gasto por Produto: R$ " + mediaGastoPorProduto);
        System.out.println(mensagem);
    }
}