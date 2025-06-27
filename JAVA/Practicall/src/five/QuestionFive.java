package five;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class QuestionFive extends JFrame {
    JTextField name = new JTextField(10), age = new JTextField(5), role = new JTextField(10);
    JTable table = new JTable(new DefaultTableModel(new String[]{"ID", "Name", "Age", "Role"}, 0));
    Connection conn;

    public QuestionFive() {
        setTitle("CAN Player Manager");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        JButton addBtn = new JButton("Add"), updateBtn = new JButton("Update"), delBtn = new JButton("Delete");
        top.add(new JLabel("Name")); top.add(name);
        top.add(new JLabel("Age")); top.add(age);
        top.add(new JLabel("Role")); top.add(role);
        top.add(addBtn); top.add(updateBtn); top.add(delBtn);
        add(top, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
            loadData();
        } catch (Exception e) {
            show("DB Error: " + e.getMessage());
        }

        addBtn.addActionListener(e -> executeUpdate("INSERT INTO players(name, age, role) VALUES (?, ?, ?)", false));
        updateBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) return;
            int id = (int) table.getValueAt(row, 0);
            executeUpdate("UPDATE players SET name=?, age=?, role=? WHERE id=" + id, true);
        });

        delBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) return;
            int id = (int) table.getValueAt(row, 0);
            try (PreparedStatement ps = conn.prepareStatement("DELETE FROM players WHERE id=?")) {
                ps.setInt(1, id);
                ps.executeUpdate();
                loadData();
            } catch (Exception ex) {
                show("Delete Error: " + ex.getMessage());
            }
        });

        table.getSelectionModel().addListSelectionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                name.setText(table.getValueAt(row, 1).toString());
                age.setText(table.getValueAt(row, 2).toString());
                role.setText(table.getValueAt(row, 3).toString());
            }
        });
    }

    void executeUpdate(String query, boolean isUpdate) {
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, name.getText());
            ps.setInt(2, Integer.parseInt(age.getText()));
            ps.setString(3, role.getText());
            ps.executeUpdate();
            loadData();
            name.setText(""); age.setText(""); role.setText("");
        } catch (Exception ex) {
            show((isUpdate ? "Update" : "Add") + " Error: " + ex.getMessage());
        }
    }

    void loadData() {
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM players")) {
            DefaultTableModel m = (DefaultTableModel) table.getModel();
            m.setRowCount(0);
            while (rs.next())
                m.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});
        } catch (Exception e) {
            show("Load Error: " + e.getMessage());
        }
    }

    void show(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuestionFive().setVisible(true));
    }
}