package ListaX;
import ListaX.Quadro;

public class ProgramaQuadro {
    public static void main(String[] args) {
        Quadro quadro = new Quadro("Josef", "2024", "abstrata(o)", "pintura");

        System.out.println("O quadro de "+quadro.getArtista()+" pintado em "+quadro.getAnoDeCriacao()+", é avaliado em 1B de reais, e é "+
        "uma "+quadro.getTipo()+" "+quadro.getTema());
        System.out.print("Ele foi ");
        quadro.pendurar("parede");
        System.out.print("Após ficar horas ");
        quadro.olhar();
        System.out.print(" e ");
        quadro.restaurando();
        System.out.print(" para depois ficar mais algumas horas ");
        quadro.limpar();
    }
}
