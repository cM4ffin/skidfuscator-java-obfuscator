/*
 * Copyright 2014 Higher Frequency Trading http://www.higherfrequencytrading.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sdk;

enum UnknownJvmStringHash implements StringHash {
    INSTANCE;

    @Override
    public long longHash(String s, LongHashFunction hashFunction, int off, int len) {
        return hashFunction.hashNativeChars(s, off, len);
    }

    @Override
    public void hash(final String s, final LongTupleHashFunction hashFunction,
                    final int off, final int len, final long[] result) {
        LongTupleHashFunction.hashNativeChars(hashFunction, s, off, len, result);
    }
}
