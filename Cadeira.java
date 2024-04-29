package ListaX;

public class Cadeira {
        public String estilo;
        public String tamanho;
        public String cor;
        public String material;
        
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
}
