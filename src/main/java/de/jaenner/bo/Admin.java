package de.jaenner.bo;
import java.awt.EventQueue;

public class Admin {
	
	public static void main(String[] args) {
//		Process p = Runtime.getRuntime().exec("psql -U postgres -d testdb -h localhost -p 5432 -f D:\test.sql");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Admin() {
		
	}
}
