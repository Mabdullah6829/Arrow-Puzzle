package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3174LD {
    public final int A00;
    public final String A01;
    public final List<C3173LC> A02;
    public final byte[] A03;

    public C3174LD(int i2, String str, List<C3173LC> list, byte[] bArr) {
        List<C3173LC> listUnmodifiableList;
        this.A00 = i2;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
