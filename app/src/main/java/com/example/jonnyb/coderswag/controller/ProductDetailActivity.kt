package com.example.jonnyb.coderswag.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jonnyb.coderswag.R
import com.example.jonnyb.coderswag.model.Product
import com.example.jonnyb.coderswag.util.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceId = this.resources.getIdentifier(
            product?.image, "drawable", this.packageName)
        productImage.setImageResource(resourceId)

        productName.text = product?.title
        productPrice.text = product?.price
    }
}