import java.util.InputMismatchException;

public class AboutMe {
    public static void main(String[] args) {
        try {
            String nome = args[0];
            String sobrenome = args[1];
            Integer idade = Integer.valueOf(args[2]);
            Double altura = Double.valueOf(args[3]);

            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");

            System.out.println("Minha autura é " + altura + "cm");
        }
        catch (InputMismatchException e) {
            System.out.println("Os Campos idade e altura precisam ser numéricos.");
        }

    }
}
