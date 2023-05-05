import java.util.Scanner;

public class 1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;

        do {
            System.out.println("Novo grenal(1-sim 2-nao)");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                grenais++;
                System.out.println("Digite o número de gols do Inter:");
                int golsInter = sc.nextInt();
                System.out.println("Digite o número de gols do Grêmio:");
                int golsGremio = sc.nextInt();

                if (golsInter > golsGremio) {
                    vitoriasInter++;
                } else if (golsGremio > golsInter) {
                    vitoriasGremio++;
                } else {
                    empates++;
                }
            } else if (opcao == 2) {
                break;
            } else {
                System.out.println("Opção inválida. Digite novamente.");
            }
        } while (true);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Grêmio venceu mais");
        } else {
            System.out.println("Não houve vencedor");
        }
    }
}