package ListaX;
import ListaX.Planta;

public class ProgramaPlanta {
    public static void main(String[] args) {
        Planta planta = new Planta("rosa", 15, 1, "preta");
        System.out.print("Comprei um buquê de "+planta.getEspecie()+" "+planta.getCor()+" de "+planta.getIdade()+
        " anos, para minha namorada.");
        System.out.println(" A rosa tem "+planta.getAltura()+"cm de altura.");
        System.out.print("Para a planta nascer saudavel, o moço da flora ");
        planta.fertilizar(" AB12 ");
        planta.regar();
        System.out.print(", ");
        planta.podar();
        System.out.print(" e por fim, ");
        planta.transplantar();
    }
}
