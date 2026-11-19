package com.instagram.common.viewpoint.core;

import android.net.Uri;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5f */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
public final class C22325f {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public C3244ML A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public C22325f() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C22325f(C22355i c22355i) {
        this.A05 = c22355i.A06;
        this.A04 = c22355i.A05;
        this.A01 = c22355i.A01;
        this.A09 = c22355i.A0A;
        this.A08 = c22355i.A09;
        this.A03 = c22355i.A04;
        this.A02 = c22355i.A03;
        this.A07 = c22355i.A08;
        this.A00 = c22355i.A00;
        this.A06 = c22355i.A07;
    }

    public final C22325f A02(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C22325f A03(long j2) {
        this.A02 = j2;
        return this;
    }

    public final C22325f A04(long j2) {
        this.A03 = j2;
        return this;
    }

    public final C22325f A05(long j2) {
        this.A04 = j2;
        return this;
    }

    public final C22325f A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C22325f A07(C3244ML c3244ml) {
        this.A06 = c3244ml;
        return this;
    }

    public final C22325f A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final C22355i A09() {
        C3244ML c3244ml;
        AbstractC21273y.A03(this.A05, A00(0, 20, C1137R.styleable.ConstraintSet_transitionPathRotate));
        Uri uri = this.A05;
        long j2 = this.A04;
        int i2 = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j3 = this.A03;
        long j4 = this.A02;
        String str = this.A07;
        int i3 = this.A00;
        if (this.A06 != null) {
            c3244ml = this.A06;
        } else {
            c3244ml = new C3244ML();
        }
        return new C22355i(uri, j2, i2, bArr, map, j3, j4, str, i3, c3244ml);
    }
}
