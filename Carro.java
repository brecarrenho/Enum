class Carro {
    private String placa;
    private int numChassi;

    
    public Carro() {
    }

    public Carro(String placa) {
        this.placa = placa;
    }

    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }
}