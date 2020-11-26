package edu.ucucite.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class message5 extends AppCompatActivity {
    EditText editMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message5);

        editMessage = findViewById(R.id.editMessage);

    }
    public void btnSend(View view) {
        int permissionCheck =
                ContextCompat.checkSelfPermission(this,
                        Manifest.permission.SEND_SMS);
        if (permissionCheck ==
                PackageManager.PERMISSION_GRANTED) {

            sendMessage();
        } else {
            ActivityCompat.requestPermissions(this, new
                    String[]{Manifest.permission.SEND_SMS}, 0);
        }

    }

    protected void sendMessage() {

        String message;

        message = editMessage.getText().toString().trim();
        SmsManager smsManager =
                SmsManager.getDefault();
        smsManager.sendTextMessage("09246259875", null,
                message, null, null);
        Toast.makeText(this, "Message Sent",
                Toast.LENGTH_SHORT).show();
    }
}
