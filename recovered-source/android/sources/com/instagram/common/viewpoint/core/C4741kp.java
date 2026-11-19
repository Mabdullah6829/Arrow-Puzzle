package com.instagram.common.viewpoint.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class C4741kp {
    public final int A00;
    public final AbstractC2618CC A01;
    public final InterfaceC4740ko A02;
    public final boolean A03;

    public C4741kp(InterfaceC4740ko strategy) {
        this(strategy, false, AbstractC2618CC.A03(), Integer.MAX_VALUE);
    }

    public C4741kp(InterfaceC4740ko strategy, boolean omitEmptyStrings, AbstractC2618CC trimmer, int limit) {
        this.A02 = strategy;
        this.A03 = omitEmptyStrings;
        this.A01 = trimmer;
        this.A00 = limit;
    }

    public static C4741kp A02(char separator) {
        return A03(AbstractC2618CC.A02(separator));
    }

    public static C4741kp A03(final AbstractC2618CC separatorMatcher) {
        AbstractC4734ki.A04(separatorMatcher);
        return new C4741kp(new C2610C3(separatorMatcher));
    }

    private Iterator<String> A04(CharSequence sequence) {
        return this.A02.AAl(this, sequence);
    }

    public final List<String> A06(CharSequence sequence) {
        AbstractC4734ki.A04(sequence);
        Iterator<String> itA04 = A04(sequence);
        List<String> result = new ArrayList<>();
        while (itA04.hasNext()) {
            result.add(itA04.next());
        }
        return Collections.unmodifiableList(result);
    }
}
