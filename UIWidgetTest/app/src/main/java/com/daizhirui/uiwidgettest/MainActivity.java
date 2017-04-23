package com.daizhirui.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private TextView textView;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        editText =(EditText)findViewById(R.id.edit_text);
        button.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.text_view);
        textView.setOnClickListener(this);
        imageView =(ImageView)findViewById(R.id.image_view);
        imageView.setOnClickListener(this);
        progressBar =(ProgressBar)findViewById(R.id.process_bar);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:
                /*String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                }
                else {
                    progressBar.setVisibility(View.GONE);
                }
                int progress=progressBar.getProgress();
                progress=progress+10;
                progressBar.setProgress(progress);*/

                /**
                 * AlterDialog
                 */
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();

                /**
                 * ProgressDialog
                 */
                /*ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Building...");
                progressDialog.setCancelable(true);
                progressDialog.show();*/
                break;
            case R.id.text_view:
                String toastText = textView.getText().toString();
                Toast.makeText(MainActivity.this,  toastText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.image_view:
                imageView.setImageResource(R.drawable.img_2);
                break;
            default:
                break;
        }
    }
}
