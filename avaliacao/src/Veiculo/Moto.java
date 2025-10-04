package Veiculo;

public class Moto extends Veiculo {
    int cilindradas;
    public Moto(String placa, String marca, double preco, int cilindradas){
        super(placa,marca,preco);
        this.cilindradas = cilindradas;

    }
    @Override
    public void mostrar_dados(){
        super.mostrar_dados();
        System.out.println("O número de cilindradas do veículo é: "+this.cilindradas);
    }
    public void mostrar_dados_moto(){
        super.mostrar_dados();
        System.out.println("O número de cilindradas do veículo é: "+this.cilindradas);
    }
}
