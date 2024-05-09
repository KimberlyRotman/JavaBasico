package AnatomiaDasClasses;
public class MeuNome {

    public static void main(String[] args) {

        String primeiroNome = "Kimberly";
        String segundoNome = "Rotman";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Meu nome é: " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
