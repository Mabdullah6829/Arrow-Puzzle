package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.util.Supplier;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5796e implements Supplier {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23763s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocalStore f23764t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23765u;

    public /* synthetic */ C5796e(LocalStore localStore, Object obj, int i2) {
        this.f23763s = i2;
        this.f23764t = localStore;
        this.f23765u = obj;
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public final Object get() {
        switch (this.f23763s) {
            case 0:
                return this.f23764t.lambda$getNamedQuery$13((String) this.f23765u);
            case 1:
                return this.f23764t.lambda$acknowledgeBatch$3((MutationBatchResult) this.f23765u);
            case 2:
                return this.f23764t.lambda$collectGarbage$18((LruGarbageCollector) this.f23765u);
            default:
                return this.f23764t.lambda$hasNewerBundle$9((BundleMetadata) this.f23765u);
        }
    }
}
