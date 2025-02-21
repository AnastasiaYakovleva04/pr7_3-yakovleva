fun main() {
    try {
        print("Введите a: ")
        val a  = readln().toDouble()
        print("Введите b: ")
        val b  = readln().toDouble()
        print("Введите c: ")
        val c  = readln().toDouble()
        when (a){
            0.0 -> println("а не может быть = 0")
            else -> {
                val x0 = -b/(2*a)
                val y0 = a * Math.pow(x0, 2.0) + b * x0 + c
                println("Вершина параболы в точке: (${String.format("%.2f", x0)}; ${String.format("%.2f", y0)})")
            }
        }
    }
    catch(e: Exception)
    {
        println("Неверный формат данных")
    }
}