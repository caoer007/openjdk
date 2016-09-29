/*
 * Copyright (c) 1997, 2011, Oracle and/or its affiliates. All rights reserved.
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

/* this file is generated by RelaxNGCC */
package com.sun.xml.internal.xsom.impl.parser.state;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import com.sun.xml.internal.xsom.impl.parser.NGCCRuntimeEx;

    import com.sun.xml.internal.xsom.*;
    import com.sun.xml.internal.xsom.parser.*;
    import com.sun.xml.internal.xsom.impl.*;
    import com.sun.xml.internal.xsom.impl.parser.*;
    import org.xml.sax.Locator;
    import org.xml.sax.ContentHandler;
    import org.xml.sax.helpers.*;
    import java.util.*;
    import java.math.BigInteger;



class simpleType extends NGCCHandler {
    private AnnotationImpl annotation;
    private String name;
    private ForeignAttributesImpl fa;
    private String finalValue;
    protected final NGCCRuntimeEx $runtime;
    private int $_ngcc_current_state;
    protected String $uri;
    protected String $localName;
    protected String $qname;

    public final NGCCRuntime getRuntime() {
        return($runtime);
    }

    public simpleType(NGCCHandler parent, NGCCEventSource source, NGCCRuntimeEx runtime, int cookie) {
        super(source, parent, cookie);
        $runtime = runtime;
        $_ngcc_current_state = 19;
    }

    public simpleType(NGCCRuntimeEx runtime) {
        this(null, runtime, runtime, -1);
    }

    private void action0()throws SAXException {
        finalSet = makeFinalSet(finalValue);
}

    private void action1()throws SAXException {
        locator=$runtime.copyLocator();
}

    public void enterElement(String $__uri, String $__local, String $__qname, Attributes $attrs) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 2:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("restriction"))) {
                    NGCCHandler h = new SimpleType_Restriction(this, super._source, $runtime, 182, annotation,locator,fa,name,finalSet);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("list"))) {
                        NGCCHandler h = new SimpleType_List(this, super._source, $runtime, 183, annotation,locator,fa,name,finalSet);
                        spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                    }
                    else {
                        if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("union"))) {
                            NGCCHandler h = new SimpleType_Union(this, super._source, $runtime, 177, annotation,locator,fa,name,finalSet);
                            spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                        }
                        else {
                            unexpectedEnterElement($__qname);
                        }
                    }
                }
            }
            break;
        case 7:
            {
                action0();
                $_ngcc_current_state = 2;
                $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 15:
            {
                if(($ai = $runtime.getAttributeIndex("","final"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 11;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterElement(result, super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 11:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 19:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("simpleType"))) {
                    $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                    action1();
                    $_ngcc_current_state = 15;
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 10:
            {
                if((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation")) || (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("union")) || (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("restriction")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("list")))))) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 188, fa);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 8:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 186, null,AnnotationContext.SIMPLETYPE_DECL);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 7;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        default:
            {
                unexpectedEnterElement($__qname);
            }
            break;
        }
    }

    public void leaveElement(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 7:
            {
                action0();
                $_ngcc_current_state = 2;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 15:
            {
                if(($ai = $runtime.getAttributeIndex("","final"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 11;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromLeaveElement(result, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 11:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 8:
            {
                $_ngcc_current_state = 7;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("simpleType"))) {
                    $runtime.onLeaveElementConsumed($__uri, $__local, $__qname);
                    $_ngcc_current_state = 0;
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        default:
            {
                unexpectedLeaveElement($__qname);
            }
            break;
        }
    }

    public void enterAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 7:
            {
                action0();
                $_ngcc_current_state = 2;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 15:
            {
                if(($__uri.equals("") && $__local.equals("final"))) {
                    $_ngcc_current_state = 17;
                }
                else {
                    $_ngcc_current_state = 11;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterAttribute(result, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 11:
            {
                if(($__uri.equals("") && $__local.equals("name"))) {
                    $_ngcc_current_state = 13;
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 8:
            {
                $_ngcc_current_state = 7;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedEnterAttribute($__qname);
            }
            break;
        }
    }

    public void leaveAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 7:
            {
                action0();
                $_ngcc_current_state = 2;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 15:
            {
                $_ngcc_current_state = 11;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 16:
            {
                if(($__uri.equals("") && $__local.equals("final"))) {
                    $_ngcc_current_state = 11;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 12:
            {
                if(($__uri.equals("") && $__local.equals("name"))) {
                    $_ngcc_current_state = 10;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromLeaveAttribute(result, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 11:
            {
                $_ngcc_current_state = 10;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 8:
            {
                $_ngcc_current_state = 7;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveAttribute($__qname);
            }
            break;
        }
    }

    public void text(String $value) throws SAXException {
        int $ai;
        switch($_ngcc_current_state) {
        case 7:
            {
                action0();
                $_ngcc_current_state = 2;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 15:
            {
                if(($ai = $runtime.getAttributeIndex("","final"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 11;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 13:
            {
                name = $value;
                $_ngcc_current_state = 12;
            }
            break;
        case 0:
            {
                revertToParentFromText(result, super._cookie, $value);
            }
            break;
        case 11:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 17:
            {
                finalValue = $value;
                $_ngcc_current_state = 16;
            }
            break;
        case 8:
            {
                $_ngcc_current_state = 7;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        }
    }

    public void onChildCompleted(Object $__result__, int $__cookie__, boolean $__needAttCheck__)throws SAXException {
        switch($__cookie__) {
        case 186:
            {
                annotation = ((AnnotationImpl)$__result__);
                $_ngcc_current_state = 7;
            }
            break;
        case 188:
            {
                fa = ((ForeignAttributesImpl)$__result__);
                $_ngcc_current_state = 8;
            }
            break;
        case 182:
            {
                result = ((RestrictionSimpleTypeImpl)$__result__);
                $_ngcc_current_state = 1;
            }
            break;
        case 183:
            {
                result = ((ListSimpleTypeImpl)$__result__);
                $_ngcc_current_state = 1;
            }
            break;
        case 177:
            {
                result = ((UnionSimpleTypeImpl)$__result__);
                $_ngcc_current_state = 1;
            }
            break;
        }
    }

    public boolean accepted() {
        return(($_ngcc_current_state == 0));
    }


                /** computed simple type object */
                private SimpleTypeImpl result;

                private Locator locator;

      private Set finalSet;

      private Set makeFinalSet(String finalValue) {
        if(finalValue==null)
          return Collections.EMPTY_SET;

        Set s = new HashSet();
        StringTokenizer tokens = new StringTokenizer(finalValue);
        while(tokens.hasMoreTokens()) {
          String token = tokens.nextToken();
          if(token.equals("#all")) {
            s.add(XSVariety.ATOMIC);
            s.add(XSVariety.UNION);
            s.add(XSVariety.LIST);
          }
          if(token.equals("list")) {
            s.add(XSVariety.LIST);
          }
          if(token.equals("union")) {
            s.add(XSVariety.UNION);
          }
          if(token.equals("restriction")) {
            s.add(XSVariety.ATOMIC);
          }
        }
        return s;
      }

}
