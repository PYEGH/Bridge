package com.epam.bridge.implementor;

import java.util.List;

import javax.swing.JComponent;
import javax.swing.JTable;

/**
 * Table list implementation
 * @author Pavel
 *
 */
public class TableList implements UIList {

	@Override
	public JComponent getFilledComponent(List<String> list) {

		Object columnNames[] = { "Column One" };
		// This matrix simulates table with one column
		String rowData[][] = new String[list.size()][1];

		// Filling the matrix
		for (int i = 0; i < list.size(); i++) {
			rowData[i][0] = list.get(i);
		}

		return new JTable(rowData, columnNames);
	}

}
