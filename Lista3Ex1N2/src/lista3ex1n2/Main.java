/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex1n2;

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
        int cod, ch;
        String nome;
        ArrayList<Curso> listCurso = new ArrayList<>();
        Curso cursoSelecionado = null;
        while(opc != 6){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Curso\n"
                    + "2 - Criar Aluno\n"
                    + "3 - Remover Aluno\n4 - Mostrar Todos os Cursos\n"
                    + "5 - Mostrar Alunos do curso\n6 - Sair"));
            if(opc == 2 || opc == 3 || opc == 5){
                cursoSelecionado = null;
                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do curso"));
                for(Curso c : listCurso){
                    if(c.getCodigo() == cod)
                        cursoSelecionado = c;
                }
                if(cursoSelecionado == null)
                    continue;
            }
            
            switch(opc){
                case 1: 
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                    nome = JOptionPane.showInputDialog("Nome");
                    ch = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária"));
                    listCurso.add(new Curso(cod, nome, ch));
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                default: break;
            }
        }
    }
    
}
