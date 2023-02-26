//Herdamos os métodos e atributos de Conta, mas não herdamos seus construtores!
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override //anotação do compilador, para que a assinatura da reescrita seja a mesma
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
