/*******************************************************************************
 * Copyright (c) 2010 Angelo ZERR.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:      
 *     Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.jm2t.internal.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * Helper class to route trace output.
 */
public class Trace {
	public static final byte CONFIG = 0;
	public static final byte INFO = 1;
	public static final byte WARNING = 2;
	public static final byte SEVERE = 3;
	public static final byte FINEST = 4;
	public static final byte FINER = 5;
	public static final byte PERFORMANCE = 6;
	public static final byte EXTENSION_POINT = 7;

	private static final String[] levelNames = new String[] { "CONFIG ",
			"INFO   ", "WARNING", "SEVERE ", "FINER  ", "FINEST ", "PERF   ",
			"EXTENSION" };

	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"dd/MM/yy HH:mm.ss.SSS");

	private static Set<String> logged = new HashSet<String>();

	/**
	 * Trace constructor comment.
	 */
	private Trace() {
		super();
	}

	/**
	 * Trace the given text.
	 * 
	 * @param level
	 *            a trace level
	 * @param s
	 *            a message
	 */
	public static void trace(byte level, String s) {
		trace(level, s, null);
	}

	/**
	 * Trace the given message and exception.
	 * 
	 * @param level
	 *            a trace level
	 * @param s
	 *            a message
	 * @param t
	 *            a throwable
	 */
	public static void trace(byte level, String s, Throwable t) {
		if (s == null)
			return;

		if (level == SEVERE) {
			if (!logged.contains(s)) {
				JM2TUI.getDefault().getLog()
						.log(new Status(IStatus.ERROR, JM2TUI.PLUGIN_ID, s, t));
				logged.add(s);
			}
		}

		if (!JM2TUI.getDefault().isDebugging())
			return;

		StringBuilder sb = new StringBuilder(JM2TUI.PLUGIN_ID);
		sb.append(" ");
		sb.append(levelNames[level]);
		sb.append(" ");
		sb.append(sdf.format(new Date()));
		sb.append(" ");
		sb.append(s);
		System.out.println(sb.toString());
		if (t != null)
			t.printStackTrace();
	}
}
