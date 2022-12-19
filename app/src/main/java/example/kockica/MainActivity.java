package example.kockica;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt1; /*deklariranje*/
    TextView txt2;
    Button btn;
    View Root;

    @Override
    protected void onCreate(Bundle savedInstanceState) { /*funkcija oncreate*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); /*postavljanje contentview*/

        txt1 = findViewById(R.id.kockica1); /*postavljanje textviewa, gumba i pozadine*/
        txt2 = findViewById(R.id.kockica2);
        btn = findViewById(R.id.KockicaGumb);
        Root = findViewById(R.id.root);

        btn.setOnClickListener(new View.OnClickListener() { /*onclicklistener za gumb*/
            @Override
            public void onClick(View view) { /*funkcija onclick*/
                Random random = new Random(); /*novi randomizirani broj*/
                int broj1 = random.nextInt((6)); /*postaljvanje broja 1 i 2*/
                int broj2 = random.nextInt((6));
                txt1.setText(Integer.toString(broj1+1)); /*zapisivanje brojeva na textview*/
                txt2.setText(Integer.toString(broj2+1));

                Random rnd = new Random(); /*novi randomizirani broj za boju*/
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)); /*postavljanje boje*/
                Root.setBackgroundColor(color);

            }
        });
    }
}