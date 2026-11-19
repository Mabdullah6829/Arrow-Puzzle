package com.google.firebase.firestore.pipeline;

import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5822a implements InterfaceC6487a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23844s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23845t;

    public /* synthetic */ C5822a(Object obj, int i2) {
        this.f23844s = i2;
        this.f23845t = obj;
    }

    @Override // p078p0.InterfaceC6487a
    public final Object invoke() {
        switch (this.f23844s) {
            case 0:
                return DocumentsSource.docKeySet_delegate$lambda$1((DocumentsSource) this.f23845t);
            default:
                return this.f23845t;
        }
    }
}
