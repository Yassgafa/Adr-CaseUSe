package co.edu.funlam.usecase.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import co.edu.funlam.usecase.*
import co.edu.funlam.usecase.Estrategias.EstrategiaEleccionesAlcaldia
import co.edu.funlam.usecase.Estrategias.EstrategiaEleccionesAsamblea
import co.edu.funlam.usecase.Estrategias.EstrategiaEleccionesConcejo
import co.edu.funlam.usecase.Estrategias.EstrategiaEleccionesPresidencia


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tableta = TabletaVotacion(EstrategiaEleccionesPresidencia())

        //Datos
        val lista = this.findViewById<ListView>(R.id.ListaCandidatos)


        val listaCiudades = mutableListOf<String>()
        val Presidencia = "Elecciones Presidencia"
        val Alcaldia = "Elecciones Alcaldía"
        val Concejo = "Elecciones Concejo"
        val Asamblea = "Elecciones Asamblea"


        listaCiudades.add(Presidencia)
        listaCiudades.add(Alcaldia)
        listaCiudades.add(Concejo)
        listaCiudades.add(Asamblea)


        //adaptador
        val adapatador = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCiudades)
        lista.adapter = adapatador


        lista.setOnItemClickListener { parent, view, position, id ->
            val elementoSeleccionado = listaCiudades[position]

            // Cambiar la estrategia en la Tableta de Votación según el elemento seleccionado
            when (elementoSeleccionado) {
                Presidencia -> tableta.cambiarElecciones(EstrategiaEleccionesPresidencia())
                Alcaldia -> tableta.cambiarElecciones(EstrategiaEleccionesAlcaldia())
                Concejo -> tableta.cambiarElecciones(EstrategiaEleccionesConcejo())
                Asamblea -> tableta.cambiarElecciones(EstrategiaEleccionesAsamblea())
            }

            // Mostrar candidatos usando la estrategia actual
            tableta.mostrarCandidatos(this, lista)
        }


    }
}
