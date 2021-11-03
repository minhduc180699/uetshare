package ie.app.uetstudents.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.app.uetstudents.R
import kotlinx.android.synthetic.main.item_uettalk.view.*

class adapter_itemuettalk(var listitem : ArrayList<item_uettalk>): RecyclerView.Adapter<adapter_itemuettalk.viewholder>() {
    inner class viewholder(var itemview: View): RecyclerView.ViewHolder(itemview) {
        fun onBinData(itemUettalk: item_uettalk){
            itemview.image_uettalk_user.setImageResource(itemUettalk.imageuser)
            itemview.name_uettalk_user.text = itemUettalk.nameuser
            itemview.time_uetttalk_item.text= itemUettalk.time
            itemview.txt_status_itemuettalk.text = itemUettalk.content
            itemview.numberlike.text = "có ${itemUettalk.numberlike} thích"
            itemview.number_comment.text = "Có ${itemUettalk.numbercomment} Bình luận"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        return viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_uettalk,parent,false)
        )
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        return holder.onBinData(listitem.get(position))
    }

    override fun getItemCount(): Int {
        return listitem.size
    }
}