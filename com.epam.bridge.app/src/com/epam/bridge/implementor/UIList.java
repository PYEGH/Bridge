package com.epam.bridge.implementor;

import java.util.List;

import javax.swing.JComponent;

/**
 * Describes UIList component
 * @author Pavel
 *
 */
public interface UIList {
	JComponent getFilledComponent(List<String> list);
}
