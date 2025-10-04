package Conta;

public class Conta {
    private String numero, titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrar_dados(){
        System.out.println("O número da conta é: " +this.numero);
        System.out.println("O titular da conta é: " +this.titular);
        System.out.println("O saldo da conta é: " +this.saldo);
    }

    public void mostrar_dados(double projecao_mensal){
        mostrar_dados();
        System.out.println("O saldo de acordo com a projeção:" + (this.saldo + projecao_mensal*this.saldo));
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}