package com.sahabatpnj.feby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    String[] makanan = {"Nasi", "Daging", "Bubur", "Ayam", "Jagung", "Tahu", "Tempe"};
    private AutoCompleteTextView mMakanan1, mMakanan2, mMakanan3;
    private Button mButtonHitung;
    private int kalori1, kalori2, kalori3, hasil;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.select_dialog_item, makanan);

        mMakanan1 = findViewById(R.id.makanan1);
        mMakanan1.setThreshold(1);
        mMakanan1.setAdapter(adapter);

        mMakanan2 = findViewById(R.id.makanan2);
        mMakanan2.setThreshold(1);
        mMakanan2.setAdapter(adapter);

        mMakanan3 = findViewById(R.id.makanan3);
        mMakanan3.setThreshold(1);
        mMakanan3.setAdapter(adapter);

        mButtonHitung = findViewById(R.id.hitung);
        total = findViewById(R.id.total);
        mButtonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValue();
                hasil = kalori1 + kalori2 + kalori3;
                Log.d(TAG, "onClick: " + hasil);
                total.setText("Total Kalori Anda : " + hasil);
            }
        });

    }

    private void getValue(){
        String makanan1 = mMakanan1.getText().toString();
        String makanan2 = mMakanan2.getText().toString();
        String makanan3 = mMakanan3.getText().toString();
        if (makanan1.equalsIgnoreCase("Nasi")){
            kalori1 = 1000;
            Log.d(TAG, "getValue: " + kalori1);
        }
        if (makanan2.equalsIgnoreCase("Nasi")){
            kalori2 = 1000;
            Log.d(TAG, "getValue: " + kalori2);
        }
        if (makanan3.equalsIgnoreCase("Nasi")){
            kalori3 = 1000;
            Log.d(TAG, "getValue: " + kalori3);
        }
        if (makanan1.equalsIgnoreCase("Daging")){
            kalori1 = 10000;
            Log.d(TAG, "getValue: " + kalori1);
        }
        if (makanan2.equalsIgnoreCase("Daging")){
            kalori2 = 10000;
            Log.d(TAG, "getValue: " + kalori2);
        }
        if (makanan3.equalsIgnoreCase("Daging")){
            kalori3 = 10000;
            Log.d(TAG, "getValue: " + kalori3);
        }
        if (makanan1.equalsIgnoreCase("Bubur")){
            kalori1 = 8000;
            Log.d(TAG, "getValue: " + kalori1);
        }
        if (makanan2.equalsIgnoreCase("Bubur")){
            kalori2 = 8000;
            Log.d(TAG, "getValue: " + kalori2);
        }
        if (makanan3.equalsIgnoreCase("Bubur")){
            kalori3 = 8000;
            Log.d(TAG, "getValue: " + kalori3);
        }
        if (makanan1.equalsIgnoreCase("Ayam")){
            kalori1 = 5000;
            Log.d(TAG, "getValue: " + kalori1);
        }
        if (makanan2.equalsIgnoreCase("Ayam")){
            kalori2 = 5000;
            Log.d(TAG, "getValue: " + kalori2);
        }
        if (makanan3.equalsIgnoreCase("Ayam")){
            kalori3 = 5000;
            Log.d(TAG, "getValue: " + kalori3);
        }
        if (makanan1.equalsIgnoreCase("Jagung")){
            kalori1 = 3000;
            Log.d(TAG, "getValue: " + kalori1);
        }
        if (makanan2.equalsIgnoreCase("Jagung")){
            kalori2 = 3000;
            Log.d(TAG, "getValue: " + kalori2);
        }
        if (makanan3.equalsIgnoreCase("Jagung")){
            kalori3 = 3000;
            Log.d(TAG, "getValue: " + kalori3);
        }
        if (makanan1.equalsIgnoreCase("Tahu")){
            kalori1 = 2000;
            Log.d(TAG, "getValue: " + kalori1);
        }
        if (makanan2.equalsIgnoreCase("Tahu")){
            kalori2 = 2000;
            Log.d(TAG, "getValue: " + kalori2);
        }
        if (makanan3.equalsIgnoreCase("Tahu")){
            kalori3 = 2000;
            Log.d(TAG, "getValue: " + kalori3);
        }
        if (makanan1.equalsIgnoreCase("Tempe")){
            kalori1 = 500;
            Log.d(TAG, "getValue: " + kalori1);
        }
        if (makanan2.equalsIgnoreCase("Tempe")){
            kalori2 = 500;
            Log.d(TAG, "getValue: " + kalori2);
        }
        if (makanan3.equalsIgnoreCase("Tempe")){
            kalori3 = 500;
            Log.d(TAG, "getValue: " + kalori3);
        }


    }

    public void hitungKalori(int kal1, int kal2, int kal3){

    }
}
