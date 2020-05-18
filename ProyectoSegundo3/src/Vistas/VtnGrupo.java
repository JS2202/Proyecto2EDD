/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Archivos;
import Clases.ColaDinamica;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import Clases.Propiedades;
import static Vistas.vtnChat.cd;
import cjb.ci.Mensaje;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author zgame
 */
public class VtnGrupo extends javax.swing.JFrame {

    public static Nodo r = null;//RAIZ

    /**
     * Creates new form VtnGrupos
     */
    
    public void transparenciaBotones() //PONER EN VtnGrupo
    {
        jBEliminarG.setOpaque(false);
        jBEliminarG.setContentAreaFilled(false);
        jBEliminarG.setBorderPainted(false);
        
        jBBusca.setOpaque(false);
        jBBusca.setContentAreaFilled(false);
        jBBusca.setBorderPainted(false);
        
        jBAgregarG.setOpaque(false);
        jBAgregarG.setContentAreaFilled(false);
        jBAgregarG.setBorderPainted(false);
        
        jBCerrar.setOpaque(false);
        jBCerrar.setContentAreaFilled(false);
        jBCerrar.setBorderPainted(false);
    }
    
    
    public VtnGrupo() {
        initComponents();
        this.setLocationRelativeTo(null); // CENTRA LA PANTALLA

        jLGrupos.setForeground(Color.WHITE); //PONE EL COLOR DE LA ETIQUETA EN BLANCO
        JPGrupos.setBackground(Color.WHITE);//PONE BLANCO EL COLOR DEL PANEL
        
        JPGrupos.setLayout(new BoxLayout(JPGrupos, BoxLayout.PAGE_AXIS));//CAMBIA EL ESTILO DE EL PANEL, PERMITE QUE LOS BOTONES NO OCUPEN TODA LA PANTALLA
        
        transparenciaBotones();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBAgregarG = new javax.swing.JButton();
        jBEliminarG = new javax.swing.JButton();
        jLGrupos = new javax.swing.JLabel();
        jLAgregarG = new javax.swing.JLabel();
        JPGrupos = new javax.swing.JPanel();
        jLEliminarG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBBusca = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jLFondoG = new javax.swing.JLabel();
        jLFondoG1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAgregarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarg50.jpg"))); // NOI18N
        jBAgregarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarGActionPerformed(evt);
            }
        });
        getContentPane().add(jBAgregarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 58, -1));

        jBEliminarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elimina50.jpg"))); // NOI18N
        jBEliminarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarGActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 56, -1));

        jLGrupos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLGrupos.setText("Grupos");
        getContentPane().add(jLGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLAgregarG.setText("Agregar");
        getContentPane().add(jLAgregarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, -1, -1));

        JPGrupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPGrupos.setLayout(new java.awt.GridLayout(0, 1, 0, 1));
        getContentPane().add(JPGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 273, 360));

        jLEliminarG.setText("Eliminar");
        getContentPane().add(jLEliminarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jLabel1.setText("Busqueda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        jBBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar50.png"))); // NOI18N
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(jBBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 50, -1));

        jBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar30.jpg"))); // NOI18N
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 30, 30));

        jLFondoG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondowhats.png"))); // NOI18N
        getContentPane().add(jLFondoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLFondoG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoverde.jpg"))); // NOI18N
        getContentPane().add(jLFondoG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarGActionPerformed

        //PRUEBA DE COMMIT
        String s = "";
        s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a añadir"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s.length() == 0) {
            Mensaje.error(this, "Debe ecsribir un nombre");
        } else {
            Nodo nom = new Nodo(null, s);

            String[] etqs = new String[1];//arreglo de etiquetas

            etqs[0] = s;

            r = Multilistas.inserta(r, nom, 0, etqs);

            Propiedades p = new Propiedades(cd, r);

            try {
                Archivos.guardar(p, this);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (r != null) {
                Nodo aux = r;

                JPGrupos.removeAll();

                while (aux != null) {
                    JButton boton = new JButton(aux.getEtq());
                    
                    boton.setBackground(Color.WHITE);//PONE EL FONDO DEL BOTON EN BLANCO
                    boton.setForeground(Color.BLACK);//PONE LAS LETRAS COLOR NEGRO
                    boton.setFont(new Font("arial", 1, 14));//CAMBIA LA FUENTE Y EL TAMAÑO

                    //ESTABLECE UN TAMAÑO POR DEFECTO PARA LOS BOTONES
                    boton.setMinimumSize(new Dimension(273,50));
                    boton.setMaximumSize(new Dimension(280, 50));
                    boton.setPreferredSize(new Dimension(273,50));
                    
                    
                    JPGrupos.add(boton);

                    boton.addActionListener(new ActionListener()//pone una accion al boton
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)//accion del boton
                        {
                            VtnContacto c = new VtnContacto();
                            c.d = boton.getText();
                            c.setVisible(true);

                        }
                    });
                    aux = aux.getSig();
                }

            }

            JPGrupos.revalidate();
            JPGrupos.repaint();
        }


    }//GEN-LAST:event_jBAgregarGActionPerformed

    private void jBEliminarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarGActionPerformed

        String s = "";

        s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a eliminar"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s.length() == 0) {
            Mensaje.error(this, "Debe escribir un nombre");
        } else {
            Nodo nom = new Nodo(null, s);

            String[] etqs = new String[1];//arreglo de etiquetas

            etqs[0] = s;

            boolean c = false;

            if (cjb.ci.Mensaje.pregunta(this, "Eliminar grupo\nSe eliminaran los contactos "
                    + "y conversaciones asociados a este grupo\n¿Continuar?") == 0) {
                c = true;
            }

            if (c) {
                r = Multilistas.elimina(r, 0, etqs);

                Propiedades p = new Propiedades(cd, r);

                try {
                    Archivos.guardar(p, this);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //
            if (r != null) {
                Nodo aux = r;

                while (aux != null) {

                    JButton boton = new JButton(aux.getEtq());

                    Component componentes[] = JPGrupos.getComponents();

                    for (int i = 0; i < componentes.length; i++) {
                        System.out.println(((JButton) componentes[i]).getText());
                        if (etqs[0].equals(((JButton) componentes[i]).getText().trim())) {
                            JPGrupos.remove(i);
                        }
                    }

                    boton.addActionListener(new ActionListener()//pone una accion al boton
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)//accion del boton
                        {
                            VtnContacto c = new VtnContacto();
                            c.d = boton.getText();
                            c.setVisible(false);

                        }
                    });
                    aux = aux.getSig();
                }

            }

            if (c) {
                JPGrupos.revalidate();
                JPGrupos.repaint();
            }
        }

        System.out.println(Multilistas.desp(r, 0));
    }//GEN-LAST:event_jBEliminarGActionPerformed

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed

        //PROBAR CUANDO FUNCIONE LA PARTE DE ARBOLES BINARIOS
        //nb=NOMBRE A BUSCAR
        String nb = null;

        nb = JOptionPane.showInputDialog("Escriba el nombre de la persona que desea buscar");

        if (r == null) {
            JOptionPane.showMessageDialog(rootPane, "La agenda se encuentra vacia");

        } else {
            if (nb == null) {
                JOptionPane.showMessageDialog(rootPane, "Debe escribir un nombre");
            } else {
                //NodoArbol=r;
                Nodo aux = r;
                /*while()
                {
                    if (aux.dato!=nb) 
                    {
                        
                    }
                    else
                    {
                        
                    }
                }*/

            }
        }


    }//GEN-LAST:event_jBBuscaActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed

        //PONER AQUI EL CODIGO PARA GUARDAR ARCHIVOS
        System.exit(0);
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {
            Archivos.carga(this);
        } catch (IOException ex) {
            Logger.getLogger(VtnGrupo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VtnGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (r == null) {
            Mensaje.error(this, "No hay datos en la lista");
        } else {
            Nodo aux = r;

            JPGrupos.removeAll();

            while (aux != null) {
                JButton boton = new JButton(aux.getEtq());
                
                boton.setBackground(Color.WHITE);//PONE EL FONDO DEL BOTON EN BLANCO
                boton.setForeground(Color.BLACK);//PONE LAS LETRAS COLOR NEGRO
                boton.setFont(new Font("arial", 1, 14));//CAMBIA LA FUENTE Y EL TAMAÑO
                    
                    //ESTABLECE UN TAMAÑO POR DEFECTO PARA LOS BOTONES
                boton.setMinimumSize(new Dimension(273,50));
                boton.setMaximumSize(new Dimension(280, 50));
                boton.setPreferredSize(new Dimension(273,50));
                
                JPGrupos.add(boton);

                boton.addActionListener(new ActionListener()//pone una accion al boton
                {
                    @Override
                    public void actionPerformed(ActionEvent e)//accion del boton
                    {
                        VtnContacto c = new VtnContacto();
                        c.d = boton.getText();
                        c.setVisible(true);

                    }
                });
                aux = aux.getSig();
            }
        }

        JPGrupos.revalidate();
        JPGrupos.repaint();

        System.out.println(Multilistas.desp(r, 0));
    }//GEN-LAST:event_formWindowOpened

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPGrupos;
    private javax.swing.JButton jBAgregarG;
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBEliminarG;
    private javax.swing.JLabel jLAgregarG;
    private javax.swing.JLabel jLEliminarG;
    private javax.swing.JLabel jLFondoG;
    private javax.swing.JLabel jLFondoG1;
    private javax.swing.JLabel jLGrupos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
