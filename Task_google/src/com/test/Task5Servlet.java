package com.test;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task5Servlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String operationStr = req.getParameter("operation");
		int operationInt = Integer.parseInt(operationStr);
		
		
		switch (operationInt) {
		case 1:
			
			chislo(req, resp);
				
					
			break;
			
		case 2:
			stroka(req, resp);
			break;
			
		case 3:
			bykva(req, resp);
	
			break;
	
		case 4:
			data(req, resp);
	
			break;
			
		default:
			break;
		}
		
		
		}
	public void chislo(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String s1 = req.getParameter("num1");
		int num1 = Integer.parseInt(s1);
		
		int a=13;
		
		if (num1==a){
			resp.setContentType("text/plain");
			resp.getWriter().println("Chislo vvedeno verno");
		}
		else{
			resp.setContentType("text/plain");
			resp.getWriter().println("Chislo vvedeno neverno");
		}
				
	}
	
	public void stroka(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		String s1 = req.getParameter("num2");
		String a="aaa";
		
		resp.setContentType("text/plain");
		resp.getWriter().println(s1.equals(a));
		
		
				
	}
	
	public void bykva(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		String s1 = req.getParameter("num3");
		char b = s1.charAt(0);
		
		if (b=='a'){
			resp.setContentType("text/plain");
			resp.getWriter().println("Pervaya bykva sovpadaet");
		}
		else{
			resp.setContentType("text/plain");
			resp.getWriter().println("Pervaya bykva ne sovpadaet");
		}
	}
		
		public void data(HttpServletRequest req, HttpServletResponse resp) throws IOException{
			
			String s1 = req.getParameter("num4");
			char a0 = s1.charAt(0);
			char a1 = s1.charAt(1);
			char a2 = s1.charAt(2);
			char a3 = s1.charAt(3);
			char a4 = s1.charAt(4);
			char a5 = s1.charAt(5);
			char a6 = s1.charAt(6);
			char a7 = s1.charAt(7);
			char a8 = s1.charAt(8);
			char a9 = s1.charAt(9);
			
			
			
			if (a2=='-' && a5=='-'){
				resp.setContentType("text/plain");
				resp.getWriter().println("Pravilni format dati");
			}
			else{
				resp.setContentType("text/plain");
				resp.getWriter().println("Nepravilni format dati");
			}
		
				
	}
}