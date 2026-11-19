package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsz {
    /* JADX INFO: renamed from: a */
    public static String m7119a(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (m7121c(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (m7121c(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static String m7120b(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7121c(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7122d(String str, CharSequence charSequence) {
        char c;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }
}
