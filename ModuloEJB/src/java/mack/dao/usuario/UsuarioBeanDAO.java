/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.dao.usuario;

import br.mack.ejb.UsuarioBeanDAORemote;
import javax.ejb.Stateless;

/**
 *
 * @author 31400329
 */
@Stateless
public class UsuarioBeanDAO implements UsuarioBeanDAORemote {

    UsuarioDAOJPAImpl dao;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
