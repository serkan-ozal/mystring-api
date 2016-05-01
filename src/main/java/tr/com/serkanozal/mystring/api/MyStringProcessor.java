/*
 * Copyright (c) 1986-2016, Serkan OZAL, All Rights Reserved.
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

package tr.com.serkanozal.mystring.api;

public interface MyStringProcessor<S> {

    long createStorageId(long size);
    S createStorageBase(long storageId, long size);
    long getStorageSize(long storageId, long size);
    
    long createStorageId(char[] value, int offet, int length);
    S createStorageBase(long storageId, char[] value, int offet, int length);
    long getStorageSize(long storageId, char[] value, int offet, int length);
    
    long createStorageId(MyString myStr);
    S createStorageBase(long storageId, MyString myStr);
    long getStorageSize(long storageId, MyString myStr);
    
    char readValue(long storageId, S storageBase, int index);
    void writeValue(long storageId, S storageBase, int index, char c);
    
    void copyValue(long storageId, S storageBase, int srcBegin, char[] dst, int dstBegin, int len);
    
    void destroy(long storageId, S storageBase);
    
}
