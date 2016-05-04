/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import br.com.elearning.facade.Facade;
import br.com.praticas.model.Usuario;
import br.com.praticas.servlets.CadastrarUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class TesteMais {

    public static void main(String[] args) {
        try {
//            Usuario user = new Facade().buscarUsuario("KRNTor", "Wanderson31");
//            System.out.println(user.toString());
            Usuario user = new Usuario();
            user.setNome("Felipe");
            user.setNick("Felipe");
            user.setSenha("senha123");
            user.setEmail("felipe@gmail.com");
            user.setTipo("J");

            try {
                new Facade().salvarUsuario(user);
            } catch (Exception ex) {
                Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(TesteMais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
