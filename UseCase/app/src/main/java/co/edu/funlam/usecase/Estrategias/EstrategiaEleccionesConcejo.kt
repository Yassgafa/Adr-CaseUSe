package co.edu.funlam.usecase.Estrategias

import android.content.Context
import android.widget.ListView
import co.edu.funlam.usecase.Adaptadores.AdaptadorCandidatosSinFoto
import co.edu.funlam.usecase.Objetos.Candidato
import co.edu.funlam.usecase.Intefaces.VotacionInterface

class EstrategiaEleccionesConcejo: VotacionInterface {
    override fun MostrarCandidatos(context: Context, listView: ListView) {
        val listaCandidatos = mutableListOf<Candidato>()
        val Candidato1 = Candidato("Ana", "Esperancistas", 22 )
        val Candidato2 = Candidato("Yassir", "Partido azul ", 15 )
        val Candidato3 = Candidato("Yesid", "Partido verde ", 38 )
        val Candidato4 = Candidato("Daniel", "Partido Docente", 100 )

        listaCandidatos.add(Candidato1)
        listaCandidatos.add(Candidato2)
        listaCandidatos.add(Candidato3)
        listaCandidatos.add(Candidato4)

        //adaptador
        val adapatador = AdaptadorCandidatosSinFoto(context, listaCandidatos)
        listView.adapter = adapatador

    }
}