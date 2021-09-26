/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.banco.Banco;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author estev
 */
public class BancoTest {
    Banco b;
    public BancoTest() {
        b = new Banco();
    }
    
    @Test
    public void emprestimoLiberado(){
        assertEquals("Empréstimo liberado", b.aprovaEmprestimo(1200, true, true));
        assertEquals("Empréstimo liberado", b.aprovaEmprestimo(800, true, false));
        assertEquals("Empréstimo liberado", b.aprovaEmprestimo(800, false, true));
    }
    
    @Test
    public void emprestimoNegado(){
        assertEquals("Empréstimo negado", b.aprovaEmprestimo(800, false, false));
    }

}
