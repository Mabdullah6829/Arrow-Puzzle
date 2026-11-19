package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3K */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C20883K extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C20883K() {
    }

    @Deprecated
    public C20883K(String str) {
        super(str);
    }

    public C20883K(String str, Throwable th, boolean z, int i2) {
        super(str, th);
        this.A01 = z;
        this.A00 = i2;
    }

    public static C20883K A00(String str) {
        return new C20883K(str, null, false, 1);
    }

    public static C20883K A01(String str, Throwable th) {
        return new C20883K(str, th, true, 1);
    }

    public static C20883K A02(String str, Throwable th) {
        return new C20883K(str, th, true, 0);
    }
}
