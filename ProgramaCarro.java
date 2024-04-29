package ListaX;
import ListaX.Carro;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Laranja", "P1" , 2024, "McLaren");
        
        System.out.println(carro.getModelo()+" é o carro mais bonito da "+carro.getMarca());
        
        System.out.println("O José comprou uma "+carro.getMarca()+" de "+carro.getAno());

        System.out.print("O José está ");
        carro.acelerar(200);
        System.out.print(" com a "+carro.getModelo());
    }
}