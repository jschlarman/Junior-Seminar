package blackburn.college.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Global.rollText = (TextView) findViewById(R.id.rollOutput);
    }

    public void buttonOnClick(View v) {
        Random randy = new Random();
        Global.roll = randy.nextInt(6);
        Global.rollText.setText(String.valueOf(Global.roll));
    }
}
