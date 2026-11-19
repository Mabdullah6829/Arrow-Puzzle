package com.instagram.common.viewpoint.core;

import android.widget.TextView;
import com.google.firebase.firestore.util.ExponentialBackoff;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2712Dj extends TextView implements InterfaceC4382eu {
    public static byte[] A02;
    public static String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public C2775Ek A00;
    public final AbstractC3735UN<C21394A> A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 61);
            i5++;
        }
    }

    public static void A04() {
        A02 = new byte[]{15, 26, 24, 78, 16, 15, 26, 24, 78, 18, 18, 24, 18, 18};
    }

    static {
        A04();
        A04 = (int) (AbstractC3926XX.A02 * 6.0f);
    }

    public C2712Dj(C4494gi c4494gi) {
        super(c4494gi);
        this.A01 = new C2713Dk(this);
        AbstractC3966YB.A0V(this, AbstractC3966YB.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A02(long j2) {
        if (j2 <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
        long minutes2 = TimeUnit.MILLISECONDS.toSeconds(j2 % ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS);
        return String.format(Locale.US, A01(0, 9, 23), Long.valueOf(minutes), Long.valueOf(minutes2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AAv(C2775Ek c2775Ek) {
        this.A00 = c2775Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AKV(C2775Ek c2775Ek) {
        this.A00 = c2775Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
