package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5780I implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SQLiteSchema f23735b;

    public /* synthetic */ C5780I(SQLiteSchema sQLiteSchema, int i2) {
        this.f23734a = i2;
        this.f23735b = sQLiteSchema;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23734a) {
            case 0:
                this.f23735b.lambda$removeAcknowledgedMutations$2((Cursor) obj);
                break;
            case 1:
                this.f23735b.lambda$dropLastLimboFreeSnapshotVersion$6((Cursor) obj);
                break;
            default:
                this.f23735b.lambda$rewriteCanonicalIds$13((Cursor) obj);
                break;
        }
    }
}
