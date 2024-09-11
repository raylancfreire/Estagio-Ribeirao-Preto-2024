public class FibonacciSequence {
    public static void main(String[] args) {
        int numero = 9;
        
        if (verificarFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
    
    public static boolean verificarFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }
        
        int primeiro = 0;
        int segundo = 1;
        int proximo = primeiro + segundo;
        
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }
        
        return false;
    }
}
