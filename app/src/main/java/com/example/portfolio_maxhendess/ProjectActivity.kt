package com.example.portfolio_maxhendess

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.portfolio_maxhendess.databinding.ActivityProjectBinding

class ProjectActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val project = getSerializable(intent ,"project" , Project::class.java)

       binding.tvProjectactvityTitle.text = project.title // setText(project.title)
        binding.tvProjectactvityPresentation.text = project.presentation
        binding.tvProjectactvityDetails.text = project.details
        binding.img1Project.setImageResource(project.imageSrc)
        binding.img2Project.setImageResource(project.secondImgSrc)
        }
}