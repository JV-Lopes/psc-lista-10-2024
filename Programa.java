package ListaX;

public class Programa {
    public static void main(String[] args) {
        //Anel
        Anel anel = new Anel("ferro", "preto", 20, "com uma lua");

        System.err.println("ANEL");

        System.out.println("Eu comprei um anel de "+anel.getMaterial()+" e da cor "+anel.getCor()+" "+anel.getDesign()+" do tamanho "+anel.getTamanho());
        System.out.print("Mas depois de ");
        anel.colocar();
        System.out.print(", eu tive que ");
        anel.remover();
        System.out.print(", para ");
        anel.ajustar();
        System.out.print(" e ");
        anel.limpar();
        System.out.println(" porque ele veio sujo, e ficou escorregando no meu dedo.");
        System.out.println("\n");

        //Cadeira
        Cadeira cadeira = new Cadeira("madeira", "marrom", "média", "moderna");

        System.err.println("CADEIRA");
        System.out.print("Meu pai comprou uma cadeira de "+cadeira.getMaterial()+" "+cadeira.getEstilo()+" "+cadeira.getCor()+
        ". Ele ");
        cadeira.sentar();
        System.out.print(" para saber se ela era boa, e então ");
        cadeira.mover();
        System.out.print(" e ");
        cadeira.levantar();
        System.out.print(" para por ela no carro, e ");
        cadeira.inclinar(45);
        System.out.println(" para que ela coubesse no carro, já que ela era uma cadeira "+cadeira.getTamanho());
        System.out.println("\n");

        //Carro
        Carro carro = new Carro("Laranja", "P1" , 2024, "McLaren");
        
        System.err.println("CARRO");
        System.out.println(carro.getModelo()+" é o carro mais bonito da "+carro.getMarca());
        
        System.out.println("O José comprou uma "+carro.getMarca()+" de "+carro.getAno());

        System.out.print("O José está ");
        carro.acelerar(200);
        System.out.println(" com a "+carro.getModelo());
        System.out.println("\n");

        //Celular
        Celular celular = new Celular("S24", "Preto", "Android", "Samsung");

        System.err.println("CELULAR");
        System.out.println("Comprei um "+celular.getModelo()+" "+celular.getCor()+" da "+celular.getMarca());
        System.out.print("Fiquei o dia todo ");
        celular.navegar(" Instagram");
        
        System.out.println("\nO "+celular.getSistema()+" dele é bem otimizado");
        System.out.println("\n");

        //Pessoa
        Pessoa pessoa = new Pessoa("José", 18, "programador", "brasileiro");

        System.err.println("PESSOA");
        System.out.print(pessoa.getNome()+" está ");
        pessoa.estudar("biologia");

        System.out.print(pessoa.getNome());
        pessoa.andar("faculdade");

        System.out.println(pessoa.getNome()+" tem "+pessoa.getIdade()+" e é um "+pessoa.getNacionalidade()+" que quer ser "+pessoa.getProfissao());
        System.out.println("\n");

        //Oculos
        Oculos oculos = new Oculos("ferro", "grau", "3,5", "arredondada");

        System.err.println("OCULOS");
        System.out.println("Eu terei que usar óculos, porque tenho"+oculos.getGrau()+" de Hipermetropia e Astigmatismo");
        System.out.print("Vou compar um óculso de "+oculos.getTipo()+" com armação "+oculos.getArmacao()
        +" e de "+oculos.getMaterial()+", para ficar mais fácil quando eu tiver que ");
        oculos.limpar();
        System.out.println("\n");

        //Planta
        Planta planta = new Planta("rosa", 15, 1, "preta");

        System.err.println("PLANTA");
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
        System.out.println("\n");

        //Pulseira
        Pulseira pulseira = new Pulseira("prata", "preta", "pequena" , "Zara");

        System.err.println("PULSEIRA");
        System.out.println("O José comprou uma pulseira "+pulseira.getCor()+" da "+pulseira.getMarca()+" de "+pulseira.getMaterial());

        System.out.print("Ele está ");
        pulseira.limpar();
        System.out.print(", e ");
        pulseira.ajustar();
        System.out.print(", porque ela veio meio suja e apertada por ser "+pulseira.getTamanho());
        System.out.println("\n");

        //Tênis
        Tenis tenis = new Tenis("borracha", "preto", "40", "nike");
        
        System.err.println("TENIS");
        System.out.println("Comprei um tênis da "+tenis.getMarca());
        
        System.out.print("José está ");
        tenis.correrCom("Nike ");
        System.out.print(tenis.getCor()+" que ele comprou, do tamanho "+tenis.getTamanho()+", que é feito de uma "+tenis.getMaterial()+" muito boa!");
        System.out.println("\n");

        //Quadro
        Quadro quadro = new Quadro("Josef", "2024", "abstrata(o)", "pintura");

        System.err.println("QUADRO");
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
        System.out.println("\n");
    }
}
