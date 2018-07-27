package ru.online.m.common.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import ru.online.m.common.form.RegistrationForm;
import ru.online.m.common.services.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) {
        RegistrationForm registrationForm = (RegistrationForm) form;
        LoginService loginService = new LoginService();

        try {
            if (loginService.addLogin(registrationForm)) {
                return mapping.findForward("success");
            } else {
                return mapping.findForward("failure");
            }
        } catch (Exception e) {
            return mapping.findForward("failure");
        }
    }
}
