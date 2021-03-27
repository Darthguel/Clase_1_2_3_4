fun main(parametro: Array<String>)
    {
        clase2()
        clase3()
        clase4()

    }

fun clase2() {
    val nombre:String
    val edad:Int

    println("Hola Mundo")
    println("Segundo programa")
}

fun clase3(){
    val valor1 = 100
    val valor2 = 400
    var resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")

    val lado = 50
    val perimetro = lado * 4
    val superficie = lado * lado
    println("El perímetro de un cuadrado de lado $lado es $perimetro y su superficie es $superficie")

    val peso1 = 89.4f
    val peso2 = 67f
    val peso3 = 87.45f
    val promedio = (peso1 + peso2 + peso3) / 3
    println("El promedio de los tres pesos de personas es $promedio")
}

fun clase4(){
    print("Ingrese nombre:")
    val nombre = readLine()!!.toString()
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 y $valor2 es $producto")
}