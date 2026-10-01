//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String name = "Mauricio Marques";
    String typeAccount = "Corrente";
    double charmander = 2000;
    int option = 0;
    double squirtle = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.printf("""
            ***********************
            Dados iniciais do cliente:
            
            Nome: %s
            Tipo conta: %s
            Saldo inicial: R$ %.2f
            ***********************
            """, name, typeAccount, charmander
    );

    while (option != 4 ){

        System.out.println("""
                ****
                Operações
                ***
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                ***
                Digite a opção desejada:
                ***
        """);

        option = scanner.nextInt();

        if (option == 1){
            System.out.println("Saldo da conta: R$ " + charmander);
        } else if (option == 2) {
            System.out.println("Digite o valor a ser recebido:");
            squirtle = scanner.nextDouble();

            charmander = charmander + squirtle;

            System.out.println("O novo saldo é de: R$ " + charmander);
        } else if (option == 3) {

            System.out.println("Digite o valor a ser debitado:");
            squirtle = scanner.nextDouble();

            while (squirtle > charmander){
                System.out.println("Valor acima do saldo atual, tente novamente.");

                System.out.println("Digite o valor a ser debitado:");
                squirtle = scanner.nextDouble();

            }

            charmander = charmander - squirtle;

            System.out.println("O novo saldo é de: R$ " + charmander);
        }else {
            System.out.println("Opcao invalida tente novamente");
        }

        if (option == 4){
            System.out.println("programa encerrado");
        }
    }
}
