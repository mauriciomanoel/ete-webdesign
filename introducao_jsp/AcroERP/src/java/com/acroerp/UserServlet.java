/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acroerp;

import com.acroerp.beans.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abhi
 */
public class UserServlet extends HttpServlet {

    Connection dbConnection = null;

    @Override
    public void init() throws ServletException {
        super.init();
        connectDB();
    }
    void connectDB(){
        try {
            //STEP 2: Register JDBC driver
            Class.forName(Conexao.JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            dbConnection = DriverManager.getConnection(Conexao.DB_URL, Conexao.USER, Conexao.PASS);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Statement stmt;
        try {
            if(dbConnection==null)
                connectDB();
            stmt = dbConnection.createStatement();

            RequestDispatcher dispatcher = null;
            String sql;
            sql = "SELECT * FROM user";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<User> users = new ArrayList<User>();
            
            while (rs.next()){;
                User user = new User();
                user.setEmail(rs.getString("email"));
                user.setName(rs.getString("name"));
                user.setPhone(rs.getString("phone"));
                users.add(user);
            }
            
            System.out.println(users.size());
            request.setAttribute("usersDb", users);           
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        RequestDispatcher dispatcher = request.getRequestDispatcher("UsersJSP.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
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
