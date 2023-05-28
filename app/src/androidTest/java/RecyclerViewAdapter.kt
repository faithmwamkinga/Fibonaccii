import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(var numberList: List<Int>): RecyclerView.Adapter<NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {

        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_number, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        var currentNumber = numberList[position]
        holder.tvNumber.text = currentNumber.toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}

class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}
