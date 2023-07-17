import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void mostrarInicio(String nome, String tipo, Double saldo){
        System.out.println("***************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome: "+nome);
        System.out.println("Tipo de conta: "+tipo);
        System.out.println("Saldo inicial: "+saldo);
        System.out.println("***************************");
    }

    public void mostrarMenu(){
        System.out.println("Operações disponiveis:");
        System.out.println("1-Consultar saldo");
        System.out.println("2-Receber valor");
        System.out.println("3-Transferir valor");
        System.out.println("4-Sair");
        System.out.println("");
        System.out.println("Digite a opção desejada:");
    }

    public void consultar(Double saldo){
        System.out.println("O saldo atual é: R$"+saldo);
        System.out.println("");
    }
    public Double receber(Double saldo){
        System.out.println("Informe o valor a receber:");
            saldo += scanner.nextDouble();
        System.out.println("Saldo atualizado R$"+saldo);
        System.out.println("");
        return saldo;
    }
    public Double transferir(Double saldo){
        System.out.println("Informe o valor a transferir:");

        Double condicaoDoSaldo = saldo - scanner.nextDouble();

        if(saldo>0){
            if(condicaoDoSaldo>=0) {
                saldo = condicaoDoSaldo;
                System.out.println("Saldo atualizado R$" + saldo);
                System.out.println("");
                return saldo;
            }
            else{
                System.out.println("Não há saldo suficiente");
                System.out.println("Seu saldo é: R$"+saldo);
                System.out.println("");
                return saldo;
            }
        }
        else {
            System.out.println("Valor invalido.");
            System.out.println("");
            return saldo;
        }
    }
}
