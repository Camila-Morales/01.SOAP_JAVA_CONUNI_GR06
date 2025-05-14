// ConversorModelo.java
package ec.edu.monster.modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.StringReader;

public class ConversionModelo {

    private final String SERVICE_URL = "http://10.40.8.130:8080/ConUni_Soap_Java_Gr06/ConversionUnidades";

    public String convertirCentimetrosAPulgadas(double centimetros) {
        String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" "
                + "xmlns:ws=\"http://ws.monster.edu.ec/\">"
                + "<soapenv:Header/>"
                + "<soapenv:Body>"
                + "<ws:centimetrosAPulgadas>"
                + "<centimetros>" + centimetros + "</centimetros>"
                + "</ws:centimetrosAPulgadas>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";
        return enviarSolicitud(xmlRequest);
    }

    public String convertirPulgadasACentimetros(double pulgadas) {
        String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" "
                + "xmlns:ws=\"http://ws.monster.edu.ec/\">"
                + "<soapenv:Header/>"
                + "<soapenv:Body>"
                + "<ws:pulgadasACentimetros>"
                + "<pulgadas>" + pulgadas + "</pulgadas>"
                + "</ws:pulgadasACentimetros>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";
        return enviarSolicitud(xmlRequest);
    }

    private String enviarSolicitud(String xmlRequest) {
        String respuesta = null;
        try {
            URL url = new URL(SERVICE_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            connection.setDoOutput(true);

            OutputStream os = connection.getOutputStream();
            os.write(xmlRequest.getBytes("UTF-8"));
            os.close();

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                respuesta = parsearRespuesta(response.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    private String parsearRespuesta(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));

            NodeList nodes = document.getElementsByTagName("return");
            if (nodes.getLength() > 0) {
                return nodes.item(0).getTextContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
