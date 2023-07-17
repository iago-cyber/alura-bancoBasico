public class Conta {
    private String nomeCliente = "";
    private String tipoConta = "";
    private Double saldoConta = 0.0;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
