package sandbox;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;

import javax.imageio.ImageIO;

public class Sandbox {

	public static void main(String[] args) throws AWTException, MalformedURLException {
		
		
				try {
					Sandbox.display();
					Sandbox.displayTray();
				} catch (Exception e) {
					e.printStackTrace();
				}
			
	}
	
	public static void display() {
		
	
	}
	
	public static TrayIcon trayIcon;
	
	public static void displayTray() throws AWTException, IOException, ParseException {
		final PopupMenu popup = new PopupMenu();
		final SystemTray tray = SystemTray.getSystemTray();

		URL url = Sandbox.class.getClassLoader().getResource("flag.png"); // gets flag icon for system tray
		Image img = ImageIO.read(url); // converts URL path to an image for TrayIcon to read

		trayIcon = new TrayIcon(img, "Sandbox", popup); // sets image, hover over tool tip, right click menu

		MenuItem exitItem = new MenuItem("Quit App");
		trayIcon.setPopupMenu(popup);
		trayIcon.setImageAutoSize(true);

		popup.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		tray.add(trayIcon);
	}
	
	
}


