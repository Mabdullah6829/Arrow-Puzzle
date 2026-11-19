package com.google.firebase.firestore.util;

import com.google.firebase.firestore.model.Values;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p024O.C0467j;

/* JADX INFO: loaded from: classes2.dex */
public final class RegexUtils {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final C0393Z0 handleMatch(C0467j matcher) {
            AbstractC6452k.m12181e(matcher, "matcher");
            int i2 = matcher.f819c;
            if (i2 > 1) {
                throw new IllegalArgumentException("At most one capture group is supported");
            }
            if (i2 == 0) {
                String strM1004a = matcher.m1004a(0);
                AbstractC6452k.m12180d(strM1004a, "group(...)");
                return Values.encodeValue(strM1004a);
            }
            if (matcher.m1004a(1) == null) {
                return Values.NULL_VALUE;
            }
            String strM1004a2 = matcher.m1004a(1);
            AbstractC6452k.m12180d(strM1004a2, "group(...)");
            return Values.encodeValue(strM1004a2);
        }

        private Companion() {
        }
    }
}
