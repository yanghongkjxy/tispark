/*
 * Copyright 2017 PingCAP, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pingcap.tikv.predicates;

import com.google.common.collect.Range;
import com.pingcap.tikv.key.Key;
import com.pingcap.tikv.key.TypedKey;


public class IndexRange {
  private Key accessKey;
  private Range<TypedKey> range;

  public IndexRange(Key accessKey, Range<TypedKey> range) {
    this.accessKey = accessKey;
    this.range = range;
  }

  public IndexRange(Key accessKey) {
    this.accessKey = accessKey;
    this.range = null;
  }

  Key getAccessKey() {
    return accessKey;
  }

  boolean hasAccessKeys() {
    return accessKey != null && accessKey != null;
  }

  boolean hasRange() {
    return range != null;
  }

  public Range<TypedKey> getRange() {
    return range;
  }
}