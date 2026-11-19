package com.instagram.common.viewpoint.core;

import android.media.MediaCodec;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.BA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2555BA extends Exception {
    public static byte[] A05;
    public final C2548B3 A00;
    public final C2555BA A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, 12, 49, 16, 22, 26, 17, 16, 7, 85, 28, 27, 28, 1, 85, 19, 20, 28, 25, 16, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, 64, 72, 77, 68, 69, 27, 1, 122, 63, 78, 66, 29, 17, 19, 80, 24, 31, 29, 27, 28, 17, 17, 21, 80, 31, 26, 13, 80, 31, 16, 26, 12, 17, 23, 26, 6, 80, 19, 27, 26, 23, 31, 77, 80, 27, 6, 17, 14, 18, 31, 7, 27, 12, 80, 19, 27, 26, 23, 31, 29, 17, 26, 27, 29, 80, 51, 27, 26, 23, 31, 61, 17, 26, 27, 29, 44, 27, 16, 26, 27, 12, 27, 12, 33, 36, 47, 45, 21};
    }

    public C2555BA(C5064qI c5064qI, Throwable th, boolean z, int i2) {
        this(A03(23, 22, 80) + i2 + A03(45, 3, 19) + c5064qI, th, c5064qI.A0W, z, null, A02(i2), null);
    }

    public C2555BA(C5064qI c5064qI, Throwable th, boolean z, C2548B3 c2548b3) {
        this(A03(2, 21, 4) + c2548b3.A03 + A03(0, 2, 93) + c5064qI, th, c5064qI.A0W, z, c2548b3, AbstractC22035C.A02 >= 21 ? A04(th) : null, null);
    }

    public C2555BA(String str, Throwable th, String str2, boolean z, C2548B3 c2548b3, String str3, C2555BA c2555ba) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = c2548b3;
        this.A02 = str3;
        this.A01 = c2555ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2555BA A00(C2555BA c2555ba) {
        return new C2555BA(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, c2555ba);
    }

    public static String A02(int i2) {
        String strA03 = i2 < 0 ? A03(C1137R.styleable.ConstraintSet_transitionEasing, 4, 59) : A03(0, 0, 98);
        StringBuilder sb = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb.append(sign).append(strA03).append(Math.abs(i2)).toString();
    }

    public static String A04(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
