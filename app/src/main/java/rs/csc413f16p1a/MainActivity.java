package rs.csc413f16p1a;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// import android.widget.OnEditorActionListener;

public class MainActivity extends AppCompatActivity {

    public int abs(int valIn){
        int rval = valIn;

        if( valIn < 0 )
            rval = -rval;

        return rval;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = (EditText) findViewById(R.id.numberInput);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                // TODO Auto-generated method stub

                int valEntered = abs(Integer.parseInt(editText.getText().toString()));

                Context context = getApplicationContext();
                CharSequence text = "You entered " + valEntered;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                return false;
            }
        });


    }




}
