/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco;

/**
 *
 * @author estev
 */
public class Banco {
    int saldoMedio;
    boolean bomPagador;
    boolean consecaoEspecial;
    
    public Banco() {
    }

    public String aprovaEmprestimo(int saldoMedio, boolean bomPagador, boolean consecaoEspecial) {
        if(saldoMedio > 1000) {
            return "Empréstimo liberado";
        } else if(saldoMedio < 1000 && bomPagador == true) {
            return "Empréstimo liberado";
        } else if(saldoMedio < 1000 && bomPagador == false && consecaoEspecial == true){
            return "Empréstimo liberado";
        } else {
            return "Empréstimo negado";
        }
    }
}