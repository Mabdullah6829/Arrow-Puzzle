package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4440fq {
    public float A00;
    public EnumC3214Lr A01;
    public Map<String, String> A02;

    public C4440fq(EnumC3214Lr enumC3214Lr) {
        this(enumC3214Lr, 0.0f);
    }

    public C4440fq(EnumC3214Lr enumC3214Lr, float f2) {
        this(enumC3214Lr, f2, null);
    }

    public C4440fq(@Nullable EnumC3214Lr enumC3214Lr, float f2, Map<String, String> windowParams) {
        this.A01 = enumC3214Lr;
        this.A00 = f2;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC3214Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC3214Lr.A0I;
    }
}
