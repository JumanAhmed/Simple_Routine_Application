package pihash.com.routine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Week extends AppCompatActivity {

    ListView lvweek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);
        lvweek = (ListView) findViewById(R.id.lvweek);

        final String weekname[]={"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        ArrayAdapter adapter=new ArrayAdapter(getApplication(), R.layout.listlayout, R.id.mainlist, weekname);

        lvweek.setAdapter(adapter);

        lvweek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                switch (position)
                {
                    case 0:
                          Intent iSat = new Intent(getApplicationContext(),Sat.class);
                           startActivity(iSat);
                        break;

                    case 1:
                        Intent iSun = new Intent(getApplicationContext(),Sunday.class);
                        startActivity(iSun);

                        break;

                    case 2:
                        Intent iMon = new Intent(getApplicationContext(),Monday.class);
                        startActivity(iMon);
                          break;

                    case 3:
                        Intent iTue = new Intent(getApplicationContext(),Tuesday.class);
                        startActivity(iTue);
                          break;

                    case 4:
                        Intent iWed = new Intent(getApplicationContext(),Wednesday.class);
                        startActivity(iWed);
                        break;
                    case 5:
                        Intent iThur = new Intent(getApplicationContext(),Thursday.class);
                        startActivity(iThur);
                        break;

                    case  6:
                        Intent iFri = new Intent(getApplicationContext(),Friday.class);
                        startActivity(iFri);

                        break;
                }
            }
        });
    }


}
