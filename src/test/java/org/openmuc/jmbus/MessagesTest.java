/*
 * Copyright 2010-16 Fraunhofer ISE
 *
 * This file is part of jMBus.
 * For more information visit http://www.openmuc.org
 *
 * jMBus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jMBus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jMBus.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.openmuc.jmbus;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Ignore;

@Ignore
public class MessagesTest {
    /* RESP-UD EMH DIZ */
    final static byte[] testMsg1 = new byte[] { (byte) 0x68, (byte) 0x21, (byte) 0x21, (byte) 0x68, (byte) 0x08,
            (byte) 0x01, (byte) 0x72, (byte) 0x02, (byte) 0x37, (byte) 0x62, (byte) 0x00, (byte) 0xa8, (byte) 0x15,
            (byte) 0x00, (byte) 0x02, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x10,
            (byte) 0x04, (byte) 0x09, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0xc4, (byte) 0x00, (byte) 0x2a,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0xfd, (byte) 0x17, (byte) 0x00,
            (byte) 0x8c, (byte) 0x16 };

    /* RESP-UD NZR DHZ 5/63 M-BUS 2/230-1 single phase meter */
    final static byte[] testMsg2 = new byte[] { (byte) 0x68, (byte) 0x32, (byte) 0x32, (byte) 0x68, (byte) 0x08,
            (byte) 0x05, (byte) 0x72, (byte) 0x08, (byte) 0x06, (byte) 0x10, (byte) 0x30, (byte) 0x52, (byte) 0x3b,
            (byte) 0x01, (byte) 0x02, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x03,
            (byte) 0xfa, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x83, (byte) 0x7f, (byte) 0xfa,
            (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0xfd, (byte) 0x48, (byte) 0x44, (byte) 0x09,
            (byte) 0x02, (byte) 0xfd, (byte) 0x5b, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x2b, (byte) 0x00,
            (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x08, (byte) 0x06, (byte) 0x10, (byte) 0x30, (byte) 0x0f,
            (byte) 0x0e, (byte) 0x71, (byte) 0x16 };

    /* RESP-UD Elster F2 heat meter */
    final static byte[] testMsg3 = new byte[] { (byte) 0x68, (byte) 0x90, (byte) 0x90, (byte) 0x68, (byte) 0x08,
            (byte) 0x01, (byte) 0x72, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0xcd, (byte) 0x4e,
            (byte) 0x08, (byte) 0x04, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x07,
            (byte) 0xc8, (byte) 0x1e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x15, (byte) 0xfe, (byte) 0xbf,
            (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x40, (byte) 0x15, (byte) 0xf8, (byte) 0xbf, (byte) 0x00,
            (byte) 0x00, (byte) 0x02, (byte) 0x5a, (byte) 0x79, (byte) 0x02, (byte) 0x02, (byte) 0x5e, (byte) 0xa6,
            (byte) 0x01, (byte) 0x02, (byte) 0x62, (byte) 0xd3, (byte) 0x00, (byte) 0x04, (byte) 0x22, (byte) 0x38,
            (byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x26, (byte) 0x3d, (byte) 0x07, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0x3d, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04,
            (byte) 0x2e, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x2b,
            (byte) 0x11, (byte) 0x78, (byte) 0x11, (byte) 0x84, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x80, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0xe8, (byte) 0x03, (byte) 0x01, (byte) 0x08, (byte) 0x13,
            (byte) 0x00, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x75, (byte) 0x96, (byte) 0x91,
            (byte) 0x00, (byte) 0xcd, (byte) 0x4e, (byte) 0x08, (byte) 0x04, (byte) 0x07, (byte) 0xac, (byte) 0xff,
            (byte) 0x03, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0x01, (byte) 0x01, (byte) 0x01,
            (byte) 0x02, (byte) 0xff, (byte) 0x0f, (byte) 0x05, (byte) 0x3c, (byte) 0x33, (byte) 0x66, (byte) 0x5a,
            (byte) 0x66, (byte) 0xcb, (byte) 0x05, (byte) 0xdf, (byte) 0x05, (byte) 0xff, (byte) 0xff, (byte) 0x9d,
            (byte) 0x39, (byte) 0x13, (byte) 0x01, (byte) 0xa0, (byte) 0x05, (byte) 0x61, (byte) 0x31, (byte) 0xd3,
            (byte) 0x16 };

    /* Siemens water meter ?? */
    final static byte[] testMsg4 = new byte[] { (byte) 0x68, (byte) 0x59, (byte) 0x59, (byte) 0x68, (byte) 0x08,
            (byte) 0x00, (byte) 0x72, (byte) 0x82, (byte) 0x13, (byte) 0x02, (byte) 0x08, (byte) 0x65, (byte) 0x32,
            (byte) 0x99, (byte) 0x06, (byte) 0xeb, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x13,
            (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0b, (byte) 0x22, (byte) 0x52, (byte) 0x09,
            (byte) 0x02, (byte) 0x04, (byte) 0x6d, (byte) 0x38, (byte) 0x08, (byte) 0x6e, (byte) 0x19, (byte) 0x32,
            (byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x82, (byte) 0x13, (byte) 0x02,
            (byte) 0x08, (byte) 0x06, (byte) 0xfd, (byte) 0x0c, (byte) 0x0a, (byte) 0x00, (byte) 0x01, (byte) 0x00,
            (byte) 0xfa, (byte) 0x01, (byte) 0x0d, (byte) 0xfd, (byte) 0x0b, (byte) 0x05, (byte) 0x31, (byte) 0x32,
            (byte) 0x48, (byte) 0x46, (byte) 0x57, (byte) 0x01, (byte) 0xfd, (byte) 0x0e, (byte) 0x00, (byte) 0x0b,
            (byte) 0x3b, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0x37, (byte) 0xfd, (byte) 0x17,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x02, (byte) 0x7a, (byte) 0x0d, (byte) 0x00, (byte) 0x02, (byte) 0x78, (byte) 0x0d, (byte) 0x00,
            (byte) 0x11, (byte) 0x16 };

    /* Siemens heat meter WFH21 */
    final static byte[] testMsg5 = new byte[] { (byte) 0x68, (byte) 0x5e, (byte) 0x5e, (byte) 0x68, (byte) 0x08,
            (byte) 0x05, (byte) 0x72, (byte) 0x91, (byte) 0x64, (byte) 0x00, (byte) 0x08, (byte) 0x65, (byte) 0x32,
            (byte) 0x99, (byte) 0x06, (byte) 0xda, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x13,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0b, (byte) 0x22, (byte) 0x86, (byte) 0x40,
            (byte) 0x04, (byte) 0x04, (byte) 0x6d, (byte) 0x24, (byte) 0x0a, (byte) 0x61, (byte) 0x1c, (byte) 0x32,
            (byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x91, (byte) 0x64, (byte) 0x00,
            (byte) 0x08, (byte) 0x06, (byte) 0xfd, (byte) 0x0c, (byte) 0x0a, (byte) 0x00, (byte) 0x01, (byte) 0x00,
            (byte) 0xfa, (byte) 0x01, (byte) 0x0d, (byte) 0xfd, (byte) 0x0b, (byte) 0x05, (byte) 0x31, (byte) 0x32,
            (byte) 0x48, (byte) 0x46, (byte) 0x57, (byte) 0x01, (byte) 0xfd, (byte) 0x0e, (byte) 0x00, (byte) 0x4c,
            (byte) 0x13, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x6c, (byte) 0x5f,
            (byte) 0x1c, (byte) 0x0f, (byte) 0x37, (byte) 0xfd, (byte) 0x17, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x7a, (byte) 0x25,
            (byte) 0x00, (byte) 0x02, (byte) 0x78, (byte) 0x25, (byte) 0x00, (byte) 0x82, (byte) 0x16 };

    /* meter_1.txt from Mariusz Ryndzionek */
    final static byte[] testMsg6 = new byte[] { (byte) 0x68, (byte) 0x50, (byte) 0x50, (byte) 0x68, (byte) 0x08,
            (byte) 0x0d, (byte) 0x72, (byte) 0x13, (byte) 0x40, (byte) 0x56, (byte) 0x41, (byte) 0x74, (byte) 0x52,
            (byte) 0x52, (byte) 0x0c, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0xfb,
            (byte) 0x01, (byte) 0x20, (byte) 0x22, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x10, (byte) 0xfb,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x20, (byte) 0x16,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x16, (byte) 0x00, (byte) 0x53,
            (byte) 0x06, (byte) 0x00, (byte) 0x0c, (byte) 0x2e, (byte) 0x62, (byte) 0x65, (byte) 0x01, (byte) 0x00,
            (byte) 0x0b, (byte) 0x3e, (byte) 0x54, (byte) 0x04, (byte) 0x00, (byte) 0x0a, (byte) 0x5a, (byte) 0x06,
            (byte) 0x07, (byte) 0x0a, (byte) 0x5e, (byte) 0x84, (byte) 0x03, (byte) 0x0a, (byte) 0x62, (byte) 0x22,
            (byte) 0x03, (byte) 0x0a, (byte) 0x27, (byte) 0x04, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x39,
            (byte) 0x09, (byte) 0x6b, (byte) 0x1a, (byte) 0x72, (byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x97,
            (byte) 0x16 };

    /* meter_2.txt from Mariusz Ryndzionek */
    final static byte[] testMsg7 = new byte[] { (byte) 0x68, (byte) 0x88, (byte) 0x88, (byte) 0x68, (byte) 0x08,
            (byte) 0x01, (byte) 0x72, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0x74, (byte) 0x52,
            (byte) 0x08, (byte) 0x04, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x07,
            (byte) 0xc8, (byte) 0x1e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x15, (byte) 0xfe, (byte) 0xbf,
            (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x40, (byte) 0x15, (byte) 0xf8, (byte) 0xbf, (byte) 0x00,
            (byte) 0x00, (byte) 0x02, (byte) 0x5a, (byte) 0x79, (byte) 0x02, (byte) 0x02, (byte) 0x5e, (byte) 0xa6,
            (byte) 0x01, (byte) 0x02, (byte) 0x62, (byte) 0xd3, (byte) 0x00, (byte) 0x04, (byte) 0x22, (byte) 0x38,
            (byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x26, (byte) 0x3d, (byte) 0x07, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0x3d, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04,
            (byte) 0x2e, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x2b,
            (byte) 0x11, (byte) 0x78, (byte) 0x11, (byte) 0x84, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0xe8, (byte) 0x03, (byte) 0x01, (byte) 0x08, (byte) 0x13,
            (byte) 0x00, (byte) 0x21, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x75, (byte) 0x96, (byte) 0x91,
            (byte) 0x00, (byte) 0xcd, (byte) 0x4e, (byte) 0x08, (byte) 0x04, (byte) 0x07, (byte) 0xac, (byte) 0xf8,
            (byte) 0x03, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x33, (byte) 0x01, (byte) 0x41, (byte) 0x01,
            (byte) 0x02, (byte) 0xff, (byte) 0x0f, (byte) 0x05, (byte) 0x3c, (byte) 0x33, (byte) 0x63, (byte) 0x5a,
            (byte) 0x66, (byte) 0xcb, (byte) 0x05, (byte) 0xdf, (byte) 0x05, (byte) 0xff, (byte) 0xff, (byte) 0x9d,
            (byte) 0x39, (byte) 0x13, (byte) 0x01, (byte) 0xa0, (byte) 0x05, (byte) 0x61, (byte) 0x31, (byte) 0x55,
            (byte) 0x16 };

    /* ABB A41 513-100 electric meter Message 1 */
    final static byte[] test_ABB_A41_Msg1 = new byte[] { (byte) 0x68, (byte) 0xf6, (byte) 0xf6, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0b, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x0e,
            (byte) 0x84, (byte) 0x00, (byte) 0x13, (byte) 0x39, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x8e, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x13, (byte) 0x39, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x20, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x30, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x50, (byte) 0x84, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x60, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e,
            (byte) 0x70, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0xff, (byte) 0x93, (byte) 0x00,
            (byte) 0x01, (byte) 0x04, (byte) 0xff, (byte) 0xa0, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa1, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa2, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa3, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa6, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa7,
            (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa8, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x07, (byte) 0xff, (byte) 0xa9,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x0e, (byte) 0xed, (byte) 0x18, (byte) 0x01, (byte) 0x01, (byte) 0x01, (byte) 0x01,
            (byte) 0x01, (byte) 0x10, (byte) 0x02, (byte) 0xff, (byte) 0xf9, (byte) 0x8a, (byte) 0x18, (byte) 0x50,
            (byte) 0x00, (byte) 0x0d, (byte) 0xfd, (byte) 0x8e, (byte) 0x00, (byte) 0x07, (byte) 0x30, (byte) 0x2e,
            (byte) 0x32, (byte) 0x31, (byte) 0x2e, (byte) 0x31, (byte) 0x41, (byte) 0x0d, (byte) 0xff, (byte) 0xaa,
            (byte) 0x00, (byte) 0x0b, (byte) 0x30, (byte) 0x30, (byte) 0x31, (byte) 0x2d, (byte) 0x33, (byte) 0x31,
            (byte) 0x35, (byte) 0x20, (byte) 0x31, (byte) 0x34, (byte) 0x41, (byte) 0x1f, (byte) 0xf1, (byte) 0x16 };

    /* ABB A41 513-100 electric meter Message 2 */
    final static byte[] test_ABB_A41_Msg2 = new byte[] { (byte) 0x68, (byte) 0xea, (byte) 0xea, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0c, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x04,
            (byte) 0xff, (byte) 0x98, (byte) 0x00, (byte) 0x9f, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x0e,
            (byte) 0xff, (byte) 0xec, (byte) 0x00, (byte) 0x15, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x04, (byte) 0xa9, (byte) 0x00, (byte) 0x4c, (byte) 0x07, (byte) 0x00, (byte) 0x00,
            (byte) 0x84, (byte) 0x80, (byte) 0x40, (byte) 0xa9, (byte) 0x00, (byte) 0xb3, (byte) 0xfe, (byte) 0xff,
            (byte) 0xff, (byte) 0x84, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xa9, (byte) 0x00, (byte) 0xe2,
            (byte) 0x0e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xfd, (byte) 0xc8, (byte) 0xff, (byte) 0x81,
            (byte) 0x00, (byte) 0x02, (byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xfd, (byte) 0xd9,
            (byte) 0xff, (byte) 0x81, (byte) 0x00, (byte) 0xa6, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0a,
            (byte) 0xff, (byte) 0xd9, (byte) 0x00, (byte) 0x25, (byte) 0x50, (byte) 0x02, (byte) 0xff, (byte) 0xe0,
            (byte) 0x00, (byte) 0xeb, (byte) 0x01, (byte) 0x02, (byte) 0xff, (byte) 0xd2, (byte) 0x00, (byte) 0xa2,
            (byte) 0xfd, (byte) 0x02, (byte) 0xff, (byte) 0xc2, (byte) 0xff, (byte) 0x81, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x02, (byte) 0xff, (byte) 0xca, (byte) 0xff, (byte) 0x81, (byte) 0x00, (byte) 0x9b,
            (byte) 0xff, (byte) 0x01, (byte) 0xff, (byte) 0x97, (byte) 0x00, (byte) 0x04, (byte) 0x8e, (byte) 0x80,
            (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0x90, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xa0, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e,
            (byte) 0xb0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80, (byte) 0x50, (byte) 0x84, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x40,
            (byte) 0x84, (byte) 0x00, (byte) 0x55, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x8e, (byte) 0xd0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x55, (byte) 0x08, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xe0, (byte) 0x40, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xf0,
            (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x50, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0xff, (byte) 0xad, (byte) 0x00,
            (byte) 0x01, (byte) 0x1f, (byte) 0x85, (byte) 0x16 };

    /* ABB A41 513-100 electric meter Message 3 */
    final static byte[] test_ABB_A41_Msg3 = new byte[] { (byte) 0x68, (byte) 0x94, (byte) 0x94, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0d, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x81,
            (byte) 0x40, (byte) 0xfd, (byte) 0x9a, (byte) 0x00, (byte) 0x00, (byte) 0x81, (byte) 0x80, (byte) 0x40,
            (byte) 0xfd, (byte) 0x9a, (byte) 0x00, (byte) 0x00, (byte) 0x81, (byte) 0xc0, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9a, (byte) 0x15, (byte) 0x00, (byte) 0x81, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9a, (byte) 0x15, (byte) 0x00, (byte) 0x81, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x15,
            (byte) 0x00, (byte) 0x81, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x15, (byte) 0x00,
            (byte) 0x81, (byte) 0xc0, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x00, (byte) 0x00, (byte) 0x81,
            (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x00, (byte) 0x00, (byte) 0xc1,
            (byte) 0x40, (byte) 0xfd, (byte) 0x9b, (byte) 0x15, (byte) 0x00, (byte) 0xc1, (byte) 0x80, (byte) 0x40,
            (byte) 0xfd, (byte) 0x9b, (byte) 0x15, (byte) 0x00, (byte) 0xc1, (byte) 0xc0, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9b, (byte) 0x00, (byte) 0x01, (byte) 0xc1, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd,
            (byte) 0x9b, (byte) 0x00, (byte) 0x01, (byte) 0x8e, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0x35, (byte) 0x16 };

    /* ABB A41 513-100 electric meter Message 4 */
    final static byte[] test_ABB_A41_Msg4 = new byte[] { (byte) 0x68, (byte) 0xcf, (byte) 0xcf, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0e, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x0e,
            (byte) 0x84, (byte) 0xff, (byte) 0xf2, (byte) 0x00, (byte) 0x13, (byte) 0x39, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x40, (byte) 0x84, (byte) 0xff, (byte) 0xf2, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80,
            (byte) 0x40, (byte) 0x84, (byte) 0xff, (byte) 0xf2, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0xc0, (byte) 0x40, (byte) 0x84, (byte) 0xff,
            (byte) 0xf2, (byte) 0x00, (byte) 0x55, (byte) 0x08, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x04, (byte) 0xff, (byte) 0xf1, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x84, (byte) 0x40, (byte) 0xff, (byte) 0xf1, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x84, (byte) 0x80, (byte) 0x40, (byte) 0xff, (byte) 0xf1, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0xc0, (byte) 0x40, (byte) 0xff, (byte) 0xf1,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0e, (byte) 0xff, (byte) 0xf9,
            (byte) 0xc4, (byte) 0x00, (byte) 0x39, (byte) 0x91, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x0e, (byte) 0xff, (byte) 0xf9, (byte) 0xc9, (byte) 0x00, (byte) 0x14, (byte) 0x39, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa4, (byte) 0x00, (byte) 0xe8,
            (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0xff, (byte) 0xa5, (byte) 0x00, (byte) 0xe8,
            (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x8e, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x86, (byte) 0x76, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8e,
            (byte) 0xc0, (byte) 0x80, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x87, (byte) 0x80, (byte) 0xc0, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x49, (byte) 0x0f, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x87, (byte) 0xc0, (byte) 0xc0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0xa9,
            (byte) 0xfc, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x87,
            (byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x06, (byte) 0x1e,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0x53,
            (byte) 0x16 };

    /* ABB A41 513-100 electric meter Message 5 */
    final static byte[] test_ABB_A41_Msg5 = new byte[] { (byte) 0x68, (byte) 0xc8, (byte) 0xc8, (byte) 0x68,
            (byte) 0x08, (byte) 0x09, (byte) 0x72, (byte) 0x19, (byte) 0x78, (byte) 0x21, (byte) 0x00, (byte) 0x42,
            (byte) 0x04, (byte) 0x20, (byte) 0x02, (byte) 0x0f, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x4e,
            (byte) 0xed, (byte) 0xeb, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x01,
            (byte) 0x00, (byte) 0x4e, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x40, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce,
            (byte) 0xc0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x20, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x30,
            (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0xce, (byte) 0x80, (byte) 0x10, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x90, (byte) 0x40, (byte) 0x84, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0xa0,
            (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0xce, (byte) 0xb0, (byte) 0x40, (byte) 0x84, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x50, (byte) 0x84,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce,
            (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00,
            (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0xc0,
            (byte) 0x40, (byte) 0xfd, (byte) 0xe1, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0xce, (byte) 0x80, (byte) 0x80, (byte) 0x40, (byte) 0xfd, (byte) 0xe1,
            (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0f,
            (byte) 0x9f, (byte) 0x16 };

    final static ArrayList<byte[]> test_ABB_A41_messages = new ArrayList<byte[]>(Arrays.asList(test_ABB_A41_Msg1,
            test_ABB_A41_Msg2, test_ABB_A41_Msg3, test_ABB_A41_Msg4, test_ABB_A41_Msg5));

    public static void main(String[] args) {

        byte b = (byte) 0xBF;

        System.out.println(b);

        int c = 0xff & b;

        System.out.println(c);

        if (args.length < 1) {
            System.err.println("Add message as hex string");
            System.exit(1);
        }

        String message = args[0];

        if ((message.length() % 2) != 0) {
            System.err.println("Invalid string length");
            System.exit(1);
        }

        int i = 0;
        int columnCount = 0;
        while (i < message.length()) {
            System.out.print("(byte) 0x" + message.substring(i, i + 2) + ", ");
            i += 2;
            columnCount++;
            if (columnCount == 8) {
                System.out.println();
                columnCount = 0;
            }
        }
    }

    public static void printBuffer(byte[] buffer) {
        for (int i = 0; i < buffer.length; i++) {
            System.out.println(i + ": " + String.format("%02x", 0xff & buffer[i]));
        }
    }

}
