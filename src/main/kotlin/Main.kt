fun fibonacciSequence(limit: Int, n: Int) {

    var n1 = 0
    var n2 = 1
    var n3: Int

    val fibonacciList = mutableListOf(0, 1)

    print("$n1 ")
    print("$n2 ")

    for (i in 3..limit) {
        n3 = n1 + n2
        fibonacciList.add(n3)
        print("$n3 ")
        n1 = n2
        n2 = n3
    }

    if (n in fibonacciList) {
        println("\nO número $n pertence a sequencia Fibonacci")
    } else {
        println("\nO número $n não pertence a sequencia Fibonacci")
    }

}

fun main() {
    print("Informe um limite: ")
    val limit = readlnOrNull()?.toIntOrNull()

    print("Digite um número para saber se pertence ou não a sequência Fibonacci ")
    val n = readlnOrNull()?.toIntOrNull()

    if (limit != null && n != null) {
        fibonacciSequence(limit, n)
    }

    println("--- Fim Da Questão 1 ---")

    print("Insira um texto: ")
    val userPrompt = readlnOrNull().toString()
    var upperCase = 0
    var lowerCase = 0


    if (userPrompt.isNotEmpty()) {
        userPrompt.forEach { char ->
            if ('A' == char) {
                upperCase++
            }

            if ('a' == char) {
                lowerCase++
            }

        }
    }

    println("A apareceu $upperCase vez(es).")
    println("a apareceu $lowerCase vez(es).")

    println("--- Fim Da Questão 2 ---")

    val indice = 12
    var soma = 0
    var k = 1

    for (i in k..indice - 1) { // -1 Pois usando o range do kotlin, começa por 1 e não por 0
        k++
        soma += k
    }

    println(soma)

    println("--- Fim Da Questão 3 ---")


}
