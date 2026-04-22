import java.util.Scanner;

public class teste {
    static void main() {
        // CRIAÇÃO DE VARIÁVEIS
        Scanner sc = new Scanner(System.in);
        String direcao;
        int distancia, totalCasas = 0;
        double custoTotal;


        // PAR DE COMANDO 1
        System.out.println("Informe a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita) e a Distância de movimento do Robô: ");
        direcao = sc.next();
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("direita")
                && !direcao.equalsIgnoreCase("esquerda")
                && !direcao.equalsIgnoreCase("frente")
                && !direcao.equalsIgnoreCase("trás")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
            System.exit(0);
        } else if (!direcao.equalsIgnoreCase("direita")) {
            System.out.println("COMANDO INVÁLIDO: COLISÃO");
            System.exit(0);
        } else if (distancia <= 0) {
            System.out.println("ERRO: DISTÂNCIA INVÁLIDA");
            System.exit(0);
        } else if (distancia >= 6) {
            System.out.println("COMANDO INVÁLIDO: COLISÃO OU LIMITE EXCEDIDO");
            System.exit(0);
        } else {
            System.out.println("\nMovimentando " + distancia + " casas para " + direcao);
            totalCasas += distancia;
        }
    }
}
