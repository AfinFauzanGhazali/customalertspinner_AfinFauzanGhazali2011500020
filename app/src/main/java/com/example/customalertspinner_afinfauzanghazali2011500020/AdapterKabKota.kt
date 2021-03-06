package com.example.customalertspinner_afinfauzanghazali2011500020

import android.content.*
import android.view.*
import android.widget.*
import java.text.FieldPosition

class AdapterKabKota(
    applicationContext: Context,
    private val logo: IntArray,
    private val nama: Array<String>
): BaseAdapter() {
    val inflater = LayoutInflater.from(applicationContext)

    override fun getCount() = logo.size
    override fun getItem(position: Int) = null
    override fun getItemId(position: Int) = 0L

    override fun getView(position: Int, converView: View?, parent: ViewGroup?): View {
        val cv = inflater.inflate(R.layout.layoutitemspinner, null)
        val imgLogo = cv.findViewById<ImageView>(R.id.imgLogo)
        val tvNama = cv.findViewById<TextView>(R.id.tvNama)
        imgLogo.setImageResource(logo[position])
        tvNama.text = nama[position]
        return cv
    }

}