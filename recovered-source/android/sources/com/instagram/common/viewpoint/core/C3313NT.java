package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3313NT implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public C3334No A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public final C3313NT A0D(int i2) {
        this.A02 = i2;
        return this;
    }

    public final C3313NT A0E(int i2) {
        this.A03 = i2;
        return this;
    }

    public final C3313NT A0F(int i2) {
        this.A04 = i2;
        return this;
    }

    public final C3313NT A0G(int i2) {
        this.A05 = i2;
        return this;
    }

    public final C3313NT A0H(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C3313NT A0I(int i2) {
        this.A01 = i2;
        return this;
    }

    public final C3313NT A0J(long j2) {
        this.A06 = j2;
        return this;
    }

    public final C3313NT A0K(C3334No c3334No) {
        this.A07 = c3334No;
        return this;
    }

    public final C3313NT A0L(String str) {
        this.A09 = str;
        return this;
    }

    public final C3313NT A0M(String str) {
        this.A08 = str;
        return this;
    }

    public final C3313NT A0N(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C3313NT A0O(boolean z) {
        this.A0B = z;
        return this;
    }

    public final C3313NT A0P(boolean z) {
        this.A0C = z;
        return this;
    }

    public final C3314NU A0Q() {
        return new C3314NU(this);
    }
}
