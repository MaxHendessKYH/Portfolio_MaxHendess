package com.example.portfolio_maxhendess

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.portfolio_maxhendess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val datamanager = DataManager()
     private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setAdapterrv("Java / Kotlin");
        setSpinner();
        val aboutMebtn = binding.aboutMeBtn
        aboutMebtn.setOnClickListener {
            val intent = Intent(this, AboutMeActivity::class.java)
            startActivity(intent)
        }

    }
    fun setAdapterrv( input: String)
    {
        val recyclerView: RecyclerView = binding.rvProjects
        val layoutManager: LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager;
        val adapter = ProjectAdapter_rv(datamanager.getProjects(input)) {
            project ->
            val intent = Intent(this, ProjectActivity::class.java)
            intent.putExtra("project", project)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }

    fun setSpinner()
    {
        val spinner: Spinner = findViewById(R.id.category_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.category_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {

            val selected = parent.getItemAtPosition(pos)
//            println("Selected Item: $selected")
            setAdapterrv(selected.toString()) // set adapter to view projects of the selected category (Selected item in spinner)

        }
            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback.
            }
        }
    }
}