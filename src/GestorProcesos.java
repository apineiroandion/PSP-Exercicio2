public class GestorProcesos {
    /**
     * Srting que contiene la ruta del archivo menos el nombre
     */
    private String ruta = "/home/dam/Documentos/";
    /**
     * Metodo que crea un archivo con el nombre especificado
     * @param nombreArchivo Nombre del archivo a crear
     * @return true si el archivo se creó correctamente, false en caso contrario
     */
    public boolean crearArchivo(String nombreArchivo) {
        try {
            Runtime rt = Runtime.getRuntime();
            rt.exec("touch " + ruta + nombreArchivo);
            rt.exec("kate " + ruta + nombreArchivo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /**
     * Metodo que edita un archivo con el nombre especificado
     * @param nombreArchivo Nombre del archivo a editar
     * @return true si el archivo se editó correctamente, false en caso contrario
     */
    public boolean editarArchivo(String nombreArchivo) {
        try {
            Runtime rt = Runtime.getRuntime();
            rt.exec("kate " + ruta + nombreArchivo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
