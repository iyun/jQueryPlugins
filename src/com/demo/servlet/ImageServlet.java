package com.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ajaxload的servlet
 * Created by raymax on 2015/11/8.
 */
@WebServlet(name = "ImageServlet")
public class ImageServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out
                .println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("    This is ");
        out.print(this.getClass());
        out.println(", using the GET method");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    /**
     * The doPost method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to post.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //从数据库里面去取图片的地址
        String imageType=request.getParameter("imageType");
        if("image1".equals(imageType)){
            out.println("image/image1.jpg");
        }
        if("2".equals(imageType)){
            out.println("image/image2.jpg");
        }
        if("3".equals(imageType)){
            out.println("image/image1.jpg");
        }
        if("4".equals(imageType)){
            out.println("image/image2.jpg");
        }

        if("5".equals(imageType)){
            out.println("image/image2.jpg");
        }
        if("6".equals(imageType)){
            out.println("image/image1.jpg");
        }
    }

}
