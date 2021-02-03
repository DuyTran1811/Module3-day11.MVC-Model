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
                showCreateSmartPhone(request, response);
                break;
            case "edit":
                showEditSmartPhone(request, response);
                break;
            case "delete":
                showDeleteSmartPhone(request, response);
                break;
            case "view":
                break;
            default:
                showAllSmartPhone(request, response);
                break;
        }
    }

    private void showDeleteSmartPhone(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        SmartPhone smartPhone = smartPhoneService.findById(id);
        RequestDispatcher dispatcher;
        if (smartPhone == null) {
            dispatcher = request.getRequestDispatcher("/index.jsp");
        } else {
            request.setAttribute("sp", smartPhone);
            dispatcher = request.getRequestDispatcher("smartphone/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditSmartPhone(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("smartphone/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateSmartPhone(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("smartphone/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showAllSmartPhone(HttpServletRequest request, HttpServletResponse response) {
        List<SmartPhone> list = smartPhoneService.findAll();
        request.setAttribute("listSmartPhone", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("smartphone/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createSmartPhone(request, response);
                break;
            case "edit":
                editSmartPhone(request, response);
                break;
            case "detele":
                deleteSmartPhone(request, response);
                break;
        }
    }

    private void deleteSmartPhone(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        smartPhoneService.deleteById(id);
        try {
            response.sendRedirect("/smartphone");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editSmartPhone(HttpServletRequest request, HttpServletResponse response) {
    }

    private void createSmartPhone(HttpServletRequest request, HttpServletResponse response) {
        String brand = request.getParameter("brand");
        String name = request.getParameter("name");
        float price = Integer.parseInt(request.getParameter("price"));
        String yearproduct = request.getParameter("yearproduct");
        String sezicreen = request.getParameter("sezicreen");
        int id = (int) (Math.random() * 10000);
        SmartPhone smartPhone = new SmartPhone(id, brand, name, price, yearproduct, sezicreen);
        smartPhoneService.save(smartPhone);
        RequestDispatcher dispatcher = request.getRequestDispatcher("smartphone/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
