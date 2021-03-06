package chatapplet;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.Timer;


public class Panel extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;	
    public Workerdb w; 
    String name = "nickname            ";
    Database db;
    
    public Panel() {
    		db = new Database();
            //Starting Swing Worker update
            w = new Workerdb(Integer.parseInt(db.T));
            w.execute();
            // Initiation of some things
            this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
            initComponents();
            updateChat();      
            settime();      
       }
     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        messageText = new javax.swing.JTextField();
        labeltime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Private Chat");
        setBounds(new java.awt.Rectangle(200, 20, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Closing_frame(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                oxi_elaxistopoihsh(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                Elaxistopoihsh(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to the private discussion");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel2.setText("Choose your nickname:");

        jTextField1.setText("nickname            ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Change name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        area.setEditable(false);
        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        messageText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextActionPerformed(evt);
            }
        });
        messageText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                messageTextKeyPressed(evt);
            }
        });

        labeltime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeltime.setText("LabelTime");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Time is:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labeltime, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labeltime))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void Closing_frame(java.awt.event.WindowEvent evt) {                               
            db.close();
            //Closing auto refresh updating swingworker
            System.out.println("Closing auto refresh updating.. ");
            w.cancel(true);
         
    }                              

    private void Elaxistopoihsh(java.awt.event.WindowEvent evt) {                                
        w.cancel(true);
    }                               

    private void oxi_elaxistopoihsh(java.awt.event.WindowEvent evt) {                                    
        w = new Workerdb(Integer.parseInt(db.T));
        w.execute();
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      changename();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Insert();       //When we press the Send Button     
    }                                        

    private void messageTextActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Insert();       // When we hit Enter
    }                                           

    private void messageTextKeyPressed(java.awt.event.KeyEvent evt) {                                       
        
    }                                      

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jTextField1.getText().equals("deletedb")) { /// secret delete db
               JOptionPane.showMessageDialog(null, "Secret phrase");
               db.deletemessages();
               return;
        }
        changename();      
    }                                           

    
    
    // Variables declaration - do not modify                     
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labeltime;
    private javax.swing.JTextField messageText;
    // End of variables declaration                   


public static boolean isNotNullNotEmptyNotWhiteSpaceOnlyByJava(final String string)  
{  
   return string != null && !string.isEmpty() && !string.trim().isEmpty();  
}  
    

boolean updateChat(){
    try {
    	ResultSet set = db.selectalldb();
           
        String result = "Nickname       "   + "\t"  + "\t"+ "Message"  + "\n" + "\n";
        
        while (set.next()) {
            result = result + set.getString("name") +"-->"  + "\t"  +set.getString("sxolio") + "     (" +  set.getString("date") + ")"  + "\n";
        } 
        
        set.close();
        area.setText(result);  
        area.setCaretPosition(area.getDocument().getLength());  // scroll always to last messages
        return true;
    } 
    catch(SQLException e){
        return false;
    } 
}


public void Insert() {
    if ( !isNotNullNotEmptyNotWhiteSpaceOnlyByJava(messageText.getText()) ) { // check if message is empty
            JOptionPane.showMessageDialog(null, "Please write your message");
            return;
    }
  
    String messagetoInsert = messageText.getText();   
    db.insertdb(name, messagetoInsert);   
    messageText.setText("");
    
}

public void changename(){
    name = (jTextField1.getText());        //// Button Change name
     
    int diafora = 20 - name.length();
    
    if ( diafora >= 0 ) {
        for (int i=0; i< diafora ; i++   ){
            name = name + " ";
        }
    }

    System.out.println(diafora);

    jTextField1.setText(name);
    jLabel3.setText("Your nick is: " + name);
}

public void settime(){
    
    final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
    ActionListener timerListener = new ActionListener()  
    {  
       @Override
       public void actionPerformed(ActionEvent e)  
        {  
            Date date = new Date();  
            String time = timeFormat.format(date);  
            labeltime.setText(time);  
        }  
    };  
        
    Timer timer = new Timer(1000, timerListener);  
    // to make sure it doesn't wait one second at the start  
    timer.setInitialDelay(0);  
    timer.start();        
}


class Workerdb extends SwingWorker<Void, Void> {
    private final int T;
		
    public Workerdb(int t) {
        super();
        System.out.println("A new worker has been created ! with T = " + t +"ms");
        T = t;	
    }

    @Override
    public Void doInBackground() throws Exception {
        Thread.sleep(T);
        updateChat();
        w = new Workerdb(T);
        w.execute();
        System.out.println("Update!");
        return null;	
    }

    @Override
    protected void done() {

    }
}



}
