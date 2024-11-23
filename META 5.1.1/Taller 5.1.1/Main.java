public class Main {
    public static void main(String[] args) {
        // Crear un nuevo pedido y agregar productos
        Pedido pedido = new Pedido(1);
        pedido.agregarProducto(new Producto("Manzana", 1.2));
        pedido.agregarProducto(new Producto("Pan", 0.8));
        
        // Mostrar detalles del pedido
        pedido.mostrarDetalles();

        // Guardar el pedido en un archivo
        pedido.guardarPedido();

        // Cargar el pedido desde un archivo
        Pedido pedidoCargado = Pedido.cargarPedido("pedido_1.dat");
        if (pedidoCargado != null) {
            System.out.println("\nDetalles del pedido cargado:");
            pedidoCargado.mostrarDetalles();
        }
    }
}
