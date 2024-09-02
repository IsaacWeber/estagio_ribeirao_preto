public class Fibonacci {

    public static void main(String[] args) {
        long numeroBuscado = 144l;

        long t1 = 0l, t2 = 1l;

        System.out.println("SEQUÊNCIA DE FIBONACCI!");

        System.out.print("\t0, 1, ");

        if(numeroBuscado == 1) {
            System.out.println("\n1 pertece à sequência de Fibonacci!");
        } else {
            long f = 0l;
            while (f < numeroBuscado) {
                f = t1 + t2;
                t1 = t2;
                t2 = f;
                System.out.printf("%d, ", f);
            }


            if (f == numeroBuscado)
                System.out.printf("\n%d pertece à sequência de Fibonacci!\n", f);
            else
                System.out.printf("\n%d NÃO pertece à sequência de Fibonacci!\n", numeroBuscado);
        }
    }
}
