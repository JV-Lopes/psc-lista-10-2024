package ListaX;
import ListaX.Oculos;

public class ProgramaOculos {
        public static void main(String[] args) {
            Oculos oculos = new Oculos("ferro", "grau", "3,5", "arredondada");

            System.out.println("Eu terei que usar óculos, porque tenho"+oculos.getGrau()+" de Hipermetropia e Astigmatismo");
            System.out.print("Vou compar um óculso de "+oculos.getTipo()+" com armação "+oculos.getArmacao()
            +" e de "+oculos.getMaterial()+", para ficar mais fácil quando eu tiver que ");
            oculos.limpar();
    }
}
