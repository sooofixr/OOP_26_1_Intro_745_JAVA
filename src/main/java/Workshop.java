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
    for (int i = 2; i * i <= numero; i++) {
        if (numero % i == 0) {
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
        if (n == 0) {
        return arreglo;
        }

        posiciones = posiciones % n;
        if (posiciones < 0) {
        posiciones += n;
        }

        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
        resultado[(i + posiciones) % n] = arreglo[i];
        }

        return resultado;
}

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        if (cadena == null) {
            return false;
        }

         String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int izquierda = 0;
        int derecha = limpia.length() - 1;

        while (izquierda < derecha) {
            if (limpia.charAt(izquierda) != limpia.charAt(derecha)) {
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
        return cadena.trim().split("\\s+").length;
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
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) {
            return false;
        }
        return correo.matches("^[A-Za-z0-9._+-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,}$");
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
        if (numero < 0) {
            return "-" + Integer.toBinaryString(-numero);
        }
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
   public String convertirAHexadecimal(int numero) {
        if (numero < 0) {
            return "-" + Integer.toHexString(-numero).toUpperCase();
        }
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

    public String pptls2(String[] game) {
    String eleccionJugador1 = game[0].trim().toLowerCase();
    String eleccionJugador2 = game[1].trim().toLowerCase();

    String[] opcionesValidas = {"piedra", "papel", "tijera", "lagarto", "spock"};
    boolean jugador1Valido = false;
    boolean jugador2Valido = false;

    for (String opcion : opcionesValidas) {
        if (opcion.equals(eleccionJugador1)) jugador1Valido = true;
        if (opcion.equals(eleccionJugador2)) jugador2Valido = true;
    }

    if (!jugador1Valido || !jugador2Valido) {
        return "Invalid Option";
    }

    if (eleccionJugador1.equals(eleccionJugador2)) {
        return "Tie";
    }

    if (
        (eleccionJugador1.equals("piedra")  && (eleccionJugador2.equals("tijera") || eleccionJugador2.equals("lagarto"))) ||
        (eleccionJugador1.equals("papel")   && (eleccionJugador2.equals("piedra") || eleccionJugador2.equals("spock"))) ||
        (eleccionJugador1.equals("tijera")  && (eleccionJugador2.equals("papel") || eleccionJugador2.equals("lagarto"))) ||
        (eleccionJugador1.equals("lagarto") && (eleccionJugador2.equals("spock") || eleccionJugador2.equals("papel"))) ||
        (eleccionJugador1.equals("spock")   && (eleccionJugador2.equals("tijera") || eleccionJugador2.equals("piedra")))
    ) {
        return "Player 1";
    }

    return "Player 2";
}

    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public String zoodiac(int day, int month) {
    if (month < 1 || month > 12 || day < 1 || day > 31) {
        return "Invalid Date";
    }

    if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
        return "Invalid Date";
    }

    if (month == 2 && day > 29) {
        return "Invalid Date";
    }

    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
        return "Aries";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
        return "Tauro";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
        return "Gemini";
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
        return "Cancer";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
        return "Leo";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
        return "Virgo";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
        return "Libra";
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
        return "Escorpio";
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
        return "Sagitario";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
        return "Capricornio";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
        return "Acuario";
    } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
        return "Piscis";
    } else {
        return "Invalid Date";
    }
}

}

