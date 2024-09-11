import java.util.Scanner;

public class VerificarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não foi encontrada na string.");
        }
        scanner.close();
    }
}
