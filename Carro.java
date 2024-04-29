package ListaX;

public class Carro {
        public String cor;
        public String modelo;
        public int ano;
        public String marca;
            
        public Carro(String cor, String modelo, int ano, String marca){
                this.cor = cor;
                this.modelo = modelo;
                this.ano = ano;
                this.marca = marca;
            }

            public String getCor() {
                return cor;
            }

            public void setCor(String cor) {
                this.cor = cor;
            }

            public String getModelo() {
                return modelo;
            }

            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            public int getAno() {
                return ano;
            }

            public void setAno(int ano) {
                this.ano = ano;
            }

            public String getMarca() {
                return marca;
            }

            public void setMarca(String marca) {
                this.marca = marca;
            }

            public void dirigir(String modelo){
                System.out.print("dirigindo um "+modelo);
            }
            
            public void estacionar(){
                System.out.print("estacionando na vaga!");
            }
    
            public void manobrar(){
                System.out.print("manobrando na vaga");
            }
    
            public void acelerar(int velocidade){
                System.out.print("acelerando até "+velocidade+"Km/h");
            }
        }