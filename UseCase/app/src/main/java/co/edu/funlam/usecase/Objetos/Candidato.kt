package co.edu.funlam.usecase.Objetos

import android.widget.ImageView

open class  Candidato(val nombre: String, val partido: String, val tarjeton: Int)
{
    override fun toString(): String {
        return nombre+"-"+partido + "-"+ tarjeton
    }
}