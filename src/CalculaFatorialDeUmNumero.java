import java.util.Scanner;

public class CalculaFatorialDeUmNumero {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroQueOUsuarioDesejaSaberOFatorial = obterNumeroQueOUsuarioDesejaSaberOFatorial("Qual o fatorial?\nDigite um número e eu darei a resposta:");
        System.out.println("O fatorial de "+numeroQueOUsuarioDesejaSaberOFatorial+" é "+calcularFatorial(numeroQueOUsuarioDesejaSaberOFatorial));
    }

    private static int obterNumeroQueOUsuarioDesejaSaberOFatorial(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }

    private static int calcularFatorial(int numeroQueOUsuarioDesejaSaberOFatorial) {
        int fatorial = numeroQueOUsuarioDesejaSaberOFatorial != 0? numeroQueOUsuarioDesejaSaberOFatorial: 1;
        for (int multiplicador = fatorial-1; multiplicador > 0; multiplicador--) {
            fatorial *= multiplicador;
        }
        return fatorial;
    }
}
