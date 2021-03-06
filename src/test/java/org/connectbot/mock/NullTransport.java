/*
 * ConnectBot: simple, powerful, open-source SSH client for Android
 * Copyright 2007 Kenny Root, Jeffrey Sharkey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.connectbot.mock;

import java.io.IOException;
import java.util.Map;

import org.connectbot.bean.HostBean;
import org.connectbot.service.TerminalBridge;
import org.connectbot.service.TerminalManager;
import org.connectbot.transport.AbsTransport;

import android.net.Uri;

/**
 * @author kenny
 *
 */
public class NullTransport extends AbsTransport {

	/**
	 *
	 */
	public NullTransport() {

	}

	/**
	 * @param host
	 * @param bridge
	 * @param manager
	 */
	public NullTransport(HostBean host, TerminalBridge bridge,
			TerminalManager manager) {
		super(host, bridge, manager);
	}

	@Override
	public void close() {

	}

	@Override
	public void connect() {

	}

	@Override
	public HostBean createHost(Uri uri) {
		return null;
	}

	@Override
	public void flush() throws IOException {

	}

	@Override
	public String getDefaultNickname(String username, String hostname, int port) {
		return null;
	}

	@Override
	public int getDefaultPort() {
		return 0;
	}

	@Override
	public void getSelectionArgs(Uri uri, Map<String, String> selection) {

	}

	@Override
	public boolean isConnected() {
		return false;
	}

	@Override
	public boolean isSessionOpen() {
		return false;
	}

	@Override
	public int read(byte[] buffer, int offset, int length) throws IOException {
		return 0;
	}

	@Override
	public void setDimensions(int columns, int rows, int width, int height) {

	}

	@Override
	public void write(byte[] buffer) throws IOException {

	}

	@Override
	public void write(int c) throws IOException {

	}

	@Override
	public boolean usesNetwork() {
		return false;
	}

}
