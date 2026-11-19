package com.google.android.material.button;

import com.google.firebase.firestore.pipeline.evaluation.ArrayKt;
import java.util.Comparator;
import p000A0.C0057q;

/* JADX INFO: renamed from: com.google.android.material.button.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5241c implements Comparator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23372s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23373t;

    public /* synthetic */ C5241c(Object obj, int i2) {
        this.f23372s = i2;
        this.f23373t = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23372s) {
            case 0:
                return ((MaterialButtonGroup) this.f23373t).lambda$new$0((MaterialButton) obj, (MaterialButton) obj2);
            case 1:
                return ArrayKt.evaluateArrayMinimumN$lambda$22$lambda$21$lambda$20((C0057q) this.f23373t, obj, obj2);
            default:
                return ArrayKt.evaluateArrayMaximumN$lambda$26$lambda$25$lambda$24((C0057q) this.f23373t, obj, obj2);
        }
    }
}
