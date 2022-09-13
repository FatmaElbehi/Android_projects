package itbs.bi2.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class Affiche extends AppCompatActivity {

    EditText edreche;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche);

        edreche=findViewById(R.id.edrecherche);
        lv=findViewById(R.id.lv_affiche);
	//android.R.Layout.simple_list_item_1 : simple xml file
	/* ArrayAdapter ad=new ArrayAddapter(Afficher.this,android.R.Layout.simple_list_item_1,Acceuil.data);
	//role de l'adapter: creation des views
	
	MyContactAdapter ad=new MyContactAdapter(Afficher.this,Acceuil.data)
	lv.setAdapter(ad); 	
	

	//comment creer un adapter?	
		

    }
}