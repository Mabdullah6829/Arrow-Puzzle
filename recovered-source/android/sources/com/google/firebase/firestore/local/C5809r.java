package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.core.QueryOrPipeline;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Function;
import java.util.Set;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.r */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5809r implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23802c;

    public /* synthetic */ C5809r(int i2, Object obj, Object obj2) {
        this.f23800a = i2;
        this.f23801b = obj;
        this.f23802c = obj2;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23800a) {
            case 0:
                return ((SQLiteBundleCache) this.f23801b).lambda$getNamedQuery$1((String) this.f23802c, (Cursor) obj);
            default:
                return SQLiteRemoteDocumentCache.lambda$getDocumentsMatchingQuery$3((QueryOrPipeline) this.f23801b, (Set) this.f23802c, (MutableDocument) obj);
        }
    }
}
