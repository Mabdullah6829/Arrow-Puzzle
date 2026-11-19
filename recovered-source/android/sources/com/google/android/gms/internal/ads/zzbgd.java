package com.google.android.gms.internal.ads;

import androidx.collection.ScatterMapKt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgd {
    /* JADX INFO: renamed from: a */
    public static int m4861a(String str) {
        int i2;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = length & (-4);
            if (i4 >= i2) {
                break;
            }
            int i6 = ((bytes[i4] & 255) | ((bytes[i4 + 1] & 255) << 8) | ((bytes[i4 + 2] & 255) << 16) | (bytes[i4 + 3] << 24)) * ScatterMapKt.MurmurHashC1;
            int i7 = i5 ^ (((i6 >>> 17) | (i6 << 15)) * 461845907);
            i5 = (((i7 >>> 19) | (i7 << 13)) * 5) - 430675100;
            i4 += 4;
        }
        int i8 = length & 3;
        if (i8 == 1) {
            int i9 = ((bytes[i2] & 255) | i3) * ScatterMapKt.MurmurHashC1;
            i5 ^= ((i9 >>> 17) | (i9 << 15)) * 461845907;
        } else {
            if (i8 != 2) {
                i3 = i8 == 3 ? (bytes[i2 + 2] & 255) << 16 : 0;
            }
            i3 |= (bytes[i2 + 1] & 255) << 8;
            int i10 = ((bytes[i2] & 255) | i3) * ScatterMapKt.MurmurHashC1;
            i5 ^= ((i10 >>> 17) | (i10 << 15)) * 461845907;
        }
        int i11 = i5 ^ length;
        int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
        int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
        return i13 ^ (i13 >>> 16);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[DONT_INVERT] */
    /* JADX INFO: renamed from: b */
    public static String[] m4862b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < str.length()) {
            int iCodePointAt = Character.codePointAt(charArray, i2);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z2) {
                        arrayList.add(new String(charArray, i3, i2 - i3));
                    }
                    arrayList.add(new String(charArray, i2, iCharCount));
                } else {
                    if (!Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                        if (true != z2) {
                            i3 = i2;
                        }
                    } else if (z && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z2) {
                            i3 = i2;
                        }
                    } else if (z2) {
                        arrayList.add(new String(charArray, i3, i2 - i3));
                    }
                    z2 = true;
                }
                z2 = false;
            } else {
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z2) {
                        i3 = i2;
                    }
                } else if (true != z2) {
                    i3 = i2;
                }
                z2 = true;
            }
            i2 += iCharCount;
        }
        if (z2) {
            arrayList.add(new String(charArray, i3, i2 - i3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
