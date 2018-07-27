package ru.online.m.common.form;

import org.apache.struts.action.ActionForm;

public class OnlineMForm extends ActionForm {

    private static final long serialVersionUID = 9031730229605941260L;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
