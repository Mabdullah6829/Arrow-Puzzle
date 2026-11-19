package com.google.firebase.firestore.local;

import androidx.annotation.NonNull;
import com.google.protobuf.AbstractC6251n;

/* JADX INFO: loaded from: classes2.dex */
final class MemoryGlobalsCache implements GlobalsCache {
    private AbstractC6251n sessionToken = AbstractC6251n.f24219t;

    @Override // com.google.firebase.firestore.local.GlobalsCache
    @NonNull
    public AbstractC6251n getSessionsToken() {
        return this.sessionToken;
    }

    @Override // com.google.firebase.firestore.local.GlobalsCache
    public void setSessionToken(@NonNull AbstractC6251n abstractC6251n) {
        this.sessionToken = abstractC6251n;
    }
}
