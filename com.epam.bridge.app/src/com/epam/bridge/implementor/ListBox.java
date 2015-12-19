package com.epam.bridge.implementor;

import java.util.List;

import javax.swing.JComponent;
import javax.swing.JList;

/**
 * UI list implementation
 * @author Pavel
 *
 */
public class ListBox implements UIList {

	@Override
	public JComponent getFilledComponent(List<String> list) {

		// filling the list
		String[] listData = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			listData[i] = list.get(i);
		}

		// create JComponent
		return new JList(listData);
	}
}
