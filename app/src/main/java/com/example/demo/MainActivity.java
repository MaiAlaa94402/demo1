package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.name)
    EditText Username;

    @BindView(R.id.password)
    EditText Password;

    @BindView(R.id.register)
    Button register;

    @BindView(R.id.login)
    Button login;

    @BindView(R.id.imageView)
    ImageView im;

    String test_name="mai";
    String test_password="112233";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);
//        ImageView imageView=findViewById(R.id.imageView);


        //Glide.with(this).load("https://www.pngplay.com/wp-content/uploads/1/Login-PNG.png").placeholder(R.drawable.brokenicon).into(im);   //Image appears with no internet?
        Glide.with(getApplicationContext())
                .load("https://media.giphy.com/media/98uBZTzLXMhkk/giphy.gif")
//                .placeholder(R.drawable.brokenicon)
                .into(im);


        login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if(Username.getText().toString().isEmpty() ) {
                   Toast.makeText(login.getContext(), " Please entre username", Toast.LENGTH_SHORT).show();
            System.out.println("Please entre username and password");
               }
              else if(Password.getText().toString().isEmpty()){
                   Toast.makeText(login.getContext(), " Please entre password", Toast.LENGTH_SHORT).show();
               }
               else if(Username.getText().toString().equals(test_name)){
                   if(Password.getText().toString().equals(test_password)){
                       Toast.makeText(login.getContext(), "logged in", Toast.LENGTH_SHORT).show();
                       Intent intent=new Intent(getApplicationContext() , MainActivity2.class);
                       startActivity(intent);
                       System.out.println("logged in");
                   }
                   else {
                       Toast.makeText(login.getContext(), "wrong pass", Toast.LENGTH_SHORT).show();
                       System.out.println("wrong password");
                   }

               }
               else {
                   Toast.makeText(login.getContext(), "invalid username", Toast.LENGTH_SHORT).show();
                  System.out.println("invalid username");
               }
           }
       });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            System.out.println("Registered");
            Intent intent=new Intent(getApplicationContext() , MainActivity4.class);
            startActivity(intent);
            }
        });
    }

}