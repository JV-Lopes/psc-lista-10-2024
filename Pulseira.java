package ListaX;

public class Pulseira {
        private String marca;
        private String tamanho;
        private String cor;
        private String material;
        
        public Pulseira(String material, String cor, String tamanho, String marca){
            this.material = material;
            this.cor = cor;
            this.tamanho = tamanho;
            this.marca = marca;
    }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
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

        public void colocar(){
            System.out.print("colocando a pulseira");
        }
        
        public void remover(){
            System.out.print("removendo a pulseira");
        }

        public void ajustar(){
            System.out.print("ajustando a pulseira");
        }

        public void limpar(){
            System.out.print("limpando a pulseira");
        }
}
