package com.ctf.citytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public float rumusCT(float kendaraan, float kapasitas){
        return (kendaraan/((kapasitas/100)*(kapasitas/100)));
    }

    public void hitungCT(View view){
        EditText edtTxtKapasitas = (EditText) findViewById(R.id.edittxt_mainactivity_kapasitas);
        float kapasitas = Integer.parseInt(edtTxtKapasitas.getText().toString());

        EditText edtTextKendaraan = (EditText) findViewById(R.id.edittxt_mainactivity_kendaraan);
        float kendaraan = Integer.parseInt(edtTextKendaraan.getText().toString());

        float hasilCT = rumusCT(kendaraan, kapasitas);

        displayHasil(hasilCT); //untuk menampilkan hasil

        String kategori = kategoriCT(hasilCT);

        displayCategory(kategori);
    }

    public void displayHasil(float CT){
        TextView hasil = (TextView) findViewById(R.id.txt_mainactivity_hasilCT);
        hasil.setText(""+CT);
    }

    public String kategoriCT(float CT){
        if (CT<50){
            return "Lancar";
        } else if (CT >= 50 && CT < 100){
            return "Normal";
        } else if (CT >= 100 && CT <150) {
            return "Macet";
        }else {
            return "Sangat Macet";
        }
    }

    public void displayCategory(String kategori){
        TextView txtKategori = (TextView) findViewById(R.id.txt_mainactivity_kategori);
        txtKategori.setText(kategori);
    }
}




