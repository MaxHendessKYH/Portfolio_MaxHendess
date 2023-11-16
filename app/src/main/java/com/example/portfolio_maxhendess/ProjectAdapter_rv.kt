package com.example.portfolio_maxhendess

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio_maxhendess.databinding.ListItemProjectsLvBinding

// clickListener e Callback funktion, kan skicka en funktion som parameter
class ProjectAdapter_rv(val projectList: List<Project>, val clickListener: (Project) -> Unit) :
    RecyclerView.Adapter<ProjectAdapter_rv.ViewHolder>() {

    /*
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
        {
            val tv_title : TextView = itemView.findViewById(R.id.project_title)
            val tv_summary : TextView = itemView.findViewById(R.id.project_description)
            val imgView : ImageView = itemView.findViewById(R.id.projcet_img)
        }
          override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_projects_lv, parent, false)
            return ViewHolder(view)
        }
    */
    // Samma som förra ViewHolder fast me view binding
    class ViewHolder(binding: ListItemProjectsLvBinding) : RecyclerView.ViewHolder(binding.root) {
        val tv_title: TextView = binding.projectTitle
        val tv_summary: TextView = binding.projectDescription
        val imgView: ImageView = binding.projcetImg
    }

    // Viewbinder verisonen av onCreateViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemProjectsLvBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return projectList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = projectList[position]
        holder.tv_title.text = item.title
        holder.tv_summary.text = item.presentation
        holder.imgView.setImageResource(item.imageSrc)
        holder.itemView.setOnClickListener {
            clickListener(item)
//            Toast.makeText(holder.itemView.context, " Clicked on item ${item.title}", Toast.LENGTH_SHORT).show()
        }
        //
    }
}