import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 1; i <= limite; i++) {
            tabla[i - 1] = numero * i;
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;         }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) { // solo retorna false si es divisible
                return false;
            }
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        int[] serie = new int[n];
        if (n > 0) serie[0] = 0;
        if (n > 1) serie[1] = 1;
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        double promedio = (double) suma / arreglo.length;
        return promedio;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        while (izquierda < derecha) {
            int temp = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temp;
            izquierda++;
            derecha--;
        }
        return arreglo;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        int[] temp = new int[arreglo.length];
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < contador; j++) {
                if (arreglo[i] == temp[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                temp[contador] = arreglo[i];
                contador++;
            }
        }
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = temp[i];
        }
        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length]; 
        int indice = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            resultado[indice] = arreglo1[i];
            indice++;
        }
        for (int i = 0; i < arreglo2.length; i++) {
            resultado[indice] = arreglo2[i];
            indice++;
        }
        return resultado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] resultado = new int[n];
        int indice = 0;
        for (int i = posiciones; i < n; i++) {
            resultado[indice] = arreglo[i];
            indice++;
        }
        for (int i = 0; i < posiciones; i++) {
            resultado[indice] = arreglo[i];
            indice++;
        }
        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado = resultado + cadena.charAt(i);
        }
        return resultado;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.split("\\s+"); 
        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        int indice = cadena.indexOf(subcadena);
    if (indice == -1) {
        return "Subcadena no encontrada";
    }
    return "Encontrada en el índice: " + indice;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        int arroba = correo.indexOf("@"); 
        int punto = correo.lastIndexOf(".");
        return arroba > 0 && punto > arroba;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (int num : lista) {
            suma += num; 
        }
        return suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

    int indice = (int)(Math.random() * opciones.length);
    String eleccionComputadora = opciones[indice];

    String resultado;

    if (eleccionUsuario.equals(eleccionComputadora)) {
        resultado = "Empate";
    } else if (
        (eleccionUsuario.equals("Piedra")  && (eleccionComputadora.equals("Tijera")  || eleccionComputadora.equals("Lagarto"))) ||
        (eleccionUsuario.equals("Papel")   && (eleccionComputadora.equals("Piedra")  || eleccionComputadora.equals("Spock")))   ||
        (eleccionUsuario.equals("Tijera")  && (eleccionComputadora.equals("Papel")   || eleccionComputadora.equals("Lagarto"))) ||
        (eleccionUsuario.equals("Lagarto") && (eleccionComputadora.equals("Spock")   || eleccionComputadora.equals("Papel")))   ||
        (eleccionUsuario.equals("Spock")   && (eleccionComputadora.equals("Tijera")  || eleccionComputadora.equals("Piedra")))
    ) {
        resultado = "Ganaste";
    } else {
        resultado = "Perdiste";
    }

    return "Tu elección: " + eleccionUsuario +
           " | Computadora: " + eleccionComputadora +
           " | Resultado: " + resultado;
    }

    public String pptls2(String game[]) {
        String[] opcionesValidas = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
    boolean jugador1Valido = false;
    boolean jugador2Valido = false;
    for (String opcion : opcionesValidas) {
        if (opcion.equals(eleccionJugador1)) jugador1Valido = true;
        if (opcion.equals(eleccionJugador2)) jugador2Valido = true;
    }
    if (!jugador1Valido || !jugador2Valido) {
        return "Elección inválida. Opciones: Piedra, Papel, Tijera, Lagarto, Spock";
    }

    if (eleccionJugador1.equals(eleccionJugador2)) {
        return "Empate";
    }

    if (
        (eleccionJugador1.equals("Piedra")  && (eleccionJugador2.equals("Tijera")  || eleccionJugador2.equals("Lagarto"))) ||
        (eleccionJugador1.equals("Papel")   && (eleccionJugador2.equals("Piedra")  || eleccionJugador2.equals("Spock")))   ||
        (eleccionJugador1.equals("Tijera")  && (eleccionJugador2.equals("Papel")   || eleccionJugador2.equals("Lagarto"))) ||
        (eleccionJugador1.equals("Lagarto") && (eleccionJugador2.equals("Spock")   || eleccionJugador2.equals("Papel")))   ||
        (eleccionJugador1.equals("Spock")   && (eleccionJugador2.equals("Tijera")  || eleccionJugador2.equals("Piedra")))
    ) {
        return "Gana el Jugador 1";
    }

    return "Gana el Jugador 2";
    }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}

