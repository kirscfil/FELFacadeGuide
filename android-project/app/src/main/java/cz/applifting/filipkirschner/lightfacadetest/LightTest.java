package cz.applifting.filipkirschner.lightfacadetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.HttpURLConnection;
import java.net.URL;

public class LightTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_test);
        Button testButton = (Button) findViewById(R.id.testButton);
        if (testButton != null) {
            testButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    try {
                        URL url = new URL("http://192.168.1.97:3000/lights/all?r=68&g=146&b=4&w=0");
                        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
