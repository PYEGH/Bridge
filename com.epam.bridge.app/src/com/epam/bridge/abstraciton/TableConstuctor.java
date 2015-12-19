package com.epam.bridge.abstraciton;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;

import javax.swing.JFrame;

import com.epam.bridge.implementor.TableList;

/**
 * Class constructs table for window
 * 
 * @author Pavel
 * 
 */
public class TableConstuctor extends WindowConstructor {

	/**
	 * Method adds table to common frame
	 */
	@Override
	public void addWindowElement(final JFrame frame, final List<String> content) {
		list = new TableList();
		Component table = list.getFilledComponent(content);
		frame.add(table, BorderLayout.EAST);
	}
}
