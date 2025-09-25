public class Hola {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre;

       
            System.out.print("Introduce tu nombre: ");
            nombre = sc.nextLine().trim(); // quitamos espacios en blanco al inicio y al final

        // Saludo con el nombre introducido
        System.out.println("¡Hola, " + nombre + "!");
        
        sc.close();
    }
}