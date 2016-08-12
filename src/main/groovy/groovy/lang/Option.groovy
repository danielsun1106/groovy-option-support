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
package groovy.lang;

import java.io.Serializable;

/**
 * Represents optional values. Instances of Option are either an instance of groovy.lang.Some or the singleton groovy.lang.None.
 *
 * Created by Daniel.Sun on 2016/8/10.
 */
public abstract class Option<T> implements Iterable<T>, Serializable {
    public abstract T $get();
    public abstract T $getOrElse(T dflt);
    public abstract boolean $isEmpty();

    public static <T> Option<T> $new(T obj) {
        return null == obj ? None.instance : new Some<T>(obj);
    }
}
