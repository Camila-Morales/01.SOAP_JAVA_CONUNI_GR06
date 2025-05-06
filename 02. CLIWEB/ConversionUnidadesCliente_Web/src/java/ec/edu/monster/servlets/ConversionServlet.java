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

@WebServlet(name = "ConversionServlet", urlPatterns = {"/ConversionServlet"})
public class ConversionServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Verificar si el usuario está loggeado
        HttpSession session = request.getSession();
        Boolean loggedIn = (Boolean) session.getAttribute("loggedIn");
        if (loggedIn == null || !loggedIn) {
            response.sendRedirect("login.jsp");
            return;
        }

        // Obtener parámetros del formulario
        String accion = request.getParameter("accion");
        String valorStr = request.getParameter("valor");
        Double valor = null;
        String resultado = "";

        try {
            if (valorStr != null && !valorStr.isEmpty()) {
                valor = Double.parseDouble(valorStr);
            }
        } catch (NumberFormatException e) {
            resultado = "Por favor, ingrese un valor numérico válido.";
        }

        if (valor != null && accion != null) {
            ConversionUnidades_Service service = new ConversionUnidades_Service();
            ConversionUnidades port = service.getConversionUnidadesPort();

            if (accion.equals("pulgadasACentimetros")) {
                double centimetros = port.pulgadasACentimetros(valor);
                resultado = String.format("%.2f pulgadas = %.2f centímetros", valor, centimetros);
            } else if (accion.equals("centimetrosAPulgadas")) {
                double pulgadas = port.centimetrosAPulgadas(valor);
                resultado = String.format("%.2f centímetros = %.2f pulgadas", valor, pulgadas);
            }
        }

        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("conversion.jsp").forward(request, response);
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