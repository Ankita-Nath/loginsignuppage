package com.example.login_signuppage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {
    EditText username,password;
    Button signin;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        signin=findViewById(R.id.signin);

        Bundle bundle=getIntent().getExtras();
        String uname=bundle.getString("username");
        String pwd=bundle.getString("password");

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

               if(user.equals(uname)&&pass.equals(pwd)){
                   Toast.makeText(signin.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
               else{
                   count++;
                   if(count==3){
                       Toast.makeText(signin.this, "Failed Login Attempts", Toast.LENGTH_SHORT).show();
                   }
                   Toast.makeText(signin.this, "Login Failed", Toast.LENGTH_SHORT).show();
               }


            }
        });


    }
}