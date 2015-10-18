/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.entities;

/**
 *
 * @author 31400329
 */
public interface Usuario {

    public int getId();

    public String getNome();

    public String getSobrenome();

    public void setNome(String nome);

    public void setSobrenome(String sobrenome);
}
