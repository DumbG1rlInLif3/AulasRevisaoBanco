package org.exemple.ui.crud

import entidades.CaixaDAgua
import enumeradores.Material

class gerenciarCaixa {
}

fun cadastrarCaixa(){
    /*
    val dimenssao : Array<Double>, //Altura, Profundidade e largura

    )//Aqui vai todos os atributos da classe
     FERRO, PLASTICO, PVC
     */


    println("Digite o material do qual a caixa é composta: ")
    println("1 - FERRO")
    println("2 - PLASTICO")
    println("3 - PVC")
    val opcao = readln().toInt()
    val material : Material
    when(opcao){
        1-> material = Material.FERRO
        2-> material = Material.PLASTICO
        3-> material = Material.PVC
        else-> material = Material.PLASTICO
    }

    println("Capacidade da Caixa em Litros: ")
    val litros = readln().toInt()

    println("Cor da Caixa: ")
    val cor = readln()

    println("Qual o peso da Caixa: ")
    val peso = readln().toDouble()

    println("Qual o preço da Caixa: ")
    val preco = readln().toBigDecimal()

    println("Qual o tamanho da Caixa: ")
    val tamanho = readln()

    println("Qual o custo benefício da Caixa: ")
    val custoBenificio= readln()

    println("Qual o ambiente da Caixa: ")
    val ambiente = readln()

    println("Qual a tampa da Caixa: ")
    val tampa = readln()

    println("Qual a capacidade da Caixa: ")
    val capacidade = readln().toInt()

    println("Qual o peso da largura: ")
    val largura = readln().toDouble()
    
    println("Qual a profundidade da caixa: ")
    val profundidade = readln().toDouble()


    //salvar as variaveis agora para dentro da classe
    CaixaDAgua(
        cor = cor,
        peso = peso,
        preco = preco,
        material = material,
        tamanho = tamanho,
        custoBeneficio = custoBenificio,
        ambiente = ambiente,
        tampa = tampa,
        capacidade = capacidade,
        largura = largura,
        profundidade = profundidade,
    )

}

fun editarCaixa(){}

fun listarCaixa(){}
