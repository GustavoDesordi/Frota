package Veiculos;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga){
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public abstract double calcularCustoViagem(double distancia);

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setCapaciadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPlaca(){
        return placa;
    }

    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Capacidade de Carga: " + capacidadeCarga;
    }
}
