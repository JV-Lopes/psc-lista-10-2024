package ListaX;
import ListaX.Celular;

public class ProgramaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("S24", "Preto", "Android", "Samsung");

        System.out.println("Comprei um "+celular.getModelo()+" "+celular.getCor()+" da "+celular.getMarca());
        System.out.print("Fiquei o dia todo ");
        celular.navegar(" Instagram");
        
        System.out.println("\nO "+celular.getSistema()+" dele é bem otimizado");
    }
}
