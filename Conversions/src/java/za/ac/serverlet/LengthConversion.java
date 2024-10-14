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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.java.Convert;

/**
 *
 * @author Desmond
 */
public class LengthConversion extends HttpServlet {

   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opt=request.getParameter("opt");
        double num1=Double.parseDouble(request.getParameter("num1"));
        
        Convert ln=new Convert();
        String answer=ln.convertLength(opt, num1);
        request.setAttribute(answer,"answer");
            
        RequestDispatcher rd=request.getRequestDispatcher("Length.jsp");
        rd.forward(request, response);
    }

    

}
