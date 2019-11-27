package sdu.cs.prem.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nameString ;
    String passwordCheck ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameText = findViewById(R.id.editText);
        final EditText nameText2 = findViewById(R.id.editText2);
        Button startButton = findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameText.getText().toString();
                passwordCheck = nameText2.getText().toString();
                String passString = "1234";

                if (nameString.length() == 0 && passwordCheck.length() == 0) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่กรอกข้อมูลทุกช่อง", Toast.LENGTH_SHORT)
                            .show();
                }

                if (passwordCheck.length() != 0 && passwordCheck == passString) {
                        Toast.makeText(getApplicationContext(), "ยินดีต้อนรับ" + nameString + "เข้าสู่ระบบ",
                                Toast.LENGTH_SHORT).show();
                    Intent startIntent = new Intent(MainActivity.this,MainLogin.class);
                    startIntent.putExtra("Name",nameString);
                    startActivity(startIntent);
                }
                else{
                        Toast.makeText(getApplicationContext(), "รหัสผ่านไม่ถูกต้อง", Toast.LENGTH_SHORT)
                                .show();
                }

            }
        });
    } //End ocCeate()Mwthod
} //End class
