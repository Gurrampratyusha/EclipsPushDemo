package Java_Selenium_codes;

import java.sql.Connection;

public class jdbc {
	public static void show_connection_info(Connection conn)
	{
	System.out.println("Connection: " + conn);
	System.out.println("Connection class: " + conn.getClass());
	System.out.println("Connection class name: " + conn.getClass().getName());
	}
}
