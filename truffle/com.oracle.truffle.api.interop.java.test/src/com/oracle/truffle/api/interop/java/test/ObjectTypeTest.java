/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.truffle.api.interop.java.test;

import com.oracle.truffle.api.interop.java.JavaInterop;
import com.oracle.truffle.api.object.DynamicObject;
import com.oracle.truffle.api.object.Layout;
import com.oracle.truffle.api.object.ObjectType;
import com.oracle.truffle.api.object.Shape;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ObjectTypeTest {

    @Test
    public void objectTypeRespondsToIsBoxed() {
        final Layout layout = Layout.newLayout().build();
        final Shape rootShape = layout.createShape(new ObjectType());
        final DynamicObject obj = rootShape.newInstance();
        final boolean is = JavaInterop.isBoxed(obj);
        assertFalse("It is not boxed", is);
    }

    @Test
    public void objectTypeRespondsToIsNull() {
        final Layout layout = Layout.newLayout().build();
        final Shape rootShape = layout.createShape(new ObjectType());
        final DynamicObject obj = rootShape.newInstance();
        final boolean is = JavaInterop.isNull(obj);
        assertFalse("It is not null", is);
    }

    @Test
    public void objectTypeRespondsToIsArray() {
        final Layout layout = Layout.newLayout().build();
        final Shape rootShape = layout.createShape(new ObjectType());
        final DynamicObject obj = rootShape.newInstance();
        final boolean is = JavaInterop.isArray(obj);
        assertFalse("It is not array", is);
    }

}
