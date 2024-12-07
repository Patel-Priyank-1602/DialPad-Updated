import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class Dialpad {
    
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setTitle("Dial Pad");
            frame.setSize(330, 580);
    
            Font f = new Font("Arial", Font.BOLD, 30);
            Font f1 = new Font("Arial", Font.BOLD, 20);
            JTextField text = new JTextField();
            text.setBounds(120, 20, 170, 65);
            text.setEditable(false);
            text.setFont(f);
    
            String[] countries = {"+61", "+1", "+86", "+33" , "+49", "+91", "+62", "+81" , "+64", "+7", "+966", "+65", "+27", "+971", "+44"};
            JComboBox<String> comboBox = new JComboBox<>(countries);
            comboBox.setBounds(30,20,80,65);
            comboBox.setFont(f1);
            frame.add(comboBox);
    
            StringBuilder numtext = new StringBuilder();
    
            JButton b9 = new JButton("9");
            b9.setBounds(30, 100, 80, 80);
            b9.setFont(f);
            JButton b8 = new JButton("8");
            b8.setBounds(120, 100, 80, 80);
            b8.setFont(f);
            JButton b7 = new JButton("7");
            b7.setBounds(210, 100, 80, 80);
            b7.setFont(f);
            JButton b6 = new JButton("6");
            b6.setBounds(30, 190, 80, 80);
            b6.setFont(f);
            JButton b5 = new JButton("5");
            b5.setBounds(120, 190, 80, 80);
            b5.setFont(f);
            JButton b4 = new JButton("4");
            b4.setBounds(210, 190, 80, 80);
            b4.setFont(f);
            JButton b3 = new JButton("3");
            b3.setBounds(30, 280, 80, 80);
            b3.setFont(f);
            JButton b2 = new JButton("2");
            b2.setBounds(120, 280, 80, 80);
            b2.setFont(f);
            JButton b1 = new JButton("1");
            b1.setBounds(210, 280, 80, 80);
            b1.setFont(f);
            
            JButton b0 = new JButton("0");
            b0.setBounds(75, 370, 80, 80);
            b0.setFont(f);
            JButton clear = new JButton("<");
            clear.setBounds(165, 370, 80, 80);
            clear.setFont(f);
    
            JButton b11 = new JButton("Call");
            b11.setBounds(30, 460, 250, 65);
            b11.setFont(f);
    
            ActionListener actionListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        if (e.getSource() == b9) numtext.append("9");
                        if (e.getSource() == b8) numtext.append("8");
                        if (e.getSource() == b7) numtext.append("7");
                        if (e.getSource() == b6) numtext.append("6");
                        if (e.getSource() == b5) numtext.append("5");
                        if (e.getSource() == b4) numtext.append("4");
                        if (e.getSource() == b3) numtext.append("3");
                        if (e.getSource() == b2) numtext.append("2");
                        if (e.getSource() == b1) numtext.append("1");
                        if (e.getSource() == b0) numtext.append("0");
                        
                        if (e.getSource() == clear && numtext.length() > 0)
                            numtext.deleteCharAt(numtext.length() - 1);
                        text.setText(numtext.toString());
    
                    } catch (Exception ex) {
                    }
                }
            };
        
            b11.addActionListener(e -> {
                String selectedText = (String) comboBox.getSelectedItem();
                String x = Cheack(selectedText);
                if ((numtext.length() == 10)){
                    JOptionPane.showMessageDialog(frame, "Calling : " + numtext.toString() + " " + x);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please Enter a Valid Number To Call.");
                }
            });
    
            b9.addActionListener(actionListener);
            b8.addActionListener(actionListener);
            b7.addActionListener(actionListener);
            b6.addActionListener(actionListener);
            b5.addActionListener(actionListener);
            b4.addActionListener(actionListener);
            b3.addActionListener(actionListener);
            b2.addActionListener(actionListener);
            b1.addActionListener(actionListener);
            b0.addActionListener(actionListener);
            clear.addActionListener(actionListener);
    
            frame.add(text);
            frame.add(b9);
            frame.add(b8);
            frame.add(b7);
            frame.add(b6);
            frame.add(b5);
            frame.add(b4);
            frame.add(b3);
            frame.add(b2);
            frame.add(b1);
            frame.add(b0);
            frame.add(clear);
            frame.add(b11);
    
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public static String Cheack(String selectedText){
            if(selectedText.equals("+61")){
                return "Australia";
            }
            else if(selectedText.equals("+1")){
                return "Canada/USA";
            }
            else if(selectedText.equals("+86")){
                return "China";
            }
            else if(selectedText.equals("+33")){
                return "France";
            }
            else if(selectedText.equals("+49")){
                return "Germany";
            }
            else if(selectedText.equals("+91")){
                return "India";
            }
            else if(selectedText.equals("+62")){
                return "Indonesia";
            }
            else if(selectedText.equals("+81")){
                return "Japan";
            }
            else if(selectedText.equals("+64")){
                return "New Zealand";
            }
            else if(selectedText.equals("+7")){
                return "Russia";
            }
            else if(selectedText.equals("+966")){
                return "Saudi Arabia";
            }
            else if(selectedText.equals("+65")){
                return "Singapore";
            }
            else if(selectedText.equals("+27")){
                return "South Africa";
            }
            else if(selectedText.equals("+971")){
                return "UAE";
            }
            else{
                return "UK";
            }
    }
}
