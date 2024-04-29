package ListaX;

public class Anel {
        public String design;
        public double tamanho;
        public String cor;
        public String material;
        
        public Anel(String material, String cor, double tamanho, String design){
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

        public double getTamanho() {
            return tamanho;
        }

        public void setTamanho(double tamanho) {
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
            System.out.print("colocar o anel");
        }
        
        public void remover(){
            System.out.print("remover o anel");
        }
    
        public void limpar(){
            System.out.print("limpar o anel");
        }
    
        public void ajustar(){
            System.out.print("ajustar o anel");
}
}
