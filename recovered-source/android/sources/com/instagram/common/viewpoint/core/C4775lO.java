package com.instagram.common.viewpoint.core;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4775lO implements InterfaceC3156Kv {
    public static String[] A0B = {"dLkHlusgcNv2NHu1x", "kOXDYUAe8n5k0zIrGkajB2ICMzhCI1bW", "J2PER8S0U1OpHQWQYcrbTTlLRvEHJnnX", "68SowiJizkgZ7NsO9", "yBvkDSkIOuw9vvMDA", "yIdyl2Bhz3wOi3n7q0uPuN", "BOu02ldMHGg7m0a8qy56aJXpGwCl3gmF", "zi7PV4PgK11phQSkaHF2tMz4gZWLtpOH"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public C5064qI A06;
    public InterfaceC2953Hd A07;
    public String A08;
    public final String A0A;
    public final C21864v A09 = new C21864v(new byte[18]);
    public int A02 = 0;
    public long A05 = -9223372036854775807L;

    public C4775lO(String str) {
        this.A0A = str;
    }

    @RequiresNonNull({"output"})
    private void A00() {
        byte[] bArrA0l = this.A09.A0l();
        if (this.A06 == null) {
            this.A06 = AbstractC2921H7.A03(bArrA0l, this.A08, this.A0A, null);
            this.A07.A6e(this.A06);
        }
        this.A01 = AbstractC2921H7.A01(bArrA0l);
        this.A04 = (int) ((((long) AbstractC2921H7.A02(bArrA0l)) * 1000000) / ((long) this.A06.A0G));
    }

    private boolean A01(C21864v c21864v) {
        while (c21864v.A07() > 0) {
            this.A03 <<= 8;
            this.A03 |= c21864v.A0I();
            if (AbstractC2921H7.A07(this.A03)) {
                byte[] bArrA0l = this.A09.A0l();
                bArrA0l[0] = (byte) ((this.A03 >> 24) & 255);
                bArrA0l[1] = (byte) ((this.A03 >> 16) & 255);
                bArrA0l[2] = (byte) ((this.A03 >> 8) & 255);
                bArrA0l[3] = (byte) (this.A03 & 255);
                if (A0B[2].charAt(27) == '4') {
                    throw new RuntimeException();
                }
                A0B[2] = "EvoORA1qucNZxupBm89VmEjcctmXNkxV";
                this.A00 = 4;
                this.A03 = 0;
                return true;
            }
        }
        return false;
    }

    private boolean A02(C21864v c21864v, byte[] bArr, int i2) {
        int iMin = Math.min(c21864v.A07(), i2 - this.A00);
        int bytesToRead = this.A00;
        c21864v.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void A5A(C21864v c21864v) {
        AbstractC21273y.A02(this.A07);
        while (c21864v.A07() > 0) {
            switch (this.A02) {
                case 0:
                    boolean zA01 = A01(c21864v);
                    if (A0B[6].charAt(14) != 'a') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[1] = "LnG0CahPOhXel4OI27B1IhRoFtWtCxEm";
                    strArr[7] = "4f6V0CDv6EuXljjMlCYsbwPtjLzOLcdT";
                    if (zA01) {
                        this.A02 = 1;
                    }
                    break;
                case 1:
                    if (A02(c21864v, this.A09.A0l(), 18)) {
                        A00();
                        this.A09.A0f(0);
                        this.A07.AIr(this.A09, 18);
                        this.A02 = 2;
                    }
                    break;
                case 2:
                    int iMin = Math.min(c21864v.A07(), this.A01 - this.A00);
                    this.A07.AIr(c21864v, iMin);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + iMin;
                    int i2 = this.A00;
                    int bytesToRead2 = this.A01;
                    if (i2 == bytesToRead2) {
                        if (this.A05 != -9223372036854775807L) {
                            this.A07.AIu(this.A05, 1, this.A01, 0, null);
                            this.A05 += this.A04;
                        }
                        this.A02 = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void A5c(InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        c3177lg.A05();
        this.A08 = c3177lg.A04();
        this.A07 = interfaceC2924HA.AKS(c3177lg.A03(), 1);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AGp() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AGq(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.A05 = j2;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AJ5() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A05 = -9223372036854775807L;
    }
}
