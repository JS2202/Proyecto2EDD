/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.ArbolBinario;
import Clases.Archivos;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import Clases.Propiedades;
import static Vistas.VtnContacto.JPContactos;
import static Vistas.VtnContacto.d;
import static Vistas.VtnContacto.r1;
import static Vistas.VtnGrupo.r;
import cjb.ci.Mensaje;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.BoxLayout;
import javax.swing.JButton;

/**
 *
 * @author zgame
 */
public class VtnMover extends javax.swing.JFrame {

    boolean muestraG = false;
    public String nom;
    public String gpo;

    public boolean validaBE(String s) {
        boolean validabe = false;

        if (s.length() == 0) {
            Mensaje.error(this, "El campo se ecnuentra vacio, debe ingresar un nombre primero");
            validabe = false;
        } else {////////////////////////////////////////////////////////////prueba para evitar los mensajes de caracter no permitido en bus y elim
            if (s.length() > 30) {
                Mensaje.error(this, "El nombre que desea ingresar excede el numero de caracteres permitidos(30)");
                validabe = false;
            } else {
                validabe = true;
            }//fin del valida=30
        }//fin del valida s=0

        System.out.println("//////////////EL VALOR DE VALIDA ES " + validabe);
        return validabe;
    }

    public static boolean validaC(Nodo r, String etq)//valida que el nombre de un grupo no se repita 
    {
        boolean aux = false;
        if (r == null) {
            System.out.println("no puedo buscar ningun dato");
        } else {
            Nodo aux2 = r;
            aux2 = aux2.getSig();

            do {
                if (aux2.getEtq().equalsIgnoreCase(etq.trim())) {
                    aux = true;
                    break;
                } else {
                    aux2 = aux2.getSig();
                }
            } while (aux2 != r.getSig());
            return aux;
        }

        System.out.println("EL DATO QUE ENCONTRE FUE:" + aux);
        return aux;

    }

    public boolean validaE(String s)//valida que no haya espacios al principio y al final de la palabra
    {
        boolean validaE = false;

        char c = s.charAt(0);
        String p1 = Character.toString(c);

        if (Character.isLetter(c) == false) {
            Mensaje.error(this, "Caracter invalido detectado\nSolo se permiten letras");
            Mensaje.error(this, "Recuerde que no se permite el espacio al principio ni al final de una palabra");
            validaE = false;
        } else {
            validaE = true;
        }

        return validaE;
    }

    public VtnMover() {
        initComponents();
        this.setLocationRelativeTo(null);
        jBAtras.setContentAreaFilled(false);

//        jPContactos1.setLayout(new BoxLayout(jPContactos1, BoxLayout.PAGE_AXIS));
        jPContactos1.setLayout(new BoxLayout(jPContactos1, BoxLayout.PAGE_AXIS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBAtras = new javax.swing.JButton();
        jPContactos1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPGrupo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Elige el contacto a mover");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jBAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasMover.png"))); // NOI18N
        jBAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jBAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 50, 40));

        jPContactos1.setBackground(new java.awt.Color(255, 255, 255));
        jPContactos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPContactos1Layout = new javax.swing.GroupLayout(jPContactos1);
        jPContactos1.setLayout(jPContactos1Layout);
        jPContactos1Layout.setHorizontalGroup(
            jPContactos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPContactos1Layout.setVerticalGroup(
            jPContactos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        getContentPane().add(jPContactos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 430));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomover12.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPGrupo.setBackground(new java.awt.Color(255, 255, 255));
        jPGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPGrupoLayout = new javax.swing.GroupLayout(jPGrupo);
        jPGrupo.setLayout(jPGrupoLayout);
        jPGrupoLayout.setHorizontalGroup(
            jPGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPGrupoLayout.setVerticalGroup(
            jPGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        getContentPane().add(jPGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        VtnContacto.r1 = Multilistas.busca(VtnGrupo.r, VtnContacto.d);
        VtnContacto.r1 = VtnContacto.r1.getAbj();

        if (VtnContacto.r1 != null) {
            Nodo aux = VtnContacto.r1;
            aux = aux.getSig();
            do {
                JButton boton = new JButton(aux.getEtq());

                boton.setBackground(Color.WHITE);//PONE EL FONDO DEL BOTON EN BLANCO
                boton.setForeground(Color.BLACK);//PONE LAS LETRAS COLOR NEGRO
                boton.setFont(new Font("arial", 1, 14));//CAMBIA LA FUENTE Y EL TAMAÑO

                //ESTABLECE UN TAMAÑO POR DEFECTO PARA LOS BOTONES
                boton.setMinimumSize(new Dimension(jPContactos1.getWidth(), 50));
                boton.setMaximumSize(new Dimension(jPContactos1.getWidth(), 50));
                boton.setPreferredSize(new Dimension(jPContactos1.getWidth(), 50));

                jPContactos1.add(boton);
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        VtnContacto c = new VtnContacto();
                        muestraG = true;
                        nom = boton.getText();
                        jPContactos1.removeAll();
                        muestraGrupos();
                    }
                }
                );
                System.out.println(boton.getText());
                aux = aux.getSig();
                jPContactos1.revalidate();
                jPContactos1.repaint();
            } while (aux != VtnContacto.r1.getSig());
        }
    }//GEN-LAST:event_formWindowOpened

    public void muestraGrupos() {
        jPContactos1.removeAll();
        jPContactos1.updateUI();
        jLabel1.setText("Elige el grupo al que deseas mover");
        if (muestraG != false) {
            if (r == null) {//hacer esta validacion en las demas ventanas
                Mensaje.error(this, "No hay datos en la lista");
            } else {
                Nodo aux = r;
                aux = aux.getSig();
                do {
                    JButton boton = new JButton(aux.getEtq());

                    boton.setBackground(Color.WHITE);//PONE EL FONDO DEL BOTON EN BLANCO
                    boton.setForeground(Color.BLACK);//PONE LAS LETRAS COLOR NEGRO
                    boton.setFont(new Font("arial", 1, 14));//CAMBIA LA FUENTE Y EL TAMAÑO

                    //ESTABLECE UN TAMAÑO POR DEFECTO PARA LOS BOTONES
                    boton.setMinimumSize(new Dimension(jPContactos1.getWidth(), 50));
                    boton.setMaximumSize(new Dimension(jPContactos1.getWidth(), 50));
                    boton.setPreferredSize(new Dimension(jPContactos1.getWidth(), 50));

                    jPContactos1.add(boton);
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            VtnContacto c = new VtnContacto();
                            gpo = boton.getText();
                            mover();
                            cerrar();
                            c.setVisible(true);
                        }
                    }
                    );
                    aux = aux.getSig();
                    jPContactos1.revalidate();
                    jPContactos1.repaint();
                } while (aux != r.getSig());
            }

            jPContactos1.revalidate();
            jPContactos1.repaint();
        }
    }

    public void mover() {

        Nodo rm;

        boolean b1 = true;
        boolean b2 = true;

        if (nom == null) {
            b1 = false;
            //Evita el NPE al salir del showInputDialog o presionar cancelar
        } else if (validaBE(nom) != false) ///////////////////////////////////////prueba de valida
        {
            if (validaE(nom) == false) {
                System.out.println("");
            } else {

                if (gpo != null) //Evita el NPE al salir del showInputDialog o presionar cancelar
                {
                    b2 = false;
                    if (validaE(gpo) == false)//valida que no haya espacios al principio
                    {
                        System.out.println("");
                    } else {
                        if (gpo.length() == 0) {
                            Mensaje.error(this, "Los campos no deben estar vacios");
                        }
                        if (b1 == false && b2 == false) {

                        } else if (nom.length() != 0 && gpo.length() != 0) {
                            rm = Multilistas.busca(VtnGrupo.r, gpo);
                            rm = rm.getAbj();

                            if (rm != null) {
                                if (validaC(rm, nom) == true) {
                                    Mensaje.error(this, "El nombre que intentas ingresar esta repetido en grupo " + gpo);
                                } else {
                                    String[] etqsE = new String[2];
                                    etqsE[0] = d;
                                    etqsE[1] = nom;

                                    String nom2 = nom.toUpperCase().charAt(0) + nom.substring(1, nom.length());
                                    String[] etqsI = new String[2];
                                    etqsI[0] = gpo;
                                    etqsI[1] = nom2;

                                    Nodo arriba = Multilistas.busca(VtnGrupo.r, gpo);
                                    VtnGrupo.r = Multilistas.mover(VtnGrupo.r, 0, etqsE, etqsI, arriba);

                                    Propiedades p = new Propiedades(VtnGrupo.r, VtnGrupo.arr);
                                    try {
                                        Archivos.guardar(p, this);
                                    } catch (FileNotFoundException ex) {
                                        System.out.println(" No se encontro el archivo ");
                                    }
//                                        }
//                                    }
                                    r1 = Multilistas.busca(VtnGrupo.r, d);
                                    r1 = r1.getAbj();

                                    if (r1 != null) {
                                        Component componentes[] = JPContactos.getComponents();

                                        for (int i = 0; i < componentes.length; i++) {
                                            System.out.println(((JButton) componentes[i]).getText());
                                            if (etqsE[1].trim().equalsIgnoreCase(((JButton) componentes[i]).getText().trim())) {
                                                JPContactos.remove(i);
                                            }
                                        }

                                    } else {
                                        JPContactos.removeAll();
                                    }

                                    JPContactos.revalidate();//NO MOVER DE AQUI
                                    JPContactos.repaint();
                                }
                            } else {
                                String[] etqsE = new String[2];
                                etqsE[0] = d;
                                etqsE[1] = nom;

                                String nom2 = nom.toUpperCase().charAt(0) + nom.substring(1, nom.length());
                                String[] etqsI = new String[2];
                                etqsI[0] = gpo;
                                etqsI[1] = nom2;

                                Nodo arriba = Multilistas.busca(VtnGrupo.r, gpo);
                                VtnGrupo.r = Multilistas.mover(VtnGrupo.r, 0, etqsE, etqsI, arriba);

                                Propiedades p = new Propiedades(VtnGrupo.r, VtnGrupo.arr);
                                try {
                                    Archivos.guardar(p, this);
                                } catch (FileNotFoundException ex) {
                                    System.out.println(" No se encontro el archivo ");
                                }

                                r1 = Multilistas.busca(VtnGrupo.r, d);
                                r1 = r1.getAbj();

                                if (r1 != null) {
                                    Component componentes[] = JPContactos.getComponents();

                                    for (int i = 0; i < componentes.length; i++) {
                                        System.out.println(((JButton) componentes[i]).getText());
                                        if (etqsE[1].trim().equalsIgnoreCase(((JButton) componentes[i]).getText().trim())) {
                                            JPContactos.remove(i);
                                        }
                                    }
                                } else {
                                    JPContactos.removeAll();
                                }

                                JPContactos.revalidate();//NO MOVER DE AQUI
                                JPContactos.repaint();
                            }
                        }
                    }//fin del validaE de grupo
                }//fin del gpo!=null
            }/////////FIN DE VALIDA
        }//fin del validaE

        JPContactos.revalidate();
        JPContactos.repaint();
//        System.out.println(Multilistas.desp(VtnGrupo.r, 0));
    }

    public void cerrar() {
        this.dispose();
    }

    private void jBAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtrasActionPerformed
        //LE CAMBIE ESTO
        this.setVisible(false);
        new VtnContacto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(VtnMover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnMover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnMover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnMover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnMover().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPContactos1;
    private javax.swing.JPanel jPGrupo;
    // End of variables declaration//GEN-END:variables
}
