package ListaX;

public class Planta {
        public String especie;
        public String altura;
        public String idade;
        public String cor;
        
        public Planta(String especie, String altura, String idade, String cor){
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

        public String getAltura() {
            return altura;
        }

        public void setAltura(String altura) {
            this.altura = altura;
        }

        public String getIdade() {
            return idade;
        }

        public void setIdade(String idade) {
            this.idade = idade;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }
}
