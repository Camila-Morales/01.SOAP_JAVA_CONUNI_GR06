// MainActivity.java
package ec.edu.monster.vista;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ec.edu.monster.controlador.ConversionControlador;
import com.example.con_uni_cmov_soap.R;

public class MainActivity extends AppCompatActivity {

    private EditText inputCentimetros;
    private EditText inputPulgadas;
    private Button btnConvertir;
    private Button btnConvertirAPulgadas;
    private TextView textResultado;
    private ConversionControlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputCentimetros = findViewById(R.id.inputCentimetros);
        inputPulgadas = findViewById(R.id.inputPulgadas);
        btnConvertir = findViewById(R.id.btnConvertir);
        btnConvertirAPulgadas = findViewById(R.id.btnConvertirAPulgadas);
        textResultado = findViewById(R.id.textResultado);
        controlador = new ConversionControlador();

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String centimetros = inputCentimetros.getText().toString();
                if (!centimetros.isEmpty()) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            String resultado = controlador.convertirCentimetrosAPulgadas(Double.parseDouble(centimetros));
                            runOnUiThread(() -> {
                                if (resultado != null) {
                                    textResultado.setText("Resultado: " + resultado + " pulgadas");
                                } else {
                                    Toast.makeText(MainActivity.this, "Error al realizar la conversión", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }).start();
                } else {
                    Toast.makeText(MainActivity.this, "Ingrese un valor en centímetros", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnConvertirAPulgadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pulgadas = inputPulgadas.getText().toString();
                if (!pulgadas.isEmpty()) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            String resultado = controlador.convertirPulgadasACentimetros(Double.parseDouble(pulgadas));
                            runOnUiThread(() -> {
                                if (resultado != null) {
                                    textResultado.setText("Resultado: " + resultado + " centímetros");
                                } else {
                                    Toast.makeText(MainActivity.this, "Error al realizar la conversión", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }).start();
                } else {
                    Toast.makeText(MainActivity.this, "Ingrese un valor en pulgadas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
