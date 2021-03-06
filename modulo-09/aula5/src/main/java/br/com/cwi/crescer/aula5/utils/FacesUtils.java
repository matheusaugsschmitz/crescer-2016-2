package br.com.cwi.crescer.aula5.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Carlos H. Nonnemacher
 */
public class FacesUtils {

    public static FacesContext getContext() {
        return FacesContext.getCurrentInstance();
    }

    private static HttpServletRequest getRequest() {
        return (HttpServletRequest) getContext().getExternalContext().getRequest();
    }

    public static HttpSession getSession() {
        return getRequest().getSession(false);
    }

    public static void addMessage(FacesMessage facesMessage) {
        getContext().addMessage(null, facesMessage);
    }

    public static void addSuccessMessage(String message) {
        addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, message, ""));
    }

    public static void addErrorMessage(String message) {
        addMessage(new FacesMessage(FacesMessage.SEVERITY_ERROR, message, ""));
    }
}
