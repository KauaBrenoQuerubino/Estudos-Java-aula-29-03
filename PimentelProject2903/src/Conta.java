public class Conta {
    private double saldo;
    private double limite;
    private int numero;


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (valor > this.saldo){
            throw new RuntimeException("Saldo indisponivel");
        }else {
            this.saldo -= valor;
        }

    }

    public void transferencia(Conta c1, Conta c2, double valor) {
        c1.saque(valor);
        c2.deposito(valor);
    }

    public double consultaSaldo() {
        return this.saldo + this.limite;
    }


}
