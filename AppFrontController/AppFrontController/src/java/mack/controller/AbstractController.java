/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controller;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 31400329
 */
public abstract class AbstractController implements Controller {

    private HttpServletRequest request;
    protected String returnPage;

    @Override
    public void init(HttpServletRequest request) {
        this.setRequest(request);
    }

    public void setReturnPage(String page) {
        returnPage = page;
    }

    @Override
    public String getReturnPage() {
        return returnPage;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
//Controlador que recebe uma requisição de página e a envia para o cliente
}
