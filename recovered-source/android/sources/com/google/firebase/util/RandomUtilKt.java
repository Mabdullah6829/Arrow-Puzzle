package com.google.firebase.util;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6316x;
import p084t0.AbstractC6539d;
import p087v0.C6544c;
import p087v0.C6545d;

/* JADX INFO: loaded from: classes2.dex */
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final String nextAlphanumericString(AbstractC6539d abstractC6539d, int i2) {
        AbstractC6452k.m12181e(abstractC6539d, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "invalid length: ").toString());
        }
        C6545d c6545dM1757p = AbstractC0846b.m1757p(0, i2);
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(c6545dM1757p, 10));
        Iterator it = c6545dM1757p.iterator();
        while (((C6544c) it).f24772u) {
            ((AbstractC6316x) it).nextInt();
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(abstractC6539d.mo12209a(30))));
        }
        return AbstractC6305m.m12105A(arrayList, "", null, null, null, 62);
    }
}
