package com.ticlavilca.abigail.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {
    //@Test indica que este metodo es un caso de prueba. esta función permite ejecutar como una prueba unitaria
    @Test
    //La función main es la entrada principal para ejecutar esta prueba. Esta funcion no recibe ningun parametro y tampoco duelve uno
    fun main() {
        // Se define la palabra de entrada para la que queremos contar la frecuencia de caracteres
        val palabra = "hello"

        // Llamamos a la función contarFrecuencia para obtener un mapa con la frecuencia de cada carácter.
        val frecuencia = contarFrecuencia(palabra)

        // Imprimimos el mapa de frecuencias resultante.
        println("Frecuencia de caracteres: $frecuencia")
    }

    // Función que recibe una cadena y retorna un mapa con la frecuencia de cada carácter.
    private fun contarFrecuencia(palabra: String): Map<Char, Int> {
        // Creamos un mapa mutable para almacenar el carácter y su respectiva frecuencia.
        val mapaFrecuencia = mutableMapOf<Char, Int>()

        // Aqui recorremos cada carácter de la palabra.
        for (caracter in palabra) {
            // Usamos una estructura Condicional para saber si el carácter ya está en el mapa,
            if (caracter in mapaFrecuencia) {
                //El operador !! se utiliza para indicar que estamos seguros de que el valor obtenido no es null,e incrementamos su valor en 1.
                mapaFrecuencia[caracter] = mapaFrecuencia[caracter]!! + 1
            } else {
                // Si el carácter no está en el mapa, lo añadimos con frecuencia 1.
                mapaFrecuencia[caracter] = 1
            }
        }
        // Retornamos el mapa con las frecuencias de los caracteres.
        return mapaFrecuencia
    }
}
