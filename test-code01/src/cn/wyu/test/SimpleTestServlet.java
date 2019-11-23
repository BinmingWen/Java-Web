package cn.wyu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "SimpleTestServlet", urlPatterns = {"/QuestionServlet"})
public class SimpleTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String c1 = request.getParameter("c1");
        String[] c2 = request.getParameterValues("c2");
        String ser = request.getParameter("ser").trim();
        String c3 = request.getParameter("c3");
        //总分数
        double score = 0;
        //答对题数
        int count = 0;
        if (c1 != null && c1.equals("1")) {
            score += 25;
            count++;
        }
        if (c2 != null && c2.length == 2 && c2[0].equals("1") && c2[1].equals("1")) {
            score += 25;
            count++;

        }
        if (ser != null && ser.equals("HttpServlet") || ser.equals("javax.servlet.http.HttpServlet")) {
            score += 25;
            count++;
        }
        if (c3 != null && c3.equals("1")) {
            score += 25;
            count++;
        }

        //输出总分数
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html lang=\"en\">");
        out.print("<head>\n" +
                "</head>");
        out.print("<body>");
        out.println("<h3>");
        out.println("一共答对了：" + count + "题");
        out.println("<br>");
        out.println("本次成绩为：" + score + "分");
        out.println("</h3>");
        out.println("</body>");
        out.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
