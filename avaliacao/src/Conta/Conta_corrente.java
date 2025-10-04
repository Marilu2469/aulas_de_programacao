package Conta;

public class Conta_corrente extends Conta{
    double limite_cheque;

    public Conta_corrente(String numero, String titular, double saldo, double limite_cheque) {
        super(numero, titular, saldo);
        this.limite_cheque = limite_cheque;
    }

    @Override
    public void mostrar_dados(){
        super.mostrar_dados();
        System.out.println("O limite de cheque da conta é: " + this.limite_cheque);
    }

    public void mostrar_dados_corrente(boolean detalhar){
        super.mostrar_dados();

        if(detalhar){
            System.out.println("O limite do cheque da conta é: " + this.limite_cheque);
        }
    }

    public double getLimite_cheque() {
        return limite_cheque;
    }

    public void setLimite_cheque(double limite_cheque) {
        this.limite_cheque = limite_cheque;
    }
}