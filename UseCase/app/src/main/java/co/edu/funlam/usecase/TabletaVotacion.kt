package co.edu.funlam.usecase

import android.content.Context
import android.widget.ListView
import co.edu.funlam.usecase.Intefaces.VotacionInterface

class TabletaVotacion(private var estrategia: VotacionInterface) {
    fun cambiarElecciones(estrategiaNueva: VotacionInterface) {
        estrategia = estrategiaNueva
    }

    fun mostrarCandidatos(context: Context, listView: ListView) {
        estrategia.MostrarCandidatos(context, listView)
    }
}