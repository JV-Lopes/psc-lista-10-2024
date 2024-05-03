package ListaX;

public class Planta {
        private String especie;
        private double altura;
        private double idade;
        private String cor;
        
        public Planta(String especie, double altura, double idade, String cor){
            this.especie = especie;
            this.cor = cor;
            this.altura = altura;
            this.idade = idade;
}

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getIdade() {
            return idade;
        }

        public void setIdade(double idade) {
            this.idade = idade;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void regar(){
            System.out.print("regou a planta");
        }
        
        public void podar(){
            System.out.print("podou a planta");
        }
    
        public void transplantar(){
            System.out.print("tranplantou a planta");
        }
    
        public void fertilizar(String fertilizante){
            System.out.print("fertilizou a planta com"+fertilizante);
}
}
