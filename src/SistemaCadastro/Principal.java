package SistemaCadastro;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Principal extends javax.swing.JFrame {
    ArrayList<Setor> ListaSet;
    ArrayList<Colaborador> ListaColabr;
    String modoSet;
    String modoColabr;
    
    public void LoadTableSet(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Serial","Nome"},0);
            
        for(int i=0;i<ListaSet.size();i++){
            Object linha[] = new Object[]{ListaSet.get(i).getCodigo(),
                                          ListaSet.get(i).getNome()};
            modelo.addRow(linha);
        }
        
        tbl_set_setor.setModel(modelo);
        tbl_set_setor.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_set_setor.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        LoadCBSet();
    }
    
    public void LoadTableColabr(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Matrícula","Nome","Setor"},0);
            
        for(int i=0;i<ListaColabr.size();i++){
            Object linha[] = new Object[]{ListaColabr.get(i).getMatricula(),
                                          ListaColabr.get(i).getNome(),
                                          ListaColabr.get(i).getSetor().getNome()};
            modelo.addRow(linha);
        }
        
        tbl_colabr_colabr.setModel(modelo);
        tbl_colabr_colabr.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_colabr_colabr.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_colabr_colabr.getColumnModel().getColumn(2).setPreferredWidth(150);
    }
    
    public void LoadCBSet(){
        cb_colabr_setor.removeAllItems();
        cb_colabr_setor.addItem("Selecione");
        for(int i=0;i<ListaSet.size();i++){
            cb_colabr_setor.addItem(ListaSet.get(i).getNome());
        }
    }
    
    /**
     * Criar novo formulário Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaSet = new ArrayList();
        ListaColabr = new ArrayList();
        modoSet = "Navegar";
        modoColabr = "Navegar";
        ManipulaInterfaceSet();
        ManipulaInterfaceColabr();
    }
    
    public void ManipulaInterfaceSet(){
        switch(modoSet){
            case "Navegar":
                btn_set_salvar.setEnabled(false);
                btn_set_cancelar.setEnabled(false);
                c_set_serial.setEnabled(false);
                c_set_nome.setEnabled(false);
                btn_set_novo.setEnabled(true);
                btn_set_editar.setEnabled(false);
                btn_set_excluir.setEnabled(false);
                break;
            
            case "Novo":
                btn_set_salvar.setEnabled(true);
                btn_set_cancelar.setEnabled(true);
                c_set_serial.setEnabled(true);
                c_set_nome.setEnabled(true);
                btn_set_novo.setEnabled(false);
                btn_set_editar.setEnabled(false);
                btn_set_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_set_salvar.setEnabled(true);
                btn_set_cancelar.setEnabled(true);
                c_set_serial.setEnabled(true);
                c_set_nome.setEnabled(true);
                btn_set_novo.setEnabled(true);
                btn_set_editar.setEnabled(false);
                btn_set_excluir.setEnabled(false);
                break;
                
            case "Excluir":
                btn_set_salvar.setEnabled(false);
                btn_set_cancelar.setEnabled(false);
                c_set_serial.setEnabled(false);
                c_set_nome.setEnabled(false);
                btn_set_novo.setEnabled(true);
                btn_set_editar.setEnabled(false);
                btn_set_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_set_salvar.setEnabled(false);
                btn_set_cancelar.setEnabled(false);
                c_set_serial.setEnabled(false);
                c_set_nome.setEnabled(false);
                btn_set_novo.setEnabled(true);
                btn_set_editar.setEnabled(true);
                btn_set_excluir.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }
    
    
    public void ManipulaInterfaceColabr(){
        switch(modoColabr){
            case "Navegar":
                btn_colabr_salvar.setEnabled(false);
                btn_colabr_cancelar.setEnabled(false);
                c_colabr_mat.setEnabled(false);
                c_colabr_nome.setEnabled(false);
                btn_colabr_novo.setEnabled(true);
                btn_colabr_editar.setEnabled(false);
                btn_colabr_excluir.setEnabled(false);
                cb_colabr_setor.setEnabled(false);
                break;
            
            case "Novo":
                btn_colabr_salvar.setEnabled(true);
                btn_colabr_cancelar.setEnabled(true);
                c_colabr_mat.setEnabled(true);
                c_colabr_nome.setEnabled(true);
                cb_colabr_setor.setEnabled(true);
                btn_colabr_novo.setEnabled(false);
                btn_colabr_editar.setEnabled(false);
                btn_colabr_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_colabr_salvar.setEnabled(true);
                btn_colabr_cancelar.setEnabled(true);
                c_colabr_mat.setEnabled(true);
                c_colabr_nome.setEnabled(true);
                cb_colabr_setor.setEnabled(true);
                btn_colabr_novo.setEnabled(true);
                btn_colabr_editar.setEnabled(false);
                btn_colabr_excluir.setEnabled(false);
                break;
                
            case "Excluir":
                btn_colabr_salvar.setEnabled(false);
                btn_colabr_cancelar.setEnabled(false);
                c_colabr_mat.setEnabled(false);
                c_colabr_nome.setEnabled(false);
                cb_colabr_setor.setEnabled(false);
                btn_colabr_novo.setEnabled(true);
                btn_colabr_editar.setEnabled(false);
                btn_colabr_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_colabr_salvar.setEnabled(false);
                btn_colabr_cancelar.setEnabled(false);
                c_colabr_mat.setEnabled(false);
                c_colabr_nome.setEnabled(false);
                cb_colabr_setor.setEnabled(false);
                btn_colabr_novo.setEnabled(true);
                btn_colabr_editar.setEnabled(true);
                btn_colabr_excluir.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }
    
    /**
     * Este método é chamado de dentro do construtor para iniciar o formulário.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_set_setor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_set_serial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_set_nome = new javax.swing.JTextField();
        btn_set_salvar = new javax.swing.JButton();
        btn_set_cancelar = new javax.swing.JButton();
        btn_set_novo = new javax.swing.JButton();
        btn_set_editar = new javax.swing.JButton();
        btn_set_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_colabr_editar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_colabr_colabr = new javax.swing.JTable();
        btn_colabr_excluir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        c_colabr_mat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_colabr_nome = new javax.swing.JTextField();
        btn_colabr_salvar = new javax.swing.JButton();
        btn_colabr_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_colabr_setor = new javax.swing.JComboBox();
        btn_colabr_novo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        tbl_set_setor.setForeground(new java.awt.Color(102, 102, 102));
        tbl_set_setor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_set_setor.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tbl_set_setor.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_set_setor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_set_setorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_set_setor);
        if (tbl_set_setor.getColumnModel().getColumnCount() > 0) {
            tbl_set_setor.getColumnModel().getColumn(0).setResizable(false);
            tbl_set_setor.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_set_setor.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento"));
        jPanel3.setForeground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(" Serial:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 15, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 4, 0, 0);
        jPanel3.add(c_set_serial, gridBagConstraints);

        jLabel2.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 21, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 233;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 15);
        jPanel3.add(c_set_nome, gridBagConstraints);

        btn_set_salvar.setText("Salvar");
        btn_set_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_set_salvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 15, 0, 0);
        jPanel3.add(btn_set_salvar, gridBagConstraints);

        btn_set_cancelar.setText("Cancelar");
        btn_set_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_set_cancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel3.add(btn_set_cancelar, gridBagConstraints);

        btn_set_novo.setText("Novo");
        btn_set_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_set_novoActionPerformed(evt);
            }
        });

        btn_set_editar.setText("Editar");
        btn_set_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_set_editarActionPerformed(evt);
            }
        });

        btn_set_excluir.setText("Excluir");
        btn_set_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_set_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_set_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_set_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_set_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_set_novo)
                    .addComponent(btn_set_editar)
                    .addComponent(btn_set_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Setor", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        btn_colabr_editar.setText("Editar");
        btn_colabr_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colabr_editarActionPerformed(evt);
            }
        });

        tbl_colabr_colabr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Setor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_colabr_colabr.setGridColor(new java.awt.Color(255, 255, 0));
        tbl_colabr_colabr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_colabr_colabrMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_colabr_colabr);
        if (tbl_colabr_colabr.getColumnModel().getColumnCount() > 0) {
            tbl_colabr_colabr.getColumnModel().getColumn(0).setResizable(false);
            tbl_colabr_colabr.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_colabr_colabr.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_colabr_colabr.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btn_colabr_excluir.setText("Excluir");
        btn_colabr_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colabr_excluirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Funcionário"));
        jPanel4.setForeground(new java.awt.Color(204, 204, 0));

        jLabel3.setText("Matrícula:");

        jLabel4.setText("Nome:");

        btn_colabr_salvar.setText("Salvar");
        btn_colabr_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colabr_salvarActionPerformed(evt);
            }
        });

        btn_colabr_cancelar.setText("Cancelar");
        btn_colabr_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colabr_cancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Setor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btn_colabr_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_colabr_cancelar)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_colabr_nome)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(c_colabr_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cb_colabr_setor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_colabr_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_colabr_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_colabr_setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_colabr_salvar)
                    .addComponent(btn_colabr_cancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_colabr_novo.setText("Novo");
        btn_colabr_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colabr_novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_colabr_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_colabr_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_colabr_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_colabr_novo)
                    .addComponent(btn_colabr_editar)
                    .addComponent(btn_colabr_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Colaborador", jPanel2);

        jLabel6.setText("        Luan Ribeiro de Menezes");

        jToolBar1.setRollover(true);

        jToolBar2.setRollover(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_set_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_novoActionPerformed
        c_set_serial.setText("");
        c_set_nome.setText("");
        
        modoSet = "Novo";
        ManipulaInterfaceSet();
    }//GEN-LAST:event_btn_set_novoActionPerformed

    private void btn_set_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_cancelarActionPerformed
        c_set_serial.setText("");
        c_set_nome.setText("");
        modoSet = "Navegar";
        ManipulaInterfaceSet();
    }//GEN-LAST:event_btn_set_cancelarActionPerformed

    private void btn_set_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_salvarActionPerformed
        int cod = Integer.parseInt(c_set_serial.getText());
        if(modoSet.equals("Novo")){  
            Setor D = new Setor(cod, c_set_nome.getText());
            ListaSet.add(D);
        }else if(modoSet.equals("Editar")){
            int index = tbl_set_setor.getSelectedRow();
            ListaSet.get(index).setCodigo(cod);
            ListaSet.get(index).setNome(c_set_nome.getText());
        }
        
        LoadTableSet();
        modoSet = "Navegar";
        ManipulaInterfaceSet();
        c_set_serial.setText("");
        c_set_nome.setText("");
    }//GEN-LAST:event_btn_set_salvarActionPerformed

    private void tbl_set_setorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_set_setorMouseClicked
        int index = tbl_set_setor.getSelectedRow();
        if(index>=0 && index<ListaSet.size()){
            Setor D = ListaSet.get(index);
            c_set_serial.setText(String.valueOf(D.getCodigo()));
            c_set_nome.setText(D.getNome());
            modoSet = "Selecao";
            ManipulaInterfaceSet();
        }
    }//GEN-LAST:event_tbl_set_setorMouseClicked

    private void btn_set_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_editarActionPerformed
        modoSet = "Editar";
        ManipulaInterfaceSet();
    }//GEN-LAST:event_btn_set_editarActionPerformed

    private void btn_set_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_excluirActionPerformed
        int index = tbl_set_setor.getSelectedRow();
        if(index>=0 && index<ListaSet.size()){
            ListaSet.remove(index);
        }
        LoadTableSet();
        modoSet = "Navegar";
        ManipulaInterfaceSet();
    }//GEN-LAST:event_btn_set_excluirActionPerformed

    private void btn_colabr_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colabr_editarActionPerformed
        modoColabr = "Editar";
        ManipulaInterfaceColabr();
    }//GEN-LAST:event_btn_colabr_editarActionPerformed

    private void tbl_colabr_colabrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_colabr_colabrMouseClicked

    }//GEN-LAST:event_tbl_colabr_colabrMouseClicked

    private void btn_colabr_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colabr_excluirActionPerformed
        modoColabr = "Navegar";
        ManipulaInterfaceColabr();
    }//GEN-LAST:event_btn_colabr_excluirActionPerformed

    private void btn_colabr_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colabr_salvarActionPerformed
        int index = cb_colabr_setor.getSelectedIndex();
        if(index==0){
            JOptionPane.showMessageDialog(this,"Você deve selecionar um departamento");
        }else{
            Colaborador F = new Colaborador();
            F.setMatricula(Integer.parseInt(c_colabr_mat.getText()));
            F.setNome(c_colabr_nome.getText());
            F.setSet(ListaSet.get(index-1));
            
            ListaColabr.add(F);
            ListaSet.get(index-1).addSet(F);
        }
        LoadTableColabr();
        modoColabr = "Navegar";
        ManipulaInterfaceColabr();
    }//GEN-LAST:event_btn_colabr_salvarActionPerformed

    private void btn_colabr_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colabr_cancelarActionPerformed
        modoColabr = "Navegar";
        ManipulaInterfaceColabr();
    }//GEN-LAST:event_btn_colabr_cancelarActionPerformed

    private void btn_colabr_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colabr_novoActionPerformed
        modoColabr = "Novo";
        ManipulaInterfaceColabr();
    }//GEN-LAST:event_btn_colabr_novoActionPerformed

    /**
     * @param args são argumentos da linha de comando
     */
    public static void main(String args[]) {
        /* Defina a aparência e a sensação Nimbus*/
        //<editor-fold defaultstate="collapsed" desc=" Código de configuração de aparência e sensação (opcional) ">
        /* Se o Nimbus (introduzido no Java SE 6) não estiver disponível, fique com a aparência e a aparência padrão.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Criar e exibir o form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
     
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_colabr_cancelar;
    private javax.swing.JButton btn_colabr_editar;
    private javax.swing.JButton btn_colabr_excluir;
    private javax.swing.JButton btn_colabr_novo;
    private javax.swing.JButton btn_colabr_salvar;
    private javax.swing.JButton btn_set_cancelar;
    private javax.swing.JButton btn_set_editar;
    private javax.swing.JButton btn_set_excluir;
    private javax.swing.JButton btn_set_novo;
    private javax.swing.JButton btn_set_salvar;
    private javax.swing.JTextField c_colabr_mat;
    private javax.swing.JTextField c_colabr_nome;
    private javax.swing.JTextField c_set_nome;
    private javax.swing.JTextField c_set_serial;
    private javax.swing.JComboBox cb_colabr_setor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tbl_colabr_colabr;
    private javax.swing.JTable tbl_set_setor;
    // End of variables declaration//GEN-END:variables
}



