/**
 * Copyright (C) 2013 codingtony (t.bussieres@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.butor.netty.handler.codec.ftp.fs;

public enum Permission {
	NONE("---"),
	READ("r--"),
	WRITE("-w-"),
	EXEC("--x"),
	READWRITE("rw-"),
	READEXEC("r-x"),
	WRITEEXEC("-wx"),
	READWRITEEXEC("rwx");
	
	private final String permString;
	
	Permission(String permString) {
		this.permString = permString;
	}
	
	protected String perm() {
		return permString;
	}
}