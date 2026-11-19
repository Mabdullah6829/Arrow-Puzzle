package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8P */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC24028P extends AbstractC4984oz implements InterfaceC3082Jj {
    public long A00;
    public InterfaceC3082Jj A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC4984oz
    public abstract void A0B();

    @Override // com.instagram.common.viewpoint.core.AbstractC22475u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j2, InterfaceC3082Jj interfaceC3082Jj, long j3) {
        super.A01 = j2;
        this.A01 = interfaceC3082Jj;
        if (j3 == LocationRequestCompat.PASSIVE_INTERVAL) {
            j3 = super.A01;
        }
        this.A00 = j3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final List<C5014pT> A7X(long j2) {
        return ((InterfaceC3082Jj) AbstractC21273y.A01(this.A01)).A7X(j2 - this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final long A83(int i2) {
        return ((InterfaceC3082Jj) AbstractC21273y.A01(this.A01)).A83(i2) + this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A84() {
        return ((InterfaceC3082Jj) AbstractC21273y.A01(this.A01)).A84();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A8a(long j2) {
        return ((InterfaceC3082Jj) AbstractC21273y.A01(this.A01)).A8a(j2 - this.A00);
    }
}
