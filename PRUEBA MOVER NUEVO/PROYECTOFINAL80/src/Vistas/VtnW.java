package Vistas;

import Clases.Archivos;
import Clases.ColaDinamica;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.PilaDinamica;
import Clases.Propiedades;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author zgame
 */
public class VtnW extends javax.swing.JFrame {

    //OBJETO QUE ALMACENARA 
    public PilaDinamica p1 = new PilaDinamica();
    public PilaDinamica p2 = new PilaDinamica();
    public ColaDinamica c = new ColaDinamica();
    public ColaDinamica cAux = new ColaDinamica();

    String s = "";

    public Nodo raiz;

    public String d1;
    public String d2;
    public String d3;

    public void transparenciaBotones() 
    {
        jBEnviar1.setContentAreaFilled(false);
        jBEnviar2.setContentAreaFilled(false);
        jBMostrarTexto.setContentAreaFilled(false);
        jBOrdenaC.setContentAreaFilled(false);
        jBOrdenar1.setContentAreaFilled(false);
        jBOrdenar2.setContentAreaFilled(false);
        jBRegresar.setContentAreaFilled(false);
        jBBuscarC.setContentAreaFilled(false);
        jBBuscar.setContentAreaFilled(false);
        jBBuscar2.setContentAreaFilled(false);
    }

    public VtnW() {
        initComponents();
        this.setLocationRelativeTo(null);

        jLChat.setForeground(Color.WHITE);
        jTConversacion.setBackground(Color.WHITE);

        jLOriginal.setForeground(Color.WHITE);
        jLOrdenar.setForeground(Color.WHITE);
        jLBuscar.setForeground(Color.WHITE);

        transparenciaBotones();

        jTConversacion.setLineWrap(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBEnviar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTConversacion = new javax.swing.JTextArea();
        jTChat1 = new javax.swing.JTextField();
        jTChat2 = new javax.swing.JTextField();
        jBEnviar2 = new javax.swing.JButton();
        jBOrdenar1 = new javax.swing.JButton();
        jBOrdenar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBMostrarTexto = new javax.swing.JButton();
        jLChat = new javax.swing.JLabel();
        lNombreUser = new javax.swing.JLabel();
        jLOrdenar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBOrdenaC = new javax.swing.JButton();
        jLOriginal = new javax.swing.JLabel();
        jLBuscar = new javax.swing.JLabel();
        jBRegresar = new javax.swing.JButton();
        jBBuscarC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBBuscar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBEnviar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviarNuevo.png"))); // NOI18N
        jBEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 50, 50));

        jTConversacion.setEditable(false);
        jTConversacion.setColumns(20);
        jTConversacion.setRows(5);
        jScrollPane3.setViewportView(jTConversacion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 290, 470));

        jTChat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTChat1ActionPerformed(evt);
            }
        });
        jTChat1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTChat1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTChat1KeyTyped(evt);
            }
        });
        getContentPane().add(jTChat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 50));

        jTChat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTChat2ActionPerformed(evt);
            }
        });
        jTChat2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTChat2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTChat2KeyTyped(evt);
            }
        });
        getContentPane().add(jTChat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 200, 50));

        jBEnviar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviarNuevo.png"))); // NOI18N
        jBEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnviar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 50, 50));

        jBOrdenar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenarColor.png"))); // NOI18N
        jBOrdenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBOrdenar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, 50));

        jBOrdenar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenarColor.png"))); // NOI18N
        jBOrdenar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBOrdenar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 60, 50));

        jLabel2.setText("Ordenar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        jLabel4.setText("Ordenar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 40));

        jBMostrarTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/charla50.png"))); // NOI18N
        jBMostrarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(jBMostrarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 70, -1));

        jLChat.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLChat.setText("Chat principal");
        getContentPane().add(jLChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 220, 40));

        lNombreUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lNombreUser.setText("Persona 2");
        getContentPane().add(lNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLOrdenar.setText("Ordenar");
        getContentPane().add(jLOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 60, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Yo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jBOrdenaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga50.png"))); // NOI18N
        jBOrdenaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenaCActionPerformed(evt);
            }
        });
        getContentPane().add(jBOrdenaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 40, -1));

        jLOriginal.setText("Chat original");
        getContentPane().add(jLOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, 30));

        jLBuscar.setText("Buscar");
        getContentPane().add(jLBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 50, 30));

        jBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasNuevo.png"))); // NOI18N
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 30));

        jBBuscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro50.png"))); // NOI18N
        jBBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 50, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoarribachat3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarNuevo.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 50, -1));

        jBBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarNuevo.png"))); // NOI18N
        jBBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 50, -1));

        jLabel1.setText("Buscar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoChat2.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTChat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTChat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTChat1ActionPerformed

    private void jTChat1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTChat1KeyPressed
        if (evt.getKeyChar() == '\n')
        {
            jBEnviar1ActionPerformed(null);
        }
    }//GEN-LAST:event_jTChat1KeyPressed

    private void jTChat2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTChat2KeyPressed
        if (evt.getKeyChar() == '\n')
        {
            jBEnviar2ActionPerformed(null);
        }
    }//GEN-LAST:event_jTChat2KeyPressed

    private void jBEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviar1ActionPerformed

        //EN ESTA PARTE SE DEBE MANDAR EL TEXTO A LA PILA 1
        if (jTChat1.getText().length() == 0) {
            Mensaje.error(this, "Mensaje vacio"); //ENVIA UN MENSAJE DE ERROR EN CASO DE QUE NO HAYA ESCRITO NADA
        } else {
            
            //String z = jTChat1.getText().replaceAll("(.{15})","$1\n");//ESTO DA EL SALTO DE LINEA CADA 15 CARACTERES
            
            String z=jTChat1.getText();//z VA ALMACENA LO ESCRITO EN EL AREA DE TEXTO
            
            
            //SALTO DE LINEA CADA 15 CARACTERES
            ///////////////////////////////////////
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < z.length(); i++) 
            {
                   if (i > 0 && (i % 15 == 0)) {
                       sb.append("\n");
                   }

                   sb.append(z.charAt(i));
            }

            z = sb.toString();
            ///////////////////////////////////
            
            
            Nodo n = new Nodo(1,z);

            p1.Inserta(n);
            c.Inserta(n);
            raiz.setNum(raiz.getNum() + 1);
            CtrlInterfaz.limpia(jTChat1); //LIMPIA LA CAJA DE TEXTO
            raiz.setObj(c);
            raiz.setPila1(p1);
            muestra();
        }
    }//GEN-LAST:event_jBEnviar1ActionPerformed

    private void jBEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviar2ActionPerformed

        //EN ESTA PARTE SE DEBE MANDAR EL TEXTO A LA PILA 2
        if (jTChat2.getText().length() == 0) {
            Mensaje.error(this, "Mensaje vacio");
        } 
        else 
        {
            
            //MISMA FUNCION QUE EN LA PARTE DE ARRIBA
            String t=jTChat2.getText();
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < t.length(); i++) 
            {
                    if (i > 0 && (i % 13 == 0)) {
                        sb.append("\n");
                    }

                    sb.append(t.charAt(i));
            }
            t = sb.toString();
            //////////////////////////////////////////

            System.out.println("LA CADENA SEPARADA ES");
            System.out.println(t);


            t="                                                         "+t;
        
            String z =t.replaceAll("\n","\n                                                         ");
            //replaceAll(elemento a reemplazar, con que lo vas a reemplazar)
            
            
            System.out.println("LA CADENA SEPARADA CON ESPACIOS ES");
            System.out.println(z);
            
            Nodo n = new Nodo(2,z);
            
            
            p2.Inserta(n);
            c.Inserta(n);
            raiz.setNum(raiz.getNum() + 1);
            CtrlInterfaz.limpia(jTChat2);
            raiz.setObj(c);
            raiz.setPila2(p2);
            muestra();
        }
    }//GEN-LAST:event_jBEnviar2ActionPerformed

    private void jBOrdenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenar1ActionPerformed
        ordena(p1);
    }//GEN-LAST:event_jBOrdenar1ActionPerformed

    private void jBOrdenar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenar2ActionPerformed
        ordenap(p2);
    }//GEN-LAST:event_jBOrdenar2ActionPerformed

    private void jBMostrarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarTextoActionPerformed
        muestra();
    }//GEN-LAST:event_jBMostrarTextoActionPerformed

    private void jBOrdenaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenaCActionPerformed
        ordenac(c);
    }//GEN-LAST:event_jBOrdenaCActionPerformed

    private void jTChat1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTChat1KeyTyped

    }//GEN-LAST:event_jTChat1KeyTyped

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed

        Propiedades p = new Propiedades(VtnGrupo.r, VtnGrupo.arr);
        try {
            Archivos.guardar(p, this);
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        }
        this.setVisible(false);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Archivos.carga(this);
        } catch (IOException ex) {
            System.out.println("No se encontro el archivo");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        }

        String s = "";
        raiz = Multilistas.busca(VtnGrupo.r, d1);
        System.out.println(raiz.getEtq());
        raiz = raiz.getAbj();
        raiz = Multilistas.busca(raiz, d2);
        System.out.println(raiz.getEtq());
        s = raiz.getEtq();
        raiz = raiz.getAbj();
        raiz = Multilistas.busca(raiz, d3);
        System.out.println(raiz.getEtq());
        if (raiz.getObj() != null) {
            c = (ColaDinamica) raiz.getObj();
            p1 = (PilaDinamica) raiz.getPila1();
            p2 = (PilaDinamica) raiz.getPila2();

            lNombreUser.setText(s);
//            
        }
        muestra();
    }//GEN-LAST:event_formWindowOpened

    private void jBBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCActionPerformed
        buscaC(c);
    }//GEN-LAST:event_jBBuscarCActionPerformed

    private void jTChat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTChat2ActionPerformed

    }//GEN-LAST:event_jTChat2ActionPerformed

    private void jTChat2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTChat2KeyTyped

    }//GEN-LAST:event_jTChat2KeyTyped

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        buscaP(p1, 1);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscar2ActionPerformed
        buscaP(p2, 2);
    }//GEN-LAST:event_jBBuscar2ActionPerformed

    public void buscaC(ColaDinamica cd) {

        int bandera = 0;
        ColaDinamica cdt = new ColaDinamica();
        Nodo aux = null;
        String sb = "";

        String s = JOptionPane.showInputDialog(null, "Ingrese dato a buscar");

        if (s != null) {
            if (s.length() == 0) {
                Mensaje.error(this, "Campo vacio, debe introducir el elemento a buscar");
            } else {
                while (cd.getFrente() != null) {
                    aux = cd.Elimina();
                    if (aux.getObj().toString().toLowerCase().contains(s.toLowerCase())) {
                        sb += aux.getObj().toString() + "\n";
                        bandera = 1;
                    } else {
                        //
                        if (cd.getFrente() == null && bandera == 0) {
                            Mensaje.error(this, "Dato no encontrado");
                        }
                    }
                    cdt.Inserta(aux);
                }
                c = cdt;
                raiz.setObj(c);
                jTConversacion.setText(sb);
            }
        }

    }
    
    public void buscaP(PilaDinamica p, int numPila) {

        String s = JOptionPane.showInputDialog(null, "ingresa el dato que quieres buscar");
        String sb = "";
        PilaDinamica pdt = new PilaDinamica();
        Nodo aux = null;
        Nodo aux2 = null;
        int encontrado = 0;

        if (s != null) {
            if (s.length() == 0) {
                Mensaje.error(this, "Campo vacio, debe introducir el elemento a buscar");
            } else {
                while (p.getTope() != null) {
                    aux = p.Elimina();
                    if (aux.getObj().toString().toLowerCase().contains(s.toLowerCase())) {
                        sb += aux.getObj().toString() + "\n";
                        encontrado = 1;
                    }else{
                        if (p.getTope() == null && encontrado == 0) {
                           Mensaje.error(this, "Dato no encontrado");
                        }
                    }
                    pdt.Inserta(aux);
                }
                
                while (pdt.getTope() != null) {
                    aux2 = pdt.Elimina();
                    p.Inserta(aux2);
                }
                
                if (numPila == 1) {
                    p1 = p;
                    raiz.setPila1(p1);
                }else{
                p2 = p;
                raiz.setPila2(p2);
                }
                jTConversacion.setText(sb);
            }
        }

    }

    public void muestra()
    {
        s = "";

        ColaDinamica cmuestra = new ColaDinamica();

        for (int i = 0; i < raiz.getNum(); i++)
        {

            Nodo aux = new Nodo(c.Elimina().getObj());

            if (aux == null)
            {
                break;
            }

            cmuestra.Inserta(aux);
            s += " " + String.valueOf(aux.getObj()) + "\n";
        }

        jTConversacion.setText(s);

        for (int i = 0; i < raiz.getNum(); i++) {
            Nodo aux = new Nodo(cmuestra.Elimina().getObj());
            c.Inserta(aux);
        }

    }

    public void ordenac(ColaDinamica cd)//METODO QUE ORDENA LOS DATOS DE LA COLA
    {
        String m = "";//Mensaje
        String arr[];//Arreglo
        int n = 0;//Numeroo datos
        ColaDinamica a = new ColaDinamica();

        for (int i = 0; i < raiz.getNum(); i++)
        {
            try {
                Nodo aux = new Nodo(c.Elimina().getObj());
                a.Inserta(aux);
                n += 1;
            } catch (NullPointerException ex) {
                break;
            }
        }

        if (a.getAtras() == null) {
            Mensaje.error(this, "No hay datos para ordenar");
        } else {
            arr = new String[n];
            
            for (int i = 0; i < n; i++)
            {
                try {
                    Nodo aux = new Nodo(a.Elimina().getObj());
                    c.Inserta(aux);
                    arr[i] = (String)aux.getObj().toString().replaceAll("\\s{2,}", " ").trim();
                    //arr[i] = (String) aux.getObj();
                } catch (NullPointerException ex) {
                    break;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (arr[j].compareTo(arr[j + 1]) > 0)
                    {
                        String tmp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
                m += arr[i] + "\n";
                m+="-------------\n";
            }
            
            jTConversacion.setText(m);
        }

    }

    public void ordena(PilaDinamica p) //METODO QUE ORDENA LOS DATOS DE UNA PILA
    {

        String t = "";//texto
        String ar[];//
        int n = 0;
        PilaDinamica auxiliar = new PilaDinamica();

        for (int i = 0; i < raiz.getNum(); i++)
        {
            try {
                Nodo aux = new Nodo(p.Elimina().getObj());
                auxiliar.Inserta(aux);
                n += 1;
            } catch (NullPointerException ex) {
                break;
            }
        }

        if (auxiliar.getTope() == null) {
            Mensaje.error(this, "El chat se encuentra vacio, no se puede ordenar");
        } else {
            ar = new String[n];

            for (int i = 0; i < n; i++)
            {
                try {
                    Nodo aux = new Nodo(auxiliar.Elimina().getObj());
                    p.Inserta(aux);
                    ar[i] = (String) aux.getObj();
                } catch (NullPointerException ex) {
                    break;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (ar[j].compareTo(ar[j + 1]) > 0) {
                        String tmp = ar[j + 1];
                        ar[j + 1] = ar[j];
                        ar[j] = tmp;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println(ar[i]);
                t += ar[i] + "\n";
            }

            jTConversacion.setText(t);
        }

    }

    public void ordenap(PilaDinamica p)
    {

        String t = "";//texto
        String ar[];//
        int n = 0;
        PilaDinamica auxiliar = new PilaDinamica();

        for (int i = 0; i < raiz.getNum(); i++)
        {
            try {
                Nodo aux = new Nodo(p.Elimina().getObj());
                auxiliar.Inserta(aux);
                n += 1;
            } catch (NullPointerException ex) {
                break;
            }
        }

        if (auxiliar.getTope() == null) {
            Mensaje.error(this, "El chat se encuentra vacio, no se puede ordenar");
        } else {

            ar = new String[n];

            for (int i = 0; i < n; i++)
            {
                try {
                    Nodo aux = new Nodo(auxiliar.Elimina().getObj());
                    p.Inserta(aux);
                    ar[i] = (String) aux.getObj();
                } catch (NullPointerException ex) {
                    break;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (ar[j].compareTo(ar[j + 1]) > 0) {
                        String tmp = ar[j + 1];
                        ar[j + 1] = ar[j];
                        ar[j] = tmp;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println(ar[i]);
                t += ar[i] + "\n";
            }

            jTConversacion.setText(t);
        }
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
            java.util.logging.Logger.getLogger(VtnW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscar2;
    private javax.swing.JButton jBBuscarC;
    private javax.swing.JButton jBEnviar1;
    private javax.swing.JButton jBEnviar2;
    private javax.swing.JButton jBMostrarTexto;
    private javax.swing.JButton jBOrdenaC;
    private javax.swing.JButton jBOrdenar1;
    private javax.swing.JButton jBOrdenar2;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLChat;
    private javax.swing.JLabel jLOrdenar;
    private javax.swing.JLabel jLOriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTChat1;
    private javax.swing.JTextField jTChat2;
    private javax.swing.JTextArea jTConversacion;
    private javax.swing.JLabel lNombreUser;
    // End of variables declaration//GEN-END:variables
}
