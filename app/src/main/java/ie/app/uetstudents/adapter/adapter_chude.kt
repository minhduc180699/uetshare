package ie.app.uetstudents.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.app.uetstudents.R
import kotlinx.android.synthetic.main.item_chude.view.*
import java.util.concurrent.RecursiveAction

class adapter_chude(var listchude: ArrayList<String>):RecyclerView.Adapter<adapter_chude.Viewholder>() {
   inner class Viewholder (var itemview: View): RecyclerView.ViewHolder(itemview) {
       fun onbindate(chude : String){
           itemview.txt_chude.text= chude
       }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter_chude.Viewholder {
        return Viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_chude,parent,false)
        )
    }

    override fun onBindViewHolder(holder: adapter_chude.Viewholder, position: Int) {
        return holder.onbindate(listchude.get(position))
    }

    override fun getItemCount(): Int {
        return listchude.size
    }
}