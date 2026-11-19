package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.J4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3041J4 {
    public static String[] A00 = {"oZj5aoX1KvbFHq33YkjSnnR9n2", "YrN4", "d5f6mUL", "wzC2np4aQz", "bSG0VkmAa5PTnnRqB4khFtTiUFve1XQW", "Qyz6G41qMcU917EtFwNhHmzpy", "Reep", "5AjdKovxhleFLdRt3FcvPVZSBJ"};

    public static C3040J3 A00(int i2, long[] jArr, int[] iArr, long j2) {
        int chunkSamplesRemaining = 8192 / i2;
        int iA05 = 0;
        for (int i3 : iArr) {
            iA05 += AbstractC22035C.A05(i3, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[iA05];
        int[] iArr2 = new int[iA05];
        int originalSampleIndex = 0;
        long[] timestamps = new long[iA05];
        int[] flags = new int[iA05];
        int i4 = 0;
        int bufferSampleCount = 0;
        int i5 = 0;
        String[] strArr = A00;
        String str = strArr[2];
        String str2 = strArr[3];
        int maxSampleCount = str.length();
        if (maxSampleCount != str2.length()) {
            String[] strArr2 = A00;
            strArr2[2] = "OG99HZu";
            strArr2[3] = "ptKGW28cJb";
            while (true) {
                int rechunkedSampleCount = iArr.length;
                String[] strArr3 = A00;
                String str3 = strArr3[2];
                String str4 = strArr3[3];
                int maxSampleCount2 = str3.length();
                if (maxSampleCount2 == str4.length()) {
                    break;
                }
                A00[5] = "uTdlUcyBkPhiZ9U2ydDZL";
                if (i5 < rechunkedSampleCount) {
                    int rechunkedSampleCount2 = iArr[i5];
                    int maxSampleCount3 = A00[5].length();
                    if (maxSampleCount3 == 5) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A00;
                    strArr4[2] = "PmQbGcH";
                    strArr4[3] = "fT2ewQCR49";
                    long j3 = jArr[i5];
                    while (rechunkedSampleCount2 > 0) {
                        int maximumSize = Math.min(chunkSamplesRemaining, rechunkedSampleCount2);
                        jArr2[bufferSampleCount] = j3;
                        iArr2[bufferSampleCount] = i2 * maximumSize;
                        originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                        timestamps[bufferSampleCount] = ((long) i4) * j2;
                        flags[bufferSampleCount] = 1;
                        j3 += (long) iArr2[bufferSampleCount];
                        i4 += maximumSize;
                        rechunkedSampleCount2 -= maximumSize;
                        bufferSampleCount++;
                    }
                    i5++;
                } else {
                    return new C3040J3(jArr2, iArr2, originalSampleIndex, timestamps, flags, j2 * ((long) i4));
                }
            }
        }
        throw new RuntimeException();
    }
}
