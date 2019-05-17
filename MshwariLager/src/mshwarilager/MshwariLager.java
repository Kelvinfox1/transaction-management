
package mshwarilager;

/**
 *
 * @author kevo
 */
// CIT-227-054 /2016
//CIT-227- 0
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.awt.GridBagLayout; // arrange components Placing controls with a specified very flexible rectangular grid.
public class MshwariLager extends JFrame {
    
JLabel balanceLabel = new JLabel();
JTextField balanceTextField = new JTextField(); 
JLabel interestLabel = new JLabel();
JTextField interestTextField = new JTextField();
JLabel monthsLabel = new JLabel();
JTextField monthsTextField = new JTextField();
JLabel paymentLabel = new JLabel();
JTextField paymentTextField = new JTextField(); 
JButton computeButton = new JButton();
JButton newLoanButton = new JButton();
JButton monthsButton = new JButton();
JButton paymentButton = new JButton();
JLabel analysisLabel = new JLabel();
JTextArea analysisTextArea = new JTextArea(); 
JButton exitButton = new JButton();
Font myFont = new Font("Algerian", Font.PLAIN, 16); 
Color lightYellow = new Color(255, 255,128);
boolean computePayment;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new MshwariLager().show();
    }
  public MshwariLager()
{
// frame constructor
 
    setTitle("M-SHWARI LAGER");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

getContentPane().setLayout(new GridBagLayout());  
GridBagConstraints c;
balanceLabel.setText("Loan Balance");
balanceLabel.setFont(myFont);
c = new GridBagConstraints();
c.gridx = 0;
c.gridy = 0;
c.anchor = GridBagConstraints.WEST; 
c.insets = new Insets(10,10, 0, 0); 

getContentPane().add(balanceLabel, c);
balanceTextField.setPreferredSize(new Dimension(100, 25));
balanceTextField.setHorizontalAlignment(SwingConstants.RIGHT);
balanceTextField.setFont(myFont);
c = new GridBagConstraints(); 
c.gridx = 1;
c.gridy = 0;
c.insets = new Insets(10, 10, 0, 10); 

getContentPane().add(balanceTextField,c);
balanceTextField.addActionListener((ActionEvent e) -> 
    {
        
            balanceTextFieldActionPerformed(e);
    
    });
interestLabel.setText("Interest Rate");
interestLabel.setFont(myFont);
c = new GridBagConstraints();
c.gridx = 0;
c.gridy = 1;
c.anchor = GridBagConstraints.WEST; 
c.insets = new Insets(10,10, 0, 0);

getContentPane().add(interestLabel, c);
interestTextField.setPreferredSize(new Dimension(100, 25));
interestTextField.setHorizontalAlignment(SwingConstants.RIGHT);
interestTextField.setFont(myFont);
c = new GridBagConstraints();
c.gridx = 1;
c.gridy = 1;
c.insets = new Insets(10, 10, 0, 10);

getContentPane().add(interestTextField,c); 
interestTextField.addActionListener((ActionEvent e) -> {
    interestTextFieldActionPerformed(e);
    });
monthsLabel.setText("Number of Payments");
monthsLabel.setFont(myFont);
c = new GridBagConstraints();
c.gridx = 0;
c.gridy = 2;
c.anchor = GridBagConstraints.WEST;
c.insets = new Insets(10,10, 0, 0); 

getContentPane().add(monthsLabel, c);
monthsTextField.setPreferredSize(new Dimension(100, 25));
monthsTextField.setHorizontalAlignment(SwingConstants.RIGHT);
monthsTextField.setFont(myFont);
c = new GridBagConstraints(); c.gridx = 1;
c.gridy = 2;
c.insets = new Insets(10, 10, 0, 10);

getContentPane().add(monthsTextField,c); 
monthsTextField.addActionListener((ActionEvent e) -> {
    monthsTextFieldActionPerformed(e);
    });
paymentLabel.setText("Monthly Payment");
paymentLabel.setFont(myFont);
c = new GridBagConstraints();
c.gridx = 0;
c.gridy = 3;
c.anchor = GridBagConstraints.WEST;
c.insets = new Insets(10,10, 0, 0); 

getContentPane().add(paymentLabel, c);
paymentTextField.setPreferredSize(new Dimension(100, 25));
paymentTextField.setHorizontalAlignment(SwingConstants.RIGHT);
paymentTextField.setFont(myFont);
c = new GridBagConstraints();
c.gridx = 1;
c.gridy = 3;
c.insets = new Insets(10, 10, 0, 10);

getContentPane().add(paymentTextField,c);
paymentTextField.addActionListener((ActionEvent e) -> {
    paymentTextFieldActionPerformed(e);
    });
computeButton.setText("Compute Monthly Payment");
c = new GridBagConstraints(); 
c.gridx = 0;
c.gridy = 4;
c.gridwidth = 2;
c.insets = new Insets(10, 0, 0, 0);

getContentPane().add(computeButton,c); 
computeButton.addActionListener((ActionEvent e) -> {
    computeButtonActionPerformed(e);
    });
newLoanButton.setText("New Loan Analysis"); 
newLoanButton.setEnabled(false);
c = new GridBagConstraints();
c.gridx = 0;
c.gridy = 5;
c.gridwidth = 2;
c.insets = new Insets(10, 0, 10, 0);

getContentPane().add(newLoanButton,c); 
newLoanButton.addActionListener((ActionEvent e) -> {
    newLoanButtonActionPerformed(e);
    });
monthsButton.setText("change");
monthsButton.setFocusable(false);
c = new GridBagConstraints();
c.gridx = 2;
c.gridy = 2;
c.insets = new Insets(10, 0, 0, 0);

getContentPane().add(monthsButton,c); 
monthsButton.addActionListener((ActionEvent e) -> {
    monthsButtonActionPerformed(e);
    });
paymentButton.setText("change");
paymentButton.setFocusable(false);
c = new GridBagConstraints();
c.gridx = 2;
c.gridy = 3;
c.insets = new Insets(10, 0, 0, 0); 

getContentPane().add(paymentButton,c); 
paymentButton.addActionListener((ActionEvent e) -> {
    paymentButtonActionPerformed(e);
    });
analysisLabel.setText("Loan Analysis:");
analysisLabel.setFont(myFont);
c = new GridBagConstraints(); 
c.gridx = 3;
c.gridy = 0;
c.anchor = GridBagConstraints.WEST;
c.insets = new Insets(0,10, 0, 0); 

getContentPane().add(analysisLabel, c);
analysisTextArea.setPreferredSize(new Dimension(250, 150));
analysisTextArea.setFocusable(false);
analysisTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
analysisTextArea.setFont(new Font("Courier New", Font.PLAIN, 14));
analysisTextArea.setEditable(false);
analysisTextArea.setBackground(Color.WHITE);
c = new GridBagConstraints(); 
c.gridx = 3;
c.gridy = 1;
c.gridheight = 4;
c.insets = new Insets(0, 10, 0, 10);

getContentPane().add(analysisTextArea,
c); exitButton.setText("Exit");
exitButton.setFocusable(false);
c = new GridBagConstraints();
c.gridx = 3;
c.gridy = 5;
getContentPane().add(exitButton, c);
exitButton.addActionListener((ActionEvent e) -> {
    exitButtonActionPerformed(e);
    });
pack();
Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize(); 
setBounds((int) (0.5 * (screenSize.width -getWidth())), (int) (0.5 * (screenSize.height - getHeight())), getWidth(), getHeight());

/*this code of line centers ours frame in a computer screen where To find the centering position,
we need two things: the dimensions of the frame (use getWidth and getHeight methods) and 
the dimensions of the screen held in the frame’s ‘toolkit’.*/

paymentButton.doClick();

}
  
private void computeButtonActionPerformed(ActionEvent e)
{
    
    double balance, interest, payment, monthlyInterest, multiplier, loanBalance, finalPayment;
    int months;
    
    
    // validate user input and also  capture decimal point if included 
if (validateDecimalNumber(balanceTextField)) 
{
    balance = Double.parseDouble(balanceTextField.getText()); 

}
else
{
    
    // return a joption error of invalid input
    
JOptionPane.showConfirmDialog(null,"You entered an invalid or empty field.\n Please correct.",
"Balance Input Error", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE); return;
}
// interest field
if (validateDecimalNumber(interestTextField)) {
interest =
Double.parseDouble(interestTextField.getText()); }
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.", "Interest Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE); return;
}
monthlyInterest = interest / 1200;
if (computePayment)
{
// Compute loan payment
if (validateDecimalNumber(monthsTextField)) {
    months =
            Integer.valueOf(monthsTextField.getText()); }
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Paymentsentry.\nPlease correct.",
"Number of Payments Input Error", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE); return;
}
if (interest == 0)
{
payment = balance / months;
}
else
{
multiplier = Math.pow(1 + monthlyInterest, months); payment = balance *
monthlyInterest * multiplier / (multiplier - 1); }
paymentTextField.setText(new DecimalFormat("0.00").format(payment)); }
else
{
// Compute number of payments
if (validateDecimalNumber(paymentTextField)) {
payment =
Double.parseDouble(paymentTextField.getText()); if (payment <= (balance *
monthlyInterest + 1.0)) {
if (JOptionPane.showConfirmDialog(null, "Minimum payment must be ksh " + new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) + "\n" + "Do you want touse the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
paymentTextField.setText(new DecimalFormat("0.00").format((int)(balance *
monthlyInterest + 1.0))); payment =
Double.parseDouble(paymentTextField.getText()); }
else
{
paymentTextField.requestFocus();
return;
}
}
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\n Please correct.",
"Payment Input Error", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);return;
}
if (interest == 0)
{
months = (int)(balance / payment);
}
else
{
months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest)) /
Math.log(1 + monthlyInterest)); }
monthsTextField.setText(String.valueOf(months)); }
// reset payment prior to analysis to fix at two decimals payment =
Double.parseDouble(paymentTextField.getText()); // show analysis
analysisTextArea.setText("Loan Balance: ksh " + new DecimalFormat("0.00").format(balance));
analysisTextArea.append("\n" + "Interest Rate: " + new DecimalFormat("0.00").format(interest)
+ "%"); // process all but last payment
loanBalance = balance;
for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++) {
loanBalance += loanBalance * monthlyInterest - payment; }
// find final payment
finalPayment = loanBalance;
if (finalPayment > payment)
{
// apply one more payment
loanBalance += loanBalance * monthlyInterest - payment; finalPayment = loanBalance;
months++;
monthsTextField.setText(String.valueOf(months)); }
analysisTextArea.append("\n\n" + String.valueOf(months - 1) + " Payments of ksh " + new DecimalFormat("0.00").format(payment));
analysisTextArea.append("\n" + "Final Payment of: ksh "+ new DecimalFormat("0.00").format(finalPayment));
analysisTextArea.append("\n" + "Total Payments: ksh " + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
analysisTextArea.append("\n" + "Interest Paid ksh " + new DecimalFormat("0.00").format((months -
1) * payment + finalPayment - balance)); computeButton.setEnabled(false);
newLoanButton.setEnabled(true);
newLoanButton.requestFocus();
}
private void newLoanButtonActionPerformed(ActionEvent e) {
// clear computed value and analysis
if (computePayment)
    {
paymentTextField.setText("");
}
else
{
monthsTextField.setText("");
}
analysisTextArea.setText("");
computeButton.setEnabled(true);
newLoanButton.setEnabled(false);
balanceTextField.requestFocus();
}
private void monthsButtonActionPerformed(ActionEvent e) {
// will compute months
computePayment = false;
paymentButton.setVisible(true);
monthsButton.setVisible(false);
monthsTextField.setText("");
monthsTextField.setEditable(false);
monthsTextField.setBackground(lightYellow); monthsTextField.setFocusable(false);
paymentTextField.setEditable(true);
paymentTextField.setBackground(Color.WHITE); paymentTextField.setFocusable(true);
computeButton.setText("Compute Number of Payments"); balanceTextField.requestFocus();
}
private void paymentButtonActionPerformed(ActionEvent e) {
// will compute payment
computePayment = true;
paymentButton.setVisible(false);
monthsButton.setVisible(true);
monthsTextField.setEditable(true);
monthsTextField.setBackground(Color.WHITE); monthsTextField.setFocusable(true);
paymentTextField.setText("");
paymentTextField.setEditable(false);
paymentTextField.setBackground(lightYellow); paymentTextField.setFocusable(false);
computeButton.setText("Compute Monthly Payment"); balanceTextField.requestFocus();
}
private void exitButtonActionPerformed(ActionEvent e) {
System.exit(0);
}
private void balanceTextFieldActionPerformed(ActionEvent e) {
balanceTextField.transferFocus();
}
private void interestTextFieldActionPerformed(ActionEvent e) {
interestTextField.transferFocus();
}
private void monthsTextFieldActionPerformed(ActionEvent e) {
monthsTextField.transferFocus();
}
private void paymentTextFieldActionPerformed(ActionEvent e) {
paymentTextField.transferFocus();
}
private boolean validateDecimalNumber(JTextField tf) {
// checks to see if text field contains
// valid decimal number with only digits and a single decimal point
String s =tf.getText().trim();
boolean hasDecimal = false;
boolean valid = true;
if (s.length() == 0)
{
valid = false;
}
else
{
for (int i = 0; i < s.length(); i++)
{
char c = s.charAt(i);
if (c >= '0' && c <= '9')
{
}
else if (c == '.' && !hasDecimal)
{
hasDecimal = true;
}
else
{
// invalid character found
valid = false;
}
}
}
tf.setText(s);
if (!valid)
{
tf.requestFocus();
}
return (valid);
}
}