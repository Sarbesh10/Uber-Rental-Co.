package UberAndRental;

import javax.swing.ButtonGroup;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author karki
 */
public class UberAndRental extends javax.swing.JFrame {

    /**
     * Creates new form UberAndRental
     */
    CardLayout cardlayout;

    public UberAndRental() {
        initComponents();
        cardlayout = (CardLayout) (cards.getLayout());   //for card layout
        ButtonGroup bg = new ButtonGroup();     //to add radio buttons 
        bg.add(rb_uber);
        bg.add(rb_rent);
        bg.add(cb_yes);
        bg.add(cb_no);
        vehiclebtn.setVisible(false);  
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        Admin = new javax.swing.JButton();
        Customer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cards = new javax.swing.JPanel();
        customerpnl = new javax.swing.JPanel();
        u_namelbl = new javax.swing.JLabel();
        u_phonelbl = new javax.swing.JLabel();
        u_locationlbl = new javax.swing.JLabel();
        u_name = new javax.swing.JTextField();
        u_phone = new javax.swing.JTextField();
        u_location = new javax.swing.JTextField();
        rb_uber = new javax.swing.JRadioButton();
        rb_rent = new javax.swing.JRadioButton();
        u_emaillbl = new javax.swing.JLabel();
        u_email = new javax.swing.JTextField();
        datelbl = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        datelbl1 = new javax.swing.JLabel();
        uberinfo = new javax.swing.JPanel();
        uber_d_phonelbl = new javax.swing.JLabel();
        nearbylbl = new javax.swing.JLabel();
        cb_nearby = new javax.swing.JComboBox<>();
        uber_d_idlbl = new javax.swing.JLabel();
        uber_d_licnolbl = new javax.swing.JLabel();
        uber_pricelbl = new javax.swing.JLabel();
        uber_d_phone = new javax.swing.JLabel();
        uber_d_id = new javax.swing.JLabel();
        uber_d_licno = new javax.swing.JLabel();
        uber_price = new javax.swing.JLabel();
        price_note = new javax.swing.JLabel();
        vehiclebtn = new javax.swing.JButton();
        u_bookbtn = new javax.swing.JButton();
        adminpnl = new javax.swing.JPanel();
        codelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        aboutpnl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        vehiclepnl = new javax.swing.JPanel();
        vehicleslbl = new javax.swing.JLabel();
        cb_vehicle = new javax.swing.JComboBox<>();
        timelbl = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox<>();
        backbtn = new javax.swing.JButton();
        bookbtn = new javax.swing.JButton();
        checkbox_driver = new javax.swing.JLabel();
        rent_driverpnl = new javax.swing.JPanel();
        cb_driver = new javax.swing.JComboBox<>();
        driverlbl = new javax.swing.JLabel();
        driver_idlbl = new javax.swing.JLabel();
        driver_id = new javax.swing.JLabel();
        licenseno = new javax.swing.JLabel();
        licenselbl = new javax.swing.JLabel();
        d_phonelbl = new javax.swing.JLabel();
        d_phone = new javax.swing.JLabel();
        pricelbl = new javax.swing.JLabel();
        rent_price = new javax.swing.JLabel();
        durationlbl = new javax.swing.JLabel();
        cb_duration = new javax.swing.JComboBox<>();
        cb_yes = new javax.swing.JRadioButton();
        cb_no = new javax.swing.JRadioButton();
        bookedpnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        rent_infolbl = new javax.swing.JLabel();
        cb_search = new javax.swing.JComboBox<>();
        seach_vehicle = new javax.swing.JButton();
        search_ser = new javax.swing.JLabel();
        searchprice = new javax.swing.JLabel();
        search_field = new javax.swing.JTextField();
        search_price = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        abt = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        Save = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        Open = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        aboutt = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        Exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        manual = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        faq = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uber And Rental Co.");
        setFocusable(false);
        setResizable(false);

        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        Admin.setText("Admin");
        Admin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        Customer.setText("Customer");
        Customer.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Precious", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uber And Rental Co.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        cards.setLayout(new java.awt.CardLayout());

        customerpnl.setBackground(new java.awt.Color(45, 40, 45));

        u_namelbl.setForeground(new java.awt.Color(255, 255, 255));
        u_namelbl.setText("Name");

        u_phonelbl.setForeground(new java.awt.Color(255, 255, 255));
        u_phonelbl.setText("Contact Number");
        u_phonelbl.setToolTipText("");

        u_locationlbl.setForeground(new java.awt.Color(255, 255, 255));
        u_locationlbl.setText("Pick-up Location");

        u_name.setBackground(new java.awt.Color(51, 51, 51));
        u_name.setForeground(new java.awt.Color(255, 255, 255));

        u_phone.setBackground(new java.awt.Color(51, 51, 51));
        u_phone.setForeground(new java.awt.Color(255, 255, 255));
        u_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                u_phoneKeyPressed(evt);
            }
        });

        u_location.setBackground(new java.awt.Color(51, 51, 51));
        u_location.setForeground(new java.awt.Color(255, 255, 255));

        rb_uber.setForeground(new java.awt.Color(255, 255, 255));
        rb_uber.setText("Uber");
        rb_uber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_uberActionPerformed(evt);
            }
        });

        rb_rent.setForeground(new java.awt.Color(255, 255, 255));
        rb_rent.setText("Rent");
        rb_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_rentActionPerformed(evt);
            }
        });

        u_emaillbl.setForeground(new java.awt.Color(255, 255, 255));
        u_emaillbl.setText("Email Address");

        u_email.setBackground(new java.awt.Color(51, 51, 51));
        u_email.setForeground(new java.awt.Color(255, 255, 255));

        datelbl.setForeground(new java.awt.Color(255, 255, 255));
        datelbl.setText("Date");

        day.setBackground(new java.awt.Color(51, 51, 51));
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        day.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dayKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dayKeyTyped(evt);
            }
        });

        month.setBackground(new java.awt.Color(51, 51, 51));
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                monthKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                monthKeyTyped(evt);
            }
        });

        year.setEditable(false);
        year.setBackground(new java.awt.Color(51, 51, 51));
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        year.setText("2020");
        year.setFocusable(false);
        year.setVerifyInputWhenFocusTarget(false);
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });

        datelbl1.setForeground(new java.awt.Color(153, 153, 153));
        datelbl1.setText("(DD-MM-YYYY)");

        uberinfo.setBackground(new java.awt.Color(45, 40, 45));

        uber_d_phonelbl.setForeground(new java.awt.Color(255, 255, 255));
        uber_d_phonelbl.setText("Contact Number");

        nearbylbl.setForeground(new java.awt.Color(255, 255, 255));
        nearbylbl.setText("Nearby Drivers");

        cb_nearby.setBackground(new java.awt.Color(51, 51, 51));
        cb_nearby.setForeground(new java.awt.Color(255, 255, 255));
        cb_nearby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Check Nearby Drivers", "Rajendra Mahat", "Shree Basnet", "Mahesh Maharjan", "Shivam Pandey" }));
        cb_nearby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nearbyActionPerformed(evt);
            }
        });

        uber_d_idlbl.setForeground(new java.awt.Color(255, 255, 255));
        uber_d_idlbl.setText("Driver ID");

        uber_d_licnolbl.setForeground(new java.awt.Color(255, 255, 255));
        uber_d_licnolbl.setText("License Number");

        uber_pricelbl.setForeground(new java.awt.Color(255, 255, 255));
        uber_pricelbl.setText("Price");

        uber_d_phone.setForeground(new java.awt.Color(255, 255, 255));

        uber_d_id.setForeground(new java.awt.Color(255, 255, 255));

        uber_d_licno.setForeground(new java.awt.Color(255, 255, 255));

        uber_price.setForeground(new java.awt.Color(255, 255, 255));

        price_note.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        price_note.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout uberinfoLayout = new javax.swing.GroupLayout(uberinfo);
        uberinfo.setLayout(uberinfoLayout);
        uberinfoLayout.setHorizontalGroup(
            uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uberinfoLayout.createSequentialGroup()
                .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uberinfoLayout.createSequentialGroup()
                        .addComponent(nearbylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cb_nearby, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(uberinfoLayout.createSequentialGroup()
                            .addComponent(uber_d_idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(uber_d_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(uberinfoLayout.createSequentialGroup()
                            .addComponent(uber_d_phonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(uber_d_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, uberinfoLayout.createSequentialGroup()
                            .addComponent(uber_d_licnolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(uber_d_licno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(uberinfoLayout.createSequentialGroup()
                        .addComponent(uber_pricelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uber_price, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_note, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        uberinfoLayout.setVerticalGroup(
            uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uberinfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nearbylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_nearby, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uber_d_phonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uber_d_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uber_d_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uber_d_idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uber_d_licno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uber_d_licnolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(uberinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uber_price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uber_pricelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(price_note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        vehiclebtn.setBackground(new java.awt.Color(0, 0, 0));
        vehiclebtn.setForeground(new java.awt.Color(255, 255, 255));
        vehiclebtn.setText("Choose Vehicle");
        vehiclebtn.setToolTipText("");
        vehiclebtn.setBorderPainted(false);
        vehiclebtn.setFocusPainted(false);
        vehiclebtn.setFocusable(false);
        vehiclebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclebtnActionPerformed(evt);
            }
        });

        u_bookbtn.setBackground(new java.awt.Color(0, 0, 0));
        u_bookbtn.setForeground(new java.awt.Color(255, 255, 255));
        u_bookbtn.setText("Book");
        u_bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_bookbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerpnlLayout = new javax.swing.GroupLayout(customerpnl);
        customerpnl.setLayout(customerpnlLayout);
        customerpnlLayout.setHorizontalGroup(
            customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerpnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(u_bookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(vehiclebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(customerpnlLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerpnlLayout.createSequentialGroup()
                        .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uberinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(customerpnlLayout.createSequentialGroup()
                                    .addComponent(u_namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(customerpnlLayout.createSequentialGroup()
                                    .addComponent(u_phonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(u_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(customerpnlLayout.createSequentialGroup()
                                    .addComponent(u_locationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(u_location, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerpnlLayout.createSequentialGroup()
                                    .addComponent(u_emaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(u_email, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(customerpnlLayout.createSequentialGroup()
                        .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerpnlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rb_uber)
                                .addGap(43, 43, 43)
                                .addComponent(rb_rent))
                            .addGroup(customerpnlLayout.createSequentialGroup()
                                .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        customerpnlLayout.setVerticalGroup(
            customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerpnlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(u_namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(u_phonelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(u_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(u_emaillbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(u_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(u_locationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_location, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_uber)
                    .addComponent(rb_rent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uberinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(u_bookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehiclebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        u_namelbl.getAccessibleContext().setAccessibleDescription("");

        cards.add(customerpnl, "customerpnl");

        adminpnl.setBackground(new java.awt.Color(78, 50, 68));

        codelbl.setForeground(new java.awt.Color(255, 255, 255));
        codelbl.setText("User ID");

        passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordlbl.setText("Password");

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        loginbtn.setText("Log In");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminpnlLayout = new javax.swing.GroupLayout(adminpnl);
        adminpnl.setLayout(adminpnlLayout);
        adminpnlLayout.setHorizontalGroup(
            adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpnlLayout.createSequentialGroup()
                .addGroup(adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminpnlLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminpnlLayout.createSequentialGroup()
                                .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminpnlLayout.createSequentialGroup()
                                .addComponent(codelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(adminpnlLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        adminpnlLayout.setVerticalGroup(
            adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminpnlLayout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        cards.add(adminpnl, "adminpnl");

        aboutpnl.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Uber And Rental Co.");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Uber and Rental Corporation is an easy to access online booking application for people who require immediate transportation. The organization was designed in January 1,2020 in Kathmandu. The application is specially designed for people inside the Kathmandu Valley. The application will rise to access for people all over nepal steadily. People can book or rent a vehicle easily as per their requirements by entering the fields provided.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout aboutpnlLayout = new javax.swing.GroupLayout(aboutpnl);
        aboutpnl.setLayout(aboutpnlLayout);
        aboutpnlLayout.setHorizontalGroup(
            aboutpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        aboutpnlLayout.setVerticalGroup(
            aboutpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cards.add(aboutpnl, "aboutpnl");

        vehiclepnl.setBackground(new java.awt.Color(45, 40, 45));
        vehiclepnl.setForeground(new java.awt.Color(255, 255, 255));

        vehicleslbl.setForeground(new java.awt.Color(255, 255, 255));
        vehicleslbl.setText("Vehicle's Available");

        cb_vehicle.setBackground(new java.awt.Color(51, 51, 51));
        cb_vehicle.setForeground(new java.awt.Color(255, 255, 255));
        cb_vehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Vehicle", "Cab", "Bus", "Micro-Bus" }));
        cb_vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_vehicleActionPerformed(evt);
            }
        });

        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setText("Time");

        cb_time.setBackground(new java.awt.Color(51, 51, 51));
        cb_time.setForeground(new java.awt.Color(255, 255, 255));
        cb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Pickup Time", "6:00 AM", "8:00 AM", "10:00 AM", "12:00 PM", "2:00 PM", "6:00 PM", "8:00 PM" }));
        cb_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_timeActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        bookbtn.setText("Book");
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });

        checkbox_driver.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_driver.setText("Need Driver ?");

        rent_driverpnl.setBackground(new java.awt.Color(45, 40, 45));

        cb_driver.setBackground(new java.awt.Color(51, 51, 51));
        cb_driver.setForeground(new java.awt.Color(255, 255, 255));
        cb_driver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Vehicle First" }));
        cb_driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_driverActionPerformed(evt);
            }
        });

        driverlbl.setForeground(new java.awt.Color(255, 255, 255));
        driverlbl.setText("Driver's Available");

        driver_idlbl.setForeground(new java.awt.Color(255, 255, 255));
        driver_idlbl.setText("Driver ID");

        driver_id.setForeground(new java.awt.Color(255, 255, 255));

        licenseno.setForeground(new java.awt.Color(255, 255, 255));

        licenselbl.setForeground(new java.awt.Color(255, 255, 255));
        licenselbl.setText("License Number");

        d_phonelbl.setForeground(new java.awt.Color(255, 255, 255));
        d_phonelbl.setText("Contact Number");

        d_phone.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rent_driverpnlLayout = new javax.swing.GroupLayout(rent_driverpnl);
        rent_driverpnl.setLayout(rent_driverpnlLayout);
        rent_driverpnlLayout.setHorizontalGroup(
            rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rent_driverpnlLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(driverlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driver_idlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenselbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_phonelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_driver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(driver_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(licenseno, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        rent_driverpnlLayout.setVerticalGroup(
            rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rent_driverpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(driver_idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driver_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(licenseno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenselbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rent_driverpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d_phonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pricelbl.setForeground(new java.awt.Color(255, 255, 255));
        pricelbl.setText("Price");

        rent_price.setForeground(new java.awt.Color(255, 255, 255));

        durationlbl.setForeground(new java.awt.Color(255, 255, 255));
        durationlbl.setText("Duration");

        cb_duration.setBackground(new java.awt.Color(51, 51, 51));
        cb_duration.setForeground(new java.awt.Color(255, 255, 255));
        cb_duration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Duration", "3 hours", "8 hours", "10 hours", "12 hours" }));
        cb_duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_durationActionPerformed(evt);
            }
        });

        cb_yes.setForeground(new java.awt.Color(255, 255, 255));
        cb_yes.setText("Yes");
        cb_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_yesActionPerformed(evt);
            }
        });

        cb_no.setForeground(new java.awt.Color(255, 255, 255));
        cb_no.setText("No");
        cb_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vehiclepnlLayout = new javax.swing.GroupLayout(vehiclepnl);
        vehiclepnl.setLayout(vehiclepnlLayout);
        vehiclepnlLayout.setHorizontalGroup(
            vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclepnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vehiclepnlLayout.createSequentialGroup()
                        .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vehicleslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(timelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(durationlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pricelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox_driver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rent_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(vehiclepnlLayout.createSequentialGroup()
                                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cb_vehicle, 0, 181, Short.MAX_VALUE)
                                        .addComponent(cb_time, 0, 181, Short.MAX_VALUE)
                                        .addComponent(cb_duration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(vehiclepnlLayout.createSequentialGroup()
                                        .addComponent(cb_yes)
                                        .addGap(42, 42, 42)
                                        .addComponent(cb_no)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(vehiclepnlLayout.createSequentialGroup()
                        .addComponent(rent_driverpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(vehiclepnlLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        vehiclepnlLayout.setVerticalGroup(
            vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclepnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkbox_driver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_yes)
                    .addComponent(cb_no))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pricelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rent_price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rent_driverpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(vehiclepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cards.add(vehiclepnl, "vehiclepnl");

        bookedpnl.setBackground(new java.awt.Color(51, 51, 51));
        bookedpnl.setForeground(new java.awt.Color(51, 0, 51));

        table.setBackground(new java.awt.Color(51, 51, 51));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Monik Shrestha", "9823237137", "D299", "Baniyatar", "Rent", "Micro-Bus", "8800", "02/01/2020"},
                {"Shre Shrestha", "9808211350", "D200", "Kalanki", "Rent", "Cab", "8000", "02/01/2020"},
                {"Nirajan Lamsal", "9876541231", "D126", "Chapagaun", "Uber", "Cab", "1000", "04/01/2020"},
                {"Mahima Shakya", "9887563452", "D111", "Bhaktapur", "Rent", "Cab", "11000", "04/01/2020"},
                {"Kumar Shrestha", "9841789231", "D200", "Gongabu", "Rent", "Cab", "8000", "03/01/2020"},
                {"Avinash Bhandari", "9812334521", "D169", "Futung", "Uber", "Cab", "1000", "05/01/2020"},
                {"Bimala Karki", "9841324151", "D100", "Gongabu", "Rent", "Bus", "12000", "03/01/2020"},
                {"Khitiz Lama", "9808211751", "D126", "Sanepa", "Uber", "Cab", "1000", "02/01/2020"},
                {"Akrety Karki", "9841324637", "D299", "Gongabu", "Rent", "Micro-Bus", "9000", "03/01/2020"},
                {"Mirakuruh", "981111111", "D169", "kakani", "Uber", "Cab", "1000", "03/01/2020"},
                {"Big Shaq", "9877883434", "D311", "Koteswore", "Rent", "Micro-Bus", "8800", "06/01/2020"},
                {"Nishant Karki", "9841941941", "D101", "Samakhusi", "Uber", "Cab", "1000", "01/01/2020"}
            },
            new String [] {
                "Customer", "Cust_Phone", "Driver ID", "Location", "Rent/Book", "Vehicle", "Price", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoscrolls(false);
        table.setEnabled(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(7).setResizable(false);
        }

        rent_infolbl.setForeground(new java.awt.Color(255, 255, 255));
        rent_infolbl.setText("Information Table");

        cb_search.setBackground(new java.awt.Color(51, 51, 51));
        cb_search.setForeground(new java.awt.Color(255, 255, 255));
        cb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Service", "Uber", "Rent" }));

        seach_vehicle.setBackground(new java.awt.Color(0, 0, 0));
        seach_vehicle.setForeground(new java.awt.Color(255, 255, 255));
        seach_vehicle.setText("Search");
        seach_vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seach_vehicleActionPerformed(evt);
            }
        });

        search_ser.setForeground(new java.awt.Color(255, 255, 255));
        search_ser.setText("Search by Service");

        searchprice.setForeground(new java.awt.Color(255, 255, 255));
        searchprice.setText("Search by Price");

        search_field.setBackground(new java.awt.Color(51, 51, 51));
        search_field.setForeground(new java.awt.Color(255, 255, 255));

        search_price.setBackground(new java.awt.Color(0, 0, 0));
        search_price.setForeground(new java.awt.Color(255, 255, 255));
        search_price.setText("Search");
        search_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_priceActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete Selected Row");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookedpnlLayout = new javax.swing.GroupLayout(bookedpnl);
        bookedpnl.setLayout(bookedpnlLayout);
        bookedpnlLayout.setHorizontalGroup(
            bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookedpnlLayout.createSequentialGroup()
                .addGroup(bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookedpnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                    .addGroup(bookedpnlLayout.createSequentialGroup()
                        .addGroup(bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookedpnlLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(rent_infolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bookedpnlLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(search_ser, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_search, 0, 204, Short.MAX_VALUE)
                                    .addComponent(search_field))
                                .addGap(18, 18, 18)
                                .addGroup(bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seach_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_price, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookedpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        bookedpnlLayout.setVerticalGroup(
            bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookedpnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rent_infolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_ser)
                    .addComponent(cb_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seach_vehicle))
                .addGap(18, 18, 18)
                .addGroup(bookedpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_price)
                    .addComponent(searchprice))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        cards.add(bookedpnl, "bookedpnl");

        jSplitPane1.setRightComponent(cards);

        jMenuBar2.setBackground(new java.awt.Color(51, 51, 51));

        abt.setBackground(new java.awt.Color(51, 51, 51));
        abt.setText("File");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setBackground(new java.awt.Color(51, 51, 51));
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        abt.add(New);
        abt.add(jSeparator5);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setBackground(new java.awt.Color(51, 51, 51));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        abt.add(Save);
        abt.add(jSeparator6);

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setBackground(new java.awt.Color(51, 51, 51));
        Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.png"))); // NOI18N
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        abt.add(Open);
        abt.add(jSeparator7);

        aboutt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        aboutt.setText("About");
        aboutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abouttActionPerformed(evt);
            }
        });
        abt.add(aboutt);
        abt.add(jSeparator8);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setBackground(new java.awt.Color(51, 51, 51));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        abt.add(Exit);

        jMenuBar2.add(abt);

        help.setBackground(new java.awt.Color(51, 51, 51));
        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        manual.setText("Manual");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });
        help.add(manual);
        help.add(jSeparator1);

        faq.setText("FAQ");
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });
        help.add(faq);

        jMenuBar2.add(help);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        cardlayout.show(cards,"adminpnl");
    }//GEN-LAST:event_AdminActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        cardlayout.show(cards, "customerpnl");
    }//GEN-LAST:event_CustomerActionPerformed

    private void vehiclebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclebtnActionPerformed
        String Cust_email = u_email.getText();
        String Cust_phone = u_phone.getText();
        String Cust_location = u_location.getText();
        String Cust_name = u_name.getText();
        
        //validation
        if (Cust_name.isBlank() || Cust_phone.isBlank() || Cust_email.isBlank() || Cust_location.isBlank()) {
            JOptionPane.showMessageDialog(null, "Please Fill the form completely", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            cardlayout.show(cards, "vehiclepnl");
        }
    }//GEN-LAST:event_vehiclebtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        admin_checker(); //calling method
    }//GEN-LAST:event_loginbtnActionPerformed

    void admin_checker() {   //method used in two different action listener
        if (code.getText().contains("admin") && password.getText().contains("1234")) {
            cardlayout.show(cards, "bookedpnl");
            adminpnl.setVisible(false);
            table.setEnabled(true);
            code.setText("");
            password.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Id/Password", "Error", JOptionPane.ERROR_MESSAGE);
            cardlayout.show(cards,"adminpnl");
        }
    }


    private void u_bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_bookbtnActionPerformed
        String Cust_email = u_email.getText();
        String Cust_phoneno = u_phone.getText();
        String Cust_location = u_location.getText();
        String Cus_name = u_name.getText();
        String uber_driver = cb_nearby.getSelectedItem().toString();
        String u_driver_id = uber_d_id.getText();
        String u_price = uber_price.getText();
        String date = day.getText()+"/"+month.getText()+"/"+year.getText();
        String rOb = "Uber";
        String vech = "Cab";
         
        //entering value into table
          try{    
         //validation
        if (uber_driver.contains("Check Nearby Drivers") || Cus_name.isBlank() || Cust_phoneno.isBlank() || Cust_email.isBlank() || Cust_location.isBlank()||day.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please Fill the form completely", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Uber Driver will get in touch with you as soon as possible.", "Uber Booked", JOptionPane.INFORMATION_MESSAGE);
            clear();
            String[] uber_data = {Cus_name,Cust_phoneno, u_driver_id ,Cust_location,rOb, vech, u_price, date};
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.addRow(uber_data);
            
            int columnCount = table.getColumnCount();
            boolean nothing = false;    //flag

            int nextRow = 0;
            String S;

            do {
                S = (String)table.getValueAt(nextRow, 0);
                if (S != null && S.length() != 0) {
                    nextRow++;
                } else {
                    nothing = true;
                }

            } while (!nothing); //checking all rows
            
            for (int i = 0; i < columnCount; i++) {
                table.setValueAt(uber_data[i], nextRow, i);
            
        }
            }
          }catch(ArrayIndexOutOfBoundsException e){
              JOptionPane.showMessageDialog(rootPane,"Adding your information");
          }
        
    }//GEN-LAST:event_u_bookbtnActionPerformed

    private void dayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayKeyTyped

        if (day.getText().length() >= 2) { //to limit day textfield to 2 character

            getToolkit().beep();   //gives beep sound after 2 character

            evt.consume();      //consumes the event after 2 character
        }
    }//GEN-LAST:event_dayKeyTyped

    private void monthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthKeyTyped

        if (month.getText().length() >= 2) {   //to limit day textfield to 2 character

            getToolkit().beep();    //gives beep sound after 2 character

            evt.consume();  //consumes the event after 2 character
        }
    }//GEN-LAST:event_monthKeyTyped

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped

        /*if (year.getText().length() >= 4) {    //to limit day textfield to 4 character

            getToolkit().beep();    //gives beep sound after 4 character

            evt.consume();  //consumes the event after 4 character
        }*/
    }//GEN-LAST:event_yearKeyTyped

    private void rb_uberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_uberActionPerformed
        vehiclebtn.setVisible(false);
        u_bookbtn.setVisible(true);
        uberinfo.setVisible(true);

    }//GEN-LAST:event_rb_uberActionPerformed

    private void rb_rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_rentActionPerformed
        u_bookbtn.setVisible(false);
        vehiclebtn.setVisible(true);
        uberinfo.setVisible(false);

    }//GEN-LAST:event_rb_rentActionPerformed

    private void cb_nearbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nearbyActionPerformed

        int nearbyindex = cb_nearby.getSelectedIndex();
        uber_price.setText("1000");
        price_note.setText("Fare may differ according to distance covered.");

        switch (nearbyindex) {    //inserting driver informations
            case 0: // tp populate value after choosing in combo box
                uber_d_phone.setText("");
                uber_d_licno.setText("");
                uber_d_id.setText("");
                uber_price.setText("");
                price_note.setText("");
                rb_uber.setSelected(false);
                break;

            case 1:
                uber_d_phone.setText("9845202121");
                uber_d_licno.setText("01-00-00035122");
                uber_d_id.setText("D156");
                rb_uber.setSelected(true);
                break;

            case 2:
                uber_d_phone.setText("9751203254");
                uber_d_licno.setText("01-02-00231548");
                uber_d_id.setText("D126");
                rb_uber.setSelected(true);
                break;

            case 3:
                uber_d_phone.setText("9808245614");
                uber_d_licno.setText("02-02-00003515");
                uber_d_id.setText("D101");
                rb_uber.setSelected(true);
                break;

            case 4:
                uber_d_phone.setText("9841203569");
                uber_d_licno.setText("02-15-00002548");
                uber_d_id.setText("D169");
                rb_uber.setSelected(true);
                break;
        }

    }//GEN-LAST:event_cb_nearbyActionPerformed

    private void u_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_u_phoneKeyPressed
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {   //to let user input numeric values only
            u_phone.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter Numeric Value", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            u_phone.setEditable(true);
        }
    }//GEN-LAST:event_u_phoneKeyPressed

    private void cb_driverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_driverActionPerformed

        String rent_driver = cb_driver.getSelectedItem().toString();

        switch (rent_driver) {  //inserting driver information
            //to populate information after choosing combobox
            case "Ram Shrestha":
                d_phone.setText("9808887788");
                licenseno.setText("01-45-00114422");
                driver_id.setText("D111");
                cb_yes.setSelected(true);
                break;

            case "Manish Maharjan":
                d_phone.setText("9751998754");
                licenseno.setText("01-02-00000011");
                driver_id.setText("D200");
                cb_yes.setSelected(true);
                break;

            case "Kamal Pokhrel":
                d_phone.setText("9808245614");
                licenseno.setText("02-22-00245351");
                driver_id.setText("D100");
                cb_yes.setSelected(true);
                break;

            case "Shanti Lal Shrestha":
                d_phone.setText("9841203569");
                licenseno.setText("04-15-01124545");
                driver_id.setText("D199");
                cb_yes.setSelected(true);
                break;

            case "Yaman Gurung":
                d_phone.setText("9801543569");
                licenseno.setText("01-16-01124545");
                driver_id.setText("D299");
                cb_yes.setSelected(true);
                break;

            case "Ramesh Maharjan":
                d_phone.setText("9840203566");
                licenseno.setText("04-15-01124545");
                driver_id.setText("D311");
                cb_yes.setSelected(true);
                break;

            case "Dinesh Khatri":
                d_phone.setText("9841203569");
                licenseno.setText("04-15-01124545");
                driver_id.setText("D199");
                cb_yes.setSelected(true);
                break;

            case "Tenzin Lama":
                d_phone.setText("9848088555");
                licenseno.setText("04-15-08457454");
                driver_id.setText("D019");
                cb_yes.setSelected(true);
                break;

            default:
                cb_yes.setSelected(false);
                d_phone.setText("");
                licenseno.setText("");
                driver_id.setText("");
                break;
        }
    }//GEN-LAST:event_cb_driverActionPerformed

    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
        String Cust_name = u_name.getText();
        String vehicle = cb_vehicle.getSelectedItem().toString();
        String time = cb_time.getSelectedItem().toString();
        String duration = cb_duration.getSelectedItem().toString();
        String rent_driver = cb_driver.getSelectedItem().toString();
        String r_driver_id = driver_id.getText();
        String Cust_phone = u_phone.getText();
        String rent_fare = rent_price.getText();
        String rent_location = u_location.getText();
        String date = day.getText()+"/"+month.getText()+"/"+year.getText();
        String rOb = "Rent";
        
        //entering value into table 
        try{
            
        if (vehicle.contains("Choose Vehicle") || time.contains("Choose Pickup Time") || duration.contains("Choose Duration") || rent_driver.contains("Choose Vehicle First")) {
            JOptionPane.showMessageDialog(null, "Please fill the form completely", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "You will soon get a confirmation call", "Vehicle Booked", JOptionPane.INFORMATION_MESSAGE);
            clear();
            String[] rent_data = {Cust_name, Cust_phone, r_driver_id,rent_location,rOb, vehicle,rent_fare,date};
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.addRow(rent_data);
            u_bookbtn.setEnabled(false);
            
            int columnCount = table.getColumnCount();
            boolean flag = false;    //flag

            int nextRow = 0;
            String ret;
           
            do {
                ret = (String) table.getValueAt(nextRow, 0);
                if (ret != null && ret.length() != 0) {
                    nextRow++;
                } else {
                    flag = true;
                }

            } while (!flag); //checking all rows
            
            for (int i = 0; i < columnCount; i++) {
                table.setValueAt(rent_data[i], nextRow, i);
            }
            
        }
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(rootPane,"Adding your information");
        }
    }//GEN-LAST:event_bookbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        cardlayout.show(cards, "customerpnl");
    }//GEN-LAST:event_backbtnActionPerformed

    private void cb_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_timeActionPerformed
        // TODO add youhandling code here:
    }//GEN-LAST:event_cb_timeActionPerformed

    private void cb_vehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_vehicleActionPerformed
        //inorder to change driver combobox regarding vehicle combobox
        String vehicleindex = cb_vehicle.getSelectedItem().toString();
        DefaultComboBoxModel for_notchoosen = new DefaultComboBoxModel(new String[]{"Choose Vehicle First"});
        DefaultComboBoxModel for_cab = new DefaultComboBoxModel(new String[]{"Choose Driver", "Ram Shrestha", "Manish Maharjan"});
        DefaultComboBoxModel for_bus = new DefaultComboBoxModel(new String[]{"Choose Driver", "Kamal Pokhrel", "Shanti Lal Shrestha"});
        DefaultComboBoxModel for_micro_bus = new DefaultComboBoxModel(new String[]{"Choose Driver", "Yaman Gurung", "Ramesh Maharjan"});
        DefaultComboBoxModel for_motorcycle = new DefaultComboBoxModel(new String[]{"Choose Driver", "Dinesh Khatri", "Tenzin Lama"});

        switch (vehicleindex) {

            case "Cab":
                cb_driver.setModel(for_cab);
                break;

            case "Bus":
                cb_driver.setModel(for_bus);
                break;

            case "Micro-Bus":
                cb_driver.setModel(for_micro_bus);
                break;

            case "Motorcycle":
                cb_driver.setModel(for_motorcycle);
                break;

            default:
                cb_driver.setModel(for_notchoosen);
                driver_id.setText("");
                licenseno.setText("");
                d_phone.setText("");
                break;
        }

    }//GEN-LAST:event_cb_vehicleActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {      //checking whether the pressed key is enter or not
            admin_checker();     //calling method
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void cb_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_yesActionPerformed
        rent_driverpnl.setVisible(true);
        try{
        int add_price = Integer.parseInt(rent_price.getText());
        int final_price = add_price + 1500;
        rent_price.setText(""+final_price);
        
        cb_yes.setEnabled(false); //to stop the addition of final_price after one click
        }catch(NumberFormatException e){
            
        }
      
    }//GEN-LAST:event_cb_yesActionPerformed

    private void cb_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_noActionPerformed
        rent_driverpnl.setVisible(false);
        try{
        int add_price = Integer.parseInt(rent_price.getText());
        int final_price = add_price - 1500;
        rent_price.setText(""+final_price);
        driver_id.setText("-");
        cb_no.setEnabled(false);    //to stop the subtraction of final_price after one click
        }catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_cb_noActionPerformed

    private void dayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayKeyPressed
        char b = evt.getKeyChar();
        if (Character.isLetter(b)) {   //to let user input numeric values only
            day.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter Numeric Value", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            day.setEditable(true);
        }
    }//GEN-LAST:event_dayKeyPressed

    private void monthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {   //to let user input numeric values only
            month.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter Numeric Value", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            month.setEditable(true);
        }
    }//GEN-LAST:event_monthKeyPressed

    private void yearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyPressed
/*        char d = evt.getKeyChar();
        if (Character.isLetter(d)) {   //to let user input numeric values only
            year.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter Numeric Value", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            year.setEditable(true);
        }*/
    }//GEN-LAST:event_yearKeyPressed

    void clear(){
        //clearing all field
        cardlayout.show(cards,"customerpnl");
        u_name.setText(null);
        u_email.setText(null);
        u_phone.setText(null);
        u_location.setText(null);
        day.setText(null);
        month.setText(null);
        uberinfo.setVisible(true);
        rb_rent.setSelected(false);
        rb_uber.setSelected(false);
        cb_nearby.setSelectedIndex(0);
        u_bookbtn.setVisible(true);
        u_bookbtn.setEnabled(true);
        vehiclebtn.setVisible(false);

        cb_vehicle.setSelectedIndex(0);
        cb_time.setSelectedIndex(0);
        cb_yes.setSelected(false);
        cb_no.setSelected(false);
        cb_duration.setSelectedIndex(0);
        cb_driver.setSelectedIndex(0);
        driver_id.setText(null);
        licenseno.setText(null);
        d_phone.setText(null);
        rent_price.setText(null);
        bookedpnl.setVisible(true);
        bookbtn.setEnabled(true);
        table.setEnabled(false);
        Open.setEnabled(true);
    }
    
    private void cb_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_durationActionPerformed
          
        int money = cb_duration.getSelectedIndex();
        int v_name = cb_vehicle.getSelectedIndex();
        
        switch (v_name) {
            case 1:
                switch (money){
                    case 1:
                        rent_price.setText("3000");
                        break;
                        
                    case 2:
                        rent_price.setText("6000");
                        break;
                        
                    case 3:
                        rent_price.setText("8000");
                        break;
                        
                    case 4:
                        rent_price.setText("10000");
                        break;
                        
                    default:
                        rent_price.setText(null);
                        break;
                }
                break;
            case 2:
                switch (money){
                    case 1:
                        rent_price.setText("4000");
                        break;
                        
                    case 2:
                        rent_price.setText("7000");
                        break;
                        
                    case 3:
                        rent_price.setText("9000");
                        break;
                        
                    case 4:
                        rent_price.setText("12000");
                        break;
                        
                    default:
                        rent_price.setText(null);
                        break;
                }   break;
            case 3:
                switch (money){
                    case 1:
                        rent_price.setText("3500");
                        break;
                        
                    case 2:
                        rent_price.setText("4500");
                        break;
                        
                    case 3:
                        rent_price.setText("8800");
                        break;
                        
                    case 4:
                        rent_price.setText("11000");
                        break;
                        
                    default:
                        rent_price.setText(null);
                        break;
                }   break;
            case 0:
                rent_price.setText(null);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cb_durationActionPerformed

    private void seach_vehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seach_vehicleActionPerformed
        String vehicleSearch = (String)(cb_search.getSelectedItem());
        int count = 0;
        String found = "";

            //Searching via combobox
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int row = model.getRowCount();
            
           if(vehicleSearch.contains("Choose Service")){
               JOptionPane.showMessageDialog(rootPane, "Please Select Service");
           }else{
                for (int i = 0; i < row; i++)
                {
                String vehicle1= (String) model.getValueAt(i, 4);
                if (vehicleSearch.equals(vehicle1)){

                    found = found + "\n" +((model.getValueAt(i, 0)) );
                    count ++;
                }
                }
                if (count!= 0){
                JOptionPane.showMessageDialog(rootPane,""+count+" Customers used "+ vehicleSearch+" service." + "\n Name of the Customers are: \n" + found);
                }
           }
    }//GEN-LAST:event_seach_vehicleActionPerformed

    private void search_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_priceActionPerformed
      String date = day.getText()+"/"+month.getText()+"/"+year.getText();
      int user_input = Integer.parseInt(search_field.getText());
      LinkedList<Integer> list = new LinkedList<>();
      DefaultTableModel model =(DefaultTableModel)table.getModel();
      int row = model.getRowCount();
           
            //Selection Sort
                for(int i=0; i<row;i++){
                int value = Integer.parseInt((String)model.getValueAt(i,6));
                
                list.add(value);

                selectionSorter.sort(list); 
               
                 }
            System.out.println("Sorted Array: " +list);
           
            //Binary Search
            binarySearch bs = new binarySearch();
            int result = bs.binarySearch(list,user_input);
            if(result == -1){
                JOptionPane.showMessageDialog(rootPane,"Price not present");
                
            }else{
                for(int i=0; i<row;i++){
                    if(user_input == Integer.parseInt((String)table.getValueAt(i,6))){
                 String cName = (String)table.getValueAt(i,0);
                String cPhone = (String)table.getValueAt(i,1);
                String did = (String)table.getValueAt(i, 2);
                String location = (String)table.getValueAt(i, 3);
                String rob = (String)table.getValueAt(i, 4);
                String vehicle = (String)table.getValueAt(i, 5);
                String datee = (String)table.getValueAt(i,7);
         JOptionPane.showMessageDialog(rootPane,"Rs "+user_input+" was paid by \n"+cName+"\nCostumer Phone-"+cPhone+"\nLocation-"+location+"\nDriver Id-"+did+"\nService-"+rob+"\nVehicle-"+vehicle+"\nDate-"+datee);
         break;
                    }}
            }
      
    }//GEN-LAST:event_search_priceActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        int choice = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?", "Quit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void abouttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abouttActionPerformed
        cardlayout.show(cards,"aboutpnl");
    }//GEN-LAST:event_abouttActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        
        //selecting path
            File file = new File("src/resources/Info.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));

            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] lines = br.lines().toArray();  

            for (int i = 0; i<lines.length;i++) {   
                String line = lines[i].toString().trim();
                Object[] dataRow = line.split(","); //removing comma while populating value in table
                model.addRow(dataRow);
            }
        }catch (FileNotFoundException ex){
         Logger.getLogger(UberAndRental.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        Open.setEnabled(false);
    }//GEN-LAST:event_OpenActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try{
            FileWriter fw = new FileWriter("src/resources/Info.txt"); //to write in file
            BufferedWriter bw =new BufferedWriter(fw);

            for(int k = 0; k<table.getRowCount();k++){
                for (int l=0; l<table.getColumnCount();l++){
                    bw.write(table.getModel().getValueAt(k,l)+","); //separating each value with comma

                }
                bw.write("\n"); //writing each row in a single line
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null,"Data Saved");
        }catch(IOException e){
            JOptionPane.showMessageDialog(rootPane,"Error while saving file");
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed

        cardlayout.show(cards, "customerpnl");   //to redirect user to customer panel
        clear();
    }//GEN-LAST:event_NewActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed

    }//GEN-LAST:event_helpActionPerformed

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
        File myFile = new File("src/resources/User_Manual.pdf");
        try { //opening pdf file
          Desktop.getDesktop().open(myFile);
    }   catch (IOException ex) {
            Logger.getLogger(UberAndRental.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_manualActionPerformed

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqActionPerformed
         File myFile = new File("src/resources/faq.pdf"); 
         try { //opening pdf file
          Desktop.getDesktop().open(myFile);
        }catch(IOException ex) {
        Logger.getLogger(UberAndRental.class.getName()).log(Level.SEVERE, null, ex);
    }
  
    }//GEN-LAST:event_faqActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        //to delete the selected row
        DefaultTableModel model =(DefaultTableModel)table.getModel();
        try{
        int S_row = table.getSelectedRow();
        model.removeRow(S_row);
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null,ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UberAndRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UberAndRental().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Customer;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Save;
    private javax.swing.JPanel aboutpnl;
    private javax.swing.JMenuItem aboutt;
    private javax.swing.JMenu abt;
    private javax.swing.JPanel adminpnl;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton bookbtn;
    private javax.swing.JPanel bookedpnl;
    private javax.swing.JPanel cards;
    private javax.swing.JComboBox<String> cb_driver;
    private javax.swing.JComboBox<String> cb_duration;
    private javax.swing.JComboBox<String> cb_nearby;
    private javax.swing.JRadioButton cb_no;
    private javax.swing.JComboBox<String> cb_search;
    private javax.swing.JComboBox<String> cb_time;
    private javax.swing.JComboBox<String> cb_vehicle;
    private javax.swing.JRadioButton cb_yes;
    private javax.swing.JLabel checkbox_driver;
    private javax.swing.JTextField code;
    private javax.swing.JLabel codelbl;
    private javax.swing.JPanel customerpnl;
    private javax.swing.JLabel d_phone;
    private javax.swing.JLabel d_phonelbl;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel datelbl1;
    private javax.swing.JTextField day;
    private javax.swing.JButton delete;
    private javax.swing.JLabel driver_id;
    private javax.swing.JLabel driver_idlbl;
    private javax.swing.JLabel driverlbl;
    private javax.swing.JLabel durationlbl;
    private javax.swing.JMenuItem faq;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel licenselbl;
    private javax.swing.JLabel licenseno;
    private javax.swing.JButton loginbtn;
    private javax.swing.JMenuItem manual;
    private javax.swing.JTextField month;
    private javax.swing.JLabel nearbylbl;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel price_note;
    private javax.swing.JLabel pricelbl;
    private javax.swing.JRadioButton rb_rent;
    private javax.swing.JRadioButton rb_uber;
    private javax.swing.JPanel rent_driverpnl;
    private javax.swing.JLabel rent_infolbl;
    private javax.swing.JLabel rent_price;
    private javax.swing.JButton seach_vehicle;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton search_price;
    private javax.swing.JLabel search_ser;
    private javax.swing.JLabel searchprice;
    public javax.swing.JTable table;
    private javax.swing.JLabel timelbl;
    private javax.swing.JButton u_bookbtn;
    private javax.swing.JTextField u_email;
    private javax.swing.JLabel u_emaillbl;
    private javax.swing.JTextField u_location;
    private javax.swing.JLabel u_locationlbl;
    private javax.swing.JTextField u_name;
    private javax.swing.JLabel u_namelbl;
    private javax.swing.JTextField u_phone;
    private javax.swing.JLabel u_phonelbl;
    private javax.swing.JLabel uber_d_id;
    private javax.swing.JLabel uber_d_idlbl;
    private javax.swing.JLabel uber_d_licno;
    private javax.swing.JLabel uber_d_licnolbl;
    private javax.swing.JLabel uber_d_phone;
    private javax.swing.JLabel uber_d_phonelbl;
    private javax.swing.JLabel uber_price;
    private javax.swing.JLabel uber_pricelbl;
    private javax.swing.JPanel uberinfo;
    private javax.swing.JButton vehiclebtn;
    private javax.swing.JPanel vehiclepnl;
    private javax.swing.JLabel vehicleslbl;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
