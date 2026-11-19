package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2E */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class C20242E<E> extends AbstractC2570BP<E> {
    public static final AbstractC2570BP<Object> A02 = new C20242E(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    public C20242E(Object[] array, int size) {
        this.A00 = array;
        this.A01 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC4947oO
    public final int A0G() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC4947oO
    public final int A0H() {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2570BP, com.instagram.common.viewpoint.core.AbstractC4947oO
    public final int A0I(Object[] dst, int dstOff) {
        System.arraycopy(this.A00, 0, dst, dstOff, this.A01);
        return this.A01 + dstOff;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC4947oO
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.instagram.common.viewpoint.core.AbstractC4947oO
    public final Object[] A0L() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.List
    public final E get(int i2) {
        AbstractC4734ki.A00(i2, this.A01);
        return (E) Objects.requireNonNull(this.A00[i2]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
