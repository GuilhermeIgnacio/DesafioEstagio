fun fibonacciSequence(limit: Int, n: Int) {

    var n1 = 0
    var n2 = 1
    var n3: Int

    val fibonacciList = mutableListOf(0,1)

    print("$n1 ")
    print("$n2 ")

    for (i in 3 .. limit) {
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

}
