package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ht */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4566ht implements InterfaceC3512Qk {
    public static byte[] A07;
    public static String[] A08 = {"t5607oHfL2MNwmRFcsOr1jnyxzutumg5", "jNVCF7hNBx7qTlxJtSxtZf62y0YMH9ti", "vdh53KDEVDvYPF4U9zJ9CmemLfeqkfcW", "xmowDJGre", "ZTG0qcJaBRai17vkpDLZ7jbeFwjjrIPL", "kzc7Q54viT3CLivIFTQawvhHzc5bSJU6", "6m9Kb2lg4QS4P0ZcGJ2XwsRwfv4UyCAv", "gH"};
    public int A00;
    public InterfaceC3421PD<C3490QN> A01;
    public final InterfaceC3489QM A02;
    public final C3513Ql A03;
    public final ArrayList<C3490QN> A04;
    public final ArrayList<C3490QN> A05;
    public final boolean A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{23, 25, 16, 19, 2, 26, 15, 12, 2, 7};
    }

    static {
        A02();
    }

    public C4566ht(InterfaceC3489QM interfaceC3489QM) {
        this(interfaceC3489QM, false);
    }

    public C4566ht(InterfaceC3489QM interfaceC3489QM, boolean z) {
        this.A01 = new C4577i6(30);
        this.A04 = new ArrayList<>();
        this.A05 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC3489QM;
        this.A06 = z;
        this.A03 = new C3513Ql(this);
    }

    private final int A00(int i2, int i3) {
        int count = this.A05.size();
        if (i3 < count) {
            this.A05.get(i3);
            throw new NullPointerException(A01(0, 3, 126));
        }
        return i2;
    }

    private final void A03(List<C3490QN> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            A0A(null);
        }
        list.clear();
        if (A08[1].charAt(29) != '9') {
            throw new RuntimeException();
        }
        A08[2] = "ayjYK9F9Z6sDhNCNS52R1Qcr5XRGx639";
    }

    public final int A04(int i2) {
        return A00(i2, 0);
    }

    public final int A05(int i2) {
        int size = this.A04.size();
        if (0 < size) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        return i2;
    }

    public final void A06() {
        int count = this.A05.size();
        if (0 < count) {
            InterfaceC3489QM interfaceC3489QM = this.A02;
            this.A05.get(0);
            String[] strArr = A08;
            String str = strArr[0];
            String str2 = strArr[4];
            int i2 = str.charAt(3);
            int count2 = str2.charAt(3);
            if (i2 != count2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "Yhl0jQrdp33aIQ4Nx5XRCxKVlJRMQ99k";
            strArr2[4] = "te80aWrb7iKuE4ta48s0tNKQ3kiAwVCD";
            interfaceC3489QM.ADg(null);
            throw null;
        }
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A07() {
        A06();
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(C3490QN c3490qn) {
        if (!this.A06) {
            throw new NullPointerException(A01(3, 7, 105));
        }
    }

    public final boolean A0B() {
        return this.A04.size() > 0;
    }

    public final boolean A0C() {
        return (this.A05.isEmpty() || this.A04.isEmpty()) ? false : true;
    }

    public final boolean A0D(int i2) {
        return (this.A00 & i2) != 0;
    }
}
