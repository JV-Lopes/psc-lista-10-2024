package ListaX;
import ListaX.Cadeira;

public class ProgramaCadeira {
    public static void main(String[] args) {
        Cadeira cadeira = new Cadeira("madeira", "marrom", "média", "moderna");
        System.out.print("Meu pai comprou uma cadeira de "+cadeira.getMaterial()+" "+cadeira.getEstilo()+" "+cadeira.getCor()+
        ". Ele ");
        cadeira.sentar();
        System.out.print(" para saber se ela era boa, e então ");
        cadeira.mover();
        System.out.print(" e ");
        cadeira.levantar();
        System.out.print(" para por ela no carro, e ");
        cadeira.inclinar(45);
        System.out.print(" para que ela coubesse no carro, já que ela era uma cadeira "+cadeira.getTamanho());
    }
}
