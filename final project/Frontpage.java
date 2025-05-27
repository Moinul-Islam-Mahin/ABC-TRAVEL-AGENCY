import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
 
public class Frontpage extends JFrame implements MouseListener, ActionListener {
    ImageIcon img;
    JLabel userLabel, passLabel, imgLabel, cLabel, r4, r5, r6, r7;
    JTextField userTF, mobileTF;
    JButton loginBtn, exitBtn, excepBtn, costBtn, resetBtn, historyBtn, priceBtn, confirmBtn;
    JRadioButton r1, r2, r3;
    ButtonGroup bg1;
    JComboBox<String> combo, combo1, comboPerson;
    JPanel panel;
 
    Map<String, Integer> packagePrices;
 
    public Frontpage() {
        super("ABC TRAVEL AGENCY");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
 
        userLabel = new JLabel("Your Name : ");
        userLabel.setBounds(45, 190, 159, 20);
        panel.add(userLabel);
 
        userTF = new JTextField();
        userTF.setBounds(45, 220, 170, 30);
        panel.add(userTF);
 
        cLabel = new JLabel("Mobile  : ");
        cLabel.setBounds(45, 260, 159, 30);
        panel.add(cLabel);
 
        mobileTF = new JTextField();
        mobileTF.setBounds(45, 290, 170, 30);
        panel.add(mobileTF);
 
        loginBtn = new JButton("Login");
        loginBtn.setBounds(520, 55, 80, 30);
        loginBtn.addMouseListener(this);
        loginBtn.addActionListener(this);
        loginBtn.setBackground(Color.GREEN);
        panel.add(loginBtn);
 
        confirmBtn = new JButton("Confirm Booking");
        confirmBtn.setBounds(340, 335, 140, 30);
        confirmBtn.addMouseListener(this);
        confirmBtn.addActionListener(this);
        confirmBtn.setBackground(Color.GREEN);
        panel.add(confirmBtn);
 
        priceBtn = new JButton("Our Packages");
        priceBtn.setBounds(270, 120, 130, 30);
        priceBtn.addMouseListener(this);
        priceBtn.addActionListener(this);
        priceBtn.setBackground(Color.ORANGE);
        panel.add(priceBtn);
 
        excepBtn = new JButton("Don't have an account? Sign up");
        excepBtn.setBounds(480, 100, 280, 30);
        excepBtn.setBackground(Color.CYAN);
        panel.add(excepBtn);
 
        exitBtn = new JButton("Exit");
        exitBtn.setBounds(616, 55, 80, 30);
        exitBtn.setBackground(Color.RED);
        exitBtn.addActionListener(this);
        exitBtn.addMouseListener(this);
        panel.add(exitBtn);
 
        r1 = new JRadioButton("BKASH");
        r1.setBounds(665, 220, 100, 20);
        panel.add(r1);
 
        r2 = new JRadioButton("NAGAD");
        r2.setBounds(665, 250, 100, 20);
        panel.add(r2);
 
        r3 = new JRadioButton("VISA/DEBIT");
        r3.setBounds(665, 280, 100, 20);
        panel.add(r3);
 
        r4 = new JLabel("Payment Method");
        r4.setBounds(665, 190, 140, 20);
        panel.add(r4);
 
        bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
 
        r5 = new JLabel("Select Destination");
        r5.setBounds(250, 190, 150, 20);
        panel.add(r5);
 
        String[] packages = {"COX'S BAZAR", "SAJEK VALLEY", "JAFLONG", "BANDARBAN", "SUNDARBAN", "KUAKATA", "SAINT MARTIN", "RANGAMATI", "SYLHET", "PANCHAGARH"};
        combo = new JComboBox<>(packages);
        combo.setBounds(250, 220, 130, 30);
        panel.add(combo);
 
        r6 = new JLabel("Duration");
        r6.setBounds(405, 190, 150, 20);
        panel.add(r6);
 
        String[] durations = {"One Day Trip", "2 Days 1 Night", "3 Days 2 Nights", "4 Days 3 Nights", "5 Days 4 Nights"};
        combo1 = new JComboBox<>(durations);
        combo1.setBounds(405, 220, 115, 30);
        panel.add(combo1);
 
        r7 = new JLabel("Person");
        r7.setBounds(540, 190, 105, 20);
        panel.add(r7);
 
        String[] persons = {"1", "2", "3", "4", "5"};
        comboPerson = new JComboBox<>(persons);
        comboPerson.setBounds(540, 220, 105, 30);
        panel.add(comboPerson);
 
        costBtn = new JButton("Total Cost");
        costBtn.setBounds(250, 285, 120, 30);
        costBtn.addActionListener(this);
        panel.add(costBtn);
 
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(410, 285, 80, 30);
        panel.add(resetBtn);
 
        historyBtn = new JButton("History");
        historyBtn.setBounds(550, 285, 75, 30);
        historyBtn.addActionListener(this);
        panel.add(historyBtn);
 
        img = new ImageIcon("E:\\java\\trialproject\\IMG_20221214_162742.jpg");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 160, 800, 600);
        panel.add(imgLabel);
 
        img = new ImageIcon("E:\\java\\trialproject\\n.png");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(30, 10, 170, 134);
        panel.add(imgLabel);
 
        Color bgcolor = new Color(135, 226, 235);
        panel.setBackground(bgcolor);
 
        packagePrices = new HashMap<>();
        packagePrices.put("COX'S BAZAR", 300);
        packagePrices.put("SAJEK VALLEY", 250);
        packagePrices.put("JAFLONG", 200);
        packagePrices.put("BANDARBAN", 280);
        packagePrices.put("SUNDARBAN", 350);
        packagePrices.put("KUAKATA", 260);
        packagePrices.put("SAINT MARTIN", 320);
        packagePrices.put("RANGAMATI", 240);
        packagePrices.put("SYLHET", 210);
        packagePrices.put("PANCHAGARH", 190);
 
        this.add(panel);
    }
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
 
        if (command.equals("Login")) {
            JOptionPane.showMessageDialog(this, "Welcome to our webpage");
 
        }
		else if(exitBtn.getText().equals(command))
        {
            System.exit(0);
        }
		else if (ae.getSource() == costBtn) {
            String selectedPackage = (String) combo.getSelectedItem();
            int durationMultiplier = combo1.getSelectedIndex() + 1;
            int persons = comboPerson.getSelectedIndex() + 1;
            int price = packagePrices.getOrDefault(selectedPackage, 1);
            int totalCost = price * durationMultiplier * persons;
 
            JOptionPane.showMessageDialog(this, "Total Cost: " + totalCost+"$");
 
        } else if (ae.getSource() == confirmBtn) {
			String selectedPackage = (String) combo.getSelectedItem();
            int durationMultiplier = combo1.getSelectedIndex() + 1;
            int persons = comboPerson.getSelectedIndex() + 1;
            int price = packagePrices.getOrDefault(selectedPackage, 1);
            int totalCost = price * durationMultiplier * persons;
            try {
                FileWriter writer = new FileWriter("bookingData.txt", true);
                writer.write("Name: " + userTF.getText() + ", Mobile: " + mobileTF.getText()
                        + ", Package: " + combo.getSelectedItem()
                        + ", Duration: " + combo1.getSelectedItem()
                        + ", Persons: " + comboPerson.getSelectedItem() + "\n" + "Total Cost : " + totalCost+"$"+"\n" );
                writer.close();
                JOptionPane.showMessageDialog(this, "Booking Confirmed!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == historyBtn) {
            try {
                File file = new File("bookingData.txt");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(this, "No booking history found.");
                    return;
                }
 
                Scanner scanner = new Scanner(file);
                StringBuilder history = new StringBuilder();
                while (scanner.hasNextLine()) {
                    history.append(scanner.nextLine()).append("\n");
                }
                scanner.close();
 
                JTextArea textArea = new JTextArea(history.toString());
                textArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(500, 300));
                JOptionPane.showMessageDialog(this, scrollPane, "Booking History", JOptionPane.INFORMATION_MESSAGE);
 
            } catch (IOException e) {
                e.printStackTrace();
            }
 
        } else if (ae.getSource() == priceBtn) {
            StringBuilder packagesList = new StringBuilder("Available Packages and Prices:\n");
            for (Map.Entry<String, Integer> entry : packagePrices.entrySet()) {
                packagesList.append(entry.getKey()).append(": $").append(entry.getValue()).append("\n");
            }
            JOptionPane.showMessageDialog(this, packagesList.toString(), "Our Packages", JOptionPane.INFORMATION_MESSAGE);
        }
    }
 
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) 
	{
	if(me.getSource() == loginBtn)
        {
            loginBtn.setBackground(Color.BLUE);
            loginBtn.setForeground(Color.WHITE);
        }
        else if(me.getSource() == exitBtn)
        {
            exitBtn.setBackground(Color.BLUE);
            exitBtn.setForeground(Color.WHITE);
        }
		 else if(me.getSource() == confirmBtn)
        {
            confirmBtn.setBackground(Color.BLUE);
            confirmBtn.setForeground(Color.WHITE);
        }	
	}
    public void mouseExited(MouseEvent me) 
	{
	 if(me.getSource() == loginBtn)
        {
            loginBtn.setBackground(Color.WHITE);
            loginBtn.setForeground(Color.BLACK);
        }
        else if(me.getSource() == exitBtn)
        {
            exitBtn.setBackground(Color.RED);
            exitBtn.setForeground(Color.GREEN);
        }
		else if(me.getSource() == confirmBtn)
        {
            confirmBtn.setBackground(Color.WHITE);
            confirmBtn.setForeground(Color.BLACK);
        }	
		
	}

}
