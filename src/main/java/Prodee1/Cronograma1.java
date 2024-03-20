
package Prodee1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Cronograma1 extends javax.swing.JFrame {
    DefaultTableModel tabla;
    String data [][]={};
    String cabeza []={"N°","Fecha de Pago","Cuota","Cuota Capital","Interes","Mora","Saldo Final"};

public Cronograma1() {
    initComponents();    
    tabla = new DefaultTableModel(data, cabeza);
    tablacronograma.setModel(tabla); 
    // define el ancho de la columna
    tablacronograma.getColumnModel().getColumn(0).setPreferredWidth(25);
    tablacronograma.getColumnModel().getColumn(5).setPreferredWidth(30);
    // centra los datos de la tabla
    DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
    Alinear.setHorizontalAlignment(SwingConstants.CENTER);
    tablacronograma.getColumnModel().getColumn(0).setCellRenderer(Alinear);
    tablacronograma.getColumnModel().getColumn(1).setCellRenderer(Alinear);    
    tablacronograma.getColumnModel().getColumn(2).setCellRenderer(Alinear);
    tablacronograma.getColumnModel().getColumn(3).setCellRenderer(Alinear);
    tablacronograma.getColumnModel().getColumn(4).setCellRenderer(Alinear);
    tablacronograma.getColumnModel().getColumn(5).setCellRenderer(Alinear);
    tablacronograma.getColumnModel().getColumn(6).setCellRenderer(Alinear);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablacronograma = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbperiodo = new javax.swing.JComboBox<>();
        cbforma = new javax.swing.JComboBox<>();
        cbproducto = new javax.swing.JComboBox<>();
        fechadesembolso = new com.toedter.calendar.JDateChooser();
        fechainicio = new com.toedter.calendar.JDateChooser();
        textmonto = new javax.swing.JTextField();
        textplazo = new javax.swing.JTextField();
        texttasa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btncalcular = new javax.swing.JButton();
        btngenerar = new javax.swing.JButton();
        labinteres = new javax.swing.JLabel();
        labtotal = new javax.swing.JLabel();
        labcuota = new javax.swing.JLabel();
        labvencimiento = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labcapitaltotal = new javax.swing.JLabel();
        labcuotatotal1 = new javax.swing.JLabel();
        labinterestotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablacronograma.setBackground(new java.awt.Color(102, 255, 204));
        tablacronograma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Fecha de pago", "Cuota", "Capital cuota", "Interes", "Mora", "Saldo Final"
            }
        ));
        tablacronograma.setGridColor(new java.awt.Color(102, 255, 204));
        jScrollPane1.setViewportView(tablacronograma);

        jLabel1.setText("Monto");

        jLabel2.setText("Plazo");

        jLabel3.setText("Tasa");

        jLabel4.setText("Cuota");

        jLabel5.setText("Total");

        jLabel6.setText("Periodo");

        jLabel7.setText("Forma");

        jLabel8.setText("Interes");

        jLabel9.setText("F. Desembolso");

        jLabel10.setText("F.I. Credito");

        jLabel12.setText("Producto");

        cbperiodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Diario", "Semanal", "Quincenal", "Mensual" }));
        cbperiodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbperiodoActionPerformed(evt);
            }
        });

        cbforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "LunesDomingo", "LunesSabado", "LunesViernes" }));

        cbproducto.setEnabled(false);

        textmonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        textplazo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        texttasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btngenerar.setText("GENERAR");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labinteres.setBackground(new java.awt.Color(204, 255, 204));
        labinteres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labinteres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        labtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        labcuota.setBackground(new java.awt.Color(204, 255, 204));
        labcuota.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labcuota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        labvencimiento.setBackground(new java.awt.Color(204, 255, 204));
        labvencimiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labvencimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel13.setText("F.V Credito");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("PRODEE SYSTEM - CRONOGRAMA DE PAGOS ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(textplazo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(texttasa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cbperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(cbforma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(cbproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(fechadesembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(fechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(labvencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(labcuota, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(labinteres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(labtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(labcuotatotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(labcapitaltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(labinterestotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textplazo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texttasa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbforma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechadesembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labvencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labcuota, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labinteres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labcapitaltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(labcuotatotal1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(labinterestotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
    double tasa; int monto,plazo,cb,cbf; String m,p,t; Date fechai;  
    fechai=fechainicio.getDate();
    m=textmonto.getText();
    p=textplazo.getText();
    t=texttasa.getText();
    cb=cbperiodo.getSelectedIndex();
    cbf=cbforma.getSelectedIndex();
    
    if(m.length()==0 || p.length()==0 || t.length()==0 || cb==0 || fechai==null){
       JOptionPane.showMessageDialog(null, "Ingrese: monto, plazo, tasa,periodo y fecha inicio");
    }else{
         
        monto=Integer.parseInt(textmonto.getText());
        plazo=Integer.parseInt(textplazo.getText());    
        tasa=Double.parseDouble(texttasa.getText());
        Calculo calcular=new Calculo();
        
     
            if (cbperiodo.getSelectedItem().toString().equals("Diario")){  
                  if(cbf==0){
                    JOptionPane.showMessageDialog(null, "Seleccione: Forma");
                   }
                  else{
                    calcular.DiarioCalculo(monto, plazo, tasa);
                    labcuota.setText(String.format("%.1f",calcular.cuota));  
                    labinteres.setText(String.format("%.1f",calcular.interes));   
                    labtotal.setText(String.format("%.1f",calcular.total));    
                
                } 
       }
        
        if (cbperiodo.getSelectedItem().toString().equals("Semanal")){
            calcular.SemanalCalculo(monto, plazo, tasa);
            labcuota.setText(String.format("%.1f",calcular.cuota));  
            labinteres.setText(String.format("%.1f",calcular.interes));   
            labtotal.setText(String.format("%.1f",calcular.total));         
        }
            if (cbperiodo.getSelectedItem().toString().equals("Quincenal")){
            calcular.QuincenalCalculo(monto, plazo, tasa);
            labcuota.setText(String.format("%.1f",calcular.cuota));  
            labinteres.setText(String.format("%.1f",calcular.interes));   
            labtotal.setText(String.format("%.1f",calcular.total));         
        }
            if (cbperiodo.getSelectedItem().toString().equals("Mensual")){
            calcular.MensualCalculo(monto, plazo, tasa);
            labcuota.setText(String.format("%.1f",calcular.cuota));  
            labinteres.setText(String.format("%.1f",calcular.interes));   
            labtotal.setText(String.format("%.1f",calcular.total));   
        }
    }

    }//GEN-LAST:event_btncalcularActionPerformed

    private void cbperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbperiodoActionPerformed
        cbproducto.removeAllItems();
        if (cbperiodo.getSelectedItem().toString().equals("Diario")){
        cbproducto.addItem("ProDiario");
        cbforma.setEnabled(true);
        }           
        if (cbperiodo.getSelectedItem().toString().equals("Semanal")){
        cbproducto.addItem("ProSemanal");
        cbforma.setEnabled(false);
        }
        if (cbperiodo.getSelectedItem().toString().equals("Quincenal")){
        cbproducto.addItem("ProQuincenal");
        cbforma.setEnabled(false);
        }
        if (cbperiodo.getSelectedItem().toString().equals("Mensual")){
        cbproducto.addItem("ProMensual");
        cbforma.setEnabled(false);
        }
    }//GEN-LAST:event_cbperiodoActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        tabla.setRowCount(0);     //LIMPIA LA TABLA   
        int plazo,c=20,monto; double cuota,saldo,interes,total,interesdiario,cuotacapital; 
        String fecha,salida2;
        
        monto=Integer.parseInt(textmonto.getText());
        plazo=Integer.parseInt(textplazo.getText());
        cuota=Double.parseDouble(labcuota.getText());
        interes=Double.parseDouble(labinteres.getText());  
        total=Double.parseDouble(labtotal.getText());
        fecha=((JTextField)fechainicio.getDateEditor().getUiComponent()).getText();
          
        
        interesdiario=Math.round(interes/plazo*100)/100d; 
        cuotacapital=cuota-interesdiario;
        saldo=total-cuota;
        //-----------------------------------------
        if (cbperiodo.getSelectedItem().toString().equals("Diario")){               
           if (cbforma.getSelectedItem().toString().equals("LunesDomingo")){  
                    for(int i=1;i<=plazo;i++){
                        salida2=sumarDiasAFecha(fecha, i-1);
                        String generarFilas[]={""+i,""+ salida2,""+ Math.round(cuota*100)/100d,
                            ""+Math.round(cuotacapital*100)/100d,""+ Math.round(interesdiario*100)/100d,
                            ""+ 0.00,""+ Math.round(saldo*100)/100d};

                        saldo = saldo - cuota;
                        tabla.addRow(generarFilas);
                        labvencimiento.setText(salida2.toString());
                    }   
           }
           
           Calendar  fechai=fechainicio.getCalendar();
           if (cbforma.getSelectedItem().toString().equals("LunesSabado")){ 
                   
                    DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");//damos el formato para la fecha         
                    for(int i=0;i<=plazo;i++){
                    String salida=df.format(fechai.getTime());                  
                    
                     String generarFilas[]={""+i,""+ salida,""+ Math.round(cuota*100)/100d,
                            ""+Math.round(cuotacapital*100)/100d,""+ Math.round(interesdiario*100)/100d,
                            ""+ 0.00,""+ Math.round(saldo*100)/100d};
                    
                    int diaSemana=fechai.get(Calendar.DAY_OF_WEEK);
                    if(diaSemana==Calendar.SATURDAY){
                    fechai.add(Calendar.DATE, 2);
                    }else{
                    fechai.add(Calendar.DATE, 1);
                    }                    
                    saldo = saldo - cuota;
                    tabla.addRow(generarFilas);
                    labvencimiento.setText(salida.toString());                    
                    }
           }
           
           if (cbforma.getSelectedItem().toString().equals("LunesViernes")){ 
                    DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");//damos el formato para la fecha         
                    for(int i=0;i<=plazo;i++){
                    String salida=df.format(fechai.getTime());                  
                    
                     String generarFilas[]={""+i,""+ salida,""+ Math.round(cuota*100)/100d,
                            ""+Math.round(cuotacapital*100)/100d,""+ Math.round(interesdiario*100)/100d,
                            ""+ 0.00,""+ Math.round(saldo*100)/100d};
                    
                    int diaSemana=fechai.get(Calendar.DAY_OF_WEEK);
                    if(diaSemana==Calendar.FRIDAY){
                    fechai.add(Calendar.DATE, 3);
                    }else{
                    fechai.add(Calendar.DATE, 1);
                    }                    
                    saldo = saldo - cuota;
                    tabla.addRow(generarFilas);
                    labvencimiento.setText(salida.toString());                    
                    }
           }
        }
        
//-------------------------------SEMANAL------------------------------------
        if (cbperiodo.getSelectedItem().toString().equals("Semanal")){
          for(int i=1;i<=plazo;i++){
                salida2=sumarSemanaAFecha(fecha, i);
                String generarFilas[]={""+i,""+ salida2,""+ Math.round(cuota*100)/100d,
                    ""+Math.round(cuotacapital*100)/100d,""+ Math.round(interesdiario*100)/100d,
                    ""+ 0.00,""+ Math.round(saldo*100)/100d};

                saldo = saldo - cuota;
                tabla.addRow(generarFilas);
                labvencimiento.setText(salida2.toString());
            }          
        }
        
        if (cbperiodo.getSelectedItem().toString().equals("Quincenal")){
            for(int i=1;i<=plazo;i++){
                salida2=sumarQuincenaAFecha(fecha, i*15);
                String generarFilas[]={""+i,""+ salida2,""+ Math.round(cuota*100)/100d,
                    ""+Math.round(cuotacapital*100)/100d,""+ Math.round(interesdiario*100)/100d,
                    ""+ 0.00,""+ Math.round(saldo*100)/100d};

                saldo = saldo - cuota;
                tabla.addRow(generarFilas);
                labvencimiento.setText(salida2.toString());
            }            
        }
        
        if (cbperiodo.getSelectedItem().toString().equals("Mensual")){
            for(int i=1;i<=plazo;i++){
                salida2=sumarMesAFecha(fecha, i);
                String generarFilas[]={""+i,""+ salida2,""+ Math.round(cuota*100)/100d,
                    ""+Math.round(cuotacapital*100)/100d,""+ Math.round(interesdiario*100)/100d,
                    ""+ 0.00,""+ Math.round(saldo*100)/100d};

                saldo = saldo - cuota;
                tabla.addRow(generarFilas);
                labvencimiento.setText(salida2.toString());
            }   
             
         } 
        
        
       labcapitaltotal.setText(String.valueOf(monto+".0"));    
       labcuotatotal1.setText(String.valueOf(total));  
       labinterestotal.setText(String.valueOf(interes));
    }//GEN-LAST:event_btngenerarActionPerformed
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronograma1().setVisible(true);
            }
        });
    }
    
    public static String sumarDiasAFecha(String fecha, int dias) {
//    if(dias == 0){
//        return fecha;
//    }
 SimpleDateFormat fe = new SimpleDateFormat("EEE dd/MM/yyy");
 
    String[] f = fecha.split("/"); //separa datos a partir de - 
    Calendar calendario = Calendar.getInstance();   
    calendario.set(Integer.parseInt(f[2]), Integer.parseInt(f[1])-1, Integer.parseInt(f[0]));

    calendario.add(Calendar.DAY_OF_MONTH, dias);
    
    return fe.format(calendario.getTime());
}
    
    public static String sumarSemanaAFecha(String fecha, int semana) {
    SimpleDateFormat fe = new SimpleDateFormat("EEE dd/MM/yyy");
 
    String[] f = fecha.split("/"); //separa datos a partir de - 
    Calendar calendario = Calendar.getInstance();   
    calendario.set(Integer.parseInt(f[2]), Integer.parseInt(f[1])-1, Integer.parseInt(f[0]));

    calendario.add(Calendar.WEEK_OF_MONTH, semana);  
    return fe.format(calendario.getTime());
   }
    
    public static String sumarQuincenaAFecha(String fecha, int dias) {
    SimpleDateFormat fe = new SimpleDateFormat("EEE dd/MM/yyy");
 
    String[] f = fecha.split("/"); //separa datos a partir de - 
    Calendar calendario = Calendar.getInstance();  
    calendario.set(Integer.parseInt(f[2]), Integer.parseInt(f[1])-1, Integer.parseInt(f[0])); //("año,mes.dia")

    calendario.add(Calendar.DAY_OF_MONTH, dias);   
    return fe.format(calendario.getTime());
 }
   
    public static String sumarMesAFecha(String fecha, int mes) {
    SimpleDateFormat fe = new SimpleDateFormat("EEE dd/MM/yyy");
 
    String[] f = fecha.split("/"); //separa datos a partir de - 
    Calendar calendario = Calendar.getInstance();  
    calendario.set(Integer.parseInt(f[2]), Integer.parseInt(f[1])-1, Integer.parseInt(f[0])); //("año,mes.dia")

    calendario.add(Calendar.MONTH, mes);  
    return fe.format(calendario.getTime());
 }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btngenerar;
    private javax.swing.JComboBox<String> cbforma;
    private javax.swing.JComboBox<String> cbperiodo;
    private javax.swing.JComboBox<String> cbproducto;
    private com.toedter.calendar.JDateChooser fechadesembolso;
    private com.toedter.calendar.JDateChooser fechainicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labcapitaltotal;
    private javax.swing.JLabel labcuota;
    private javax.swing.JLabel labcuotatotal1;
    private javax.swing.JLabel labinteres;
    private javax.swing.JLabel labinterestotal;
    private javax.swing.JLabel labtotal;
    private javax.swing.JLabel labvencimiento;
    private javax.swing.JTable tablacronograma;
    private javax.swing.JTextField textmonto;
    private javax.swing.JTextField textplazo;
    private javax.swing.JTextField texttasa;
    // End of variables declaration//GEN-END:variables
}
