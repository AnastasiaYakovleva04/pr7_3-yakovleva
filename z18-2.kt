fun main() {
    try {
        //M1
        print("Введите х1: ")
        val x1 = readln().toDouble()
        print("Введите у1: ")
        val y1 = readln().toDouble()
        //M2
        print("Введите х2: ")
        val x2 = readln().toDouble()
        print("Введите у2: ")
        val y2 = readln().toDouble()
        //N1
        print("Введите х3: ")
        val x3 = readln().toDouble()
        print("Введите у3: ")
        val y3 = readln().toDouble()
        //N2
        print("Введите х4: ")
        val x4 = readln().toDouble()
        print("Введите у4: ")
        val y4 = readln().toDouble()

        val d = (x1-x2) * (y3-y4) - (y1-y2) * (x3-x4)
        when(d){
            0.0 -> println("Прямые параллельны")
            else -> {
                val t = ((x1-x3) * (y3-y4) - (y1-y3) * (x3-x4)) / d
                val x = x1+t * (x2-x1)
                val y = y1 + t * (y2-y1)
                println("Координаты точки пересечения: (${String.format("%.3f", x)}; ${String.format("%.3f", y)})")
            }
        }
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
    }
}