package com.epam.bridge.abstraciton;

import java.util.List;

import javax.swing.JFrame;

import com.epam.bridge.implementor.UIList;

/**
 * Class constructs window
 * @author Pavel
 *
 */
public abstract class WindowConstructor {
	protected UIList list;

	public abstract void addWindowElement(final JFrame frame,
			final List<String> content);
}
