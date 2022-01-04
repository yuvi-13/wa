try{

             Class.forName("org.apache.derby.jdbc.ClientDriver");

             Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/register","surraj","surraj");

             PreparedStatement ps=con.prepareStatement("insert into Table1 values(?,?)");

             ps.setString(1,jTextField1.getText());

             ps.setString(2,jTextField2.getText());

             ps.executeUpdate();

             JOptionPane.showMessageDialog(null,"Saved");

         }

         catch(ClassNotFoundException ex){

             Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null,ex);

         }

         catch(SQLException ex){

             Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null,ex);

         }

    }
    
