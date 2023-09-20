package com.example.luyentapgiohang2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "AddProduct",value = "/addProduct")
public class CartController extends HttpServlet {
    List<Product> listCart;

    @Override
    public void init() throws ServletException {
        listCart = new ArrayList<>();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String date = req.getParameter("date");

        System.out.println("Dữ liệu nhận từ listView ở trong cartController: " + name);
        Product productFromList = new Product(name, type, date);
        listCart.add(productFromList);

        HttpSession session = req.getSession();
        session.setAttribute("listCart", listCart);
        resp.sendRedirect("list-view.jsp");
    }
}

