package com.epam.bridge;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.epam.bridge.abstraciton.ListBoxConstructor;
import com.epam.bridge.abstraciton.TableConstuctor;
import com.epam.bridge.abstraciton.WindowConstructor;

/**
 * Class construct initialize and window
 * 
 * @author Pavel
 * 
 */
public class WindowConstructionRunner {
	/**
	 * Window initialiing and creation
	 */
	public static void createWindow() {
		final WindowConstructor tableConstructor = new TableConstuctor();
		final WindowConstructor listBoxConstructor = new ListBoxConstructor();
		final JFrame frame = new JFrame();
		final List<String> content = new ArrayList();

		initialieFrame(frame);
		fillListWithContent(content);
		tableConstructor.addWindowElement(frame, content);
		listBoxConstructor.addWindowElement(frame, content);
		frame.setVisible(true);
	}

	/**
	 * 
	 * inintializing of window
	 * 
	 * @param frame
	 */
	private static void initialieFrame(final JFrame frame) {
		int height = 600;
		int width = 800;
		String title = "Bridge example";
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}

	/**
	 * Filling list with a content
	 * 
	 * @param content
	 */
	private static void fillListWithContent(final List<String> content) {
		content.add("1st item");
		content.add("2nd item");
		content.add("3d item");
	}
}
