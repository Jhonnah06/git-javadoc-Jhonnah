package SGUP;

    /**
     * Clase que representa un producto de la tienda.
     * Permite calcular el precio final con impuestos.
     *
     * @author Jhonnah
     * @version 1.0
     * @since 2026
     */
    public class Producto {

        private String nombreProducto;
        private double precio;

        /**
         * Constructor de la clase Producto
         *
         * @param nombreProducto Nombre del producto
         * @param precio Precio base del producto
         */
        public Producto(String nombreProducto, double precio) {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
        }

        /**
         * Calcula el precio final con IVA
         *
         * @param iva Porcentaje de IVA (ej: 0.21 para 21%)
         * @return Precio final con IVA incluido
         */
        public double calcularPrecioFinal(double iva) {
            return precio + (precio * iva);
        }

        /**
         * Muestra la información del producto
         *
         * @return Cadena con los datos del producto
         */
        public String mostrarProducto() {
            return "Producto: " + nombreProducto + ", Precio: " + precio;
        }

        /**
         * Método que puede lanzar una excepción si el precio es inválido
         *
         * @throws IllegalArgumentException si el precio es negativo
         */
        public void validarPrecio() throws IllegalArgumentException {
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
        }
    }
