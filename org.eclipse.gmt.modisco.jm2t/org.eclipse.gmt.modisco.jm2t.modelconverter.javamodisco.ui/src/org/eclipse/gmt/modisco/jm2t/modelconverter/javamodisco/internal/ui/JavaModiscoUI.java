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
package org.eclipse.gmt.modisco.jm2t.modelconverter.javamodisco.internal.ui;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class JavaModiscoUI extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.gmt.modisco.jm2t.modelconverter.javamodisco.ui"; //$NON-NLS-1$

	// The shared instance
	private static JavaModiscoUI plugin;

	/**
	 * The constructor
	 */
	public JavaModiscoUI() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		plugin = this;
		super.start(bundleContext);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static JavaModiscoUI getDefault() {
		return plugin;
	}
}
