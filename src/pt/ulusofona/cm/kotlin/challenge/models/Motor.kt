package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(val cavalos: Int, val clindrada: Int): Ligavel {
    var ligado: Boolean = false
    override fun toString(): String{
        return "Motor | $cavalos | $clindrada"
    }

    override fun ligar() {

        if(ligado) throw VeiculoDesligadoException()

        ligado = true
    }

    override fun desligar() {

        if(!ligado) throw VeiculoDesligadoException()

        ligado = false
    }

    override fun estaLigado(): Boolean {
        return ligado
    }
}