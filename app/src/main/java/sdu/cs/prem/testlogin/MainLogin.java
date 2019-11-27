package sdu.cs.prem.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        TextView text = findViewById(R.id.view);

        Bundle bundle = getIntent().getExtras();
        String name1 = bundle.getString("name");


        text.setText("ยินดีต้อนรับ"+ name1);
















    }
}
