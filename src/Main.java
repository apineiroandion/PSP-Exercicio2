public class Main {
    public static void main(String[] args) {
        GestorProcesos gp = new GestorProcesos();
        Menu menu = new Menu(gp);
        menu.mostrarMenu(gp);
    }
}
