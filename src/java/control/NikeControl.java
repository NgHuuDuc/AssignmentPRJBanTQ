/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class NikeControl extends HttpServlet {

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
        String ID = request.getParameter("ID");

        DAO dao = new DAO();
        List<Product> listP = dao.getAllProducts();

        request.getRequestDispatcher("Nike.jsp").forward(request, response);
        //b1 get total 

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
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
//        String ID = request.getParameter("ID");
        List<Product> listP = dao.getProductByBrandID("1");

        String sort = request.getParameter("sort");
        if (sort == null){
            sort = "name";
        }
        if (sort.equals("name")) {
            sortProductByName(listP);
        }
        if (sort.equals("price")) {
            sortProductByPrice(listP);
        }
        request.setAttribute("listP", listP );
        request.setAttribute("sort", sort);
        request.getRequestDispatcher("Nike.jsp").include(request, response);

    }

    public static void sortProductByName(List<Product> list) {
        Collections.sort(
                list,
                new Comparator<Product>() {
            @Override
            public int compare(Product firstProduct, Product secondProduct) {
                return firstProduct
                        .getName()
                        .toLowerCase()
                        .compareTo(secondProduct.getName().toLowerCase());
            }
        }
        );
    }

    public static void sortProductByPrice(List<Product> list) {
        Collections.sort(
                list,
                new Comparator<Product>() {
            @Override
            public int compare(Product firstProduct, Product secondProduct) {
                return secondProduct
                        .getPrice()
                        - firstProduct.getPrice();
            }
        }
        );
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
