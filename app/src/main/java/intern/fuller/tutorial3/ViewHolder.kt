package intern.fuller.tutorial3

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val id = view.id_name
    val txt = view.tweet_data
    val img = view.profile_img
    val tweet_img = view.tweet_img
    val fav = view.fav
    val rt =  view.rt
    val share = view.share
    val comment = view.comment
}
