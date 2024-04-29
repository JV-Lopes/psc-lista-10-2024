package ListaX;

public class Pessoa{
        private String nome;
        private int idade;
        private String profissao;
        private String nacionalidade;

        public Pessoa(String nome, int idade, String profissao, String nacionalidade){
            this.nome = nome;
            this.idade = idade;
            this.profissao = profissao;
            this.nacionalidade = nacionalidade;
        }

        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public String getProfissao() {
            return profissao;
        }
        
        public void setProfissao(String profissao) {
            this.profissao = profissao;
        }
        
        public String getNacionalidade() {
            return nacionalidade;
        }
        
        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }

        public void falar(){
            System.out.println("OI!");
        }
        
        public void andar(String local){
            System.out.println(" andou até o(a) "+local);
        }

        public void escrever(){
            System.out.println("escrevendo um poema");
        }

        public void estudar(String materia){
            System.out.println("estudando "+materia);
        }
    }