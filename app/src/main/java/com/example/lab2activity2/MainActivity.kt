package com.example.lab2activity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnText : Button;
    lateinit var lblText : TextView;
    lateinit var HungryImg : ImageView;
   lateinit var fullImg : ImageView;
    lateinit var chqImg : ImageView;





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun makeFull(v: View){

        btnText = findViewById(R.id.buttonH);
        btnText.text = "Done";

        lblText = findViewById(R.id.txtHungry);
        lblText.text = "I'm so full";



        HungryImg = findViewById(R.id.pic1);
        fullImg = findViewById(R.id.pic2);


//        HungryImg = findViewById(R.id.pic2);
        HungryImg.setImageResource(R.drawable.full);

    }


    fun makeHuungry(v: View){

        btnText = findViewById(R.id.buttonH);
        btnText.text = "Eat Cookie";


        lblText = findViewById(R.id.txtHungry);
        lblText.text = "I'm so hungry";


        HungryImg = findViewById(R.id.pic2);
        fullImg = findViewById(R.id.pic1);


//        HungryImg = findViewById(R.id.pic2);
        fullImg.setImageResource(R.drawable.hungry);




    }
}