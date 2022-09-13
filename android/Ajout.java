package itbs.bi2.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Ajout extends AppCompatActivity {

    EditText ednom,edprenom,ednumero;
    Button btnval,btnqte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);

        ednom=findViewById(R.id.ednom_ajout);
        edprenom=findViewById(R.id.edprenom_ajoute);
        ednumero=findViewById(R.id.ednum_ajout);
        btnqte=findViewById(R.id.btnqte_ajout);
        btnval=findViewById(R.id.btnval_ajout);

	btnqte.setOnClickListener(){

		public void onClick(View view)
	{

		Ajout.this.finish();
	}
}

btnval.setOnClickListener(){

		public void onClick(View view)
	{

		String nom=ednom.getText().toString();
		String prenom=edprenom.getText().toString();
		String numero=ednumero.getText().toString();
		Contact c=new Contact(nom,prenom,numero);
		Toast.makeText(Ajout.this,"Ajout ",Toast.LENGTH_SHORT).show();

		Acceuil.data.add(c);
		
	}
	}

    }
}