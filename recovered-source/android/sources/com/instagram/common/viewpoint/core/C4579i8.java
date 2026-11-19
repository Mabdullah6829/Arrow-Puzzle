package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4579i8<K, V> extends AbstractC3420PC<K, V> {
    public final /* synthetic */ C4578i7 A00;

    public C4579i8(C4578i7 c4578i7) {
        this.A00 = c4578i7;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final int A04() {
        return ((C3423PF) this.A00).A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final Object A0B(int i2, int i3) {
        return this.A00.A02[(i2 << 1) + i3];
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final V A0C(int i2, V value) {
        return this.A00.A0C(i2, value);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final void A0E(int i2) {
        this.A00.A0A(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3420PC
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
