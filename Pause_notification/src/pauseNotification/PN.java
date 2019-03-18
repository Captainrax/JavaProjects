package pauseNotification;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class PN {

	public static void main(String[] args) throws AWTException, MalformedURLException {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PN.displayTray();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static TrayIcon trayIcon;
	
	public static void displayTray() throws AWTException, IOException, ParseException {
		final PopupMenu popup = new PopupMenu();
		final SystemTray tray = SystemTray.getSystemTray();

		URL url = PN.class.getClassLoader().getResource("flag.png"); // gets flag icon for system tray
		Image img = ImageIO.read(url); // converts url path to an image for TrayIcon to read

		trayIcon = new TrayIcon(img, "PauseNotification", popup); // sets image, hover over tool tip, right click menu

		MenuItem exitItem = new MenuItem("Quit App");
		trayIcon.setPopupMenu(popup);
		trayIcon.setImageAutoSize(true);

		popup.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tray.remove(trayIcon);
				System.exit(0);
			}
		});
		tray.add(trayIcon);

		ScheduledExecutorService schedul = Executors.newScheduledThreadPool(1);
		final Runnable checkTime = new Runnable() {
			public void run() {
				// get current time, format to seconds only in a String.
				org.joda.time.format.DateTimeFormatter fmtseconds = DateTimeFormat.forPattern("ss");
				DateTime curtime = DateTime.now();
				String curtim = curtime.toString(fmtseconds);

				if (curtim.equals("00")) {
					notif();
					throw new RuntimeException();
				}
			}
		};
		schedul.scheduleAtFixedRate(checkTime, 0, 1, TimeUnit.SECONDS);
	}

	static void notif() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm"); // formats local time
		LocalTime nowcomp = LocalTime.of(15, 40); // time to display notification
		String timecomp = nowcomp.toString();
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		final Runnable checkTime = new Runnable() {
			public void run() {

				LocalTime now = LocalTime.now(); // gets local time
				String time = now.format(dtf); // converts formated time into Stringddd
				System.out.println(time); // debug

				if (time.equals(timecomp)) {
					trayIcon.displayMessage("PAUSE", time, MessageType.INFO);
				}
			}
		};
		scheduler.scheduleAtFixedRate(checkTime, 0, 1, TimeUnit.MINUTES);
	}
}