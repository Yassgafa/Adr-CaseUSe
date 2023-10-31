package co.edu.funlam.usecase.Estrategias

import android.content.Context
import android.widget.ListView
import co.edu.funlam.usecase.Adaptadores.AdaptadorCandidatosSinFoto
import co.edu.funlam.usecase.Objetos.Candidato
import co.edu.funlam.usecase.Intefaces.VotacionInterface

class EstrategiaEleccionesAsamblea: VotacionInterface {
    override fun MostrarCandidatos(context: Context, listView: ListView) {
        val listaCandidatos = mutableListOf<Candidato>()
        val Candidato1 = Candidato("Pablito", "Esperancistas", 21 )
        val Candidato2 = Candidato("Clavó", "Partido azul ", 14 )
        val Candidato3 = Candidato("Clavito", "Partido verde ", 48 )
        val Candidato4 = Candidato("Calva", "Partido Obrero", 99 )
        val Candidato5 = Candidato("Calvito", "Partido Obrero", 12 )

        listaCandidatos.add(Candidato1)
        listaCandidatos.add(Candidato2)
        listaCandidatos.add(Candidato3)
        listaCandidatos.add(Candidato4)
        listaCandidatos.add(Candidato5)



        //adaptador
        val adapatador = AdaptadorCandidatosSinFoto(context, listaCandidatos)
        listView.adapter = adapatador

    }
}