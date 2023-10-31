package co.edu.funlam.usecase.Intefaces

import android.content.Context
import android.widget.ListView

interface VotacionInterface {
    fun MostrarCandidatos(context: Context, listView: ListView)
}