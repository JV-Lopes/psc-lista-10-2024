package ListaX;

public class Anel {
        public String design;
        public String tamanho;
        public String cor;
        public String material;
        
        public Anel(String material, String cor, String tamanho, String design){
            this.material = material;
            this.cor = cor;
            this.tamanho = tamanho;
            this.design = design;
        }

        public String getDesign() {
            return design;
        }

        public void setDesign(String design) {
            this.design = design;
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
