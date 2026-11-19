package com.instagram.common.viewpoint.core;

import android.os.SystemClock;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4948oP implements InterfaceC243793 {
    public static byte[] A01;
    public static String[] A02 = {"JE7C4PJjP7BCbZqkJpMMyURXZ5h", "iMYF6XNZz1LBnq9Lsd18aPb3vu2", "XxqNLC6c7RSVqgSJXO5oI", "nEpRStmmyFjBR5hyZRShRQxXaXf0Mj7x", "WMevU6o4a2paeBy7iKLxLT9X", "1yBfwy19", "IbfL1f4elDnhfhlOaFmHA7", "3K7V2NpliX3hv5M7KS"};
    public final /* synthetic */ C4945oM A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ C1137R.styleable.ConstraintSet_polarRelativeTo);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {64, 76, 70, 103, 100, 99, 119, 110, 118, 67, 119, 102, 107, 109, 81, 107, 108, 105, 24, 54, 63, 62, 35, 56, 63, 54, 113, 56, 60, 33, 62, 34, 34, 56, 51, 61, 40, 113, 61, 48, 35, 54, 52, 113, 48, 36, 53, 56, 62, 113, 61, 48, 37, 52, 63, 50, 40, 107, 113, 98, 65, 68, 67, 88, 94, 68, 66, 17, 80, 68, 85, 88, 94, 17, 69, 88, 92, 84, 66, 69, 80, 92, 65, 17, 25, 87, 67, 80, 92, 84, 17, 65, 94, 66, 88, 69, 88, 94, 95, 17, 92, 88, 66, 92, 80, 69, 82, 89, 24, 11, 17, 102, 69, 64, 71, 92, 90, 64, 70, 21, 84, 64, 81, 92, 90, 21, 65, 92, 88, 80, 70, 65, 84, 88, 69, 21, 29, 70, 76, 70, 65, 80, 88, 21, 86, 89, 90, 86, 94, 21, 88, 92, 70, 88, 84, 65, 86, 93, 28, 15, 21};
        if (A02[4].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "crOuuTwIIsvqp0CyO4zKH";
        strArr[6] = "QvBSziwTMADuiMqU3qgYIx";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C4948oP(C4945oM c4945oM) {
        this.A00 = c4945oM;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC243793
    public final void AEM(long j2) {
        AbstractC21714g.A07(A00(2, 16, C1137R.styleable.ConstraintSet_pathMotionArc), A00(18, 41, 39) + j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC243793
    public final void AFN(long j2) {
        if (this.A00.A0I != null) {
            C4945oM c4945oM = this.A00;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "XUD65QsQyQCwJDnhFrO8y";
            strArr2[6] = "L1DcP3KlVDNfGhVI0cZDzs";
            c4945oM.A0I.AFN(j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC243793
    public final void AFP(long j2, long j3, long j4, long j5) {
        StringBuilder sbAppend = new StringBuilder().append(A00(59, 52, 71)).append(j2);
        String strA00 = A00(0, 2, 26);
        String string = sbAppend.append(strA00).append(j3).append(strA00).append(j4).append(strA00).append(j5).append(strA00).append(this.A00.A06()).append(strA00).append(this.A00.A07()).toString();
        if (!C4945oM.A0v) {
            String message = A00(2, 16, C1137R.styleable.ConstraintSet_pathMotionArc);
            AbstractC21714g.A07(message, string);
            return;
        }
        throw new C24499I(string);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC243793
    public final void AG9(long j2, long j3, long j4, long j5) {
        StringBuilder sbAppend = new StringBuilder().append(A00(111, 50, 67)).append(j2);
        String strA00 = A00(0, 2, 26);
        String string = sbAppend.append(strA00).append(j3).append(strA00).append(j4).append(strA00).append(j5).append(strA00).append(this.A00.A06()).append(strA00).append(this.A00.A07()).toString();
        if (!C4945oM.A0v) {
            String message = A00(2, 16, C1137R.styleable.ConstraintSet_pathMotionArc);
            AbstractC21714g.A07(message, string);
            return;
        }
        throw new C24499I(string);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC243793
    public final void AGI(int i2, long j2) {
        if (this.A00.A0I != null) {
            this.A00.A0I.AGJ(i2, j2, SystemClock.elapsedRealtime() - this.A00.A07);
        }
    }
}
