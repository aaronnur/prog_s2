public class CaixaEletronicoApp {
    static ContaBancaria conta;
    public static void main(String[]args) {
        String nome = ES.input("Nome do correntista: ");
        double saldoIni = ES.toDouble(ES.input("Saldo inicial: "));
        conta = new ContaBancaria(nome, saldoIni);
        boolean sair = false;
        while (!sair) {
            String opcao = dialogoPrincipal();
            if (opcao.equals("1")) { ES.print("Saldo: R$" + conta.getSaldo()); }
            else if (opcao.equals("2")) { ES.print("Correntista: " + conta.getNomeCorrentista());}
            else if (opcao.equals("3")) { dialogoDepositar();}
            else if (opcao.equals("4")) { dialogoSacar();}
            else if (opcao.equals("0")) {
                sair = true;
                ES.print(" Você escolheu sair!");    
            }
                
            }
         ES.print("Fim!");   
        }
        static String dialogoPrincipal() {
            String msg = "\nMENU PRINCIPAL:" + "\n(1) Mostrar saldo" + "\n(2) Mostrar correntista";
            msg += "\n(3) Depositar" + "\n(4) Sacar" + "\n(0) Sair" + "\nOPÇÃO DESEJADA: ";
            return ES.input(msg);  
        }
        static void dialogoDepositar() {
            double valor = ES.toDouble(ES.input("Valor do depósito: "));
            conta.depositar(valor);
            ES.print("Depósito efetuado!");
        }
        static void dialogoSacar() {
            double valor = ES.toDouble(ES.input("Valor do saque: "));
            try {
                conta.sacar(valor);
                ES.print("Saque efetuado!");
            } catch (SaqueInvalidoException e) {
                ES.print("Erro: " + e.getMessage());
            }
        }
    }
