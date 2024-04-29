package ListaX;
import ListaX.Pulseira;

public class ProgramaPulseira {
    public static void main(String[] args) {
        Pulseira pulseira = new Pulseira("prata", "preta", "pequena" , "Zara");

        System.out.println("O José comprou uma pulseira "+pulseira.getCor()+" da "+pulseira.getMarca()+" de "+pulseira.getMaterial());

        System.out.print("Ele está ");
        pulseira.limpar();
        System.out.print(", e ");
        pulseira.ajustar();
        System.out.print(", porque ela veio meio suja e apertada por ser "+pulseira.getTamanho());
    }
}
