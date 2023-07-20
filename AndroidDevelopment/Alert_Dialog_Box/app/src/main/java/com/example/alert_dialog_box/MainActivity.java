package com.example.alert_dialog_box;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.exit).setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
//                    direct create an object of alert dialog box
                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(R.drawable.baseline_warning_amber_24)
                        .setTitle("Exit")
                        .setMessage("Are you sure")
//                        Why is use DialogInterface with OnClickListener
//                        because we are applying onclicklistener on dialog box
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                                @Override
                            public void onClick(DialogInterface dialog, int which){
                                    finish();
                                }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                dialog.dismiss();
                            }
                        })
                        .setNeutralButton("Help", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                Toast.makeText(MainActivity.this, "Press yes button to exit", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show(); //show() function is using to start Dialog box

            }
        });
    }
}