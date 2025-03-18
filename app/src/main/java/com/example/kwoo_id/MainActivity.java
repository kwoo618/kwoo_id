package com.example.kwoo_id;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText name_text_1;
    private EditText password_text_1;
    private EditText phone_number_text_1;
    private Button eButton;
    private TextView name_text;
    private TextView password_text;
    private TextView phone_number_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        name_text_1 = (EditText) findViewById(R.id.name_text_1);
        password_text_1 = (EditText) findViewById(R.id.password_text_1);
        phone_number_text_1 = (EditText) findViewById(R.id.phone_number_text_1);
        eButton = (Button) findViewById(R.id.button);
        name_text = (TextView) findViewById(R.id.name_text);
        password_text = (TextView) findViewById(R.id.password_text);
        phone_number_text = (TextView) findViewById(R.id.phone_number_text);

    }

    public void onClicked(View view) {
        String name = name_text_1.getText().toString();
        String password = password_text_1.getText().toString();
        String phone = phone_number_text_1.getText().toString();
        name_text.setText("이름: "+ name);
        password_text.setText("비밀번호: "+ password);
        phone_number_text.setText("전화번호: "+ phone);
    }
}