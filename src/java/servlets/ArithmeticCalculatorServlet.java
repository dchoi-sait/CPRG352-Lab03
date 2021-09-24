/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 775262
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "--");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fNum = request.getParameter("fNum");
        String sNum = request.getParameter("sNum");
        String ari = request.getParameter("ari");
        String reg = "^[\\d]+$";

        System.out.print(request);

        if (fNum.matches(reg)) {
            request.setAttribute("fNum", fNum);
        }
        if (sNum.matches(reg)) {
            request.setAttribute("sNum", sNum);
        }

        if (fNum == null || fNum.trim().equals("") || sNum == null || sNum.trim().equals("") || !sNum.matches(reg) || !fNum.matches(reg)) {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        switch (ari) {
            case "+":
                request.setAttribute("result", Integer.parseInt(fNum) + Integer.parseInt(sNum));
                break;
            case "-":
                request.setAttribute("result", Integer.parseInt(fNum) - Integer.parseInt(sNum));
                break;
            case "*":
                request.setAttribute("result", Integer.parseInt(fNum) * Integer.parseInt(sNum));
                break;
            case "%":
                request.setAttribute("result", Integer.parseInt(fNum) % Integer.parseInt(sNum));
                break;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
