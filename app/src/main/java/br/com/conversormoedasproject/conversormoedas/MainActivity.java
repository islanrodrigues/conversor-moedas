package br.com.conversormoedasproject.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = (EditText) findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = (TextView) findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = (TextView) findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = (Button) findViewById(R.id.button_calculate);
        this.mViewHolder.buttonCalculate = (Button) findViewById(R.id.button_calculate);

    }



    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;

    }
}
