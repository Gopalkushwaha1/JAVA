import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniCalculator extends JFrame implements ActionListener {

    private JTextField display;
    private String currentInput = "";       // Current number
    private String expression = "";         // Full expression to display
    private double result = 0;
    private String lastOperator = "+";
    private boolean startNewNumber = true;

    public MiniCalculator() {
        setTitle("Mini Calculator");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#f0f0f0"));

        // Display field
        display = new JTextField("0");
        display.setBounds(30, 30, 320, 50);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBounds(30, 100, 320, 300);
        panel.setBackground(Color.decode("#f0f0f0"));
        add(panel);

        // Button labels
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "Reset", "=", "+"
        };

        // Add buttons with hover and click effects
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Verdana", Font.PLAIN, 18));
            button.setBackground(Color.decode("#dfe6e9"));
            button.setForeground(Color.BLACK);
            button.setFocusPainted(false);
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            button.addActionListener(this);

            // Hover effects
            button.addMouseListener(new MouseAdapter() {
                Font originalFont = button.getFont();
                Color originalColor = button.getBackground();

                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(Color.decode("#a5d6a7"));
                    button.setFont(originalFont.deriveFont(Font.BOLD));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(originalColor);
                    button.setFont(originalFont);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    button.setBackground(Color.decode("#66bb6a"));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    button.setBackground(Color.decode("#a5d6a7"));
                }
            });

            panel.add(button);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            if (startNewNumber) {
                currentInput = command;
                startNewNumber = false;
            } else {
                currentInput += command;
            }
            expression += command;
            display.setText(expression);
        }

        else if (command.matches("[+\\-*/]")) {
            if (!currentInput.isEmpty()) {
                calculate(Double.parseDouble(currentInput));
                lastOperator = command;
                expression += " " + command + " ";
                display.setText(expression);
                startNewNumber = true;
            }
        }

        else if (command.equals("=")) {
            if (!currentInput.isEmpty()) {
                calculate(Double.parseDouble(currentInput));
                expression += " = " + result;
                display.setText(expression);
                // Reset for next calculation
                currentInput = String.valueOf(result);
                expression = currentInput;
                startNewNumber = true;
                lastOperator = "+";
            }
        }

        else if (command.equals("Reset")) {
            currentInput = "";
            expression = "";
            lastOperator = "+";
            result = 0;
            display.setText("0");
            startNewNumber = true;
        }
    }

    private void calculate(double num) {
        switch (lastOperator) {
            case "+": result += num; break;
            case "-": result -= num; break;
            case "*": result *= num; break;
            case "/":
                if (num == 0) {
                    display.setText("Cannot divide by 0");
                    expression = "";
                    currentInput = "";
                    result = 0;
                    startNewNumber = true;
                    return;
                }
                result /= num;
                break;
        }
    }

    public static void main(String[] args) {
        new MiniCalculator();
    }
}
