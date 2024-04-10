public class InverterString {
    public static void main(String[] args) {
        String stringOriginal = "Eu amo Programar!";
        
        String invertedString = inverterString(stringOriginal);
        
        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + invertedString);
    }
    
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;
        
        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            
            esquerda++;
            direita--;
        }
        
        return new String(caracteres);
    }
}
