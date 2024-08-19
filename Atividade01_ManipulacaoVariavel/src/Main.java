// Criação do projeto: Atividade01_ManipulacaoVariavel
class Atividade01_ManipulacaoVariavel {
    public static void main(String[] args) {
        // Declaração de variáveis
        int idade = 25;                  // Idade da pessoa
        double altura = 1.75;            // Altura em metros
        String nome = "João";            // Nome da pessoa
        boolean ehEstudante = true;       // Se a pessoa é estudante

        // Operações simples
        // Calcular a soma de duas idades
        int idadeOutraPessoa = 30;       // Idade de outra pessoa
        int somaIdades = idade + idadeOutraPessoa;

        // Multiplicar a altura por um fator de 2
        double alturaMultiplicada = altura * 2;

        // Concatenar o nome da pessoa com uma saudação
        String saudacao = "Olá, " + nome + "!";

        // 3. Exibição dos resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante? " + ehEstudante);
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura multiplicada por 2: " + alturaMultiplicada);
        System.out.println(saudacao);
    }
}