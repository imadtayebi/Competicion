/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competicion;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fran
 */
public class VerClasificacion extends javax.swing.JFrame {

    Competicion competicion;
    
    DefaultTableModel modeloTabClasi = new DefaultTableModel()
    {
        @Override
        public boolean isCellEditable(int fil, int col)
        {
            return false;
        }
    };
    
    public VerClasificacion(Competicion c) {
        competicion = c;
        tabClasi = new JTable(modeloTabClasi);
        initComponents();
    }

    private void dibujaTabPartidos()
    {
        tabClasi.setModel(modeloTabClasi);
        String[] columnasTabla = {"Pos","Jugador","Puntos","P. Jugados","P.Ganados","P.Empatados","P.Perdidos","Goles F","Goles C"};
        modeloTabClasi.setColumnIdentifiers(columnasTabla);
        
        // Para no permitir el redimensionamiento de las columnas con el ratón
        tabClasi.getTableHeader().setResizingAllowed(false);
        
        // Así se fija el ancho de las columnas
        tabClasi.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabClasi.getColumnModel().getColumn(1).setPreferredWidth(20);
        tabClasi.getColumnModel().getColumn(2).setPreferredWidth(20);
        tabClasi.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabClasi.getColumnModel().getColumn(4).setPreferredWidth(50);
        tabClasi.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabClasi.getColumnModel().getColumn(6).setPreferredWidth(50);
        tabClasi.getColumnModel().getColumn(7).setPreferredWidth(50);
        tabClasi.getColumnModel().getColumn(8).setPreferredWidth(50);
    }
    
    private void rellenarTabPartidos()
    {
        Object[] columna = new Object[4];
        
        for(int i = 0; i < competicion.partidos.size(); i++)
        {
            columna[0] = competicion.partidos.get(i).getLocal();
            columna[1] = competicion.partidos.get(i).getGolesL();
            columna[2] = competicion.partidos.get(i).getGolesV();
            columna[3] = competicion.partidos.get(i).getVisitante();
            modeloTabClasi.addRow(columna);
        }
    }
    
    private void vaciarTabPartidos()
    {
        //int i = modeloTabExp.getRowCount();
        
        while (modeloTabClasi.getRowCount() > 0)
            modeloTabClasi.removeRow(0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabClasi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabClasi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabClasi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabClasi;
    // End of variables declaration//GEN-END:variables
}
