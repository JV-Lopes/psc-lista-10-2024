package ListaX;

    public class Celular{
        private String marca;
        private String modelo;
        private String cor;
        private String sistema;
        
        public Celular(String modelo, String cor, String sistema, String marca){
            this.sistema = sistema;
            this.cor = cor;
            this.modelo = modelo;
            this.marca = marca;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getSistema() {
            return sistema;
        }

        public void setSistema(String sistema) {
            this.sistema = sistema;
        }

        public void ligar(String alguem){
            System.out.print("ligando para"+alguem);
        }
        
        public void mandarMensagem(String alguem){
            System.out.print("mandando mensagem para"+alguem);
        }

        public void jogar(String jogo){
            System.out.print("jogando"+jogo);
        }

        public void navegar(String app){
            System.out.print("navegando no(a)"+app);
        }
    }
