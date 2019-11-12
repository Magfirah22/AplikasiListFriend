package id.ac.poliban.mi.firah.aplikasilistfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> countries = new ArrayList<>();
    {
        countries.add("Ahmad Irfan");
        countries.add("Akhmad Indrawan");
        countries.add("Andre Ramadhandy");
        countries.add("Andri Sudarman");
        countries.add("Diana");
        countries.add("Gina Melati Addini");
        countries.add("Iffa Nafiatunnisa");
        countries.add("Lidya Lusiana");
        countries.add("Melisa Arianie");
        countries.add("Muhamad Ade Setiawan");
        countries.add("Purnama");
        countries.add("Radhika Ramadani");
        countries.add("Rafi'i Hidayat Nor");
        countries.add("Renaldy Kambayu");
        countries.add("Sarwan");
        countries.add("Thasya Ismyanti Novianda");
        countries.add("Yunita Rahmah");
        countries.add("Rezal Alfansyah");
        countries.add("Agustya Fazriani");
        countries.add("Ratu Hana Yunita");
        countries.add("M Rizky Maulana");
        countries.add("Radiansyah");
        countries.add("Taufan Ryanda Utama");
        countries.add("Magfirah Maulidya");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null)
            setTitle("APLIKASI ABSEN KELAS 5 B MI");

        ListView listView = findViewById(R.id.list_teman);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.item_rows_kelas, R.id.tv_item_kelas, countries);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Anda Memilih : "+countries.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}
