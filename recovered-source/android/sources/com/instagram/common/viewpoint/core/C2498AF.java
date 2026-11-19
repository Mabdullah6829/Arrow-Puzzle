package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2498AF implements InterfaceC5000pF {
    public static String[] A04 = {"wbGAhFLyG1O1BXRQkdAsuvRwjcG0JvdY", "WIGHUXkmdMwjKtYrGQHAEajnCcLVhsJc", "71g9TI5vzncmEyYDsqHRZQ5IIDSVhuCU", "Of7gEliA8dohBLU5UePsnNPr9luYUKIX", "Ip7oB5coOYYSe2wQ3nHh7WYhGK", "mFyxGR7YA7Uh54mquru9LT9AFg", "iYrL5ZFnNwboLBDSkDK7D5rnh7HwI2GN", "DEMvAgZEfGNSxO1Scy7Mz579azioI4xU"};
    public long A00;
    public boolean A01;
    public final InterfaceC22235W A02;
    public final InterfaceC5000pF A03;

    public C2498AF(InterfaceC5000pF interfaceC5000pF, InterfaceC22235W interfaceC22235W) {
        this.A03 = (InterfaceC5000pF) AbstractC21273y.A01(interfaceC5000pF);
        this.A02 = (InterfaceC22235W) AbstractC21273y.A01(interfaceC22235W);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void A43(InterfaceC22465t interfaceC22465t) {
        AbstractC21273y.A01(interfaceC22465t);
        this.A03.A43(interfaceC22465t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Map<String, List<String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final long AGi(C22355i c22355i) throws IOException {
        this.A00 = this.A03.AGi(c22355i);
        if (this.A00 == 0) {
            return 0L;
        }
        long j2 = c22355i.A03;
        String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "8JYiy7Q3QOgUU9IJtNo1oEeVZYLkhQA2";
        strArr2[1] = "C3hXJiAszWGMEEgz1C8EzdfpsF4hhGij";
        if (j2 == -1 && this.A00 != -1) {
            c22355i = c22355i.A05(0L, this.A00);
        }
        this.A01 = true;
        this.A02.AGk(c22355i);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20482c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.A00 != 0) {
            int i4 = this.A03.read(bArr, i2, i3);
            if (i4 > 0) {
                this.A02.write(bArr, i2, i4);
                if (this.A00 != -1) {
                    this.A00 -= (long) i4;
                }
            }
            return i4;
        }
        String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "tTmOA5hODgmGBNxF0mS11dvWTNwifcB6";
        strArr2[3] = "mpSZqupnUd3dBB1VIyplsxMvqiIWybTS";
        return -1;
    }
}
