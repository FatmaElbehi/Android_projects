package itbs.bi2.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Accueil extends AppCompatActivity {

    String nom,prenom,numero;
	public Contact(String nom, String prenom, String numero)
{
			this.nom=nom;
			this.prenom=prenom;
			this.numero=numero;
}

public Contact(int id,String nom, String prenom, String numero)
{
			this.id=id;
			this.nom=nom;
			this.prenom=prenom;
			this.numero=numero;
}

Generate Methode toString(){



}

}