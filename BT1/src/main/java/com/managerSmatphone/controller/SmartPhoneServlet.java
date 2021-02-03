package com.managerSmatphone.controller;

import com.managerSmatphone.controller.model.SmartPhone;
import com.managerSmatphone.controller.service.ISmartPhoneService;
import com.managerSmatphone.controller.service.SmartPhoneService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SmartPhoneServlet", value = "/smartphone")
public class SmartPhoneServlet extends HttpServlet {
    private static final ISmartPhoneService smartPhoneService = new SmartPhoneService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:
                showAllSmartPhone(request,response);
                break;
        }
    }

    private void showAllSmartPhone(HttpServletRequest request, HttpServletResponse response) {
        List<SmartPhone> list = smartPhoneService.findAll();
        request.setAttribute("listSmartPhone",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("smartphone/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
