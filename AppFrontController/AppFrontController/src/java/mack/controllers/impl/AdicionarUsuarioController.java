/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controller.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

/**
 *
 * @author Guilherme
 */
public class AdicionarUsuarioController extends AbstractController {

    @Override
    public void execute() {
        try {
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            Usuario usu = dao.criaUsuario(this.getRequest().getParameter("nome"),
                    this.getRequest().getParameter("sobrenome"));
            this.setReturnPage("/resultado.jsp");
            this.getRequest().setAttribute("usuario", usu);
        } catch (Exception ex) {
            Logger.getLogger(ListaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
