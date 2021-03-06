/*******************************************************************************
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
package org.eclipse.gmt.modisco.jm2t.internal.core.xml;

import java.io.Writer;

import org.eclipse.gmt.modisco.jm2t.core.IJM2TProject;
import org.eclipse.gmt.modisco.jm2t.internal.core.util.Util;

/**
 * @since 3.0
 */
public class XMLWriter extends GenericXMLWriter {

	public XMLWriter(Writer writer, IJM2TProject project,
			boolean printXmlVersion) {
		super(writer, Util.getLineSeparator((String) null, project),
				printXmlVersion);
	}
}
