package ListaX;
import ListaX.Tenis;

public class ProgramaTenis{
    public static void main(String[] args) {
        Tenis tenis = new Tenis("borracha", "preto", "40", "nike");
        System.out.println("Comprei um tênis da "+tenis.getMarca());
        
        System.out.print("José está ");
        tenis.correrCom("Nike ");
        System.out.print(tenis.getCor()+" que ele comprou, do tamanho "+tenis.getTamanho()+", que é feito de uma "+tenis.getMaterial()+" muito boa!");
    }
}
   
