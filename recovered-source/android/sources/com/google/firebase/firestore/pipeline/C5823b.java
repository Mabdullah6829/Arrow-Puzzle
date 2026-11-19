package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5823b implements InterfaceC6498l {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23846s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ UserDataReader f23847t;

    public /* synthetic */ C5823b(UserDataReader userDataReader, int i2) {
        this.f23846s = i2;
        this.f23847t = userDataReader;
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(Object obj) {
        switch (this.f23846s) {
            case 0:
                return RawStage.args$lambda$0(this.f23847t, (GenericArg) obj);
            default:
                return SortStage.args$lambda$1(this.f23847t, (Ordering) obj);
        }
    }
}
