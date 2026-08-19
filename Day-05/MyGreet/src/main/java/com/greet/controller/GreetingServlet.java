package com.greet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GreetingServlet extends HttpServlet {

    private List<String> names = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        names.add(name);

        response.getWriter().println("Name added: " + name);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("Names:");

        for (String name : names) {
            response.getWriter().println(name);
        }
    }

    @Override
    protected void doPut(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String oldName = request.getParameter("oldName");
        String newName = request.getParameter("newName");

        int index = names.indexOf(oldName);

        if (index != -1) {
            names.set(index, newName);
            response.getWriter().println("Name updated");
        } else {
            response.getWriter().println("Name not found");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request,
                            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        if (names.remove(name)) {
            response.getWriter().println("Name deleted");
        } else {
            response.getWriter().println("Name not found");
        }
    }
}