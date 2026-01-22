import java.util.Scanner;
import java.util.Locale;

    public class Bank {
        static void ImprimeLinha() {
                System.out.print("_______________________________________________\n");
            }
            
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

            System.out.println("Vamos abrir sua nova conta bancária!");
            Bank.ImprimeLinha();
            System.out.println("Digite o nome do titular da conta:");
             String titular = scanner.nextLine();
            System.out.println("Digite uma senha para sua conta (números apenas):");
             int senha = scanner.nextInt();

            ContaBancaria conta = new ContaBancaria();
            conta.abrirConta(titular, senha);

            Bank.ImprimeLinha();
            int opcao = 1;
            while (opcao != 0) {
                System.out.println("Escolha uma operação:");
                System.out.println("1. Sacar\n2. Depositar\n0. Finalizar");
                opcao = scanner.nextInt();
                Bank.ImprimeLinha();
            switch (opcao) {
            case 1:
                System.out.println("Digite a senha da conta para continuar:");
                if (scanner.nextInt() != conta.obterSenha()) {
                    System.out.println("Senha incorreta! Operação cancelada.");
                    break;
                }
                System.out.print("Digite o valor para saque: U$ ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                conta.mostrarSaldo();
                break;
            case 2:
                System.out.println("Digite a senha da conta para continuar:");
                if (scanner.nextInt() != conta.obterSenha()) {
                    System.out.println("Senha incorreta! Operação cancelada.");
                    break;
                }
                System.out.print("Digite o valor para depósito: U$ ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                conta.mostrarSaldo();
                break;
            }
        }
        scanner.close();
    }
}

    class ContaBancaria {
        private static int proximoNumero = 100;
        private int numeroConta;
        private String titular;
        private double saldo;
        private int senha;

        void abrirConta(String titular, int senha) {
            this.titular = titular;
            this.numeroConta = proximoNumero;
            proximoNumero++;
            this.saldo = 0;
            this.senha = senha;

            Bank.ImprimeLinha();
            System.out.println("Conta aberta com sucesso!");
            System.out.println("Titular: " + this.titular);
            System.out.println("Número da conta: |" + this.numeroConta + "|");
            System.out.println("Senha: oculta por motivos de segurança");
            Bank.ImprimeLinha();
        }

        void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            }
        }

        int obterSenha() {
            return this.senha;
        }

        void mostrarSaldo() {
            Bank.ImprimeLinha();
            System.out.printf("Saldo atual: U$ %.2f\n", saldo);
            Bank.ImprimeLinha();
        }

        void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saque inválido, nada foi descontado da sua conta");
            }
        }
    }
    