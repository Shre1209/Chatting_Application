import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
public class Server extends JFrame implements ActionListener {
    JTextField text;
    JPanel a1;
    Box vertical=Box.createVerticalBox();
	
	Server()
            
    {
    	setLayout(null);
    	JPanel p1=new JPanel();
    	p1.setBackground(new Color(7,94,84));
    	p1.setBounds(0,0,450,70);
    	p1.setLayout(null);
    	add(p1);
    	
    	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("3.png"));
    	Image i2=i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
    	ImageIcon i3=new ImageIcon(i2);
    	JLabel back=new JLabel(i3);
    	back.setBounds(5,20,25,25);
    	p1.add(back);
    	
    	back.addMouseListener(new MouseAdapter(){
    		public void mouseClicked(MouseEvent ae) {
    			System.exit(0);
    		}
    	});
    	
    	ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Photo.jpg"));
    	Image i5=i4.getImage().getScaledInstance(35, 40, Image.SCALE_DEFAULT);
    	ImageIcon i6=new ImageIcon(i5);
    	JLabel profile=new JLabel(i6);
    	profile.setBounds(40,10,50,50);
    	p1.add(profile);
    	
    	ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("video.png"));
    	Image i8=i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
    	ImageIcon i9=new ImageIcon(i8);
    	JLabel video=new JLabel(i9);
    	video.setBounds(300,20,30,30);
    	p1.add(video);
    	
    	ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("phone.png"));
    	Image i11=i10.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
    	ImageIcon i12=new ImageIcon(i11);
    	JLabel phone=new JLabel(i12);
    	phone.setBounds(360,20,30,30);
    	p1.add(phone);
    	
    	ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("3icon.png"));
    	Image i14=i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
    	ImageIcon i15=new ImageIcon(i14);
    	JLabel morevert=new JLabel(i15);
    	morevert.setBounds(420,20,10,25);
    	p1.add(morevert);
    	
    	JLabel name=new JLabel("Shreyash ");
    	name.setBounds(110,20,100,20);
    	name.setForeground(Color.WHITE);
    	name.setFont(new Font("SAN SERIF",Font.BOLD,18));
    	p1.add(name);
    	
    	JLabel status=new JLabel("Active_Now");
    	status.setBounds(110,40,100,20);
    	status.setForeground(Color.WHITE);
    	status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
    	p1.add(status);
    	

        a1=new JPanel();
        a1.setBounds(5,75,440,570);
        add(a1);
    	
        text=new JTextField();
        text.setBounds(5,650,310,40);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(text);
        
        JButton send =new JButton("Send");
        send.setBounds(320,650,123,40);
        send.setBackground(new Color(7,94,84));
        send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        add(send);
       
        setSize(465,750);
        setVisible(true);
        setUndecorated(true);
        setLocation(200,50);
        getContentPane().setBackground(Color.WHITE);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
    	String out=text.getText();
    	JLabel output=new JLabel(out);
    	JPanel p2=formatLabel(out);
    	
    	a1.setLayout(new BorderLayout());
    	JPanel right=new JPanel(new BorderLayout());
    	right.add(p2,BorderLayout.LINE_END);
    	vertical.add(right);
    	vertical.add(Box.createVerticalStrut(15));
    	a1.add(vertical,BorderLayout.PAGE_START);
    	repaint();
    	invalidate();
    	validate();
    }
    
    public static JPanel formatLabel(String out)
    {
    	JPanel panel=new JPanel();
    	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
    	
    	JLabel output=new JLabel(out);
    	
    	output.setFont(new Font("Tahoma",Font.BOLD,16));
    	
    	output.setBackground(new Color(37,211,102));
    	output.setOpaque(true);
    	output.setBorder(new EmptyBorder(15,15,15,50));
    	panel.add(output);
    	
    	return panel;
    	
    	
    }
    public static void main(String[] args){
    new Server();    
}
}
