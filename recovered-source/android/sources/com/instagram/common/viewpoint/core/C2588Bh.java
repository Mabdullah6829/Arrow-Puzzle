package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class C2588Bh<T> extends AbstractC5066qK<T> implements Serializable {
    public static String[] A01 = {"jVomwQRsen5vglXLuhXzBdwbPq6Ybrnn", "4aFITO9kz2LhtcD79HHzI", "vi18DojAtNgr3DJJSarcVnM7GKn6nndK", "ML5KuQXC", "N0lS1ni31cQ1TBeJZ0107lcHpyRIIPod", "312TaVRQAIGqwiXD4iywzyjTEypEIgK4", "JELmBa89yxiLk2CDuF87Yo0NIlkJ44v9", "QWcb8PBY5hKO"};
    public static final long serialVersionUID = 0;
    public final Comparator<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public C2588Bh(Comparator<T> comparator) {
        this.A00 = (Comparator) AbstractC4734ki.A04(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    @Override // com.instagram.common.viewpoint.core.AbstractC5066qK, java.util.Comparator
    public final int compare(@ParametricNullness T a2, @ParametricNullness T b) {
        return this.A00.compare(a2, b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof C2588Bh) {
            return this.A00.equals(((C2588Bh) object).A00);
        }
        String[] strArr = A01;
        if (strArr[0].charAt(22) == strArr[5].charAt(22)) {
            throw new RuntimeException();
        }
        A01[7] = "MG7YcOvDvuMg";
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public final String toString() {
        return this.A00.toString();
    }
}
