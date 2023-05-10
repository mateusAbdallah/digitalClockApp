import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClockApp extends JFrame {
	
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	DigitalClockApp(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Digital Clock");
		setLayout(new FlowLayout());
		setSize(350,220);
		setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("SANS SERIF", Font.PLAIN, 59));
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setForeground(Color.WHITE);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.BOLD, 34));
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.BOLD, 30));
		
		add(timeLabel);
		add(dayLabel);
		add(dateLabel);
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		
		new DigitalClockApp();

	}

}
