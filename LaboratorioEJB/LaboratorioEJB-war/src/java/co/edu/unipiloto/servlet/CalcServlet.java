/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.sessionBean.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int valor1 = Integer.parseInt(request.getParameter("valor1"));
            int valor2 = Integer.parseInt(request.getParameter("valor2"));
            String Bsumar = request.getParameter("Bsumar");
            String Brestar = request.getParameter("Brestar");
            String Bdividir = request.getParameter("Bdividir");
            String Bmultiplicar = request.getParameter("Bmultiplicar");
            String Bmodulo = request.getParameter("Bmodulo");
            String Belevar = request.getParameter("Belevar");
       
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            if(Bsumar != null){
                int resultado = calcBean.sumar(valor1, valor2);
                out.println("<h1>"); out.print("Valor 1 : " + valor1);out.println("</h1>");
                out.println("<h1>"); out.print("Valor 2 : " + valor2);out.println("</h1>");
                out.println("<h1>"); out.print("La suma es igual a : " +resultado);out.println("</h1>");
                out.println("<h1>"); out.print("<p><a href='index.html'>Nueva Operacion</a></p>");out.println("</h1>");
            }else if(Brestar!=null){
                int resultado = calcBean.restar(valor1, valor2);
                out.println("<h1>"); out.print("Valor 1 : " + valor1);out.println("</h1>");
                out.println("<h1>"); out.print("Valor 2 : " + valor2);out.println("</h1>");
                out.println("<h1>"); out.print("La resta es igual a : " +resultado);out.println("</h1>");
                out.println("<h1>"); out.print("<p><a href='index.html'>Nueva Operacion</a></p>");out.println("</h1>");
            }else if(Bdividir!= null){
                double resultado = calcBean.dividir(valor1, valor2);
                out.println("<h1>"); out.print("Valor 1 : " + valor1);out.println("</h1>");
                out.println("<h1>"); out.print("Valor 2 : " + valor2);out.println("</h1>");
                out.println("<h1>"); out.print("La division es igual a : " +resultado);out.println("</h1>");
                out.println("<h1>"); out.print("<p><a href='index.html'>Nueva Operacion</a></p>");out.println("</h1>");
            }else if(Bmultiplicar != null){
                int resultado = calcBean.multiplicar(valor1, valor2);
                out.println("<h1>"); out.print("Valor 1 : " + valor1);out.println("</h1>");
                out.println("<h1>"); out.print("Valor 2 : " + valor2);out.println("</h1>");
                out.println("<h1>"); out.print("La multiplicacion es igual a : " + resultado);out.println("</h1>");
                out.println("<h1>"); out.print("<p><a href='index.html'>Nueva Operacion</a></p>");out.println("</h1>");
            }else if(Bmodulo != null){
                double resultado = calcBean.modulo(valor1, valor2);
                out.println("<h1>"); out.print("Valor 1 : " + valor1);out.println("</h1>");
                out.println("<h1>"); out.print("Valor 2 : " + valor2);out.println("</h1>");
                out.println("<h1>"); out.print("El modulo es igual a : " + resultado);out.println("</h1>");
                out.println("<h1>"); out.print("<p><a href='index.html'>Nueva Operacion</a></p>");out.println("</h1>");
                
            }else if(Belevar != null){
                double resultado = calcBean.elevar(valor1,valor2);
                out.println("<h1>"); out.print("Valor 1 : " + valor1);out.println("</h1>");
                out.println("<h1>"); out.print("Valor 2 : " + valor2);out.println("</h1>");
                out.println("<h1>"); out.print("El numero elevado al cuadrado es igual a  : " + resultado);out.println("</h1>");
                out.println("<h1>"); out.print("<p><a href='index.html'>Nueva Operacion</a></p>");out.println("</h1>");
            
            }  
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
