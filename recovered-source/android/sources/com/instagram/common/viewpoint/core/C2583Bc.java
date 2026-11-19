package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2583Bc extends AbstractC4916ns {
    public final int A00;

    public C2583Bc(int result) {
        super(null);
        this.A00 = result;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final int A05() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A06(int left, int right) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A07(long left, long right) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final <T> AbstractC4916ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A09(boolean left, boolean right) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A0A(boolean left, boolean right) {
        return this;
    }
}
