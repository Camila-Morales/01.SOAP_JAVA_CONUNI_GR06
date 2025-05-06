package ec.edu.monster.servlets;

import ec.edu.monster.controlador.ConversionUnidades;
import ec.edu.monster.controlador.ConversionUnidades_Service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Obtener parámetros del formulario
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        // Consumir el Web Service para validar el login
        ConversionUnidades_Service service = new ConversionUnidades_Service();
        ConversionUnidades port = service.getConversionUnidadesPort();
        boolean loginExitoso = port.login(usuario, contrasena);

        // Usar una sesión para mantener el estado de login
        HttpSession session = request.getSession();
        if (loginExitoso) {
            session.setAttribute("loggedIn", true);
            response.sendRedirect("conversion.jsp");
        } else {
            request.setAttribute("errorMessage", "Credenciales incorrectas. Intente de nuevo.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}