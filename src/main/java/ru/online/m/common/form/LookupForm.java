package ru.online.m.common.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class LookupForm extends ActionForm {
    private static final long serialVersionUID = 5333143777016975784L;
    private String professionId = null;
    private String professionName = null;

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.professionId = null;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors ae = new ActionErrors();
        if (professionId == null || professionId.trim().isEmpty()) {
            ae.add("professionId", new ActionMessage("errors.lookup.symbol.required"));
        }
        return ae;
    }
}
