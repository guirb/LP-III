/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.dao.usuario;

public final class UsuarioDAOFactory {

    private UsuarioDAOFactory() {
    }

    public static UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAOJPAImpl();
    }
}
//Ao chamar o metodo getUsuarioDAO devolve uma instancia de UsuarioDAOJPAImpl onde contem
//todos os métodos com as query que se comunicam com o banco