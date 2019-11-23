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
        //�ܷ���
        double score = 0;
        //�������
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

        //����ܷ���
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html lang=\"en\">");
        out.print("<head>\n" +
                "</head>");
        out.print("<body>");
        out.println("<h3>");
        out.println("һ������ˣ�" + count + "��");
        out.println("<br>");
        out.println("���γɼ�Ϊ��" + score + "��");
        out.println("</h3>");
        out.println("</body>");
        out.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
