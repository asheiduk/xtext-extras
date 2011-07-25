/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.generator.parser.antlr;

import org.eclipse.xtext.generator.parser.antlr.splitting.AntlrParserSplitter;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class AntlrOptions {
	private boolean backtrack = false;
	private boolean backtrackLexer = false;
	private boolean memoize = false;
	private int k = -1;
	private boolean ignoreCase = false;
	private boolean classSplitting = false;
	private int fieldsPerClass = AntlrParserSplitter.FIELDS_PER_CLASS;

	public boolean isBacktrack() {
		return backtrack;
	}
	public void setBacktrack(boolean backtrack) {
		this.backtrack = backtrack;
	}
	public boolean isMemoize() {
		return memoize;
	}
	public void setMemoize(boolean memoize) {
		this.memoize = memoize;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public void setBacktrackLexer(boolean backtrackLexer) {
		this.backtrackLexer = backtrackLexer;
	}
	public boolean isBacktrackLexer() {
		return backtrackLexer;
	}
	public void setIgnoreCase(boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}
	public boolean isIgnoreCase() {
		return ignoreCase;
	}
	public boolean isClassSplitting() {
		return classSplitting;
	}
	public void setClassSplitting(boolean value) {
		this.classSplitting = value;
	}
	/**
	 * This method will become public API with 2.1
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public int getFieldsPerClass() {
		return fieldsPerClass;
	}
	/**
	 * This method will become public API with 2.1
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void setFieldsPerClass(String fieldsPerClass) {
		this.fieldsPerClass = Integer.parseInt(fieldsPerClass);
	}

}
