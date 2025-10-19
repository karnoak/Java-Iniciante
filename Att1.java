import java.util.Scanner;

public class Att1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Calcular IMC, (Km/L), Calculadora");
        System.out.println("2 - Analise de alternativas");
        System.out.println("3 - Definição de variavel");
        System.out.println("4 - Problema do João");
        System.out.println("5 - Desconto");
        System.out.println("6 - Km rodados");
        System.out.println("7 - Calcular Média de Notas");
        System.out.println("8 - eleição");
        System.out.println("9 - 10 pedidos");
        System.out.println("10 - pessoas X idade");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                Questao1_IMC.executar(sc);
                break;
            case 2:
                Questao2_AnalisedeAlternativas.executar();
                break;
            case 3:
                Questao3_DefinicaodeVariavel.executar();
                break;
            case 4:
                Questao4_ProblemadoJoao.executar();
                break;
            case 5:
                Questao5_Desconto.executar(sc);
                break;
            case 6:
                Questao6_KmRodado.executar(sc);
                break;
            case 7:
                Questao7_Calculadora.executar(sc);
                break;
            case 8:
                Questao8_Eleicao.executar(sc);
                break;
            case 9:
                Questao9_10pedidos.executar(sc);
                break;
            case 10:
                Questao10_pessoasXidade.executar(sc);
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}

// Questão 1 A- IMC
class Questao1_IMC {
    public static void executar(Scanner sc) {
        System.out.println("diga seu peso:");
        int peso = sc.nextInt();
        System.out.println("diga sua altura:");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("seu imc é: " + imc);

        // Questão 1 B- Km/L
        int km = 120;
        int l = 8;
        System.out.println("com 120 km rodados e 8L de combustivel");
        int kml = km / l;
        System.out.println("ela fez " + kml + " km por litro");

        // Questão 1 C- Operações matemáticas
        System.out.println("diga um número:");
        int num1 = sc.nextInt();
        System.out.println("diga um número:");
        int num2 = sc.nextInt();

        int resultado_soma = num1 + num2;
        int resultado_subtracao = num1 - num2;
        double resultado_divisao = (double) num1 / num2;
        int resultado_multiplicacao = num1 * num2;
        double resultado_media = (num1 + num2) / 2.0;

        System.out.println("Soma: " + resultado_soma);
        System.out.println("Divisão: " + resultado_divisao);
        System.out.println("Subtração: " + resultado_subtracao);
        System.out.println("Multiplicação: " + resultado_multiplicacao);
        System.out.println("Média: " + resultado_media);
    }
}

// Questão 2 - Analise de alternativas
class Questao2_AnalisedeAlternativas {
    public static void executar() {
        System.out.println("Resposta V-F-V");
    }
}

// Questão 3 - Definição de variável
class Questao3_DefinicaodeVariavel {
    public static void executar() {
        System.out.println("variavel e um espaço na memoria usado para guardar valores, para usar ou modificar depois");
    }
}

// Questão 4 - Problema do João
class Questao4_ProblemadoJoao {
    public static void executar() {
        System.out.println("nome de funções não podem ser usadas como nome de variaveis, pois sao palavras reservadas");
    }
}

// Questão 5 - Desconto
class Questao5_Desconto {
    public static void executar(Scanner sc) {
        System.out.print("Diga o preço do produto: ");
        double valorproduto = sc.nextDouble();

        System.out.print("Diga o desconto aplicado (%): ");
        double desconto = sc.nextDouble();

        double valorDesconto = valorproduto * (desconto / 100);
        double valorFinal = valorproduto - valorDesconto;

        System.out.println("O valor do desconto foi de " + valorDesconto + " reais e o produto custa " + valorFinal);
    }
}

// Questão 6 - Km rodados
class Questao6_KmRodado {
    public static void executar(Scanner sc) {
        int diaria = 60;
        double km2 = 1.15;

        System.out.println("quantos km rodou:");
        int rodado = sc.nextInt();
        System.out.println("quantos dias você ficou com o carro: ");
        int dias = sc.nextInt();

        double divida = (diaria * dias) + (km2 * rodado);
        System.out.println("o valor a pagar é: " + divida);
    }
}

// Questão 7 - Calculadora
class Questao7_Calculadora {
    public static void executar(Scanner sc) {
        int num1 = 30;
        int num2 = 20;

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println((double) num1 / num2);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}

// Questão 8 - Eleição
class Questao8_Eleicao {
    public static void executar(Scanner sc) {
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int contadorVotos = 0;

        System.out.println("     Sistema de Votação     ");
        System.out.println("Digite o número do candidato para votar:");
        System.out.println("88 - Lula");
        System.out.println("51 - Bolsonaro");
        System.out.println("39 - Xandão");
        System.out.println("0 - Encerrar votação");

        int voto;

        do {
            System.out.print("Seu voto: ");
            voto = sc.nextInt();

            if (voto == 0) {
                System.out.println("Votação encerrada.");
                break;
            }

            switch (voto) {
                case 88:
                    votosCandidato1++;
                    break;
                case 51:
                    votosCandidato2++;
                    break;
                case 39:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido! Tente novamente.");
                    continue; // não conta voto inválido
            }
            contadorVotos++;
        } while (contadorVotos < 20);

        System.out.println("\n=== Resultado da Votação ===");
        System.out.println("Lula (88) recebeu: " + votosCandidato1 + " votos.");
        System.out.println("Bolsonaro (51) recebeu: " + votosCandidato2 + " votos.");
        System.out.println("Xandão (39) recebeu: " + votosCandidato3 + " votos.");
    }
}

// Questão 9 - 10 Pedidos
class Questao9_10pedidos {
    public static void executar(Scanner sc) {
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}

// Questão 10 - Pessoas X Idade
class Questao10_pessoasXidade {
    public static void executar(Scanner sc) {
        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / n;
        System.out.println("Média de idade: " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media > 25 && media <= 60) {
            System.out.println("A turma é adulta.");
        } else if (media > 60) {
            System.out.println("A turma é idosa.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}