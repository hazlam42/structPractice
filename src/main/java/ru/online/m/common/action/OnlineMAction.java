package ru.online.m.common.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import ru.online.m.common.form.OnlineMForm;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class OnlineMAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
                                 ServletResponse response) {


        OnlineMForm onlineMForm = (OnlineMForm) form;
        onlineMForm.setMessage("Online magazine!");

        return mapping.findForward("success");
    }
}
