package Paquete;

import java.awt.event.KeyEvent;

public class Vista extends javax.swing.JFrame {

    PanelSnake panelSnake;

    public Vista() {
        initComponents();

        this.setLocationRelativeTo(null);

        panelSnake = new PanelSnake(800, 30);
        this.add(panelSnake);
        panelSnake.setBounds(10, 10, 800, 800);
        panelSnake.setOpaque(false);

        PanelFondo fondo = new PanelFondo(800, 30);
        this.add(fondo);
        fondo.setBounds(10, 10, 800, 800);
        
        this.requestFocus(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                panelSnake.cambiarDireccion("iz");
                break;
            case KeyEvent.VK_RIGHT:
                panelSnake.cambiarDireccion("de");
                break;
            case KeyEvent.VK_UP:
                panelSnake.cambiarDireccion("arr");
                break;
            case KeyEvent.VK_DOWN:
                panelSnake.cambiarDireccion("aba");
                break;
            default:
                break;
        }


    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
