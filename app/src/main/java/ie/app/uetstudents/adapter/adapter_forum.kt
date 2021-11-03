package ie.app.uetstudents.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.app.uetstudents.R
import kotlinx.android.synthetic.main.item_forum.view.*

class adapter_forum(var listforum : ArrayList<item_forum>) : RecyclerView.Adapter<adapter_forum.viewHolder>()  {
    inner class viewHolder(var itemview : View): RecyclerView.ViewHolder(itemview){
        fun onBinData(itemForum: item_forum)
        {
            itemview.item_forum_image.setImageResource(itemForum.image)
            itemview.item_forum_content.text = itemForum.content
            itemview.item_forum_time.text = itemForum.time
            itemview.item_forum_numbercomment.text=itemForum.comment_number.toString()
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter_forum.viewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_forum,parent,false)
        )
    }

    override fun onBindViewHolder(holder: adapter_forum.viewHolder, position: Int) {
        return holder.onBinData(listforum.get(position))
    }

    override fun getItemCount(): Int {
        return listforum.size
    }
}