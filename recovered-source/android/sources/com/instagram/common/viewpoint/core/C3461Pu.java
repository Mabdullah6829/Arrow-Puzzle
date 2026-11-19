package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3461Pu implements Comparator<View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(View view, View view2) {
        C3455Po c3455Po = (C3455Po) view.getLayoutParams();
        C3455Po c3455Po2 = (C3455Po) view2.getLayoutParams();
        if (c3455Po.A05 != c3455Po2.A05) {
            return c3455Po.A05 ? 1 : -1;
        }
        return c3455Po.A02 - c3455Po2.A02;
    }
}
