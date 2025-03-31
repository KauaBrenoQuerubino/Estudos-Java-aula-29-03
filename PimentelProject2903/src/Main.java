import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        Conta c2 = new Conta();
        try {
            String valor = JOptionPane.showInputDialog(null, "Digite o valor para deposito: ");
            c1.deposito(Double.parseDouble(valor));
        }catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Digite um valor valido");
        }



        boolean condicao = true;



        while (condicao){

            String escolha = JOptionPane.showInputDialog(null, "" +
                    "Bem vindo a CAIXA ECONOMICA, digite a funcao que voce deseja executar: " +
                    "\n 1 - para depositar um valor" +
                    "\n 2 - para sacar um valor" +
                    "\n 3 - para realizar uma transferencia" +
                    "\n 4 - para receber o extrato da conta" +
                    "\n 5 - para finalizar a sessao");

            switch (escolha){
                case "1":
                    try {
                        double Deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para deposito: "));
                        c1.deposito(Deposito);
                        JOptionPane.showMessageDialog(null, "Valor atual apos o Deposito: "+ c1.consultaSaldo()
                                + "\nDeposito: +" + Deposito);
                    }catch (Exception e ){
                        JOptionPane.showMessageDialog(null, "Digite um valor valido");
                    }

                    break;
                case "2":
                    try {
                        double Saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para sacar: "));
                        c1.saque(Saque);
                        JOptionPane.showMessageDialog(null, "Valor atual apos o saque: "+ c1.consultaSaldo()
                                + "\nSaque: -" + Saque);
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "O Saldo indisponivel");
                    }

                    break;
                case "3":
                    try{
                        double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Transferencia"));
                        c1.transferencia(c1, c2, valorTransferencia);
                        JOptionPane.showMessageDialog(null, "Valor: " + valorTransferencia + "enviado para Conta: " + c2);
                    }catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, c1.consultaSaldo());
                    break;
                case "5":
                    condicao = false;
                    JOptionPane.showMessageDialog(null, "Obrigado por escolher nosso Sistema, encerrando sessao....");
            }
        }


    }
}