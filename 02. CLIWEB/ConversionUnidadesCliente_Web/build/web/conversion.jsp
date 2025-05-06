<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversión de Unidades</title>
    <style>
        body { font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; background-color: #f0f0f0; }
        .conversion-container { background-color: white; padding: 20px; border-radius: 5px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 400px; text-align: center; }
        .resultado { color: green; margin-top: 10px; }
        input[type="text"] { width: 100%; padding: 8px; margin: 10px 0; box-sizing: border-box; }
        input[type="submit"] { background-color: #4CAF50; color: white; padding: 10px; border: none; border-radius: 3px; cursor: pointer; margin: 5px; }
        input[type="submit"]:hover { background-color: #45a049; }
    </style>
</head>
<body>
    <div class="conversion-container">
        <h2>Conversión de Unidades</h2>
        <form action="ConversionServlet" method="post">
            <label for="valor">Valor:</label>
            <input type="text" id="valor" name="valor" required>
            <input type="submit" name="accion" value="pulgadasACentimetros" onclick="this.form.action='ConversionServlet';" />
            <input type="submit" name="accion" value="centimetrosAPulgadas" onclick="this.form.action='ConversionServlet';" />
        </form>
        <% if (request.getAttribute("resultado") != null) { %>
            <p class="resultado"><%= request.getAttribute("resultado") %></p>
        <% } %>
    </div>
</body>
</html>