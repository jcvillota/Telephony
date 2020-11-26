package edu.ucucite.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class call extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);


    }

    public void btnCall(View view) {



            int permissionCheck =
                    ContextCompat.checkSelfPermission(this,
                            Manifest.permission.CALL_PHONE);
            if (permissionCheck ==
                    PackageManager.PERMISSION_GRANTED) {
                Intent callIntent = new
                        Intent(Intent.ACTION_CALL);

                callIntent.setData(Uri.parse("tel:" + "0999999999"));

                startActivity(callIntent);
            } else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CALL_PHONE},
                        0);
            }
        }
    }

