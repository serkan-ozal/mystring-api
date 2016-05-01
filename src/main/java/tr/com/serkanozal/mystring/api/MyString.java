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

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

public interface MyString {

    int length();
    boolean isEmpty();
    char charAt(int index);
    int codePointAt(int index);
    int codePointBefore(int index);
    int codePointCount(int beginIndex, int endIndex);
    int offsetByCodePoints(int index, int codePointOffset);
    void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin);
    void getBytes(int srcBegin, int srcEnd, byte dst[], int dstBegin);
    byte[] getBytes(String charsetName) throws UnsupportedEncodingException;
    byte[] getBytes(Charset charset);
    byte[] getBytes();
    boolean equals(Object obj);
    boolean contentEquals(StringBuffer sb);
    boolean contentEquals(CharSequence cs);
    boolean equalsIgnoreCase(String anotherString);
    int compareTo(String anotherString);
    int compareToIgnoreCase(String anotherString);
    boolean regionMatches(int toffset, String other, int ooffset, int len);
    boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len);
    boolean startsWith(String prefix, int toffset);
    boolean startsWith(String prefix);
    boolean endsWith(String suffix);
    int hashCode();
    int indexOf(int ch);
    int indexOf(int ch, int fromIndex);
    int lastIndexOf(int ch);
    int lastIndexOf(int ch, int fromIndex);
    int indexOf(String str);
    int indexOf(String str, int fromIndex);
    int lastIndexOf(String str);
    int lastIndexOf(String str, int fromIndex);
    String substring(int beginIndex);
    String substring(int beginIndex, int endIndex);
    CharSequence subSequence(int beginIndex, int endIndex);
    String concat(String str);
    String replace(char oldChar, char newChar);
    boolean matches(String regex);
    boolean contains(CharSequence seq);
    String replaceFirst(String regex, String replacement);
    String replaceAll(String regex, String replacement);
    String replace(CharSequence target, CharSequence replacement);
    String[] split(String regex, int limit);
    String[] split(String regex);
    String toLowerCase(Locale locale);
    String toLowerCase();
    String toUpperCase(Locale locale);
    String toUpperCase();
    String trim();
    char[] toCharArray();
    String intern();
    String toString();
    
    ////////////////////////////////////////////////////////
    
    long INVALID_STORAGE_ID = -1;
    Object INVALID_STORAGE_BASE = null;
    long INVALID_STORAGE_SIZE = -1;
    
    long getStorageId();
    <T> T getStorageBase();
    long getStorageSize();
    <S> MyStringProcessor<S> getMyStringProcessor();
    void destroy();

}
