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
package org.eclipse.gmt.modisco.jm2t.core.generator;

/**
 * Generator manager interface.
 * 
 */
public interface IGeneratorManager {

	/**
	 * Returns an array of all known generator types.
	 * <p>
	 * A new array is returned on each call, so clients may store or modify the
	 * result.
	 * </p>
	 * 
	 * @return the array of generator types {@link IGeneratorType}
	 */
	IGeneratorType[] getGeneratorTypes();

	/**
	 * Generate .
	 * 
	 * @param model
	 * @param modelProvider
	 * @param generator
	 * @param generatorConfiguration
	 */
	void generate(final Object model, final IModelProvider modelProvider,
			final IGenerator<?> generator,
			final IGeneratorConfiguration generatorConfiguration);
}
