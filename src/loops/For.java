package loops;

public class For {
    public static void main(String[] args) {
        int pontosDeVida = 0;
       for(int i = 0; i < 11; i++){
            pontosDeVida++;
           System.out.println("Tomou poção mágica: " + i);
       }
        System.out.println(pontosDeVida + " Totais!");
    }
}
