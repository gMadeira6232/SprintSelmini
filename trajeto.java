import java.util.Scanner;

public class trajeto {
    public static void main(String[] args) {
        // CRIAÇÃO DE VARIÁVEIS
        Scanner sc = new Scanner(System.in);
        String direcao;
        int distancia, totalCasas = 0;
        double custoTotal;

        // PAR DE COMANDO 1
        System.out.println("Informe a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita): ");
        direcao = sc.next();
        System.out.println("\nInforme a Distância de movimento do Robô: ");
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("direita")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
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

        // PAR DE COMANDO 2
        System.out.println("\nInforme a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita): ");
        direcao = sc.next();
        System.out.println("\nInforme a Distância de movimento do Robô: ");
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("frente")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
            System.exit(0);
        } else if (distancia <= 0) {
            System.out.println("ERRO: DISTÂNCIA INVÁLIDA");
            System.exit(0);
        } else if (distancia >= 7) {
            System.out.println("COMANDO INVÁLIDO: COLISÃO OU LIMITE EXCEDIDO");
            System.exit(0);
        } else {
            System.out.println("\nMovimentando " + distancia + " casas para " + direcao);
            totalCasas += distancia;
        } 

        // PAR DE COMANDO 3
        System.out.println("\nInforme a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita): ");
        direcao = sc.next();
        System.out.println("\nInforme a Distância de movimento do Robô: ");
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("direita")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
            System.exit(0);
        } else if (distancia <= 0) {
            System.out.println("ERRO: DISTÂNCIA INVÁLIDA");
            System.exit(0);
        } else if (distancia >= 4) {
            System.out.println("COMANDO INVÁLIDO: COLISÃO OU LIMITE EXCEDIDO");
            System.exit(0);
        } else {
            System.out.println("\nMovimentando " + distancia + " casas para " + direcao);
            totalCasas += distancia;
        } 

        // PAR DE COMANDO 4
        System.out.println("\nInforme a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita): ");
        direcao = sc.next();
        System.out.println("\nInforme a Distância de movimento do Robô: ");
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("tras")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
            System.exit(0);
        } else if (distancia <= 0) {
            System.out.println("ERRO: DISTÂNCIA INVÁLIDA");
            System.exit(0);
        } else if (distancia >= 5) {
            System.out.println("COMANDO INVÁLIDO: COLISÃO OU LIMITE EXCEDIDO");
            System.exit(0);
        } else {
            System.out.println("\nMovimentando " + distancia + " casas para " + direcao);
            totalCasas += distancia;
        } 

        // PAR DE COMANDO 5
        System.out.println("\nInforme a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita): ");
        direcao = sc.next();
        System.out.println("\nInforme a Distância de movimento do Robô: ");
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("direita")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
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

        // PAR DE COMANDO 6
        System.out.println("\nInforme a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita): ");
        direcao = sc.next();
        System.out.println("\nInforme a Distância de movimento do Robô: ");
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("frente")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
            System.exit(0);
        } else if (distancia <= 0) {
            System.out.println("ERRO: DISTÂNCIA INVÁLIDA");
            System.exit(0);
        } else if (distancia >= 3) {
            System.out.println("COMANDO INVÁLIDO: COLISÃO OU LIMITE EXCEDIDO");
            System.exit(0);
        } else {
            System.out.println("\nMovimentando " + distancia + " casas para " + direcao);
            totalCasas += distancia;
        }

        // PAR DE COMANDO 7
        System.out.println("\nInforme a Direção de movimento do Robô (Frente, Trás, Esquerda, Direita): ");
        direcao = sc.next();
        System.out.println("\nInforme a Distância de movimento do Robô: ");
        distancia = sc.nextInt();

        // VALIDAÇÃO DE COMANDOS
        if (!direcao.equalsIgnoreCase("direita")) {
            System.out.println("ERRO: COMANDO INVÁLIDO");
            System.exit(0);
        } else if (distancia <= 0) {
            System.out.println("ERRO: DISTÂNCIA INVÁLIDA");
            System.exit(0);
        } else if (distancia >= 5) {
            System.out.println("COMANDO INVÁLIDO: COLISÃO OU LIMITE EXCEDIDO");
            System.exit(0);
        } else {
            System.out.println("\nMovimentando " + distancia + " casas para " + direcao);
            totalCasas += distancia;
        }
        
        // CÁLCULO DO CUSTO OPERACIONAL
        custoTotal = totalCasas * 0.50;
        System.out.printf("\nCusto total de: R$ %.2f\n", custoTotal);

        // CLASSIFICAÇÃO DA ROTA
        if (custoTotal <= 5) {
            System.out.println("ROTA ECONÔMICA (Rota aprovada. Operação lucrativa.)");
        } else if (custoTotal <= 10) {
            System.out.println("ROTA MODERADA (Rota aprovada com ressalvas.)");
        } else {
            System.out.println("ROTA INEFICIENTE (Rota reprovada. Revisar trajeto.)");
        }
    }
}