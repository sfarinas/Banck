package NelioAula.bancOvo;

public class Usuario {
    private int numero;
    private String nomeCliente;
    private double saldo;

    public Usuario(int numero, String nomeCliente, double depositoInicial) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        novoDeposito(depositoInicial);
    }
    public Usuario(int numero, String nomeCliente) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
    }
    public int getNumero() {
        return numero;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void novoDeposito(double Saldo ){
    saldo += Saldo;
    }
    public void novoSaque(double Saldo ){
    saldo -= Saldo + 5.0;
    }

    @Override
    public String toString() {
        return "CONTA : "
                + numero
                + ", CLIENTE : "
                + nomeCliente + '\''
                + ", SALDO : "
                + String.format("%.2f",saldo);
    }
}
