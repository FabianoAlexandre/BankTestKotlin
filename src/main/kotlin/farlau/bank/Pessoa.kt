package farlau.bank

class Pessoa {
    var nome: String = "Fabiano Alexandre"
    var cpf: String = "123.456.789-00"
}

fun main() {
        var fabiano = Pessoa()

    println(fabiano.nome)
    println(fabiano.cpf)
}