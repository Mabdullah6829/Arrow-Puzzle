package com.instagram.common.viewpoint.core;

import android.util.Log;
import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2653Cm implements InterfaceC4444fu {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{72, 99, 114, 113, 105, 116, 109, 38, 99, 116, 116, 105, 116};
    }

    public C2653Cm(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            Log.e(getClass().getSimpleName(), A00(0, 13, C1137R.styleable.ConstraintSet_transitionPathRotate), e);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4444fu
    public final byte[] A72() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4444fu
    public final String A73() {
        if (this.A03 != null) {
            return new String(this.A03);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4444fu
    public final Map<String, List<String>> A8E() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4444fu
    public final int A9C() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4444fu
    public final String getUrl() {
        return this.A01;
    }
}
