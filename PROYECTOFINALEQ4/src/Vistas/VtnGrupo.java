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
import Clases.TablasHash;
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

    public static TablasHash arr;

    /**
     * Creates new form VtnGrupos
     *///***************************
     public void transparenciaBotones() //PONER EN VtnGrupo
    {
        jBEliminarG.setContentAreaFilled(false);
        jBBusca.setContentAreaFilled(false);
        jBAgregarG.setContentAreaFilled(false);
        jBCerrar.setContentAreaFilled(false);
        jBAsistente.setContentAreaFilled(false);

    }

    public boolean valida(String s) {
        boolean valida = false;
        for (int i = 0; i < s.length(); i++) {
            char caracter = s.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII > 64 && valorASCII < 91) {
                valida = true;
                //return false; //Se ha encontrado un caracter que no es letra 
            }
            /*if (valorASCII > 97 && valorASCII < 123) {
                valida = true;
                //return false; //Se ha encontrado un caracter que no es letra 
            }*/
            /*if (valorASCII > 47 && valorASCII < 58) {
                valida = true;
            }*/

        }

        System.out.println("VALOR DE VALIDA:" + valida);

        boolean validatodo = false;

        if (s.length() == 0) {
            Mensaje.error(this, "Campo vacio, debe ingresar un nombre primero");
            validatodo = false;
        } else {
            if (valida == false) {
                Mensaje.error(this, "Error, caracter invalido detectado\n Los caracteres permitidos para este apartado son solo letras");
                validatodo = false;
            } else {
                validatodo = true;
            }
        }

        System.out.println("VALIDA TODO;" + validatodo);
        return validatodo;
    }

    public static boolean validaG(Nodo r, String etq)//valida que el nombre de un grupo no se repita 
    {
        boolean aux = false;
        while (r != null) {
            if (r.getEtq().equalsIgnoreCase(etq.trim())) {
                aux = true;
                break;
            } else {
                r = r.getSig();
            }
        }
        return aux;
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
        jLEliminarG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBBusca = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPGrupos = new javax.swing.JPanel();
        jBAsistente = new javax.swing.JButton();
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

        jBAgregarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas50.png"))); // NOI18N
        jBAgregarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarGActionPerformed(evt);
            }
        });
        getContentPane().add(jBAgregarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 60, 50));

        jBEliminarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNuevo.png"))); // NOI18N
        jBEliminarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarGActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 60, 50));

        jLGrupos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLGrupos.setText("Grupos");
        getContentPane().add(jLGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLAgregarG.setText("Agregar");
        getContentPane().add(jLAgregarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 516, 50, 30));

        jLEliminarG.setText("Eliminar");
        getContentPane().add(jLEliminarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 60, 20));

        jLabel1.setText("Busqueda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 516, 70, 30));

        jBBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarNuevo.png"))); // NOI18N
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(jBBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 60, -1));

        jBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar3.png"))); // NOI18N
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 30, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JPGrupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPGrupos.setLayout(new java.awt.GridLayout(0, 1, 0, 1));
        jScrollPane1.setViewportView(JPGrupos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 360));

        jBAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevoPregunta25.png"))); // NOI18N
        jBAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsistenteActionPerformed(evt);
            }
        });
        getContentPane().add(jBAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 30, -1));

        jLFondoG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondowhats.png"))); // NOI18N
        getContentPane().add(jLFondoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLFondoG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondowa2.jpg"))); // NOI18N
        getContentPane().add(jLFondoG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarGActionPerformed

        //PRUEBA DE COMMIT
        String s = "";

        s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a añadir"); //ETIQUETA PARA LA CATEGORIA NUEVA
        System.out.println("El nombre es " + s);
        if (s == null) //Evita el NPE al salir del showInputDialog o presionar cancelar
        {
            //No hace nada al cancelar, o presionar salir
        } else if (s.length() == 0) {
            Mensaje.error(this, "Campo vacio, debe escribir un nombre");
        } else {

            if (validaG(r, s) == true) {
                Mensaje.error(this, "El grupo que desea ingresar se encuentra repetido, por favor ingrese uno diferente");
            } 
            else 
            {
             
                if (s.length()>30) 
                {
                    Mensaje.error(this, "El nombre que intenta ingresar excede el numero de caracteres permitido(30)");
                }
                else
                {

                    Nodo nom = new Nodo(null, s);

                    String[] etqs = new String[1];//arreglo de etiquetas,esta en 1 lo cual significa que esta en el nivel 0

                    etqs[0] = s;

                    r = Multilistas.inserta(r, nom, 0, etqs);

                    Propiedades p = new Propiedades(r, arr);

                    try {
                        Archivos.guardar(p, this);
                    } catch (FileNotFoundException ex) {
                        System.out.println("No se encontro el archivo");
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
                            boton.setMinimumSize(new Dimension(JPGrupos.getWidth(), 50));
                            boton.setMaximumSize(new Dimension(JPGrupos.getWidth(), 50));
                            boton.setPreferredSize(new Dimension(JPGrupos.getWidth(), 50));

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
                }
            }
        }
        JPGrupos.revalidate();
        JPGrupos.repaint();
    }//GEN-LAST:event_jBAgregarGActionPerformed

    private void jBEliminarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarGActionPerformed
        if (r != null) {

            String s = "";

            s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a eliminar"); //ETIQUETA PARA LA CATEGORIA NUEVA

            if (s == null) {
                //No hace nada al cancelar o salir
            } else if (s.length() == 0) {
                Mensaje.error(this, "Campo vacio, debe escribir un nombre");
            } else {
                if (validaG(r, s) == false)//significa que no encontro nada 
                {
                    Mensaje.error(this, "No se encontro el grupo que desea eliminar");
                } else {

                    String[] etqs = new String[1];//arreglo de etiquetas

                    etqs[0] = s;

                    //int decision=JOptionPane.showConfirmDialog(rootPane, "Eliminar grupo\nSe eliminaran los contactos y conversaciones asociados a este grupo\n","¿Desea continuar?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

                    
                    boolean c = false;

                    if (cjb.ci.Mensaje.pregunta(this, "Eliminar grupo\nSe eliminaran los contactos "
                            + "y conversaciones asociados a este grupo\n¿Desea continuar?") == 0) 
                    {
                        c = true;
                    }
                    
                    
                    
                    if (c==true)//LE AGREGUE EL TRUE
                    {
                        //Mensaje.exito(this, "El valor de c es "+c);
                        
                        Nodo rb = Multilistas.busca(r, s.trim());

                        rb = rb.getAbj();

                        if (rb != null) {

                            Nodo aux = rb;

                            while (aux != null) {

                                arr.elimina(aux.getEtq());

                                aux = aux.getSig();
                            }
                        }

                        r = Multilistas.elimina(r, 0, etqs);

                        Propiedades p = new Propiedades(r, arr);

                        try {
                            Archivos.guardar(p, this);
                        } catch (FileNotFoundException ex) {
                            System.out.println("No se encontro el archivo");
                        }
                    
                        //ESTABA AFUERA DEL ELSE, SI DA ERROR MOVERLA A LA PARTE DE ABAJO DONDE ESTAN LOS /////
                        if (r != null) {
                        Component componentes[] = JPGrupos.getComponents();

                        for (int i = 0; i < componentes.length; i++) {
                            if (etqs[0].equalsIgnoreCase(((JButton) componentes[i]).getText().trim())) {
                                JPGrupos.remove(i);
                            }
                        }
                        } else 
                        {
                            JPGrupos.removeAll();
                        }
                        //FIN DE LO QUE HAY QUE PASAR
                    }
                    //////////PONERLO AQUI SI NO FUNCIONA
                    
                }
            }
            System.out.println(Multilistas.desp(r, 0));
        } else {
            Mensaje.error(this, "La lista se encuentra vacia, no puede eliminar elementos");
        }
        JPGrupos.updateUI();

    }//GEN-LAST:event_jBEliminarGActionPerformed

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed
        String s = "";
        s = JOptionPane.showInputDialog("Escriba el nombre del contacto que deseas buscar"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s == null) {
            //Evita el NPE al salir del showInputDialog o presionar cancelar
        } else if (valida(s) == false) {
            //Mensaje.error(this, "Debe ecsribir un nombre");
            System.out.println("error");
        } else {

            int pos = s.toUpperCase().codePointAt(0) - 65;

            if (arr.getArr()[pos] != null) {

                ArbolBinario aBus = new ArbolBinario();

                NodoArbol aux = aBus.busca(arr.getArr()[pos].getR(), s);

                if (aux != null) {

                    String[] pr = aux.getPredecesores();

                    String grupo = pr[0];
                    String contacto = pr[1];

                    Nodo r2 = Multilistas.busca(r, grupo);

                    r2 = r2.getAbj();
                    r2 = Multilistas.busca(r2, contacto);

                    if (r2 != null) {
                        VtnHistorial h = new VtnHistorial();
                        h.d1 = grupo;
                        h.d2 = contacto;
                        h.setVisible(true);
                        dispose();

                    } else {
                        Mensaje.error(this, "No se encontro el dato");
                    }

                } else {
                    Mensaje.error(this, "No se encontró " + s + " en tu lista de contactos");
                }
            }
        }

    }//GEN-LAST:event_jBBuscaActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        arr = new TablasHash(26);

        try {
            Archivos.carga(this);
        } catch (IOException ex) {
            Logger.getLogger(VtnGrupo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VtnGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (r == null) {//hacer esta validacion en las demas ventanas
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
                boton.setMinimumSize(new Dimension(JPGrupos.getWidth(), 50));
                boton.setMaximumSize(new Dimension(JPGrupos.getWidth(), 50));
                boton.setPreferredSize(new Dimension(JPGrupos.getWidth(), 50));

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
            JPGrupos.revalidate();
            JPGrupos.repaint();
        }

        JPGrupos.revalidate();
        JPGrupos.repaint();

        System.out.println(Multilistas.desp(r, 0));
        arr.verarboles();
    }//GEN-LAST:event_formWindowOpened

    private void jBAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsistenteActionPerformed
        JOptionPane.showMessageDialog(rootPane, "                                                 ¡Bienvenido a la ventana de grupos!\n"
                + "En cada grupo podras almacenar distintos contactos dependiendo de como quieras organizarlos\n"
                + "En esta ventana podras realizar distintas acciones como agregar o eliminar un grupo\n"
                + "Asi como buscar entre los distintos grupos que tengas y observar los contactos que contiene");
    }//GEN-LAST:event_jBAsistenteActionPerformed

            
    
        public boolean validaN(String s)
        {
            boolean validaN=false;
            //String s = "";
            //s = JOptionPane.showInputDialog("Escriba el nombre del contacto que deseas buscar"); //ETIQUETA PARA LA CATEGORIA NUEVA
            /*if (s == null) {
                //Evita el NPE al salir del showInputDialog o presionar cancelar
            } else if (valida(s) == false) {
                //Mensaje.error(this, "Debe ecsribir un nombre");
                System.out.println("error");
            } else {*/

                //System.out.println("ENTRA A LA FUNCION");
            
                int pos = s.toUpperCase().codePointAt(0) - 65;

                if (arr.getArr()[pos] != null) {

                    ArbolBinario aBus = new ArbolBinario();

                    NodoArbol aux = aBus.busca(arr.getArr()[pos].getR(), s);

                    if (aux != null) {

                        return validaN=true;
                        
                        //String[] pr = aux.getPredecesores();

                        //String grupo = pr[0];
                        //String contacto = pr[1];

                        //Nodo r2 = Multilistas.busca(r, grupo);

                        //r2 = r2.getAbj();
                        //r2 = Multilistas.busca(r2, contacto);

                        //if (r2 != null) 
                        //{
                            //VtnHistorial h = new VtnHistorial();
                            //h.d1 = grupo;
                            //h.d2 = contacto;
                            
                            //h.setVisible(true);
                            //dispose();

                        //} else {
                            //Mensaje.error(this, "No se encontro el dato");
                          //  return validaN=false;
                            //System.out.println(false);
                        //}

                    } else 
                    {
                        //Mensaje.error(this, "No se encontró " + s + " en tu lista de contactos");
                        return validaN=false;
                    }
                }
//            }
            return validaN=true;
        }
    
    
    
    
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
    private javax.swing.JButton jBAsistente;
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBEliminarG;
    private javax.swing.JLabel jLAgregarG;
    private javax.swing.JLabel jLEliminarG;
    private javax.swing.JLabel jLFondoG;
    private javax.swing.JLabel jLFondoG1;
    private javax.swing.JLabel jLGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
