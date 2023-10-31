package co.edu.funlam.usecase.Estrategias

import android.content.Context
import android.widget.ListView
import co.edu.funlam.usecase.Adaptadores.CandidatoFotoAdapter
import co.edu.funlam.usecase.Objetos.CandidatoFoto
import co.edu.funlam.usecase.R
import co.edu.funlam.usecase.Intefaces.VotacionInterface

class EstrategiaEleccionesAlcaldia: VotacionInterface
{
    override fun MostrarCandidatos(context: Context, listView: ListView) {

        val listaCandidatos = mutableListOf<CandidatoFoto>()
        val Candidato1 = CandidatoFoto("María", "Esperancistas", 1, R.drawable.candidato1  )
        val Candidato2 = CandidatoFoto("Nelson", "Partido Verde", 2, R.drawable.candidato2  )

        listaCandidatos.add(Candidato1)
        listaCandidatos.add(Candidato2)


        //adaptador
        val adapatador = CandidatoFotoAdapter(context, listaCandidatos)
        listView.adapter = adapatador

    }
}