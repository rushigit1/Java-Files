package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;

import javax.servlet.ServletException;

import javax.servlet.ServletRequest;

import javax.servlet.ServletResponse;

public class MyServelet extends GenericServlet{

public void init()throws ServletException (

}

@Override

public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

PrintWriter pw = res.getWriter();

res.setContentType("text/html");

pw.println("Welcome to servlet programming..!");
}
public void destroyo(){
}
}
