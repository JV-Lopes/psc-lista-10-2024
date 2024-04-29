package ListaX;
import ListaX.Pessoa;

public class ProgramaPessoa{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("José", 18, "programador", "brasileiro");

        System.out.print(pessoa.getNome()+" está ");
        pessoa.estudar("biologia");

        System.out.print(pessoa.getNome());
        pessoa.andar("faculdade");

        System.out.println(pessoa.getNome()+" tem "+pessoa.getIdade()+" e é um "+pessoa.getNacionalidade()+" que quer ser "+pessoa.getProfissao());
    }    
}

