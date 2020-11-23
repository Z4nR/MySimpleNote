package com.zulham.mydb.DB

import android.view.View

class CustomOnClickListener(private val position: Int, private val onItemClickCallback: OnItemClickCallback) : View.OnClickListener {
    override fun onClick(v: View) {
        onItemClickCallback.onItemClicked(v, position)
    }

    interface OnItemClickCallback{
        fun onItemClicked(v: View, position: Int)
    }
}