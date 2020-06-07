package interfaz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import java.io.*;

/**
 *
 * @author Enzo
 */
public class VentanaPrincipal extends javax.swing.JFrame implements Serializable  {

    private ArrayList<Evento> listaE;
    private int index = 0;

    public VentanaPrincipal() {
        initComponents();
        listaE = new ArrayList();
        setResizable(false);
        setLocationRelativeTo(null);
        leerDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spdBarra = new javax.swing.JSeparator();
        etiTItuloPrincipal = new javax.swing.JLabel();
        pnlEvento = new javax.swing.JPanel();
        btnAgregarEve = new javax.swing.JButton();
        btnEliminarEve = new javax.swing.JButton();
        pnlPonencia = new javax.swing.JPanel();
        btnAgregarPon = new javax.swing.JButton();
        btnBorrarPon = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        etiMostCiudad = new javax.swing.JLabel();
        etiMostFechIni = new javax.swing.JLabel();
        etiMostFechFin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPonencia = new javax.swing.JTable();
        etiMostTotalPone = new javax.swing.JLabel();
        etiCiudad = new javax.swing.JLabel();
        etiFechIni = new javax.swing.JLabel();
        etiFechFin = new javax.swing.JLabel();
        etiTotalPone = new javax.swing.JLabel();
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

        javax.swing.GroupLayout pnlEventoLayout = new javax.swing.GroupLayout(pnlEvento);
        pnlEvento.setLayout(pnlEventoLayout);
        pnlEventoLayout.setHorizontalGroup(
            pnlEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEventoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarEve, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(btnAgregarEve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        pnlEventoLayout.setVerticalGroup(
            pnlEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnAgregarEve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnEliminarEve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pnlPonencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Ponencia"));

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
                .addGroup(pnlPonenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarPon, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarPon, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlPonenciaLayout.setVerticalGroup(
            pnlPonenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPonenciaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnAgregarPon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnBorrarPon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        etiMostCiudad.setText("Ciudad:");

        etiMostFechIni.setText("Fecha de Inicio:");

        etiMostFechFin.setText("Fecha de Finalizacíon:");

        tablaPonencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Fecha", "Nombre del Investigador", "Descripcion", "Tipo de Ponencias"
            }
        ));
        jScrollPane1.setViewportView(tablaPonencia);

        etiMostTotalPone.setText("Total de Ponencias:");

        etiTotalPone.setText("X");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiMostFechIni)
                                    .addComponent(etiMostCiudad))
                                .addGap(18, 18, 18)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiFechIni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addComponent(etiMostFechFin)
                                .addGap(18, 18, 18)
                                .addComponent(etiFechFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                                .addComponent(etiMostTotalPone)
                                .addGap(18, 18, 18)
                                .addComponent(etiTotalPone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiMostCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiMostFechIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiMostFechFin)
                        .addComponent(etiFechFin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiFechIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiMostTotalPone)
                    .addComponent(etiTotalPone))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlDatoPag.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnPagPrincipio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagPrincipio.setText("<<|");
        btnPagPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagPrincipioActionPerformed(evt);
            }
        });

        btnPagAnterior.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagAnterior.setText("<<");
        btnPagAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagAnteriorActionPerformed(evt);
            }
        });

        btnPagSiguiente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagSiguiente.setText(">>");
        btnPagSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagSiguienteActionPerformed(evt);
            }
        });

        btnPagFinal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPagFinal.setText("|>>");
        btnPagFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatoPagLayout = new javax.swing.GroupLayout(pnlDatoPag);
        pnlDatoPag.setLayout(pnlDatoPagLayout);
        pnlDatoPagLayout.setHorizontalGroup(
            pnlDatoPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatoPagLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnPagPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnPagAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btnPagFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spdBarra)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPonencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDatoPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiTItuloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(etiTItuloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spdBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDatoPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlPonencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void leerDatos(){
        try{
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("Datos.dat"));
            listaE=(ArrayList) leerFichero.readObject();
            leerFichero.close();
            System.out.println(listaE);
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Error"+e.getMessage());
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    public void copiarDatos(){
        try{
         ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("Datos.dat"));
         escribiendoFichero.writeObject(listaE);
         escribiendoFichero.close();
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }finally{
            
        }
    }
    private void actualizarLista() {
        try {
            String titulos[] = {"Titulo", "Fecha", "Nombre del Investigador", "Descripcion", "Tipo de Ponencia"};
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            ArrayList<Ponencia> li = new ArrayList();
            SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
            li = listaE.get(index).getLista();
            modelo.setRowCount(0);
            Object fila[] = new Object[tablaPonencia.getColumnCount()];
            for (int i = 0; i < li.size(); i++) {
                fila[0] = li.get(i).getTitulo();
                fila[1] = sdformat.format(li.get(i).getFecha());
                fila[2] = li.get(i).getInvestigador();
                fila[3] = li.get(i).getDescripcion();
                fila[4] = li.get(i).getMedio();
                modelo.addRow(fila);
            }
            tablaPonencia.setModel(modelo);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showConfirmDialog(null, "Entrada de indice incorrecto", "Alerta!", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarCabecera() {
        etiCiudad.setText(listaE.get(index).getCiudad());
        SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
        etiFechIni.setText(sdformat.format(listaE.get(index).getFechain()));
        etiFechFin.setText(sdformat.format(listaE.get(index).getFechafin()));
    }
    private void btnAgregarEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEveActionPerformed
        AgregarEvento ae = new AgregarEvento(this, true);
        ae.setVisible(true);
        Evento e = new Evento(ae.getC(), ae.getInicio(), ae.getFin());
        listaE.add(e);
        actualizarCabecera();
        copiarDatos();
    }//GEN-LAST:event_btnAgregarEveActionPerformed

    private void btnEliminarEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEveActionPerformed
        if (listaE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existe un evento para eliminar");
        } else {
            if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el evento de " + listaE.get(index).getCiudad() + "?", "Eliminar evento", JOptionPane.YES_NO_OPTION) == YES_OPTION) {
                listaE.remove(index);
                index = 0;
                actualizarLista();
                actualizarCabecera();
                copiarDatos();
            }
        }
    }//GEN-LAST:event_btnEliminarEveActionPerformed

    private void btnAgregarPonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPonActionPerformed
        if (listaE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existe un evento para agregar una ponencia");
        } else {
            AgregarPonencia ap = new AgregarPonencia(this, true);
            ap.setVisible(true);
            listaE.get(index).agregarPonencias(ap.getTitulo(), ap.getFecha(), ap.getNomInves(), ap.getDescrip(), ap.getTipoPone());
            actualizarLista();
            actualizarCabecera();
            copiarDatos();
        }
    }//GEN-LAST:event_btnAgregarPonActionPerformed

    private void btnBorrarPonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPonActionPerformed
        if (listaE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existe un evento para eliminar una ponencia");
        } else {
            if(tablaPonencia.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "No has seleccionado ninguna ponencia");
                return;
            }
            if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar esta Ponencia?", "Eliminar ponencia", JOptionPane.YES_NO_OPTION) == YES_OPTION) {
                listaE.get(index).borrarPonencia(tablaPonencia.getSelectedRow());
                actualizarLista();
                actualizarCabecera();
                copiarDatos();
            }
        }
    }//GEN-LAST:event_btnBorrarPonActionPerformed

    private void btnPagPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagPrincipioActionPerformed
        if (listaE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista de eventos esta vacia");
        } else {
            index = 0;
            actualizarCabecera();
            actualizarLista();
        }
    }//GEN-LAST:event_btnPagPrincipioActionPerformed

    private void btnPagAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagAnteriorActionPerformed
        if (listaE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista de eventos esta vacia");
        } else {
            index -= 1;
            actualizarCabecera();
            actualizarLista();
        }
    }//GEN-LAST:event_btnPagAnteriorActionPerformed

    private void btnPagSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagSiguienteActionPerformed
        if (listaE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista de eventos esta vacia");
        } else {
            index += 1;
            actualizarCabecera();
            actualizarLista();
        }
    }//GEN-LAST:event_btnPagSiguienteActionPerformed

    private void btnPagFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagFinalActionPerformed
        if (listaE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista de eventos esta vacia");
        } else {
            index = listaE.size()-1;
            actualizarCabecera();
            actualizarLista();
        }
    }//GEN-LAST:event_btnPagFinalActionPerformed

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
    private javax.swing.JButton btnEliminarEve;
    private javax.swing.JButton btnPagAnterior;
    private javax.swing.JButton btnPagFinal;
    private javax.swing.JButton btnPagPrincipio;
    private javax.swing.JButton btnPagSiguiente;
    private javax.swing.JLabel etiCiudad;
    private javax.swing.JLabel etiFechFin;
    private javax.swing.JLabel etiFechIni;
    private javax.swing.JLabel etiMostCiudad;
    private javax.swing.JLabel etiMostFechFin;
    private javax.swing.JLabel etiMostFechIni;
    private javax.swing.JLabel etiMostTotalPone;
    private javax.swing.JLabel etiTItuloPrincipal;
    private javax.swing.JLabel etiTotalPone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatoPag;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlEvento;
    private javax.swing.JPanel pnlPonencia;
    private javax.swing.JSeparator spdBarra;
    private javax.swing.JTable tablaPonencia;
    // End of variables declaration//GEN-END:variables
}
