public class ContaBancaria{
    String nomeCorrentista;
    double saldo;
    public ContaBancaria(String nome) {
        nomeCorrentista = nome;
    }
    public ContaBancaria(String nome, double saldoInicial) {
        nomeCorrentista = nome;
        saldo = saldoInicial;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public boolean sacar(double valor) throws SaqueInvalidoException {
        if(valor > saldo) {
            throw new SaqueInvalidoException("Valor do saque é maior que seu saldo");
        }
        saldo -= valor;
        return true;
    }
}