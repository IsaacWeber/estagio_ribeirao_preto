import java.util.regex.*;

public class LetraA {
    public static void main(String[] args) {
        String texto = "Era uma CASA muito engraçada, NÃO tinha teto, não tinha nada!";
        Matcher m = Pattern.compile("a|á|â|à|ã|A|Á|Â|À|Ã").matcher(texto);

        int c = 0;
        while(m.find()) ++c;

        System.out.println("TEXTO:\n\t" + texto);

        System.out.println("------------------\nLETRA 'A'");
        System.out.printf(
            c == 0
            ? ("\tNÃO Aparece\n")
            : String.format("\tAparece %d vezes\n",c)
        );

    }
}
