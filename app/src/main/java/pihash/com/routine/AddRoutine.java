package pihash.com.routine;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddRoutine extends AppCompatActivity {

    EditText etClass,etTimme,etRoom,etFaculty;
    DatabasedHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_routine);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etClass= (EditText) findViewById(R.id.etClass);
        etTimme= (EditText)findViewById(R.id.etTime);
        etRoom= (EditText)findViewById(R.id.etRoom);
        etFaculty= (EditText)findViewById(R.id.etFaculty);
        mydb =new DatabasedHelper(this);



    }

    public  void savedata(View view)
    {
        String classname, time, room,feculty;

        classname =etClass.getText().toString();
        time =etTimme.getText().toString();
        room =etRoom.getText().toString();
        feculty =etFaculty.getText().toString();

        long inserted =mydb.insertroutine(classname,time,room,feculty);
        Intent i=new Intent(AddRoutine.this,Sat.class);
        startActivity(i);
        finish();



    }

}
