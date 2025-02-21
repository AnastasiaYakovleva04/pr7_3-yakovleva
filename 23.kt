import kotlin.math.sign
fun main() {
    try {
        print("Введите х: ")
        val x = readln().toDouble()
        print("Введите у: ")
        val y = readln().toDouble()

        when (IsBelongsVM4(-3.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, -1.0, x, y))
        {
            true -> println("Точка принадлежит фигуре на рисунке а")
            else -> println("Точка не принадлежит фигуре на рисунке а")
        }

        when (IsBelongsVM5(-1.0, -2.0, -1.0, 0.0, 0.0, 2.0, 1.0, 0.0, 1.0, -2.0, x, y)){
            true -> println("Точка принадлежит фигуре на рисунке б")
            else -> println("Точка не принадлежит фигуре на рисунке б")
        }

        val inRect = x >= -2.0 && x <= 1.0 && y >= 0.0 && y <= 2.0
        val distance = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y + 1.0, 2.0))
        val inCircle = distance <= 1.0 && y <= -1.0

        when(inCircle || inRect){
            true -> println("Точка принадлежит фигуре на рисунке в")
            else -> println("Точка не принадлежит фигуре на рисунке в")
        }

        when (IsBelongsVM4(-2.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, -2.0, x, y))
        {
            true -> println("Точка принадлежит фигуре на рисунке г")
            else -> println("Точка не принадлежит фигуре на рисунке г")
        }

    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
    }
}
fun IsBelongsVM4(ax: Double, ay: Double, bx: Double, by: Double, cx: Double, cy: Double, dx: Double, dy: Double, x: Double, y:Double): Boolean{
    val z1 = VectorMultiply(ax, ay, bx, by, x, y)
    val z2 = VectorMultiply(bx, by, cx, cy, x, y)
    val z3 = VectorMultiply(cx, cy, dx, dy, x, y)
    val z4 = VectorMultiply(dx, dy, ax, ay, x, y)
    val sign1 = sign(z1)
    val sign2 = sign(z2)
    val sign3 = sign(z3)
    val sign4 = sign(z4)
    val is_belong: Boolean
    when {
        (sign1 == sign2) && (sign2 == sign3) && (sign3 == sign4) ->  is_belong = true
        else -> is_belong = false
    }
    return is_belong
}
fun IsBelongsVM5(ax: Double, ay: Double, bx: Double, by: Double, cx: Double, cy: Double, dx: Double, dy: Double, ex: Double, ey: Double, x: Double, y:Double): Boolean{
    val z1 = VectorMultiply(ax, ay, bx, by, x, y)
    val z2 = VectorMultiply(bx, by, cx, cy, x, y)
    val z3 = VectorMultiply(cx, cy, dx, dy, x, y)
    val z4 = VectorMultiply(dx, dy, ex, ey, x, y)
    val z5 = VectorMultiply(ex, ey, ax, ay, x, y)
    val sign1 = sign(z1)
    val sign2 = sign(z2)
    val sign3 = sign(z3)
    val sign4 = sign(z4)
    val sign5 = sign(z5)
    val is_belong: Boolean
    when {
        (sign1 == sign2) && (sign2 == sign3) && (sign3 == sign4) && (sign4 == sign5)->  is_belong = true
        else -> is_belong = false
    }
    return is_belong
}
fun VectorMultiply(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Double {
    val z = (x2 - x1) * (y - y1) - (y2 - y1) * (x - x1)
    return z
}
