package Veiculo;

public class Veiculo {
    private String placa, marca;
    private double preco;

    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;

    }
    public void mostrar_dados(){
        System.out.println("A placa do veículo é: " + this.placa);
        System.out.println("A marca do veículo é: " + this.marca);
        System.out.println("O preço do veículo é: "  + this.preco);
    }
    public void mostrar_dados(double desconto){
        mostrar_dados();
        System.out.println("O preço do veículo com desconto é: "  + (this.preco*(desconto/100)));


    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

}
