package co.edu.funlam.usecase.Estrategias

import android.content.Context
import android.widget.ListView
import co.edu.funlam.usecase.Adaptadores.CandidatoFotoAdapter
import co.edu.funlam.usecase.Objetos.CandidatoFoto
import co.edu.funlam.usecase.R
import co.edu.funlam.usecase.Intefaces.VotacionInterface

class EstrategiaEleccionesPresidencia: VotacionInterface {

    override fun MostrarCandidatos(context:Context, listView: ListView) {
        val listaCandidatos = mutableListOf<CandidatoFoto>()
        val Candidato1 = CandidatoFoto("Cristiano", "Bicholovers", 7, R.drawable.cristiano  )
        val Candidato2 = CandidatoFoto("Messi", "Campeon Mundial", 10, R.drawable.messi )

        listaCandidatos.add(Candidato1)
        listaCandidatos.add(Candidato2)

        // Adaptador
        val adaptador = CandidatoFotoAdapter(context, listaCandidatos)
        listView.adapter = adaptador

    }

}

