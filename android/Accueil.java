package itbs.bi2.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Accueil extends AppCompatActivity {

    public static ArrayList<Contact> data=new ArrayList<Contact>();	
	

    Button btnajout,btnaffiche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	//set fichier xml dans notre ecran
        setContentView(R.layout.activity_accueil);

        btnaffiche=findViewById(R.id.btnaffiche_acc);
        btnajout=findViewById(R.id.btnajout_acc);

	btnajout.setOnClickListener(new View.OnClickListener(){
	//le contexte est une activité qui gére l'écran
		----------
		Intent i =new Intent(Acceuil.this.Ajout.class);
		startActivity(i);
	}

	btnaffiche.setOnClickListener(new View.OnClickListener(){
	//le contexte est une activité qui gére l'écran
		----------
		startActivity(new Intent(Acceuil.this.Affiche.class));
	}

	
	
    }
}