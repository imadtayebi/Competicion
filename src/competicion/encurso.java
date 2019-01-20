/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competicion;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seba Garcia
 */
public class encurso extends javax.swing.JFrame {
    
    Competicion competicion;
    
    DefaultTableModel modeloTabPartidos = new DefaultTableModel()
    {
        @Override
        public boolean isCellEditable(int fil, int col)
        {
            return false;
        }
    };
    
    public encurso(Competicion c) {
        competicion = c;
        tabPartidos = new JTable(modeloTabPartidos);
        initComponents();
        dibujaTabPartidos();
        rellenarTabPartidos();
    }

    private void dibujaTabPartidos()
    {
        tabPartidos.setModel(modeloTabPartidos);
        String[] columnasTabla = {"Local","","","Visitante"};
        modeloTabPartidos.setColumnIdentifiers(columnasTabla);
        
        // Para no permitir el redimensionamiento de las columnas con el ratón
        tabPartidos.getTableHeader().setResizingAllowed(false);
        
        // Así se fija el ancho de las columnas
        tabPartidos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabPartidos.getColumnModel().getColumn(1).setPreferredWidth(20);
        tabPartidos.getColumnModel().getColumn(2).setPreferredWidth(20);
        tabPartidos.getColumnModel().getColumn(3).setPreferredWidth(50);
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
            modeloTabPartidos.addRow(columna);
        }
    }
    
    private void vaciarTabPartidos()
    {
        //int i = modeloTabExp.getRowCount();
        
        while (modeloTabPartidos.getRowCount() > 0)
            modeloTabPartidos.removeRow(0);
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
        tabPartidos = new javax.swing.JTable();
        botonClasificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPartidos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabPartidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPartidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPartidos);

        botonClasificacion.setText("Ver clasificación");
        botonClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClasificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonClasificacion)
                        .addGap(335, 335, 335))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonClasificacion)
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void tabPartidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPartidosMouseClicked
        int index = tabPartidos.getSelectedRow();
        
        String nL = tabPartidos.getModel().getValueAt(index, 0).toString();
        String nV = tabPartidos.getModel().getValueAt(index, 3).toString();
        
        String gL = JOptionPane.showInputDialog("Introduce goles local: ");
        String gV = JOptionPane.showInputDialog("Introduce goles local: ");
        
        competicion.partidos.get(index).setGolesL(gL);
        competicion.partidos.get(index).setGolesL(gV);
        
        boolean encontrado1 = false, encontrado2 = false;
        int i = 0;
        int indice1 = -1, indice2 = -1;
        while((!encontrado1 || !encontrado2) && i < competicion.jugadores.size())
        {
            if(nL == competicion.jugadores.get(i).getNombre())
            {
                encontrado1 = true;
                indice1 = i;
            }
            
            if(nV == competicion.jugadores.get(i).getNombre())
            {
                encontrado2 = true;
                indice2 = i;
            }
            
            i++;
        }
        
        if(Integer.parseInt(gL) > Integer.parseInt(gV))
        {
            competicion.jugadores.get(indice1).setPartGanados();
            competicion.jugadores.get(indice1).setPuntos(3);
            competicion.jugadores.get(indice2).setPartPerdidos();
        }
        else if(Integer.parseInt(gV) > Integer.parseInt(gL))
        {
            competicion.jugadores.get(indice2).setPartGanados();
            competicion.jugadores.get(indice2).setPuntos(3);
            competicion.jugadores.get(indice1).setPartPerdidos();
        }
        else
        {
            competicion.jugadores.get(indice1).setPartEmpatados();
            competicion.jugadores.get(indice1).setPuntos(1);
            competicion.jugadores.get(indice2).setPartEmpatados();
            competicion.jugadores.get(indice2).setPuntos(1);
        }
        
        competicion.jugadores.get(indice1).setgFavor(Integer.parseInt(gL));
        competicion.jugadores.get(indice1).setgContra(Integer.parseInt(gV));
        competicion.jugadores.get(indice2).setgFavor(Integer.parseInt(gV));
        competicion.jugadores.get(indice2).setgContra(Integer.parseInt(gL));
        
        tabPartidos.getModel().setValueAt(gL, index, 1);
        tabPartidos.getModel().setValueAt(gV, index, 2);
    }//GEN-LAST:event_tabPartidosMouseClicked

    private void botonClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClasificacionActionPerformed
        VerClasificacion vc = new VerClasificacion(competicion);
        vc.setVisible(true);
    }//GEN-LAST:event_botonClasificacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonClasificacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPartidos;
    // End of variables declaration//GEN-END:variables
}
