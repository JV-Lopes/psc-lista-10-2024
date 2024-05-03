package ListaX;

public class Tenis {
        private String marca;
        private String tamanho;
        private String cor;
        private String material;
        
        public Tenis(String material, String cor, String tamanho, String marca){
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

        public void calcar(String marca){
            System.out.print("calçando um "+marca);
        }
        
        public void amarrar(){
            System.out.print("amarrando o cadarço");
        }

        public void limpar(){
            System.out.print("limpando o tênis");
        }

        public void correrCom(String marca){
            System.out.print("correndo com um "+marca);
        }
    }
