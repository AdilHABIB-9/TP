import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWTApplication extends JFrame implements ActionListener {
    private JTextField txtNom = new JTextField(5);
    private JTextField txtPrenom = new JTextField(5);
    private JTextField txtFiliere = new JTextField(5);
    private JButton btnOk = new JButton("Ajouter");
    private JButton btnQuitter = new JButton("Quitter");
    private List nomList = new List();
    private List prenomList = new List();
    private List filiereList = new List();
    public AWTApplication() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        add(new JLabel("Nom"));
        add(txtNom);
        add(new JLabel("Prenom"));
        add(txtPrenom);
        add(new JLabel("Filiere"));
        add(txtFiliere);
        add(btnOk);
        add(btnQuitter);
        add(nomList);
        add(prenomList);
        add(filiereList);
        btnOk.addActionListener(this);
        btnQuitter.addActionListener(this);
        this.setBounds(10, 10, 400, 300);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            String nom = txtNom.getText();
            String prenom = txtPrenom.getText();
            String filiere = txtFiliere.getText();
            nomList.add(nom);
            prenomList.add(prenom);
            filiereList.add(filiere);
            txtNom.setText("");
            txtPrenom.setText("");
            txtFiliere.setText("");
        }
        if (e.getSource() == btnQuitter) {
            System.exit(0);
        }
    }
}