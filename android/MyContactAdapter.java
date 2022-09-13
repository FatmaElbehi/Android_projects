package itbs.bi2.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class MyContactAdapter extends BaseAdapter{
	//role d'adapter: creation des views
	// implementer les methodes prédifinies dans baseAdapter

	Context con;
	ArrayList<Contact> data;
		public MyContactAdapter(Context con,ArrayList<Contact> data)
	{
		this.con=con;
		this.data=data;
	}
	public int getCount(){
		//nbr des views  à creer
		return data.size();

	}


public View getView(int position, View view,ViewGroup viewGroup){
		//la creation d'un seul view

		LayoutInflater inf=LayoutInflater.from(con);
		View v=inf.inflate(R.Layout.view_contact,null);
			TextView tnom=v.findViewById(R.id.tvnom_viewcontact);	
TextView tprenom=v.findViewById(R.id.tvprenmom_viewcontact);
	TextView tnumero=v.findViewById(R.id.tvnumero_viewcontact);
ImageView imageDelete=v.findViewById(R.id.imageview_delete_viewcontact);
ImageView imageEdit=v.findViewById(R.id.imageview_edit_viewcontact);
ImageView imageCall=v.findViewById(R.id.imageview_call_viewcontact);
		
imageDelete.setOnClickListener(nw View....){

	public void onClick(View view){

		data.remove(position);
		notifyDataSetChanged();//fonction prédifinie relative au adapter.

	}


});
	return v;
		
		/*TextView t=new TextView(con);
		t.setText(data.get(position).toString());*/
		
	}

    }
}