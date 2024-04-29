package ListaX;

public class Quadro {
        public String artista;
        public String anoDeCriacao;
        public String tema;
        public String tipo;
        
        public Quadro(String artista, String anoDeCriacao, String tema, String tipo){
            this.artista = artista;
            this.anoDeCriacao = anoDeCriacao;
            this.tema = tema;
            this.tipo = tipo;
        }

        public String getArtista() {
            return artista;
        }

        public void setArtista(String artista) {
            this.artista = artista;
        }

        public String getAnoDeCriacao() {
            return anoDeCriacao;
        }

        public void setAnoDeCriacao(String anoDeCriacao) {
            this.anoDeCriacao = anoDeCriacao;
        }

        public String getTema() {
            return tema;
        }

        public void setTema(String tema) {
            this.tema = tema;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void pendurar(String local){
            System.out.print("pendurar o quadro no "+local);
        }
        
        public void olhar(){
            System.out.print("olhando o quadro");
        }
    
        public void limpar(){
            System.out.print("limpando o quadro");
        }
    
        public void restaurando(){
            System.out.print("restaurando o quadro");
    }
}
