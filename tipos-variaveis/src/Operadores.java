// Exemplo 1
public class Operadores {
    
    public static void main (String[] args) {
                // Usando o operador +
                String nome = "João";
                String sobrenome = "Silva";
                String nomeCompleto1 = nome + " " + sobrenome;
                System.out.println(nomeCompleto1); // "João Silva"
        
                // Usando StringBuilder
                StringBuilder sb = new StringBuilder();
                sb.append("João");
                sb.append(" ");
                sb.append("Silva");
                String nomeCompleto2 = sb.toString();
                System.out.println(nomeCompleto2); // "João Silva"
        
                // Usando o método concat
                String nomeCompleto3 = nome.concat(" ").concat(sobrenome);
                System.out.println(nomeCompleto3); // "João Silva"
        
    }
}
