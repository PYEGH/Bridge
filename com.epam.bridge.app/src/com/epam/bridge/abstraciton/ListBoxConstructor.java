package com.epam.bridge.abstraciton;

import java.awt.Component;
import java.util.List;
import javax.swing.JFrame;
import com.epam.bridge.implementor.ListBox;

/**
 * Class constructs listBox for window
 * @author Pavel
 *
 */
public class ListBoxConstructor extends WindowConstructor {

	/**
	 * Method adds listBox to common frame
	 */
	@Override
	public void addWindowElement(final JFrame frame, final List<String> content) {
		list = new ListBox();
		Component table = list.getFilledComponent(content);
		frame.add(table);
	}

}
