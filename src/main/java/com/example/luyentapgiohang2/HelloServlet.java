package com.example.luyentapgiohang2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private List<Product> products;
    private Product product;
    public void init() {
        products = new ArrayList<>();
        Product product1 = new Product("Chổi","dụng cụ","2021");
        Product product2 = new Product("Quạt","dụng cụ","2021");
        Product product3 = new Product("Áo","quần áo","2023");
        Product product4 = new Product("Quần","quần áo","2022");
        System.out.println(product1.getName());
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute("Data",products);
        try {
            request.getRequestDispatcher("list-view.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
    public void destroy() {
    }
}