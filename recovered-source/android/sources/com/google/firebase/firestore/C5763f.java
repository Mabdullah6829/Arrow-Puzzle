package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: renamed from: com.google.firebase.firestore.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5763f implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventManager.ListenOptions f23691b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AsyncEventListener f23692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f23693d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f23694e;

    public /* synthetic */ C5763f(Object obj, EventManager.ListenOptions listenOptions, AsyncEventListener asyncEventListener, Activity activity, int i2) {
        this.f23690a = i2;
        this.f23694e = obj;
        this.f23691b = listenOptions;
        this.f23692c = asyncEventListener;
        this.f23693d = activity;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23690a) {
            case 0:
                return DocumentReference.lambda$addSnapshotListenerInternal$8((com.google.firebase.firestore.core.Query) this.f23694e, this.f23691b, this.f23692c, this.f23693d, (FirestoreClient) obj);
            default:
                return ((Query) this.f23694e).lambda$addSnapshotListenerInternal$5(this.f23691b, this.f23692c, this.f23693d, (FirestoreClient) obj);
        }
    }
}
