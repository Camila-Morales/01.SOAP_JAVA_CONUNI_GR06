package ec.edu.monster.vista;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.con_uni_cmov_soap.R;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class LoginActivity extends AppCompatActivity {

    private EditText inputUsuario;
    private EditText inputContrasena;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputUsuario = findViewById(R.id.inputUsuario);
        inputContrasena = findViewById(R.id.inputContrasena);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = inputUsuario.getText().toString();
                String contrasena = inputContrasena.getText().toString();
                if (!usuario.isEmpty() && !contrasena.isEmpty()) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            login(usuario, contrasena);
                        }
                    }).start();
                } else {
                    Toast.makeText(LoginActivity.this, "Por favor, ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login(String usuario, String contrasena) {
        try {
            String soapRequest = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                    "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ws=\"http://ws.monster.edu.ec/\">" +
                    "<soap:Body>" +
                    "<ws:login>" +
                    "<usuario>" + usuario + "</usuario>" +
                    "<contrasena>" + contrasena + "</contrasena>" +
                    "</ws:login>" +
                    "</soap:Body>" +
                    "</soap:Envelope>";

            URL url = new URL("http://10.40.8.130:8080/ConUni_Soap_Java_Gr06/ConversionUnidades");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            connection.setDoOutput(true);

            OutputStream os = connection.getOutputStream();
            os.write(soapRequest.getBytes("UTF-8"));
            os.close();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                br.close();

                String responseString = response.toString();
                boolean loginSuccess = parseLoginResponse(responseString);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (loginSuccess) {
                            Toast.makeText(LoginActivity.this, "Login exitoso", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(LoginActivity.this, "Login fallido", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            } else {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(LoginActivity.this, "Error en la respuesta del servidor: " + responseCode, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(LoginActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private boolean parseLoginResponse(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));

            NodeList nodes = document.getElementsByTagName("return");
            if (nodes.getLength() > 0) {
                return Boolean.parseBoolean(nodes.item(0).getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}