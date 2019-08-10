/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.paradoxalarm.internal.communication;

import org.openhab.binding.paradoxalarm.internal.communication.messages.IPPacketPayload;

/**
 * The {@link LogonRequest}. Request for initial logon sequence.
 *
 * @author Konstantin Polihronov - Initial contribution
 */
public class LogonRequest extends Request {

    private CommunicationState logonSequenceSender;

    public LogonRequest(CommunicationState logonSequenceSender, IPPacketPayload payload) {
        super(RequestType.LOGON_SEQUENCE, payload);
        this.logonSequenceSender = logonSequenceSender;
    }

    public CommunicationState getLogonSequenceSender() {
        return logonSequenceSender;
    }
}