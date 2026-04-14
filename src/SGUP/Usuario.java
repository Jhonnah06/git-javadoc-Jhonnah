package SGUP;
    /**
     * Clase que representa un usuario dentro del sistema.
     * Permite almacenar y gestionar la información básica del usuario.
     *
     * @author Jhonnah
     * @version 1.0
     * @since 2026
     */
    public class Usuario {

        private String nombre;
        private int edad;

        /**
         * Constructor de la clase Usuario
         *
         * @param nombre Nombre del usuario
         * @param edad Edad del usuario
         */
        public Usuario(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        /**
         * Obtiene el nombre del usuario
         *
         * @return Nombre del usuario
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Modifica el nombre del usuario
         *
         * @param nombre Nuevo nombre del usuario
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Muestra la información del usuario
         *
         * @return Cadena con los datos del usuario
         */
        public String mostrarInformacion() {
            return "Nombre: " + nombre + ", Edad: " + edad;
        }

        /**
         * Método obsoleto (no recomendado usar)
         *
         * @deprecated Este método será eliminado en futuras versiones
         */
        @Deprecated
        public void metodoAntiguo() {
            System.out.println("Método obsoleto");
        }
    }

