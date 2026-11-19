package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ns */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC4916ns {
    public static final AbstractC4916ns A00 = new C2585Be();
    public static final AbstractC4916ns A02 = new C2583Bc(-1);
    public static final AbstractC4916ns A01 = new C2583Bc(1);

    public abstract int A05();

    public abstract AbstractC4916ns A06(int left, int right);

    public abstract AbstractC4916ns A07(long left, long right);

    public abstract <T> AbstractC4916ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC4916ns A09(boolean left, boolean right);

    public abstract AbstractC4916ns A0A(boolean left, boolean right);

    public AbstractC4916ns() {
    }

    public /* synthetic */ AbstractC4916ns(C2585Be c2585Be) {
        this();
    }

    public static AbstractC4916ns A01() {
        return A00;
    }
}
