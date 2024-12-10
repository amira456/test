package amira;

import javax.swing.*;
import java.awt.*;

public class test extends JFrame {
    JPanel p=new JPanel();
    JPanel centre=new JPanel();
    JPanel sud=new JPanel();
    JPanel est=new JPanel();
    JPanel north=new JPanel();
    JPanel sud1=new JPanel();
    JLabel nom=new JLabel("nom");
    JLabel prenom=new JLabel("prenom");
    JLabel adress=new JLabel("address");
    JTextField nom1=new JTextField();
    JTextField prenom1=new JTextField();
    JTextField centre1=new JTextField();
    JCheckBox tennisCheckBox = new JCheckBox("tennis");
    JCheckBox squashCheckBox = new JCheckBox("squash");
    JCheckBox natationCheckBox = new JCheckBox("natation");
    JCheckBox athletismeCheckBox = new JCheckBox("athletisme");
    JCheckBox randonneeCheckBox = new JCheckBox("randonnée");
    JCheckBox footCheckBox = new JCheckBox("foot");
    JCheckBox basketCheckBox = new JCheckBox("basket");
    JCheckBox volleyCheckBox = new JCheckBox("volley");
    JCheckBox pelanqueCheckBox = new JCheckBox("pelanque");
    JRadioButton homme= new JRadioButton("homme");
    JLabel sexe= new JLabel("sexe");
    JRadioButton femme = new JRadioButton("femme");
    JButton ok=new JButton("OK");
    JButton annuler=new JButton("ANNULER");



    public test(){
        setTitle("test");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        p.setLayout(new BorderLayout());
        add(p);
        p.add(centre,BorderLayout.CENTER);
        p.add(sud,BorderLayout.SOUTH);
        p.add(est,BorderLayout.EAST);

        centre.setLayout(new BorderLayout());

        centre.add(centre1,BorderLayout.CENTER);
        centre.add(sud1,BorderLayout.SOUTH);
        centre.add(north,BorderLayout.NORTH);

        north.setLayout(new GridLayout(6,1));

        north.add(nom);
        north.add(nom1);
        north.add(prenom);
        north.add(prenom1);
        north.add(adress);

        est.setLayout(new GridLayout(9,1));

        est.add(tennisCheckBox);
        est.add(squashCheckBox);
        est.add(natationCheckBox);
        est.add(athletismeCheckBox);
        est.add(randonneeCheckBox);
        est.add(footCheckBox);
        est.add(basketCheckBox);
        est.add(volleyCheckBox);
        est.add(pelanqueCheckBox);

        sud1.setLayout(new FlowLayout());

        sud1.add(sexe);
        sud1.add(homme);
        sud1.add(femme);

        sud.setLayout(new FlowLayout());
        sud.add(ok);
        sud.add(annuler);




    }
    public static void main(String[] args) {
        new test();
    }
}