package com.instagram.common.viewpoint.core;

import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4990p5 extends C22285b {
    public static byte[] A02;
    public final int A00;
    public final C22355i A01;

    static {
        A06();
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C4990p5(C22355i c22355i, int i2, int i3) {
        super(A03(i2, i3));
        this.A01 = c22355i;
        this.A00 = i3;
    }

    public C4990p5(IOException iOException, C22355i c22355i, int i2, int i3) {
        super(iOException, A03(i2, i3));
        this.A01 = c22355i;
        this.A00 = i3;
    }

    public C4990p5(String str, C22355i c22355i, int i2, int i3) {
        super(str, A03(i2, i3));
        this.A01 = c22355i;
        this.A00 = i3;
    }

    public C4990p5(String str, IOException iOException, C22355i c22355i, int i2, int i3) {
        super(str, iOException, A03(i2, i3));
        this.A01 = c22355i;
        this.A00 = i3;
    }

    public static int A03(int i2, int i3) {
        if (i2 == 2000 && i3 == 1) {
            return AdError.INTERNAL_ERROR_CODE;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    public static C4990p5 A04(IOException iOException, C22355i c22355i, int i2) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = PointerIconCompat.TYPE_WAIT;
        } else if (message != null) {
            String strA01 = AbstractC4699k7.A01(message);
            String message2 = A05(0, 26, 62);
            if (strA01.matches(message2)) {
                errorCode = 2007;
            } else {
                errorCode = AdError.INTERNAL_ERROR_CODE;
            }
        } else {
            errorCode = AdError.INTERNAL_ERROR_CODE;
        }
        if (errorCode == 2007) {
            return new C2505AM(iOException, c22355i);
        }
        return new C4990p5(iOException, c22355i, errorCode, i2);
    }
}
