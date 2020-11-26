package edu.ucucite.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


  public void  btnCall(View view)
  {


      Intent intent = new Intent(this, call.class);


      startActivity(intent);



  }
    public void  btnCall2(View view)
    {


        Intent intent = new Intent(this, call2.class);


        startActivity(intent);



    }
    public void  btnCall3(View view)
    {


        Intent intent = new Intent(this, call3.class);


        startActivity(intent);



    }
    public void  btnCall4(View view)
    {


        Intent intent = new Intent(this, call4.class);


        startActivity(intent);



    }
    public void  btnCall5(View view)
    {


        Intent intent = new Intent(this, call5.class);


        startActivity(intent);



    }


    public void sendm(View view)
    {

        Intent intent = new Intent(this, message.class);
        startActivity(intent);


    }

    public void sendm2(View view)
    {

        Intent intent = new Intent(this, message2.class);
        startActivity(intent);


    }
    public void sendm3(View view)
    {

        Intent intent = new Intent(this, message3.class);
        startActivity(intent);


    }
    public void sendm4(View view)
    {

        Intent intent = new Intent(this, message4.class);
        startActivity(intent);


    }
    public void sendm5(View view)
    {

        Intent intent = new Intent(this, message5.class);
        startActivity(intent);


    }
}