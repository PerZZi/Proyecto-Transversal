
package proyectotransversal.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectotransversal.AccesoDatos.*;

import proyectotransversal.entidades.*;


public class CargaDeNotasView extends javax.swing.JInternalFrame {

    private List<Materia> listaMaterias;
    private List<Alumno> listaAlumnos;

    private InscripcionData insdata;
    private AlumnoData aludata;
    private DefaultTableModel modelo;
    private MateriaData materiaData;
    
    
    public CargaDeNotasView() {
        
        materiaData= new MateriaData();
        aludata = new AlumnoData();
        listaAlumnos = aludata.ListarAlumnos();
        insdata = new InscripcionData();
        modelo = new DefaultTableModel();
        
        
        
        initComponents();
        cargaAlumnos();
        armarCabecera();
        listarNotas();
       
        
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCBalumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTnotas = new javax.swing.JTable();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        jLabel2.setText("Seleccione un alumno");

        jCBalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBalumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jCBalumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("Carga de notas");

        jTnotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ));
        jTnotas.setEditingColumn(1);
        jTnotas.setEditingRow(1);
        jTnotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTnotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTnotas);

        jBguardar.setText("Guardar");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBguardar)))
                        .addGap(0, 300, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCBalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBalumnosActionPerformed
        //Cuando se selecciona un alumno en el ComboBox, se debe listar las materias a las que está inscripto.
        //Primero borra todas las filas existentes en la tabla.
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        // Obtiene el alumno seleccionado
        Alumno selec = (Alumno) jCBalumnos.getSelectedItem();
        
        // Verifica si el alumno tiene materias cursadas
        if (!selec.isActivo()) {
            
            JOptionPane.showMessageDialog(this, "El alumno seleccionado no tiene materias cursadas.");
            return;
        }
        
        // Si la tabla tiene filas, procede a listar las notas
        if (modelo.getRowCount() > 0) {
            listarNotas();
        }
    
    }//GEN-LAST:event_jCBalumnosActionPerformed

    private void jTnotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTnotasMouseClicked
        int filaSeleccionada = jTnotas.getSelectedRow();

        // ID de la inscripción
    int idInscripcion = (int) jTnotas.getValueAt(filaSeleccionada, 0);

    // Nombre de la materia (en formato de cadena)
    String nombreMateria = (String) jTnotas.getValueAt(filaSeleccionada, 1);

    // Obtener el ID de la materia correspondiente buscándolo en tu lista o base de datos
    int idMateria = IdMateriaPorNombre(nombreMateria);

    // Nota actual
    Object notaActual = jTnotas.getValueAt(filaSeleccionada, 2);

    // Nueva nota
    String nuevaNota = JOptionPane.showInputDialog("Ingrese la nueva nota:");

    // Si la nueva nota no es null, convertirla a double y continuar
    if (nuevaNota != null) {
        try {
            double nuevaNotaDouble = Double.parseDouble(nuevaNota);

            // Redondear la nueva nota
            int nuevaNotaEntera = (int) Math.round(nuevaNotaDouble);

            if (nuevaNota != null && !nuevaNota.isEmpty()) {

                if (notaActual instanceof Double) {
                    editarColumna("nota", (Double) notaActual, nuevaNotaDouble);
                } else {
                    throw new ClassCastException("El valor de la celda seleccionada no es un número.");
                }

                // Guardar la nota actualizada con el ID de la materia
                insdata.actualizarNota(idInscripcion, idMateria, nuevaNotaEntera);
            }
        } catch (NumberFormatException e) {
            // Mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El valor ingresado debe ser un número.");
        }
    }

    }//GEN-LAST:event_jTnotasMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCBalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTnotas;
    // End of variables declaration//GEN-END:variables

    
    private void armarCabecera(){

    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Nota");
    jTnotas.setModel(modelo);
}

private void cargaAlumnos() {
        for (Alumno alu : listaAlumnos) {
            jCBalumnos.addItem(alu);
        }
    }

    private void listarNotas() {
        Alumno selec = (Alumno) jCBalumnos.getSelectedItem();

        List<Materia> materiasCursadas = (ArrayList) insdata.obtenerMateriaCursada(selec.getIdAlumno());
        List<Inscripcion> notas = (ArrayList) insdata.ObtenerInscripcionesPorAlumno(selec.getIdAlumno());

        for (Materia m : materiasCursadas) {
            for (Inscripcion i : notas) {
                if (i.getNota() > 0) {
                    modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), i.getNota()});
                }
            }

        }
    }
    
    private void editarColumna(String columna, double valorActual, double valorNuevo) {
    // Obtiene todas las filas de la tabla
    int filaSeleccionada = jTnotas.getRowCount();
    
    if (filaSeleccionada != -1) { // Verificar si la tabla tiene filas
        // Recorre todas las filas
        for (int i = 0; i < filaSeleccionada; i++) {
            // Obtiene el valor de la columna actual en la fila actual
            double valorActualFila = (double) jTnotas.getValueAt(i, jTnotas.getColumnModel().getColumnIndex(columna));

            // Si el valor actual de la fila es igual al valor actual
            if (valorActualFila == valorActual) {
                // Actualiza el valor de la columna en la fila actual
                jTnotas.setValueAt(valorNuevo, i, jTnotas.getColumnModel().getColumnIndex(columna));
            }
        }
    }
}
    
    private int IdMateriaPorNombre(String nombreMateria){
    List<Materia> materias = materiaData.ListarMaterias();

    for (Materia materia : materias) {
        if (materia.getNombre().equals(nombreMateria)) {
            int IDmateria= materia.getIdMateria();
            return IDmateria;
        }
    }

    return -1;
    }

    
    
        }
