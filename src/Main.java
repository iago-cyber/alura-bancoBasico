import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Bem vindos ao 12 majestosos.");

        Conta iago = new Conta();
        iago.setNomeCliente("iago");
        iago.setTipoConta("Corrente");
        iago.setSaldoConta(1300.00);

        menu.mostrarInicio(iago.getNomeCliente(),iago.getTipoConta(),iago.getSaldoConta());

        int option=0;
        while(option != 4){
            menu.mostrarMenu();
            option = scanner.nextInt();

            switch (option){
                case 1:
                    menu.consultar(iago.getSaldoConta());
                    break;
                case 2:
                    iago.setSaldoConta(menu.receber(iago.getSaldoConta()));
                    break;
                case 3:
                    iago.setSaldoConta(menu.transferir(iago.getSaldoConta()));
                    break;
                case 4:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        }

    }
}
