/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocontabancaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Moreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        String banco,conta,agencia,tipo;
        double valor,limite;
        ContaBancaria contaBancaria = null;
        ContaBancaria contaBancariaSelecionada = null;
        ArrayList<ContaBancaria> listContaBancaria = new ArrayList<>();
        while(opc != 6){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Criar Conta\n2 - Sacar\n3 - Depositar\n4 - Extrato\n5 - Aumentar Limite\n6 - Sair"));
           
            // se opção 2,3,4 ou 5 - localiza a conta que irá manipular.
            if(opc >= 2 && opc <= 5){
                contaBancariaSelecionada = null;
                conta = JOptionPane.showInputDialog("Digite a conta");
                for(ContaBancaria cb : listContaBancaria){
                    if(cb.getConta().equals(conta)){
                        contaBancariaSelecionada = cb;
                    }
                }
                if(contaBancariaSelecionada == null)
                    continue;
            }
            
            switch(opc){
                case 1: 
                    banco = JOptionPane.showInputDialog("Banco");
                    agencia = JOptionPane.showInputDialog("Agência");
                    conta = JOptionPane.showInputDialog("Conta");
                    tipo = JOptionPane.showInputDialog("Tipo");
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Saldo"));
                    limite = Double.parseDouble(JOptionPane.showInputDialog("Limite"));
                    contaBancaria = new ContaBancaria(banco, agencia, conta, tipo, valor, limite);
                    listContaBancaria.add(contaBancaria);
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque"));
                    if(contaBancariaSelecionada.sacar(valor))
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.");
                    else
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente.","Atenção",JOptionPane.ERROR_MESSAGE); 
                    break;
                case 3: 
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito"));
                    contaBancariaSelecionada.depositar(valor);
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, contaBancariaSelecionada.verExtrato());
                    break;
                case 5: 
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Novo Valor limite"));
                    contaBancariaSelecionada.setValorLimite(valor);
                    break;
                case 6: break;
            }
                    
        }
    }
    
}
