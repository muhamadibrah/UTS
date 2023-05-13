package com.ibrah.uts.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ibrah.uts.Komik
import com.ibrah.uts.KomikAdapter
import com.ibrah.uts.R


class ListkomikFragment : Fragment() {

    private lateinit var adapter: KomikAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var komikArrayList: ArrayList<Komik>

    lateinit var image: Array<Int>
    lateinit var title: Array<String>
    lateinit var descriptions: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_listkomik, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitalize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_komik)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = KomikAdapter
        recyclerView.adapter = adapter

    }

    private fun dataInitalize() {
        komikArrayList = arrayListOf<Komik>()
        image = arrayOf(
            R.drawable.naruto,
            R.drawable.naruto_shipuden,
            R.drawable.jujutsu,
            R.drawable.onepice,
            R.drawable.kimetsu,
            R.drawable.tokyoghoul,
            R.drawable.komi,

            )
        title = arrayOf(
            "Naruto",
            "Naruto Shippuden",
            "Jujutsu No Kaisen",
            "ONE PICE",
            "Kimetsu No Yaiba",
            "Tokyo Ghoul",
            "Komi Can't Communicate",
        )
        descriptions = arrayOf(
            "lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum",
            "lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum",
            "lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum",
            "lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum",
            "lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum",
            "lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum",
            "lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum lore ipsum",
        )
        for (i in image.indices) {
            val komik = Komik(image[i], title[i], descriptions[i])
            komikArrayList.add(komik)
        }
    }
}