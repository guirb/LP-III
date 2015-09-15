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
import mack.dao.usuario.UsuarioNaoEncontradoException;
import mack.entities.Usuario;

/**
 *
 * @author 31400329
 */
public class UsuarioBuscaIdController extends AbstractController {

    @Override
    public void execute() {
        UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
        int id = Integer.parseInt(this.getRequest().getParameter("id"));
        try {
            Usuario usu = dao.buscaUsuarioPorId(id);
            this.setReturnPage("/resultado.jsp");
            this.getRequest().setAttribute("usuario", usu);
        } catch (UsuarioNaoEncontradoException ex) {
            Logger.getLogger(UsuarioBuscaIdController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
