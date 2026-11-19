package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Be */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2585Be extends AbstractC4916ns {
    public C2585Be() {
        super(null);
    }

    private final AbstractC4916ns A00(int result) {
        if (result < 0) {
            return AbstractC4916ns.A02;
        }
        if (result > 0) {
            return AbstractC4916ns.A01;
        }
        return AbstractC4916ns.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final int A05() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final <T> AbstractC4916ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4916ns
    public final AbstractC4916ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
