/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.dao.usuario;

final class UsuarioDAOConstantes {

    static public final String URL = "jdbc:derby://localhost:1527/MeuBD";
    static public final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static public final String USER = "guirib";
    static public final String PASSWORD = "guirib";
    static public final String USUARIO_DATASOURCE_NAME = "java:comp/env/jdbc/FilmesNonXADataSource";
    static public final String USUARIO_TABLE_NAME = "tb_usuario";
    static public final String USUARIO_ID_SEQUENCE_NAME = "usuario_id_seq";

    private UsuarioDAOConstantes() {
    }
}
