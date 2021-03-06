package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*


data class Pessoa (val nome: String,val dataDeNascimento: Date): Movimentavel {
    var veiculos = mutableListOf<Veiculo>()
    var carta: Carta? = null
    var posicao: Posicao = Posicao()

    override fun moverPara(x: Int, y: Int) {
        if(posicao.x == x && posicao.y == y) {
            throw AlterarPosicaoException()
        }
        posicao.x = x
        posicao.y = y
    }

    override fun toString(): String{
        val bar: String = "|"

        val cal = Calendar.getInstance()
        cal.time = dataDeNascimento
       //val formatted = year.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))

        return "Pessoa $bar $nome $bar ${cal.get(Calendar.DAY_OF_MONTH)}-${cal.get(Calendar.MONTH).toInt() + 1}-${cal.get(Calendar.YEAR)} $bar $posicao"
    }
    fun comprarVeiculo(veiculo: Veiculo){

        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String): Veiculo {
        //Finish fun
        for(veiculo in veiculos){
            if(veiculo.identificador == identificador){
                return veiculo
            }
        }
        // This is wrong, Needs exeption
        return throw VeiculoNaoEncontradoException()
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
        for(veiculo in veiculos){
            if(veiculo.identificador == identificador)
            {
                if(veiculo.posicao.x == x && veiculo.posicao.y == y) throw AlterarPosicaoException()

                if (!temCarta() && veiculo is Carro) throw PessoaSemCartaException("$nome n??o tem carta para " +
                        "conduzir o ve??culo indicado")

                return veiculo.posicao.alterarPosicaoPara(x, y)
            }
        }
    }

    fun temCarta(): Boolean{
        return carta != null
    }

    fun tirarCarta(){
        carta = Carta()
    }
}
