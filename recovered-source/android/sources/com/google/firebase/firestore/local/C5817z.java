package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Function;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5817z implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23832c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f23833d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f23834e;

    public /* synthetic */ C5817z(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f23830a = i2;
        this.f23831b = obj;
        this.f23832c = obj2;
        this.f23833d = obj3;
        this.f23834e = obj4;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23830a) {
            case 0:
                ((SQLiteLruReferenceDelegate) this.f23831b).lambda$removeOrphanedDocuments$2((int[]) this.f23832c, (ArrayList) this.f23833d, (ResourcePath[]) this.f23834e, (Cursor) obj);
                break;
            default:
                ((SQLiteRemoteDocumentCache) this.f23831b).lambda$getAll$1((BackgroundQueue) this.f23832c, (HashMap) this.f23833d, (Function) this.f23834e, (Cursor) obj);
                break;
        }
    }
}
