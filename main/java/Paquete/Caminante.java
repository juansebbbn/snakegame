package Paquete;

public class Caminante implements Runnable {

    PanelSnake panel;
    boolean estado = true;

    public Caminante(PanelSnake panel) {
        this.panel = panel;

    }

    @Override
    public void run() {

        while (estado) {
            panel.avanzar();
            panel.repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public void parar() {
        this.estado = false;
    }

}
