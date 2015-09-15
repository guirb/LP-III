/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

/**
 *
 * @author Guilherme
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controller.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;

public class RemoverUsuarioController extends AbstractController {

    @Override
    public void execute() {
        try {
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            dao.removeUsuario(Integer.parseInt(this.getRequest().getParameter("id")));
            this.setReturnPage("/index.html");
        } catch (Exception ex) {
            Logger.getLogger(ListaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
