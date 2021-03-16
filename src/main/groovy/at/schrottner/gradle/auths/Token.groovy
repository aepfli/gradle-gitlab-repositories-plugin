/*
 * Copyright 2016-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */
package at.schrottner.gradle.auths

public abstract class Token {
	String name
	String value
	String key

	Token(String name, String value, String key) {
		this.name = name
		this.value = value
		this.key = key
	}

	Token(String name) {
		this.name = name
	}
}