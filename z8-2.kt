fun main() {
    try {
        print("Введите а: ")
        val a = readln().toDouble()
        print("Введите b: ")
        val b = readln().toDouble()
        print("Введите c: ")
        val c = readln().toDouble()
        when {
            (a<=0) || (b<=0) || (c<=0) -> println("Сторона тругольника не может быть меньше 0")
            (a+b>c) && (a+c>b) && (b+c>a) -> {
                val P = a + b + c
                val p = P / 2
                val s = Math.sqrt(p * (p - a) * (p - b) * (p - c))
                println("Площадь треугольника = ${String.format("%.2f", s)}\nПериметр = ${String.format("%.2f", P)}")
            }
            else -> println("Такого треугольника не существует")
            }
        }
    catch (e: NumberFormatException)
    {
        println("Неверный формат данных")
    }
}