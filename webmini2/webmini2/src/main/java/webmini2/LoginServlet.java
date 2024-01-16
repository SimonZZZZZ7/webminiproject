package webmini2;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置请求对象字符编码格式Définir le format de codage des caractères de l'objet de requête
        request.setCharacterEncoding("utf-8");
        // 获取登录表单数据 Obtenir les données du formulaire de connexion
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 判断登录是否成功 Déterminer si la connexion a réussi
        if (username.equals("admin") && password.equals("123456")) {
            // 采用重定向，跳转到登录成功页面 Utilisez la redirection pour accéder à la page de réussite de la connexion
            response.sendRedirect("index1.html?username=" + URLEncoder.encode(username, "utf-8"));
        } else {
            // 采用重定向，跳转到登录失败页面 Utilisez la redirection pour accéder à la page d'échec de connexion
            response.sendRedirect("failure.jsp?username=" + URLEncoder.encode(username, "utf-8"));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
