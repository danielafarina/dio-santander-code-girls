class Carro extends Veiculo {

    String cor;
    String modelo;
    int capacidadeTanque;

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque; // this.capacidadeTanque é o atributo do objeto; capacidadeTanque é o parâmetro passado para o método construct.
    }

    void setCor(String cor) { // não retorna nada pois a ideia é somente guardar um valor no atributo
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double calcularTotalTanque(double precoCombustivel) {
        return capacidadeTanque * precoCombustivel;
    }
        
}