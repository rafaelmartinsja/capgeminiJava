/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author rafae
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListSubTitle = new javax.swing.JLabel();
        jPanelTooBar = new javax.swing.JPanel();
        jLabelTooBarTitle = new javax.swing.JLabel();
        jLabelTooBarSubTitle = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectsTitle = new javax.swing.JLabel();
        jLabelProjectsAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTitle = new javax.swing.JLabel();
        jLabelTasksAdd = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPaneProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        jLabelEmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 153, 51));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("Nenhuma Tarefa por aqui :D");

        jLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubTitle.setText("Clique no bot??o + para adicionar uma nova tarefa!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEmptyList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListSubTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabelEmptyListIcon)
                .addGap(32, 32, 32)
                .addComponent(jLabelEmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEmptyList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyListSubTitle)
                .addGap(276, 276, 276))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(654, 614));

        jPanelTooBar.setBackground(new java.awt.Color(0, 153, 102));

        jLabelTooBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTooBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTooBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelTooBarTitle.setText(" Todo App");

        jLabelTooBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTooBarSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTooBarSubTitle.setText("Anote tudo n??o esque??a nada!");

        javax.swing.GroupLayout jPanelTooBarLayout = new javax.swing.GroupLayout(jPanelTooBar);
        jPanelTooBar.setLayout(jPanelTooBarLayout);
        jPanelTooBarLayout.setHorizontalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTooBarLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTooBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jLabelTooBarSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(323, 323, 323))
        );
        jPanelTooBarLayout.setVerticalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTooBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTooBarSubTitle)
                .addGap(15, 15, 15))
        );

        jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));

        jLabelProjectsTitle.setBackground(new java.awt.Color(0, 153, 102));
        jLabelProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectsTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelProjectsTitle.setText("Projetos");

        jLabelProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelProjectsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabelProjectsAdd)
                .addGap(18, 18, 18))
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProjectsAdd)
                    .addComponent(jLabelProjectsTitle))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTasksTitle.setBackground(new java.awt.Color(0, 153, 102));
        jLabelTasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTasksTitle.setText("Tarefas");

        jLabelTasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelTasksAdd.setAutoscrolls(true);

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelTasksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTasksAdd)
                .addGap(20, 20, 20))
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTasksAdd)
                    .addComponent(jLabelTasksTitle))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelProjectList.setBackground(new java.awt.Color(255, 255, 255));

        jListProjects.setBackground(new java.awt.Color(255, 255, 255));
        jListProjects.setBorder(null);
        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(51, 51, 51));
        jListProjects.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setToolTipText("");
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 51));
        jListProjects.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPaneProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTableTasks.setBackground(new java.awt.Color(255, 255, 255));
        jTableTasks.setForeground(new java.awt.Color(0, 153, 0));
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descricao", "Prazo", "Tafefa Conclu??da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(0, 102, 102));
        jTableTasks.setSelectionBackground(new java.awt.Color(0, 153, 0));
        jScrollPaneTasks.setViewportView(jTableTasks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTooBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTasks)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTooBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTasks))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectAddMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handing code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubTitle;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JLabel jLabelProjectsAdd;
    private javax.swing.JLabel jLabelProjectsTitle;
    private javax.swing.JLabel jLabelTasksAdd;
    private javax.swing.JLabel jLabelTasksTitle;
    private javax.swing.JLabel jLabelTooBarSubTitle;
    private javax.swing.JLabel jLabelTooBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelTooBar;
    private javax.swing.JScrollPane jScrollPaneProjects;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTask() {
        
        //Customizando o header da table de tarefas.
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));;
        
        //Criando um sort autom??tico para as colunas da table
        jTableTasks.setAutoCreateRowSorter(true);
    }
}
