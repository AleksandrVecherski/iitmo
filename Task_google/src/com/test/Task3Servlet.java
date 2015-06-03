package com.test;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String operationStr = req.getParameter("operation");
		int operationInt = Integer.parseInt(operationStr);
		
		
		switch (operationInt) {
		case 1:
			
			String s1 = req.getParameter("num1");
			int num1 = Integer.parseInt(s1);
			String s2 = req.getParameter("num2");
			int num2 = Integer.parseInt(s2);
			
			//char U = (char) num1;
			
			double str=(num2-num1)/10;
			int kstr= (int) str;
			
			int a=num1;
			int b=num2;
			
			if ((num1<num2)&&(num1>0)&&(num1<65536)&&(num2>0)&&(num2<65536)){
				String out1 = "<table border='1'>";
				for (int i = 0; i < kstr+1; i++){
					out1+= "<tr>";
					
					for (int j = 0; j < 10; j++){
						out1 += "<td>";
						char U = (char) a;
						out1 += String.valueOf(U);
						out1+=" ";
						out1 += String.valueOf(a);
						out1+=" ";
						out1 += String.valueOf(Integer.toHexString( 0x10000 | a).substring(1).toUpperCase());
						out1 += "</td> ";
						if (a==b){
							break;
						}
						a++;
					}	
					out1 += "</tr>";
				}
				
				out1 += "</table>";
				
				resp.setContentType("text/plain");
				resp.getWriter().println(out1);				
			}
			else{
				resp.setContentType("text/plain");
				resp.getWriter().println("Neverno vvedeni chicla");
			}
											
			break;
		case 2:
			
			break;
		
		}
		
	}
}