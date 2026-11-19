package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.s */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5810s implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SQLiteDocumentOverlayCache f23804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BackgroundQueue f23805c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ HashMap f23806d;

    public /* synthetic */ C5810s(SQLiteDocumentOverlayCache sQLiteDocumentOverlayCache, BackgroundQueue backgroundQueue, HashMap map, int i2) {
        this.f23803a = i2;
        this.f23804b = sQLiteDocumentOverlayCache;
        this.f23805c = backgroundQueue;
        this.f23806d = map;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23803a) {
            case 0:
                this.f23804b.lambda$getOverlays$2(this.f23805c, this.f23806d, (Cursor) obj);
                break;
            default:
                this.f23804b.lambda$getOverlays$4(this.f23805c, this.f23806d, (Cursor) obj);
                break;
        }
    }
}
