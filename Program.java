public class Program {
    public boolean esPrimer(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int sumaPrimers() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            if (esPrimer(i)) {
                suma += i;
            }
        }
        return suma;
    }
    public int producte() {
        int producte = 1;
        for (int i = 1; i <= 5; i++) {
            producte *= i;
        }
        return producte;
    }
    public static void main(String[] args) {
        Program p = new Program();

        System.out.println("El producte dels nombres de l'1 al 5 és: " + p.producte());
        System.out.println("La suma dels nombres primers de l'1 al 100 és: " + p.sumaPrimers());
    }
}
