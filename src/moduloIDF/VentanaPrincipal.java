package moduloIDF;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import moduloMoea.EjecutarProblemas;

/**
 *
 * @author Nicoyarce
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private final Color verde = new Color(128, 255, 128);
    private final Color rojo = new Color(255, 128, 128);
    private ArrayList<Boolean> camposListos;
    public CargaIDF cargaIDF;
    public EjecutarProblemas ejecutor;
    public Thread t;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        camposListos = new ArrayList<>(Arrays.asList(false, false, false, false));
        initComponents();
        jPanel4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selector = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        boton1Carga = new javax.swing.JButton();
        boton2Carga = new javax.swing.JButton();
        boton3Carga = new javax.swing.JButton();
        boton4Carga = new javax.swing.JButton();
        materialLabel = new javax.swing.JLabel();
        iddLabel = new javax.swing.JLabel();
        idfLabel = new javax.swing.JLabel();
        epwLabel = new javax.swing.JLabel();
        iddField = new javax.swing.JTextField();
        idfField = new javax.swing.JTextField();
        epwField = new javax.swing.JTextField();
        materialField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salidaTextArea = new javax.swing.JTextArea();
        salidaLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        objetivos = new javax.swing.JLabel();
        objetivo1 = new javax.swing.JCheckBox();
        objetivo2 = new javax.swing.JCheckBox();
        objetivo3 = new javax.swing.JCheckBox();
        objetivo4 = new javax.swing.JCheckBox();
        objetivo5 = new javax.swing.JCheckBox();
        objetivo6 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        variable1 = new javax.swing.JCheckBox();
        variable2 = new javax.swing.JCheckBox();
        variable3 = new javax.swing.JCheckBox();
        variable5 = new javax.swing.JCheckBox();
        variable6 = new javax.swing.JCheckBox();
        variable4 = new javax.swing.JCheckBox();
        variable7 = new javax.swing.JCheckBox();
        botonOptimizar = new javax.swing.JButton();

        selector.setCurrentDirectory(new java.io.File("C:\\"));
            selector.setDialogTitle("Seleccione un archivo");
            selector.setToolTipText("");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Proyecto EP");
            setLocation(new java.awt.Point(0, 0));
            setMinimumSize(new java.awt.Dimension(800, 600));

            jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel1.setName("ASD"); // NOI18N

            tituloLabel.setText("Seleccione archivos");
            tituloLabel.setName("Seleccione archivos"); // NOI18N

            boton1Carga.setText("...");
            boton1Carga.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boton1CargaActionPerformed(evt);
                }
            });

            boton2Carga.setText("...");
            boton2Carga.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boton2CargaActionPerformed(evt);
                }
            });

            boton3Carga.setText("...");
            boton3Carga.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boton3CargaActionPerformed(evt);
                }
            });

            boton4Carga.setText("...");
            boton4Carga.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boton4CargaActionPerformed(evt);
                }
            });

            materialLabel.setText("Materiales");

            iddLabel.setText("IDD");

            idfLabel.setText("IDF");

            epwLabel.setText("EPW");

            iddField.setEditable(false);
            iddField.setText("Ruta IDD");
            iddField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

            idfField.setEditable(false);
            idfField.setText("Ruta IDF");

            epwField.setEditable(false);
            epwField.setText("Ruta EPW");

            materialField.setEditable(false);
            materialField.setText("Ruta lista materiales");
            materialField.setToolTipText("");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(tituloLabel)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(materialLabel)
                                .addComponent(epwLabel)
                                .addComponent(idfLabel)
                                .addComponent(iddLabel))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(epwField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idfField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(iddField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(materialField, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boton2Carga, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(boton1Carga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton3Carga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton4Carga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(73, 73, 73))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tituloLabel)
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(boton1Carga))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(iddLabel)
                                .addComponent(iddField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idfLabel)
                                .addComponent(idfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton2Carga))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(epwLabel))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(epwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton3Carga)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(materialLabel)
                                .addComponent(materialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton4Carga))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            salidaTextArea.setEditable(false);
            salidaTextArea.setColumns(20);
            salidaTextArea.setRows(5);
            salidaTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            jScrollPane1.setViewportView(salidaTextArea);

            salidaLabel.setText("Salida");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(salidaLabel)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(salidaLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1)
                    .addContainerGap())
            );

            jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            objetivos.setText("Objetivos");

            objetivo1.setText("Total Energy [kWh]/Total Site Energy");
            objetivo1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    objetivo1StateChanged(evt);
                }
            });

            objetivo2.setText("Total Energy [kWh]/Total Source Energy");
            objetivo2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    objetivo2StateChanged(evt);
                }
            });

            objetivo3.setText("District Heating [W]/Heating");
            objetivo3.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    objetivo3StateChanged(evt);
                }
            });

            objetivo4.setText("District Cooling [W]/Cooling");
            objetivo4.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    objetivo4StateChanged(evt);
                }
            });

            objetivo5.setText("<html>Facility [Hours]/Time Setpoint Not Met During Occupied Heating</html>");
            objetivo5.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    objetivo5StateChanged(evt);
                }
            });

            objetivo6.setText("District Heating Intensity [kWh/m2]/HVAC");
            objetivo6.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    objetivo6StateChanged(evt);
                }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(objetivos)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(objetivo1)
                                .addComponent(objetivo2)
                                .addComponent(objetivo3)
                                .addComponent(objetivo4)
                                .addComponent(objetivo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(objetivo5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(objetivos)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(objetivo1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(objetivo2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(objetivo3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(objetivo4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(objetivo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(objetivo6)
                    .addContainerGap(18, Short.MAX_VALUE))
            );

            jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel1.setText("Variables a optimizar");

            variable1.setText("Thickness");
            variable1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    variable1StateChanged(evt);
                }
            });

            variable2.setText("Conductivity");
            variable2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    variable2StateChanged(evt);
                }
            });

            variable3.setText("Density");
            variable3.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    variable3StateChanged(evt);
                }
            });

            variable5.setText("Thermal Absorptance");
            variable5.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    variable5StateChanged(evt);
                }
            });

            variable6.setText("Solar Absorptance");
            variable6.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    variable6StateChanged(evt);
                }
            });

            variable4.setText("Specific Heat");
            variable4.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    variable4StateChanged(evt);
                }
            });

            variable7.setText("Visible Absorptance");
            variable7.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    variable7StateChanged(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(variable1)
                        .addComponent(variable2)
                        .addComponent(variable3)
                        .addComponent(variable4)
                        .addComponent(variable5)
                        .addComponent(variable6)
                        .addComponent(variable7)
                        .addComponent(jLabel1))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(variable1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(variable2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(variable3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(variable4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(variable5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(variable6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(variable7)
                    .addContainerGap(22, Short.MAX_VALUE))
            );

            botonOptimizar.setText("Optimizar");
            botonOptimizar.setEnabled(false);
            botonOptimizar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonOptimizarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonOptimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonOptimizar)
                            .addGap(0, 6, Short.MAX_VALUE)))
                    .addContainerGap())
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void boton1CargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1CargaActionPerformed
        selector.setFileFilter(new FileNameExtensionFilter("Archivos IDD", "idd"));
        int returnVal = selector.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = selector.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            iddField.setText(file.getAbsolutePath());
            camposListos.set(0, true);
        } else {
            System.out.println("Carga de archivo " + iddLabel.getText() + " cancelada");
            iddField.setText("Ruta IDD");
            camposListos.set(0, false);
        }
        comprobarCampos(iddField, ".idd", 0);
        comprobarComponentesGUI();
    }//GEN-LAST:event_boton1CargaActionPerformed

    private void boton2CargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2CargaActionPerformed
        selector.setFileFilter(new FileNameExtensionFilter("Archivos IDF", "idf"));
        int returnVal = selector.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = selector.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            idfField.setText(file.getAbsolutePath());
            camposListos.set(1, true);
        } else {
            System.out.println("Carga de archivo " + idfLabel.getText() + " cancelada");
            idfField.setText("Ruta IDF");
            camposListos.set(1, false);
        }
        comprobarCampos(idfField, ".idf", 1);
        comprobarComponentesGUI();
    }//GEN-LAST:event_boton2CargaActionPerformed

    private void boton3CargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3CargaActionPerformed
        selector.setFileFilter(new FileNameExtensionFilter("Archivos EPW", "epw"));
        int returnVal = selector.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = selector.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            epwField.setText(file.getAbsolutePath());
            camposListos.set(2, true);
        } else {
            System.out.println("Carga de archivo " + epwLabel.getText() + " cancelada");
            epwField.setText("Ruta EPW");
            camposListos.set(2, false);
        }
        comprobarCampos(epwField, ".epw", 2);
        comprobarComponentesGUI();
    }//GEN-LAST:event_boton3CargaActionPerformed

    private void boton4CargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4CargaActionPerformed
        selector.setFileFilter(new FileNameExtensionFilter("Archivo de texto", "txt"));
        int returnVal = selector.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = selector.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            materialField.setText(file.getAbsolutePath());
            camposListos.set(3, true);
        } else {
            System.out.println("Carga de archivo " + materialLabel.getText() + " cancelada");
            materialField.setText("Ruta Materiales");
            camposListos.set(3, false);
        }
        comprobarCampos(materialField, ".txt", 3);
        comprobarComponentesGUI();
    }//GEN-LAST:event_boton4CargaActionPerformed
    /*Comprueba si la extension de los archivos es correcta*/
    private void comprobarCampos(JTextField field, String extension, int nroCampo) {
        if (field.getText().endsWith(extension)
                || field.getText().endsWith(extension.toUpperCase())) {
            field.setBackground(verde);
        } else {
            camposListos.set(nroCampo, false);
            field.setBackground(rojo);
        }
    }

    /*Comprueba los componentes de la GUI para habilitar o no el boton optimizar*/
    private void comprobarComponentesGUI() {
        if (camposListos.get(0) && camposListos.get(1) && camposListos.get(2) && camposListos.get(3) && unObjetivoMarcado()) {
            botonOptimizar.setEnabled(true);
        } else {
            botonOptimizar.setEnabled(false);

        }
    }

    private void botonOptimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOptimizarActionPerformed
        Runnable myRun;
        myRun = () -> {
            ArrayList<Boolean> objetivos = new ArrayList(Arrays.asList(
                    objetivo1.isSelected(), objetivo2.isSelected(),
                    objetivo3.isSelected(), objetivo4.isSelected(),
                    objetivo5.isSelected(), objetivo6.isSelected()));
            ArrayList<Boolean> variables = new ArrayList(Arrays.asList(
                    variable1.isSelected()));
            
            ejecutor = new EjecutarProblemas();
            ejecutor.ejecutarOptimización(iddField.getText(), idfField.getText(), epwField.getText(), materialField.getText(), objetivos, variables);
        };
        t = new Thread(myRun);
        t.start();
        boton1Carga.setEnabled(false);
        boton2Carga.setEnabled(false);
        boton3Carga.setEnabled(false);
        boton4Carga.setEnabled(false);
        objetivo1.setEnabled(false);
        objetivo2.setEnabled(false);
        objetivo3.setEnabled(false);
        objetivo4.setEnabled(false);
        objetivo5.setEnabled(false);
        objetivo6.setEnabled(false);
        /*variable1.setEnabled(false);
        variable2.setEnabled(false);
        variable3.setEnabled(false);
        variable4.setEnabled(false);
        variable5.setEnabled(false);
        variable6.setEnabled(false);
        variable7.setEnabled(false);*/
        botonOptimizar.setEnabled(false);
    }//GEN-LAST:event_botonOptimizarActionPerformed

    private void objetivo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_objetivo1StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_objetivo1StateChanged

    private void objetivo2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_objetivo2StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_objetivo2StateChanged

    private void objetivo3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_objetivo3StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_objetivo3StateChanged

    private void objetivo4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_objetivo4StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_objetivo4StateChanged

    private void objetivo5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_objetivo5StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_objetivo5StateChanged

    private void objetivo6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_objetivo6StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_objetivo6StateChanged

    private void variable1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variable1StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_variable1StateChanged

    private void variable2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variable2StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_variable2StateChanged

    private void variable3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variable3StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_variable3StateChanged

    private void variable4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variable4StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_variable4StateChanged

    private void variable5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variable5StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_variable5StateChanged

    private void variable6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variable6StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_variable6StateChanged

    private void variable7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variable7StateChanged
        comprobarComponentesGUI();
    }//GEN-LAST:event_variable7StateChanged

    private boolean unObjetivoMarcado() {
        return objetivo1.isSelected() || objetivo2.isSelected()
                || objetivo3.isSelected() || objetivo4.isSelected()
                || objetivo5.isSelected() || objetivo6.isSelected();
    }

    /*private boolean unaVariableMarcada() {
        return variable1.isSelected() || variable2.isSelected()
                || variable3.isSelected() || variable4.isSelected() 
                || variable5.isSelected() || variable6.isSelected()
                || variable7.isSelected();
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1Carga;
    private javax.swing.JButton boton2Carga;
    private javax.swing.JButton boton3Carga;
    private javax.swing.JButton boton4Carga;
    private javax.swing.JButton botonOptimizar;
    private javax.swing.JTextField epwField;
    private javax.swing.JLabel epwLabel;
    private javax.swing.JTextField iddField;
    private javax.swing.JLabel iddLabel;
    private javax.swing.JTextField idfField;
    private javax.swing.JLabel idfLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField materialField;
    private javax.swing.JLabel materialLabel;
    private javax.swing.JCheckBox objetivo1;
    private javax.swing.JCheckBox objetivo2;
    private javax.swing.JCheckBox objetivo3;
    private javax.swing.JCheckBox objetivo4;
    private javax.swing.JCheckBox objetivo5;
    private javax.swing.JCheckBox objetivo6;
    private javax.swing.JLabel objetivos;
    private javax.swing.JLabel salidaLabel;
    private javax.swing.JTextArea salidaTextArea;
    private javax.swing.JFileChooser selector;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JCheckBox variable1;
    private javax.swing.JCheckBox variable2;
    private javax.swing.JCheckBox variable3;
    private javax.swing.JCheckBox variable4;
    private javax.swing.JCheckBox variable5;
    private javax.swing.JCheckBox variable6;
    private javax.swing.JCheckBox variable7;
    // End of variables declaration//GEN-END:variables

    /*private void guardarRutas() throws FileNotFoundException, UnsupportedEncodingException {
        String rutaPrograma = System.getProperty("user.dir");
        try (PrintWriter writer = new PrintWriter(rutaPrograma+"/ultimasRutas.txt", "UTF-8")) {
            writer.println(iddField.getText());
            writer.println(idfField.getText());
            writer.println(epwField.getText());
            writer.println(materialField.getText());
        }
    }*/
}
