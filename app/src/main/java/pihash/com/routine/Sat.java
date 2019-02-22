package pihash.com.routine;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Sat extends AppCompatActivity {

    ListView listView;
    DatabasedHelper  mydb;
    Cursor cursor;
    ListDataAdpter  listDataAdpter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.listView);
        mydb=new DatabasedHelper(this);
        cursor= mydb.getInformation();
        listDataAdpter= new ListDataAdpter(getApplicationContext(),R.layout.contactlistview);
        listView.setAdapter(listDataAdpter);

        if (cursor.moveToFirst())
        {
            do {
                String classname,time,room,feculty;

                classname=cursor.getString(cursor.getColumnIndex(RoutineTableInfo.Newinfo.Uclss));
                time = cursor.getString(cursor.getColumnIndex(RoutineTableInfo.Newinfo.Utime));
                room = cursor.getString(cursor.getColumnIndex(RoutineTableInfo.Newinfo.Uroom));
                feculty = cursor.getString(cursor.getColumnIndex(RoutineTableInfo.Newinfo.Ufeculty));

                ContactInfo contactInfo =new ContactInfo(classname,time,room,feculty);
                listDataAdpter.add(contactInfo);

            }while (cursor.moveToNext());
            {

            }

        }



    }
    public  void addactivity(View v){
        Intent i=new Intent(Sat.this,AddRoutine.class);
        startActivity(i);
        finish();

    }

}
