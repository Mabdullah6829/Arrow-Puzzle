package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2497AE implements InterfaceC4973oo, InterfaceC23667p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C23697s A05;
    public C24018O A06;
    public InterfaceC2696DT A07;
    public boolean A08;
    public boolean A09;
    public C5064qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC4623ir A0B = EnumC4623ir.A09;
    public final C23146z A0D = new C23146z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j2, boolean z) throws C2496AD;

    public abstract void A1c(C5064qI[] c5064qIArr, long j2, long j3) throws C2496AD;

    public AbstractC2497AE(int i2) {
        this.A0C = i2;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j2, boolean z) throws C2496AD {
        this.A08 = false;
        this.A02 = j2;
        this.A03 = j2;
        A1a(j2, z);
    }

    public final int A1Q(long j2) {
        return ((InterfaceC2696DT) AbstractC21273y.A01(this.A07)).AK2(j2 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C23146z c23146z, C4985p0 c4985p0, int i2) {
        int iAHP = ((InterfaceC2696DT) AbstractC21273y.A01(this.A07)).AHP(c23146z, c4985p0, i2);
        if (iAHP == -4) {
            if (c4985p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c4985p0.A00 = c4985p0.A01;
            c4985p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c4985p0.A01);
        } else if (iAHP == -5) {
            C5064qI c5064qI = (C5064qI) AbstractC21273y.A01(c23146z.A00);
            if (c5064qI.A0M != LocationRequestCompat.PASSIVE_INTERVAL) {
                c23146z.A00 = c5064qI.A07().A0s(c5064qI.A0M + this.A04).A14();
            }
        }
        return iAHP;
    }

    public final C2496AD A1S(Throwable th, C5064qI c5064qI, int i2) {
        return A1T(th, c5064qI, false, i2);
    }

    public final C2496AD A1T(Throwable th, C5064qI c5064qI, boolean z, int i2) {
        int iA03 = 4;
        if (c5064qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c5064qI);
                iA03 = AbstractC23597i.A03(formatSupport);
            } catch (C2496AD unused) {
            } finally {
                this.A09 = false;
            }
        }
        return C2496AD.A04(th, getName(), A1O(), c5064qI, iA03, z, i2);
    }

    public final C23146z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C23697s A1V() {
        return (C23697s) AbstractC21273y.A01(this.A05);
    }

    public final C24018O A1W() {
        return (C24018O) AbstractC21273y.A01(this.A06);
    }

    public void A1X() throws C2496AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z, boolean z2) throws C2496AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((InterfaceC2696DT) AbstractC21273y.A01(this.A07)).AAe();
    }

    public final C5064qI[] A1e() {
        return (C5064qI[]) AbstractC21273y.A01(this.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void A5x() {
        AbstractC21273y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void A6L(C23697s c23697s, C5064qI[] c5064qIArr, InterfaceC2696DT interfaceC2696DT, long j2, boolean z, boolean z2, long j3, long j4) throws C2496AD {
        AbstractC21273y.A08(this.A01 == 0);
        this.A05 = c23697s;
        this.A01 = 1;
        A1b(z, z2);
        AIa(c5064qIArr, interfaceC2696DT, j3, j4);
        A1P(j2, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final InterfaceC23667p A7D() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public InterfaceC232378 A8T() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC4623ir A99() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final InterfaceC2696DT A9D() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo, com.instagram.common.viewpoint.core.InterfaceC23667p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC23537c
    public void A9i(int i2, Object obj) throws C2496AD {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void AA9(int i2, C24018O c24018o) {
        this.A00 = i2;
        this.A06 = c24018o;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void ACU() throws IOException {
        ((InterfaceC2696DT) AbstractC21273y.A01(this.A07)).ACR();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void AIa(C5064qI[] c5064qIArr, InterfaceC2696DT interfaceC2696DT, long j2, long j3) throws C2496AD {
        AbstractC21273y.A08(!this.A08);
        this.A07 = interfaceC2696DT;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j2;
        }
        this.A0A = c5064qIArr;
        this.A04 = j3;
        A1c(c5064qIArr, j2, j3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void AIm(long j2) throws C2496AD {
        A1P(j2, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws C2496AD {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void start() throws C2496AD {
        AbstractC21273y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void stop() {
        AbstractC21273y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
