package pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.models
import java.util.*
import kotlin.collections.*

data class Pessoa (val nome: String,val dataDeNascimento: Date){
    var veiculos = mutableListOf<Veiculo>()
    var carta: Carta? = null
    var posicao: Posicao? = null

    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String): Veiculo{
        //Finish fun
        for(veiculo in veiculos){
            if(veiculo.identificador == identificador){
                return veiculo
            }
        }
        // This is wrong, Needs exeption
        return veiculos[0]
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa){
        for(veiculo in veiculos){
            if(veiculo.identificador == identificador){
                //Removes veicle from the pessoa
                veiculos.remove(veiculo)
                //Add veicle to the buyer
                comprador.veiculos.add(veiculo)
            }
        }
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int){

    }

    fun temCarta(): Boolean{
        return carta != null
    }

    fun tirarCarta(){
        carta = Carta()
    }
}
