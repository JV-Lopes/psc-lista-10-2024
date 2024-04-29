package ListaX;
import ListaX.Anel;

public class ProgramaAnel {
    public static void main(String[] args) {
        Anel anel = new Anel("ferro", "preto", 20, "com uma lua");

        System.out.println("Eu comprei um anel de "+anel.getMaterial()+" e da cor "+anel.getCor()+" "+anel.getDesign()+" do tamanho "+anel.getTamanho());
        System.out.print("Mas depois de ");
        anel.colocar();
        System.out.print(", eu tive que ");
        anel.remover();
        System.out.print(", para ");
        anel.ajustar();
        System.out.print(" e ");
        anel.limpar();
        System.out.print(" porque ele veio sujo, e ficou escorregando no meu dedo.");
    }
}
