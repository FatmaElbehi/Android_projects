package itbs.bi2.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declaration des composantes
    Button btnqte,btnval;
    EditText edmail,edmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // mettre un fichier xml sur l'ecran
        setContentView(R.layout.activity_main);

        // Recuperation des composantes
        btnqte=findViewById(R.id.btn_qte_auth);
        btnval=findViewById(R.id.btn_val_auth);
        edmail=findViewById(R.id.ed_email_auth);
        edmp =findViewById(R.id.ed_mp_auth);

        // Evenement
        btnqte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               MainActivity.this.finish();
            }
        });
        btnval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // recuperer les chaines saisies
                String mail=edmail.getText().toString();
                String mp=edmp.getText().toString();

                if(mail.equals("azer") && mp.equals("000"))
                {
                    // passage vers l'activite accueil
                    Intent i=new Intent(MainActivity.this,Accueil.class);
                    startActivity(i);
			finish();
                }
                else {
                    // message d'erreur
                    Toast.makeText(MainActivity.this, "information non valide", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}