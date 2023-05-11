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
		timeLabel.setBackground(Color.DARK_GRAY);
		timeLabel.setForeground(Color.RED);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.BOLD, 34));
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.BOLD, 30));
		
		add(timeLabel);
		add(dayLabel);
		add(dateLabel);
		setVisible(true);
		
		setTimer();
		
		
	}
	
	public void setTimer() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.getStackTrace();
			}
			
		}
	}
	

	public static void main(String[] args) {
		
		new DigitalClockApp();

	}

}
