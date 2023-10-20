package pl.zabrze.zs10.czas_zycia_3p_piatek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonGora;
    private ImageButton buttonDol;
    private Integer punkty = 0;
    private TextView textView;

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CZAS_ZYCIA","Uruchomiana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CZAS_ZYCIA","Uruchomiana metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CZAS_ZYCIA","Uruchomiana metoda onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CZAS_ZYCIA","Uruchomiana metoda onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CZAS_ZYCIA","Uruchomiana metoda onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CZAS_ZYCIA","Uruchomiana metoda onStop");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CZAS_ZYCIA","Uruchomiona metoda onSaveInstanceState");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CZAS_ZYCIA","Uruchomiana metoda onCreate");
        buttonGora = findViewById(R.id.imageButton);
        buttonDol = findViewById(R.id.imageButton2);
        textView = findViewById(R.id.textView);
        buttonGora.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        textView.setText(punkty.toString());
                    }
                }
        );
        buttonDol.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty--;
                        textView.setText(punkty.toString());
                    }
                }
        );
    }
}