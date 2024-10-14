/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.java.Convert;

/**
 *
 * @author Desmond
 */
@WebServlet(name = "conversionServerlet", urlPatterns = {"/conversionServerlet.do"})
public class conversionServerlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //getInfo
        
            String opt=request.getParameter("opt");
            double num=Double.parseDouble(request.getParameter("num"));
            //initialise
            Convert con=new Convert();
            String answer=con.convertMass(opt, num);
            request.setAttribute("answer", answer);
            //
            RequestDispatcher disp=request.getRequestDispatcher("disp.jsp");
            disp.forward(request, response);
    }



}
