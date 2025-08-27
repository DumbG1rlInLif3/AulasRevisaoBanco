package entidades

import enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua(//construtores da classe

    val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal,
    val profundidade : Double,
    val largura : Double,
    //val dimenssao : Array<Double>, //Altura, Profundidade e largura
    val material : Material,
    val tamanho : String,
    val custoBeneficio: String,
    val ambiente : String,
    val tampa : String,

    )//Aqui vai todos os atributos da classe

{

}