/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controller.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

/**
 *
 * @author 31400329
 */
public class UsuarioBuscaNomeController extends AbstractController {

    @Override
    public void execute() {
        try {
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            Collection usuarios = dao.buscaUsuarioPorNome(this.getRequest().getParameter("nome"));
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioBuscaIdController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
