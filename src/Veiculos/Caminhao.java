package Veiculos;

public class Caminhao extends Veiculo{
    
    public Caminhao(String placa, double capacidadeCarga){
        super(placa, capacidadeCarga);
    }

    @Override
    public double calcularCustoViagem(double distancia){
        return distancia*(getCapacidadeCarga() / 1000);
    }

    @Override
    public String toString() {
        return "Caminhão - " + super.toString();
    }
}
