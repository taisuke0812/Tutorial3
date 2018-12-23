package intern.fuller.tutorial3

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.*

class ViewAdapter(private val list: List<RowModel>, private val listener: ListListener) : RecyclerView.Adapter<HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val rowView: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return HomeViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        holder.id.text = list[position].id
        holder.txt.text = list[position].tweet
        holder.img.setImageResource(list[position].img_id)
        holder.tweet_img.setImageResource(list[position].tweet_img)
        holder.fav.setImageResource(list[position].fav)
        holder.rt.setImageResource(list[position].rt)
        holder.share.setImageResource(list[position].share)
        holder.comment.setImageResource(list[position].comment)
        holder.itemView.setOnClickListener {
            listener.onClickRow(it, list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface ListListener {
        fun onClickRow(tappedView: View, rowModel: RowModel)
    }
}