package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Evento;

/**
 *
 * @author Enzo
 */
public class AgregarPonencia extends javax.swing.JDialog {

    private String titulo;
    private Date fecha;
    private String nomInves;
    private String descrip;
    private String tipoPone;
    private int fIndex;

    public boolean operacionRealizada = false;

    public AgregarPonencia(java.awt.Frame parent, boolean modal, int fIndex) {
        super(parent, modal);
        this.fIndex = fIndex;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        try {
            agregarFechas();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ha ocurrido un error:\n" + e, "Alerta!", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNomInves() {
        return nomInves;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getTipoPone() {
        return tipoPone;
    }

    private void agregarFechas() throws ParseException {
        VentanaPrincipal vp = new VentanaPrincipal();
        Evento e = vp.getEvento(fIndex);
        //Agarrar fechas + formato
        SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
        Date desdeDate = vp.getFechaIni(fIndex);
        Date hastaDate = vp.getFechafin(fIndex);
        //Obtener fehcas entre fechas y agregar al cbo
        Calendar cal = Calendar.getInstance();
        cal.setTime(desdeDate);
        if (e.buscarPonencia(sdformat.format(cal.getTime()))) {
            cboFechas.addItem(sdformat.format(desdeDate));
        }
        while (cal.getTime().before(hastaDate)) {
            cal.add(Calendar.DATE, 1);
            if (e.buscarPonencia(sdformat.format(cal.getTime()))) {
                cboFechas.addItem(sdformat.format(cal.getTime()));
            }
        }
        cboFechas.removeItem(sdformat.format(cal.getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        etiTitulo = new javax.swing.JLabel();
        etiFecha = new javax.swing.JLabel();
        etiNomInves = new javax.swing.JLabel();
        etiDescripcion = new javax.swing.JLabel();
        etiTipoPonencia = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtNomInves = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cboTipoPonencia = new javax.swing.JComboBox<>();
        cboFechas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar una ponencia");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        etiTitulo.setText("Título");

        etiFecha.setText("Fecha");

        etiNomInves.setText("Nombre del Investigador");

        etiDescripcion.setText("Descripcíón");

        etiTipoPonencia.setText("Tipo de Ponencia");

        cboTipoPonencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presencial", "Videoconferencia" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiTipoPonencia)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(btnAceptar)
                                .addGap(69, 69, 69)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(cboTipoPonencia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiFecha)
                            .addComponent(etiNomInves)
                            .addComponent(etiDescripcion)
                            .addComponent(etiTitulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomInves, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cboFechas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiFecha))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiNomInves)
                    .addComponent(txtNomInves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiTipoPonencia)
                    .addComponent(cboTipoPonencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if ("".equals(txtTitulo.getText()) || "".equals(txtNomInves.getText()) || "".equals(txtDescripcion.getText())) {
            JOptionPane.showMessageDialog(null, "Un campo esta vacio.");
        } else {
            try {
                titulo = txtTitulo.getText();
                SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
                fecha = sdformat.parse(cboFechas.getSelectedItem().toString());
                nomInves = txtNomInves.getText();
                descrip = txtDescripcion.getText();
                tipoPone = cboTipoPonencia.getSelectedItem().toString();
                operacionRealizada = true;
                dispose();
            } catch (ParseException ex) {
                JOptionPane.showConfirmDialog(null, "Ha ocurrido un error:\n" + ex, "Alerta!", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarPonencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPonencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPonencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPonencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarPonencia dialog = new AgregarPonencia(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cboFechas;
    private javax.swing.JComboBox<String> cboTipoPonencia;
    private javax.swing.JLabel etiDescripcion;
    private javax.swing.JLabel etiFecha;
    private javax.swing.JLabel etiNomInves;
    private javax.swing.JLabel etiTipoPonencia;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNomInves;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
