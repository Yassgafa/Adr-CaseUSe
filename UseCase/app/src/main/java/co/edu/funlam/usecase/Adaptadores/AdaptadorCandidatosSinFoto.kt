package co.edu.funlam.usecase.Adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import co.edu.funlam.usecase.Objetos.Candidato
import co.edu.funlam.usecase.R

class AdaptadorCandidatosSinFoto (context: Context, private val candidatos: List<Candidato>): BaseAdapter(){
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
            view = inflater.inflate(R.layout.item_candidatos_sinfoto, parent, false)
            viewHolder = ViewHolder()
            viewHolder.nombreTextViewSinFoto = view.findViewById(R.id.textViewNombreCandidatoItemSinFoto)
            viewHolder.partidoTextViewSinFoto = view.findViewById(R.id.textViewPartidoSinfoto)
            viewHolder.TarjetonTextViewSinFoto = view.findViewById(R.id.textViewTarjetonSinFoto)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val candidato = candidatos[position]
        viewHolder.nombreTextViewSinFoto.text = candidato.nombre
        viewHolder.partidoTextViewSinFoto.text = candidato.partido
        viewHolder.TarjetonTextViewSinFoto.text = candidato.tarjeton.toString()

        return view
    }

    private class ViewHolder {
        lateinit var nombreTextViewSinFoto: TextView
        lateinit var partidoTextViewSinFoto: TextView
        lateinit var TarjetonTextViewSinFoto: TextView

    }
}