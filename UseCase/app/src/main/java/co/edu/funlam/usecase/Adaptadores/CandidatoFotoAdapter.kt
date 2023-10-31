package co.edu.funlam.usecase.Adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import co.edu.funlam.usecase.Objetos.CandidatoFoto
import co.edu.funlam.usecase.R

class CandidatoFotoAdapter(context: Context, private val candidatos: List<CandidatoFoto>) : BaseAdapter() {
    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return candidatos.size
    }

    override fun getItem(position: Int): Any {
        return candidatos[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.item_listas, parent, false)
            viewHolder = ViewHolder()
            viewHolder.imageView = view.findViewById(R.id.imageViewPresidencia)
            viewHolder.nombreTextView = view.findViewById(R.id.textViewNombreCandidatoItem)
            viewHolder.partidoTextView = view.findViewById(R.id.textViewPartido)
            viewHolder.TarjetonTextView = view.findViewById(R.id.textViewTarjeton)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val candidato = candidatos[position]
        viewHolder.imageView.setImageResource(candidato.foto)
        viewHolder.nombreTextView.text = candidato.nombre
        viewHolder.partidoTextView.text = candidato.partido
        viewHolder.TarjetonTextView.text = candidato.tarjeton.toString()

        return view
    }

    private class ViewHolder {
        lateinit var imageView: ImageView
        lateinit var nombreTextView: TextView
        lateinit var partidoTextView: TextView
        lateinit var TarjetonTextView: TextView

    }
}
