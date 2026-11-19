package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC4492gg {
    public static byte[] A01;
    public static String[] A02 = {"4MR", "ox3", "IUsSI7rcrCx1ERgKd0rYF5wqQshT9MFY", "XMpLbdKCI8ptDt9BVBTjCKDwrbbZ39Yk", "reDnu4iC6gOf", "58W6JAylc1sA", "T5hdxNMEH3a8tXz2YdYKh9bF2ZTD6zRG", "CM8HCV1eVyulF3snUIL5CjajvzNLA86A"};
    public static final /* synthetic */ EnumC4492gg[] A03;
    public static final EnumC4492gg A04;
    public static final EnumC4492gg A05;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "zM61rMpjrvDScug74JUjCxPutIg5FxhC";
            strArr2[7] = "TMGBJitMUu1pxt90KbWrvOLR2BVfJ6J0";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 11);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-86, -83, -80, -80, -104, -109, -121, -124, -105, -120, -116, -113, -110, -110, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
        A04 = new EnumC4492gg(A00(0, 4, 89), 0, A00(10, 4, 27));
        A05 = new EnumC4492gg(A00(4, 6, 56), 1, A00(14, 6, 40));
        A03 = A02();
    }

    public EnumC4492gg(String str, int i2, String str2) {
        super(str, i2);
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC4492gg[] A02() {
        EnumC4492gg[] enumC4492ggArr = new EnumC4492gg[2];
        enumC4492ggArr[0] = A04;
        EnumC4492gg enumC4492gg = A05;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[2] = "lJSENTz9psORZi9A2zDcPU2PQxg7yytN";
        enumC4492ggArr[1] = enumC4492gg;
        return enumC4492ggArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC4492gg valueOf(String str) {
        return (EnumC4492gg) Enum.valueOf(EnumC4492gg.class, str);
    }

    public static EnumC4492gg[] values() {
        return (EnumC4492gg[]) A03.clone();
    }
}
