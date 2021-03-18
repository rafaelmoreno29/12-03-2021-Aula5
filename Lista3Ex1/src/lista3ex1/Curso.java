/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex1;

import java.util.ArrayList;

/**
 *
 * @author Moreno
 */
public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;
    
    public Curso(){
        alunos = new ArrayList<>();
    }
    public Curso(int codigo, String nome, int cargaHoraria){
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(int index){
        alunos.remove(index);
    }
    public String imprimir(){
        return "Código: " + codigo + " - " + nome + " (" + cargaHoraria + ") ";
    }
    public String imprimirCompleto(){
        String retorno = imprimir() + "\n --- ALUNOS ---\n";
        for(Aluno a : alunos){
            retorno += a.imprimir() +"\n";
        }
        return retorno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}
