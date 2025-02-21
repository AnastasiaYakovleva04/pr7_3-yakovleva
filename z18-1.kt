fun main(){
    try {
        print("Введите сторону равностороннего треугольника: ")
        val a = readln().toDouble()
        when {
            a<=0 -> println("Сторона не может быть меньше 0")
            else -> {
                val s = (Math.pow(a, 2.0) * Math.sqrt(3.0)) / 4
                val R = a / Math.sqrt(3.0)
                val r = a/(2 * Math.sqrt(3.0))
                println("Площадь = ${String.format("%.2f", s)}\nРадиус описанной окружности = ${String.format("%.2f", R)}\nРадиус вписанной окружности = ${String.format("%.2f", r)}")
            }
        }
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
    }
}