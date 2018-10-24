import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TinhLaiServlet", urlPatterns = "/tinhtien")
public class TinhLaiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float tiengui = Float.parseFloat(request.getParameter("sotiengui"));
        float laisuat = Float.parseFloat(request.getParameter("laisuat"))/100;
        float sothanggui = Float.parseFloat(request.getParameter("sothanggui"));

        double result = tiengui * Math.pow(1 + laisuat, sothanggui);

        PrintWriter writer = response.getWriter();

        writer.println("<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>So tien gui: " + tiengui + "</h1><br>\n" +
                "<h1>Lai suat: " + laisuat + "</h1><br>\n" +
                "<h1>So thang gui: " + sothanggui + "</h1><br>\n" +
                "<h1>Tong so tien nhan duoc sau khi gui: " + result + "</h1><br>\n" +
                "</body>\n" +
                "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
