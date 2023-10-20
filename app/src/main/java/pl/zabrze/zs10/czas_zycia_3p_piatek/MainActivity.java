package pl.zabrze.zs10.czas_zycia_3p_piatek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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