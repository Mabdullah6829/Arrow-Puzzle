package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7s */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23697s {
    public static final C23697s A01 = new C23697s(false);
    public final boolean A00;

    public C23697s(boolean z) {
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C23697s) obj).A00;
    }

    public final int hashCode() {
        return !this.A00 ? 1 : 0;
    }
}
