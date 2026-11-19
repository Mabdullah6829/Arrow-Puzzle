package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5004pJ implements InterfaceC21624X {
    public static final List<C5005pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C5004pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C5005pK A00() {
        C5005pK c5005pK;
        synchronized (A01) {
            c5005pK = A01.isEmpty() ? new C5005pK() : A01.remove(A01.size() - 1);
        }
        return c5005pK;
    }

    public static void A01(C5005pK c5005pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c5005pK);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final boolean A9n(int i2) {
        return this.A00.hasMessages(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final C5005pK ACg(int i2) {
        return A00().A01(this.A00.obtainMessage(i2), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final C5005pK ACh(int i2, int i3, int i4) {
        return A00().A01(this.A00.obtainMessage(i2, i3, i4), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final C5005pK ACi(int i2, int i3, int i4, Object obj) {
        return A00().A01(this.A00.obtainMessage(i2, i3, i4, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final C5005pK ACj(int i2, Object obj) {
        return A00().A01(this.A00.obtainMessage(i2, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final void AIT(int i2) {
        this.A00.removeMessages(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final boolean AJA(int i2) {
        return this.A00.sendEmptyMessage(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final boolean AJB(int i2, long j2) {
        return this.A00.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21624X
    public final boolean AJD(InterfaceC21614W interfaceC21614W) {
        return ((C5005pK) interfaceC21614W).A03(this.A00);
    }
}
