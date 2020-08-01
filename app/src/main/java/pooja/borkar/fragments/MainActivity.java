package pooja.borkar.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
Button button;
static TextView textview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button1);
        textview = findViewById(R.id.textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.Action_webview:
                startActivity(new Intent(MainActivity.this,MainActivityThree.class));
                Toast.makeText(this, "MainActivityThree", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.ActionSetting:
                Intent intent= new Intent(Settings.ACTION_SETTINGS);
                startActivity(intent);
                return true;
            case R.id.Actionfragement:
                startActivity(new Intent(MainActivity.this,NewActivity.class));
                Toast.makeText(this, "NewActivity", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
