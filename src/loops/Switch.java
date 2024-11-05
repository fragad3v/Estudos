package loops;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Switch {
    public static void main(String[] args) {
        String fruta = "Pera";

        switch (fruta){
            case "Laranja":
                System.out.println("Suco de laranja");
                break;
            case "Banana":
                System.out.println("Vitamina de banana");
            case "Maçã":
                System.out.println("Suco de maçã");
            default:
                System.out.println("Suco genérico");
        }
    }
}