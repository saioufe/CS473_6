package com.example.cs473_6.adaptors



import com.example.cs473_6.data.Product
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.cs473_6.R
import android.widget.TextView

class ProductsAdaptor(private val products: List<Product>) :
    RecyclerView.Adapter<ProductsAdaptor.ViewHolder>() {
    init {
        Picasso.get().isLoggingEnabled = true
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        // Inflate the custom layout
        val productView =
            inflater.inflate(R.layout.item_product, parent, false)

        // Return a new holder instance
        return ViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val product = products[position]

        // Set item views based on your views and data model
        val textView = holder.nameTextView
        textView.text = product.name
        val textView2 = holder.priceTextView
        textView2.text = "$" + product.price
        val textView3 = holder.recomTextView
        textView3.text = product.numOfRecommandations + "recommendations"
        val imageView = holder.imageImageView
        Picasso.get().load(product.image).placeholder(R.drawable.product1).into(imageView)
        // Glide.with(imageView).load(product.getImage()).into(imageView);
    }

    override fun getItemCount(): Int {
        return products.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameTextView: TextView
        var priceTextView: TextView
        var recomTextView: TextView
        var imageImageView: ImageView

        init {
            nameTextView = itemView.findViewById<View>(R.id.product_title) as TextView
            priceTextView = itemView.findViewById<View>(R.id.product_price) as TextView
            recomTextView = itemView.findViewById<View>(R.id.product_rec) as TextView
            imageImageView = itemView.findViewById<View>(R.id.product_image) as ImageView
        }
    }
}