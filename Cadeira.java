package ListaX;

public class Cadeira {
        private String estilo;
        private String tamanho;
        private String cor;
        private String material;
        
        public Cadeira(String material, String cor, String tamanho, String estilo){
            this.material = material;
            this.cor = cor;
            this.tamanho = tamanho;
            this.estilo = estilo;
}

        public String getEstilo() {
            return estilo;
        }

        public void setEstilo(String estilo) {
            this.estilo = estilo;
        }

        public String getTamanho() {
            return tamanho;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void sentar(){
            System.out.print("sentou na cadeira");
        }
        
        public void mover(){
            System.out.print("moveu a cadeira");
        }
    
        public void levantar(){
            System.out.print("levantou da cadeira");
        }
    
        public void inclinar(int inclinacao){
            System.out.print("inclinou "+inclinacao+"graus");
}
}
