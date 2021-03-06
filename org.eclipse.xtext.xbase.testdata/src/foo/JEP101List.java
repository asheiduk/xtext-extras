/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package foo;

/**
 * Example taken from JEP 101: Generalized Target-Type Inference
 * (http://openjdk.java.net/jeps/101)
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class JEP101List<E> {

	public static <Z> JEP101List<Z> nil() {
		return null;
	}

	public static <Z> JEP101List<Z> cons(Z head, JEP101List<Z> tail) {
		return null;
	}

	public E head() {
		return null;
	}

}
