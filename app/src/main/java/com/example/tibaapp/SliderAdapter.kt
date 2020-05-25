package com.example.tibaapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter (val context:Context):PagerAdapter(){

    val images = arrayListOf<Int>(
        R.drawable.corona2,
        R.drawable.washhands,
        R.drawable.mask
    )

    val headings = arrayListOf<Int>(
        R.string.first_slide_title,
        R.string.second_slide_title,
        R.string.third_slide_title

    )

    val descriptions = arrayListOf<Int>(
        R.string.first_slide_desc,
        R.string.second_slide_desc,
        R.string.third_slide_desc

    )
    override fun getCount(): Int {
        return headings.count()
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater:LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view:View = layoutInflater.inflate(R.layout.slide_layout, container,false)

        val image_view: ImageView = view.findViewById(R.id.img_slider)
        val heading_view: TextView = view.findViewById(R.id.tv_title)
        val description_view: TextView = view.findViewById(R.id.tv_description)

//        set data
        image_view.setImageResource(images[position])
        heading_view.setText(headings[position])
        description_view.setText(descriptions[position])

        container.addView(view)
        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as View
    }




}