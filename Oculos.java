package ListaX;

public class Oculos {
        private String grau;
        private String armacao;
        private String tipo;
        private String material;
        
        public Oculos(String material, String tipo, String grau, String armacao){
            this.material = material;
            this.grau = grau;
            this.tipo = tipo;
            this.armacao = armacao;
}

        public String getGrau() {
            return grau;
        }

        public void setGrau(String grau) {
            this.grau = grau;
        }

        public String getArmacao() {
            return armacao;
        }

        public void setArmacao(String armacao) {
            this.armacao = armacao;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void colocar(){
            System.out.print("colocar os óculos");
        }
        
        public void remover(){
            System.out.print("remover os Óculos");
        }
    
        public void limpar(){
            System.out.print("limpar os óculos");
        }
    
        public void guardar(){
            System.out.print("guardar os óculos");
}
}
