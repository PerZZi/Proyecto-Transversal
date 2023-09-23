/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotransversal.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectotransversal.AccesoDatos.*;
import proyectotransversal.entidades.*;

/**
 *
 * @author marce
 */
public class formuDeInscripcionView extends javax.swing.JInternalFrame {

    private List<Materia> listaMaterias;
    private List<Alumno> listaAlumnos;

    private InscripcionData insdata;
    private AlumnoData aludata;
    private DefaultTableModel modelo;

    /**
     * Creates new form formuDeInscripcionView
     */
    public formuDeInscripcionView() {
        initComponents();

        aludata = new AlumnoData();
        listaAlumnos = aludata.ListarAlumnos();
        insdata = new InscripcionData();
        modelo = new DefaultTableModel();

        cargaAlumos();
        armarCabecera();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jradioInscriptas = new javax.swing.JRadioButton();
        jradioNoInscriptas = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        JbSalir = new javax.swing.JButton();
        JbAnular = new javax.swing.JButton();
        JbInscribir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(440, 340));

        jLabel2.setText("Seleccione un alumno");

        jLabel3.setText("Listado de Materias");

        jradioInscriptas.setText("Materias inscriptas");
        jradioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradioInscriptasActionPerformed(evt);
            }
        });

        jradioNoInscriptas.setText("Materias no inscriptas");
        jradioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradioNoInscriptasActionPerformed(evt);
            }
        });

        JbSalir.setText("Salir");
        JbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalirActionPerformed(evt);
            }
        });

        JbAnular.setText("Anular inscripcion");
        JbAnular.setEnabled(false);
        JbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAnularActionPerformed(evt);
            }
        });

        JbInscribir.setText("Inscribir");
        JbInscribir.setEnabled(false);
        JbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(JbAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(JbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbAnular)
                    .addComponent(JbSalir)
                    .addComponent(JbInscribir)))
        );

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtMaterias);

        jLabel1.setText("Formulario de inscripcion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jradioInscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jradioNoInscriptas))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(27, 27, 27)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jradioInscriptas)
                    .addComponent(jradioNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JbSalirActionPerformed

    private void jradioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradioNoInscriptasActionPerformed

        borrarFila();
        jradioInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        JbAnular.setEnabled(false);
        JbInscribir.setEnabled(true);
    }//GEN-LAST:event_jradioNoInscriptasActionPerformed

    private void jradioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradioInscriptasActionPerformed

        borrarFila();
        jradioNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        JbAnular.setEnabled(true);
        JbInscribir.setEnabled(false);
    }//GEN-LAST:event_jradioInscriptasActionPerformed

    private void JbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbInscribirActionPerformed

        int filaSelec = jtMaterias.getSelectedRow();
        if (filaSelec != -1) {

            Alumno alumnoSeleccionado = (Alumno) jComboBox1.getSelectedItem();

            int idMateria = (Integer) modelo.getValueAt(filaSelec, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSelec, 1);
            int año = (Integer) modelo.getValueAt(filaSelec, 2);
            Materia m = new Materia(idMateria, nombreMateria, año, true);

            Inscripcion i = new Inscripcion(alumnoSeleccionado, m, 0);
            insdata.guardarInscripcion(i);
            borrarFila();
        }
    }//GEN-LAST:event_JbInscribirActionPerformed

    private void JbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAnularActionPerformed

        int filaSelec = jtMaterias.getSelectedRow();
        if (filaSelec != -1) {

            Alumno alumnoSeleccionado = (Alumno) jComboBox1.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSelec, 0);
           
            insdata.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), idMateria);
            borrarFila();
        }
    }//GEN-LAST:event_JbAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAnular;
    private javax.swing.JButton JbInscribir;
    private javax.swing.JButton JbSalir;
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jradioInscriptas;
    private javax.swing.JRadioButton jradioNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumos() {
        for (Alumno alu : listaAlumnos) {
            jComboBox1.addItem(alu);
        }
    }

    private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList();
        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Año");
        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
        }
        jtMaterias.setModel(modelo);
    }

    private void borrarFila() {
        int fila = modelo.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargaDatosNoInscriptas() {
        Alumno selec = (Alumno) jComboBox1.getSelectedItem();
        listaMaterias = insdata.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia m : listaMaterias) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }

    private void cargaDatosInscriptas() {
        Alumno selec = (Alumno) jComboBox1.getSelectedItem();
        List<Materia> lista = (ArrayList) insdata.obtenerMateriaCursada(selec.getIdAlumno());
        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }
}
