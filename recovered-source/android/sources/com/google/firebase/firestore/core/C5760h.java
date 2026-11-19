package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentSet;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5760h implements Comparator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23683s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Comparator f23684t;

    public /* synthetic */ C5760h(Comparator comparator, int i2) {
        this.f23683s = i2;
        this.f23684t = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23683s) {
            case 0:
                return View.lambda$applyChanges$0(this.f23684t, (DocumentViewChange) obj, (DocumentViewChange) obj2);
            default:
                return DocumentSet.lambda$emptySet$0(this.f23684t, (Document) obj, (Document) obj2);
        }
    }
}
