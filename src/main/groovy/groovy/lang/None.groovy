/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package groovy.lang
/**
 * The singleton represents non-existent values.
 *
 * Created by Daniel.Sun on 2016/8/10.
 */
public class None extends Option {
    private static final None _NONE = new None();

    private None() {}

    /**
     * Returns the singleton instance
     *
     * @return the singleton instance
     */
    public static None getInstance() {
        return _NONE;
    }

    @Override
    public Object $get() {
        throw new UnsupportedOperationException("Cannot resolve value on None");
    }

    @Override
    public boolean $isEmpty() {
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof None);
    }

    @Override
    public String toString() {
        return "None";
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        };
    }

    def methodMissing(String name, args) {
        return _NONE;
    }

    def propertyMissing(String name) {
        return _NONE;
    }
}
