package br.com.raian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        System.out.println();
        System.out.println("Bem-vindo(a)! Prepare-se para uma jornada de conhecimento e conscientização sobre a Igualdade de Gênero e o papel fundamental das mulheres na transformação da sociedade. ");
        System.out.println();

        System.out.println("======================================================");
        System.out.println("Igualdade de Gênero e Luta das Mulheres na Sociedade");
        System.out.println("======================================================");
        System.out.println();

        //Menu principal
        while (option != 5) {
            System.out.println("Escolha uma das opções");
            System.out.println("1. Entenda sobre os principais temas relacionados ao tema ");
            System.out.println("2. Conheça exemplos de mulheres que marcaram a história");
            System.out.println("3. Dicas de como contribuir com a igualdade de gênero");
            System.out.println("4. Participar de um quiz sobre o assunto!");
            System.out.println("5. Sair");
            System.out.print("Digite a opção desejada: ");
            option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    int optionCase1 = 0;
                    while (optionCase1 != 6) {
                        System.out.println("======================================================");
                        System.out.println();
                        System.out.println("Escolha uma das opções:");
                        System.out.println("1. O que é Igualdade de Gênero?");
                        System.out.println("2. Histórico da Luta das Mulheres");
                        System.out.println("3. Desigualdade no mercado de trabalho");
                        System.out.println("4. Violência contra a mulher");
                        System.out.println("5. Participação política");
                        System.out.println("6. Voltar");
                        System.out.print("Digite a opção desejada: ");
                        optionCase1 = sc.nextInt();
                        System.out.println();
                        System.out.println("======================================================");
                        System.out.println();

                        switch (optionCase1) {
                            case 1:
                                System.out.println("-> Igualdade de gênero significa garantir os mesmos direitos, oportunidades e tratamento para todas as pessoas, independentemente de serem homens, mulheres ou pessoas de outras identidades de gênero.\n");
                                break;
                            case 2:
                                System.out.println("-> Século XIX e XX: Mulheres lutaram pelo direito ao voto, acesso à educação e ao trabalho.");
                                System.out.println("-> Movimentos feministas buscaram (e ainda buscam) o fim da opressão, da violência e das desigualdades.");
                                System.out.println("-> Conquistas importantes: direito ao voto, leis contra a violência doméstica, licença-maternidade, acesso à universidade, entre outros.\n");
                                break;
                            case 3:
                                System.out.println("-> Mulheres ainda ganham menos que homens exercendo as mesmas funções.");
                                System.out.println("-> A presença feminina em cargos de liderança é muito menor.");
                                System.out.println("-> Além do emprego formal, as mulheres acumulam dupla jornada com o trabalho doméstico e cuidado familiar.\n");
                                break;
                            case 4:
                                System.out.println("-> A violência de gênero inclui agressões físicas, psicológicas, sexuais e econômicas.");
                                System.out.println("-> No Brasil, o feminicídio é uma realidade grave.");
                                System.out.println("-> Leis como a Lei Maria da Penha e a Lei do Feminicídio são marcos importantes no combate a essas violências.\n");
                                break;
                            case 5:
                                System.out.println("-> A presença de mulheres na política é essencial para a construção de uma sociedade mais justa.");
                                System.out.println("-> Ainda há sub-representação feminina nos espaços de decisão, o que reflete e reforça desigualdades históricas.\n");
                                break;
                            case 6:
                                System.out.println("Voltando para o menu principal...\n");
                                System.out.println("======================================================");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.\n");
                        }
                    }
                    break;

                case 2:
                    System.out.println("======================================================");
                    System.out.println();
                    System.out.println("Exemplos de mulheres notáveis:");
                    System.out.println("- Marie Curie: pioneira na pesquisa científica.");
                    System.out.println("- Malala Yousafzai: ativista pela educação feminina.");
                    System.out.println("- Angela Davis: símbolo da luta por direitos civis e igualdade racial.\n");
                    System.out.println("======================================================");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("======================================================");
                    System.out.println();
                    System.out.println("Como contribuir:");
                    System.out.println("- Respeite e promova a igualdade no seu ambiente.");
                    System.out.println("- Apoie iniciativas lideradas por mulheres.");
                    System.out.println("- Denuncie atitudes machistas e incentive a empatia.\n");
                    System.out.println("======================================================");
                    System.out.println();
                    break;

                case 4:
                    int points = 0;
                    System.out.println("==========================QUIZ==========================");
                    System.out.println("Responda as perguntas corretamente!");
                    System.out.println();
                    System.out.println("1. O que é igualdade de gênero? ");
                    System.out.println("a) Tratar homens e mulheres de forma idêntica sempre");
                    System.out.println("b) Garantir os mesmos direitos e oportunidades para todos os gêneros");
                    System.out.println("c) Dar privilégios para as mulheres");
                    System.out.println("d) Permitir que só mulheres ocupem cargos de liderança");
                    System.out.print("Digite a opção correta (a/b/c/d): ");
                    String answer1 = sc.next();
                    System.out.println();

                    if (answer1.equalsIgnoreCase("b")) {
                        System.out.println("Resposta correta!");
                        points++;
                        System.out.println("Pontos atuais: " + points);
                    } else {
                        System.out.println("Resposta errada!");
                        System.out.println("A resposta correta é: b) Garantir os mesmos direitos e oportunidades para todos os gêneros ");
                        System.out.println("Pontos atuais: " + points);
                    }
                    System.out.println();
                    System.out.println("2. Qual lei brasileira combate a violência doméstica?");
                    System.out.println("a) Lei da Ficha Limpa");
                    System.out.println("b) Lei de Diretrizes e Bases");
                    System.out.println("c) Lei Maria da Penha");
                    System.out.println("d) Código Florestal");
                    System.out.print("Digite a opção correta (a/b/c/d): ");
                    String answer2 = sc.next();
                    System.out.println();

                    if (answer2.equalsIgnoreCase("c")) {
                        System.out.println("Resposta correta!");
                        points++;
                        System.out.println("Pontos atuais: " + points);
                    } else {
                        System.out.println("Resposta errada!");
                        System.out.println("A resposta correta é: c) Lei Maria da Penha");
                        System.out.println("Pontos atuais: " + points);
                    }
                    System.out.println();
                    System.out.println("3. Como qualquer pessoa pode ajudar na luta pela igualdade de gênero?");
                    System.out.println("a) Evitando contato com mulheres");
                    System.out.println("b) Aceitando piadas machistas");
                    System.out.println("c) Respeitando, denunciando abusos e promovendo igualdade");
                    System.out.println("d) Ignorando a discussão para não se envolver");
                    System.out.print("Digite a opção correta (a/b/c/d): ");
                    String answer3 = sc.next();
                    System.out.println();

                    if (answer3.equalsIgnoreCase("c")) {
                        System.out.println("Resposta correta!");
                        points++;
                        System.out.println("Pontos atuais: " + points);
                    } else {
                        System.out.println("Resposta errada!");
                        System.out.println("A resposta correta é: c) Respeitando, denunciando abusos e promovendo igualdade");
                        System.out.println("Pontos atuais: " + points);
                    }

                    System.out.println();
                    System.out.println("4. Qual das alternativas abaixo representa um tipo de violência de gênero?");
                    System.out.println("a) Competição esportiva");
                    System.out.println("b) Críticas construtivas");
                    System.out.println("c) Violência psicológica");
                    System.out.println("d) Discussão política");
                    System.out.print("Digite a opção correta (a/b/c/d): ");
                    String answer4 = sc.next();
                    System.out.println();

                    if (answer4.equalsIgnoreCase("c")) {
                        System.out.println("Resposta correta!");
                        points++;
                        System.out.println("Pontos atuais: " + points);
                    } else {
                        System.out.println("Resposta errada!");
                        System.out.println("A resposta correta é: c) Violência psicológica");
                        System.out.println("Pontos atuais: " + points);
                    }

                    System.out.println();
                    System.out.println("5. O que caracteriza a desigualdade de gênero no mercado de trabalho?");
                    System.out.println("a) Mulheres trabalham menos horas");
                    System.out.println("b) Mulheres ganham menos que homens em funções iguais");
                    System.out.println("c) Mulheres não querem cargos de liderança");
                    System.out.println("d) Homens trabalham mais em equipe");
                    System.out.print("Digite a opção correta (a/b/c/d): ");
                    String answer5 = sc.next();
                    System.out.println();

                    if (answer5.equalsIgnoreCase("b")) {
                        System.out.println("Resposta correta!");
                        points++;
                        System.out.println("Pontos atuais: " + points);
                    } else {
                        System.out.println("Resposta errada!");
                        System.out.println("A resposta correta é: b) Mulheres ganham menos que homens em funções iguais");
                        System.out.println("Pontos atuais: " + points);
                    }

                    if (points >= 3) {
                        System.out.println();
                        System.out.println("Pontuação final: " + points);
                        System.out.println("Parabéns! Você foi muito bem!");
                        System.out.println("======================================================");
                    } else {
                        System.out.println();
                        System.out.println("Pontuação final: " + points);
                        System.out.println("Dá pra melhorar! Tente novamente!");
                        System.out.println("======================================================");
                    }

                    break;
                case 5:
                    System.out.println("======================================================");
                    System.out.println("Saindo...");
                    System.out.println("Obrigado por participar! Juntos podemos construir uma sociedade mais justa.\n");
                    System.out.println("======================================================");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}