package interfaz;

/**
 *
 * @author Enzo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spdBarra = new javax.swing.JSeparator();
        etiTItuloPrincipal = new javax.swing.JLabel();
        pnlEvento = new javax.swing.JPanel();
        etiCiudad = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        btnAgregarEve = new javax.swing.JButton();
        btnEliminarEve = new javax.swing.JButton();
        btnDuracionEve = new javax.swing.JButton();
        pnlPonencia = new javax.swing.JPanel();
        btnNumeroVid = new javax.swing.JButton();
        btnAgregarPon = new javax.swing.JButton();
        btnBorrarPon = new javax.swing.JButton();
        pnlDatosPon = new javax.swing.JPanel();
        etiTitulo = new javax.swing.JLabel();
        etiFecha = new javax.swing.JLabel();
        etiNombreInves = new javax.swing.JLabel();
        etiDescripcion = new javax.swing.JLabel();
        etiTipoPon = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtNombreInves = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cboTipoPon = new javax.swing.JComboBox<>();
        pnlDatoPag = new javax.swing.JPanel();
        btnPagPrincipio = new javax.swing.JButton();
        btnPagAnterior = new javax.swing.JButton();
        btnPagSiguiente = new javax.swing.JButton();
        btnPagFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planificacíon de Eventos");

        etiTItuloPrincipal.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        etiTItuloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiTItuloPrincipal.setText("SEGUIMIENTO DE EVENTOS");

        pnlEvento.setBorder(javax.swing.BorderFactory.createTitledBorder("Evento"));
        pnlEvento.setToolTipText("");

        etiCiudad.setText("Ciudad:");
        etiCiudad.setFocusable(false);

        cboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asunción", "Ciudad del Este", "Luque", "San Lorenzo", "Capiatá", "Lambaré", "Fernando de la Mora", "Limpio", "Ñemby", "Encarnación", "Caaguazú", "Coronel Oviedo", "Pedro Juan Caballero", "Itauguá", "Mariano Roque Alonso", "Presidente Franco", "Minga Guazú", "Concepción", "Itá", "Villa Elisa" }));

        btnAgregarEve.setText("Agregar Evento");
        btnAgregarEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEveActionPerformed(evt);
            }
        });

        btnEliminarEve.setText("Eliminar Evento");
        btnEliminarEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEveActionPerformed(evt);
            }
        });

        btnDuracionEve.setText("Duracion del Evento");

        javax.swing.GroupLayout pnlEventoLayout = new javax.swing.GroupLayout(pnlEvento);
        pnlEvento.setLayout(pnlEventoLayout);
        pnlEventoLayout.setHorizontalGroup(
            pnlEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEventoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDuracionEve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarEve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarEve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEventoLayout.createSequentialGroup()
                        .addComponent(etiCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        pnlEventoLayout.setVerticalGroup(
            pnlEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarEve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarEve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDuracionEve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlPonencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Ponencia"));

        btnNumeroVid.setText("Numero de Videoconferencias");

        btnAgregarPon.setText("Agregar Ponencia");
        btnAgregarPon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPonActionPerformed(evt);
            }
        });

        btnBorrarPon.setText("Borrar Ponencia");
        btnBorrarPon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPonenciaLayout = new javax.swing.GroupLayout(pnlPonencia);
        pnlPonencia.setLayout(pnlPonenciaLayout);
        pnlPonenciaLayout.setHorizontalGroup(
            pnlPonenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPonenciaLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(pnlPonenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNumeroVid, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(btnAgregarPon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarPon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlPonenciaLayout.setVerticalGroup(
            pnlPonenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPonenciaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnNumeroVid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarPon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrarPon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlDatosPon.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Ponencia"));

        etiTitulo.setText("Titulo:");
        etiTitulo.setFocusable(false);

        etiFecha.setText("Fecha:");
        etiFecha.setFocusable(false);

        etiNombreInves.setText("Nombre del Investigador:");
        etiNombreInves.setFocusable(false);

        etiDescripcion.setText("Descripcion:");
        etiDescripcion.setFocusable(false);

        etiTipoPon.setText("Tipo de Ponencia:");
        etiTipoPon.setFocusable(false);

        cboTipoPon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precencial", "Videoconferencia" }));

        javax.swing.GroupLayout pnlDatosPonLayout = new javax.swing.GroupLayout(pnlDatosPon);
        pnlDatosPon.setLayout(pnlDatosPonLayout);
        pnlDatosPonLayout.setHorizontalGroup(
            pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPonLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatosPonLayout.createSequentialGroup()
                        .addComponent(etiNombreInves)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(txtNombreInves, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPonLayout.createSequentialGroup()
                        .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPonLayout.createSequentialGroup()
                                .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiDescripcion, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(131, 131, 131))
                            .addGroup(pnlDatosPonLayout.createSequentialGroup()
                                .addComponent(etiTipoPon)
                                .addGap(102, 102, 102)))
                        .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo)
                            .addComponent(txtFecha)
                            .addComponent(txtDescripcion)
                            .addComponent(cboTipoPon, 0, 200, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosPonLayout.setVerticalGroup(
            pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreInves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiNombreInves))
                .addGap(40, 40, 40)
                .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlDatosPonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoPon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiTipoPon))
                .addGap(46, 46, 46))
        );

        pnlDatoPag.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnPagPrincipio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagPrincipio.setText("<<|");

        btnPagAnterior.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagAnterior.setText("<<");

        btnPagSiguiente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagSiguiente.setText(">>");

        btnPagFinal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagFinal.setText("|>>");

        javax.swing.GroupLayout pnlDatoPagLayout = new javax.swing.GroupLayout(pnlDatoPag);
        pnlDatoPag.setLayout(pnlDatoPagLayout);
        pnlDatoPagLayout.setHorizontalGroup(
            pnlDatoPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatoPagLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnPagPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnPagAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnPagSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnPagFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        pnlDatoPagLayout.setVerticalGroup(
            pnlDatoPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatoPagLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(pnlDatoPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spdBarra)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPonencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlDatosPon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDatoPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiTItuloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etiTItuloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spdBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatosPon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDatoPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlPonencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEveActionPerformed
        AgregarEvento ae = new AgregarEvento(this, true);
        ae.setVisible(true);
    }//GEN-LAST:event_btnAgregarEveActionPerformed

    private void btnEliminarEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEveActionPerformed
        EliminarEvento ee = new EliminarEvento(this, true);
        ee.setVisible(true);
    }//GEN-LAST:event_btnEliminarEveActionPerformed

    private void btnAgregarPonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPonActionPerformed
        AgregarPonencia ap = new AgregarPonencia(this, true);
        ap.setVisible(true);
    }//GEN-LAST:event_btnAgregarPonActionPerformed

    private void btnBorrarPonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPonActionPerformed
        BorrarPonencia bp = new BorrarPonencia(this, true);
        bp.setVisible(true);
    }//GEN-LAST:event_btnBorrarPonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEve;
    private javax.swing.JButton btnAgregarPon;
    private javax.swing.JButton btnBorrarPon;
    private javax.swing.JButton btnDuracionEve;
    private javax.swing.JButton btnEliminarEve;
    private javax.swing.JButton btnNumeroVid;
    private javax.swing.JButton btnPagAnterior;
    private javax.swing.JButton btnPagFinal;
    private javax.swing.JButton btnPagPrincipio;
    private javax.swing.JButton btnPagSiguiente;
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JComboBox<String> cboTipoPon;
    private javax.swing.JLabel etiCiudad;
    private javax.swing.JLabel etiDescripcion;
    private javax.swing.JLabel etiFecha;
    private javax.swing.JLabel etiNombreInves;
    private javax.swing.JLabel etiTItuloPrincipal;
    private javax.swing.JLabel etiTipoPon;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JPanel pnlDatoPag;
    private javax.swing.JPanel pnlDatosPon;
    private javax.swing.JPanel pnlEvento;
    private javax.swing.JPanel pnlPonencia;
    private javax.swing.JSeparator spdBarra;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombreInves;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
