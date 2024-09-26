package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    //variables to see if the pet's status  is hungry,playful or clean
    private var hunger = 100
    private var happy = 50
    private var clean = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setContentView(R.layout.activity_main2)

        //UI ID's
        val btnFeed = findViewById<Button>(R.id.btnFeed) //button to Feed
        val btnClean = findViewById<Button>(R.id.btnClean)//button to Clean
        val btnPlay = findViewById<Button>(R.id.btnPlay)//button to Play
        val txtHunger = findViewById<TextView>(R.id.txtHunger) //textview for the hunger level
        val txtHappy = findViewById<TextView>(R.id.txtHappy)// textview for the happiness level
        val txtClean = findViewById<TextView>(R.id.txtClean)//textview for the pet's cleanliness
        val imageView2 = findViewById<ImageView>(R.id.imageView2)//imageview for the virtual pet

        //Initialize TextViews to the current status of the pet
        txtHunger.text = hunger.toString()
        txtHappy.text = happy.toString()
        txtClean.text = clean.toString()

        //Set OnClickListeners for the buttons(feed button)
        btnFeed.setOnClickListener {
            hunger += 5 //increase the hunger level when the pet is fed
            happy += 10//increase the happiness  level when the pet plays
            clean += 10//increase the cleanliness level when the pet baths
            txtHunger.text=hunger.toString()//update the textview
            animateImageChange(imageView2, R.drawable.eating) //change image of the pet to eating
        }

        //Set OnClickListener for the button(Clean)
        btnClean.setOnClickListener {
            clean += 10 // increase cleanliness level when the dog baths
            txtClean.text = clean.toString()//update the textview
            animateImageChange(imageView2, R.drawable.bathing) //change image of the app to bathing
        }

        btnPlay.setOnClickListener {
            happy += 5 //  increase happiness level when the dog playsjh
            txtHappy.text = happy.toString() //update the textview
            animateImageChange(imageView2, R.drawable.playing) //change image of the pet to playing
        }
    }
        //function to change the pets image
    private fun animateImageChange(imageView: ImageView, newImageRes: Int) {
        imageView.setImageResource(newImageRes) //set new image resource
    }
}