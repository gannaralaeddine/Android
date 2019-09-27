package gannar.dsi31firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    public TextView text;
    public EditText Etext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        Etext= findViewById(R.id.Etext);

        findViewById(R.id.envoyer).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                text.setText(getString(R.string.hello) + Etext.getText().toString() + getString(R.string.exclamation_point) );
            }
        });
    }
}
