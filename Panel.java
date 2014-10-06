package chatapplet;

import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.SwingWorker;


public class Panel extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String DB_URL,username,password,message,T;
    public Workerdb w;
    public java.sql.Connection connection;
     
    String name = "nickname            ";
 
    public Panel() {
                     
        try { // Connection to Database
            DB_URL = "jdbc:mysql://db4free.net:3306/saksoo";
            username = "saksoo";
            password = "saksoo3377";
            T = "1000";
 
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, username, password);
            System.out.println("Database connection successful.");
            //Starting Swing Worker update
            w = new Workerdb(Integer.parseInt(T));
            w.execute();
       }
        catch( SQLException  | ClassNotFoundException  e){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database. Please check your internet connection");
            System.exit(EXIT_ON_CLOSE);
        } 
        
        // Initiation of some things
       
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        initComponents();
        updateChat();      
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
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

        try {
            connection.close();
            System.out.println("Connection closed. ");
            //Closing auto refresh updating swingworker
            System.out.println("Closing auto refresh updating.. ");
            w.cancel(true);
         } catch (SQLException e1) {
            System.out.println("Connection close failed! ");
         }
    }                              

    private void Elaxistopoihsh(java.awt.event.WindowEvent evt) {                                
        w.cancel(true);
    }                               

    private void oxi_elaxistopoihsh(java.awt.event.WindowEvent evt) {                                    
        w = new Workerdb(Integer.parseInt(T));
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
        // TODO add your handling code here:
    }                                      

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jTextField1.getText().equals("deletedb")) {
               JOptionPane.showMessageDialog(null, "Secret phrase");
               deletemessages();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField messageText;
    // End of variables declaration                   


public static boolean isNotNullNotEmptyNotWhiteSpaceOnlyByJava(final String string)  
{  
   return string != null && !string.isEmpty() && !string.trim().isEmpty();  
}  
    

boolean updateChat(){
    try {
        String sql = "SELECT name,sxolio,date FROM comments "; //ORDER BY idcomments ASC
        PreparedStatement pre;
        ResultSet set;
        pre = connection.prepareStatement(sql);
        set = pre.executeQuery();
               
        String result = "Nickname       "   + "\t"  + "\t"+ "Message"  + "\n" + "\n";
        
        while (set.next()) {
            result = result + set.getString("name") +"-->"  + "\t"  +set.getString("sxolio") + "     (" +  set.getString("date") + ")"  + "\n";
        } 
        
        set.close();
        pre.close();
        area.setText(result);  
        area.setCaretPosition(area.getDocument().getLength());  // scroll always to last messages
        return true;
    } 
    catch(SQLException e){
        return false;
    } 
}


public void deletemessages(){
    try{
            String query = "delete from comments";
            PreparedStatement preparedStmt;
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.executeUpdate();
        }  
        catch(SQLException e){    
        }   
}

public void Insert() {
    if ( !isNotNullNotEmptyNotWhiteSpaceOnlyByJava(messageText.getText()) ) { // check if message is empty
            JOptionPane.showMessageDialog(null, "Please write your message");
            return;
    }
           
    try {
                PreparedStatement s = (PreparedStatement) connection.prepareStatement("INSERT INTO comments (name,sxolio,date) VALUES (?, ?, ?)");
                s.setString(1, name);
                s.setString(2, messageText.getText());
                s.setTimestamp(3, new java.sql.Timestamp(System.currentTimeMillis()));
                s.executeUpdate();    
                messageText.setText("");
    } 
    catch (SQLException e) {
    }               
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

