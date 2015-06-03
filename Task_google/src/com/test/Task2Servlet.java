package com.test;
import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String operationStr = req.getParameter("operation");
		int operationInt = Integer.parseInt(operationStr);
				
		switch (operationInt) {
		case 1:
			String s1 = req.getParameter("chislo311");
			int chislo311 = Integer.parseInt(s1);
			String s2 = req.getParameter("chislo312");
			int chislo312 = Integer.parseInt(s2);
			
			double raz1=Math.abs(10-chislo311);
			double raz2=Math.abs(10-chislo312);
			
			if (raz1<raz2){
			resp.setContentType("text/plain");
			resp.getWriter().println(String.valueOf(chislo311));
			}
			else{
			resp.setContentType("text/plain");
			resp.getWriter().println(String.valueOf(chislo312));
			}
			break;
		case 2:
			String s3 = req.getParameter("chislo321");
			int a = Integer.parseInt(s3);
			String s4 = req.getParameter("chislo322");
			int b = Integer.parseInt(s4);
			String s5 = req.getParameter("chislo323");
			int c = Integer.parseInt(s5);
			
						
			
		    int d=b*b-4*a*c;
			if (d>=0){
				double x1=(-b+Math.sqrt(d))/(2*a);
				double x2=(-b-Math.sqrt(d))/(2*a);
				resp.setContentType("text/plain");
				resp.getWriter().println(String.valueOf(x1));
				resp.setContentType("text/plain");
				resp.getWriter().println(String.valueOf(x2));
				
			}
			else{
				resp.setContentType("text/plain");
				resp.getWriter().println("Net korney");
			}
			
			break;
		case 3:
			int q = 8;
			int w = 5;
			int [][] array1 =new int [q][w];
			
			Random ran = new Random();
			for (int i = 0; i < q; i++){
				for (int j = 0; j < w; j++){
					array1[i][j] = ran.nextInt(119)-10;
				}				
			}
			
			String out1 = "<table border='1'>";
			for (int i = 0; i < q; i++){
				out1+= "<tr>";
				
				for (int j = 0; j < w; j++){
					out1 += "<td>";
					out1 += String.valueOf(array1[i][j]);
					out1 += "</td> ";
				}	
				
				out1 += "</tr>";
			}
			
			out1 += "</table>";
			
			resp.setContentType("text/plain");
			resp.getWriter().println(out1);
			
	
			break;
		case 4:
			int x = 5;
			int y = 8;
			int [][] array =new int [x][y];
			
			Random rand = new Random();
			for (int i = 0; i < x; i++){
				for (int j = 0; j < y; j++){
					array[i][j] = rand.nextInt(199) - 100;
				}				
			}
			int max=array[0][0];
			String out = "<table border='1'>";
			for (int i = 0; i < x; i++){
				out += "<tr>";
				
				for (int j = 0; j < y; j++){
					out += "<td>";
					out += String.valueOf(array[i][j]);
					out += "</td> ";
					if (array[i][j]>max){
						max=array[i][j];
					}
				}	
				
				out += "</tr>";
			}
			
			out += "</table>";
			
			resp.setContentType("text/plain");
			resp.getWriter().println(out);
			resp.setContentType("text/plain");
			resp.getWriter().println(String.valueOf(max));
			
			break;

		default:
			break;
		}
		
		
	}

	
}
