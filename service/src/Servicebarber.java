public enum Servicebarber {

    CORTE("Corte de pelo", "Corte de pelo tradicional", 15.000){
        @Override
        public String mostrarDescripcionServicio() {
            return "Ambienta tu forma de vestir con un mejor peinado";
        }
    },
    UÑAS("Manicura", "Manicura y pedicura", 50.000){
        @Override
        public String mostrarDescripcionServicio() {
            return "Prueba distintos diseños para tus uñas";
        }
    },
    TINTE("Tinte de cabello", "Tinte de cabello de cualquier color", 80.000){
        @Override
        public String mostrarDescripcionServicio() {
            return "estilos para tu cabello con distintos colores";
        }
    };

    private String nombre;
    private String descripcion;
    private int precio;

    Servicebarber(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    Servicebarber(String s, String s1, double v) {
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

   public abstract String mostrarDescripcionServicio();
}
