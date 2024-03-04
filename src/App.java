import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int minimo, maximo, posicao, posVazio, valor, repetir;
        /*
         * 1. Atribuir um valor a determinada posição.
         * 2. Alterar o valor de determinada posição.
         * 3. Remover o valor de determinada posição (atribui o valor indicativo de
         * posição vaga).
         * 4. Ler o conteúdo de uma posição.
         * 5. Localizar um valor e retornar sua posição (se permitir repetição tem
         * que retornar todos).
         * 6. Inserir na primeira posição vaga (busca no sentido 0 → N).
         * 7. Remover da última posição ocupada (busca no sentido 0 → N).
         * 8. Imprimir o conteúdo do vetor.
         */

        System.out.println("Escreva o valor minimo do seu conjunto:");
        minimo = sc.nextInt();

        System.out.println("Escreva o valor maximo do seu conjunto:");
        maximo = sc.nextInt();

        System.err.println("Escreva o valor padrao(posição vaga)");
        posVazio = sc.nextInt();
        // atribuir os valores default para os indices
        TadResolucao userResolucao = new TadResolucao();
        int[] arr = new int[maximo - minimo];
        for (int i = minimo; i < arr.length; i++) {
            arr[i] = posVazio;
        }
        userResolucao.setDados(arr);

        int[] dados = userResolucao.getDados();

        while (true) {

            System.out.println("0. Parar aplicação!");
            System.out.println("1. Atribuir um valor a determinada posição.");
            System.out.println("2. Alterar o valor de determinada posição.");
            System.out
                    .println("3. Remover o valor de determinada posição (atribui o valor indicativo de posição vaga).");
            System.out.println("4. Ler o conteúdo de uma posição.");
            System.out.println(
                    "6. Inserir na primeira posição vaga (busca no sentido 0 → N).");
            System.out.println("7. Remover da última posição ocupada (busca no sentido 0 → N).");
            System.out.println("8. Imprimir o conteúdo do vetor.");
            int opcao = sc.nextInt();
            if (opcao == 0) {
                break;
            }

            // 1. Atribuir um valor a determinada posição.
            if (opcao == 1) {
                System.err.println("Insira o indice:");
                posicao = sc.nextInt();

                System.out.println("Insira o valor");
                valor = sc.nextInt();

                if (arr[posicao] != posVazio) {
                    System.out.println("Indice já utilizado!");
                    continue;
                }

                userResolucao.setPosAndValue(posicao, valor);

                continue;
            }

            // 2. Alterar o valor de determinada posição.
            if (opcao == 2) {

                System.err.println("Insira o indice:");
                posicao = sc.nextInt();

                System.out.println("Insira o valor");
                valor = sc.nextInt();

                if (dados[posicao] == posVazio) {
                    System.out.println("Esta posição esta vaga, insira um valor antes.");
                    continue;
                }
                userResolucao.setPosAndValue(posicao, valor);

                continue;
            }

            // 3. Remover o valor de determinada posição (atribui o valor indicativo de
            // posição vaga).
            if (opcao == 3) {
                System.err.println("Insira o indice:");
                posicao = sc.nextInt();

                userResolucao.setPosAndValue(posicao, posVazio);
                continue;
            }

            // "4. Ler o conteúdo de uma posição."
            if (opcao == 4) {
                System.err.println("Insira o indice:");
                posicao = sc.nextInt();

                System.out.println("Conteudo da posição " + posicao + " é: " + dados[posicao]);

            }

            // 6. Inserir na primeira posição vaga (busca no sentido 0 → N).
            if (opcao == 6) {
                System.out.println("Insira um valor na primeira posição vaga");
                valor = sc.nextInt();

                for (int i = minimo; i < arr.length; i++) {
                    if (dados[i] == posVazio) {
                        dados[i] = valor;
                        break;
                    }
                }
            }

            // 7. Remover da última posição ocupada (busca no sentido 0 → N).
            if (opcao == 7) {

                for (int i = arr.length - 1; i >= 0; i--) {
                    if (dados[i] != posVazio) {
                        dados[i] = posVazio;
                        break;
                    }
                }
            }

            // 8. Imprimir o conteúdo do vetor.
            if (opcao == 8) {
                for (int i = minimo; i < arr.length; i++) {
                    System.out.println("[" + i + "] = " + dados[i]);

                }
                continue;
            }
        }
    }
}
