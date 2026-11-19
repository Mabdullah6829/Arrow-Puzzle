package com.google.firebase.firestore.proto;

import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.InterfaceC6262s0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: loaded from: classes2.dex */
public interface MutationQueueOrBuilder extends InterfaceC6264t0 {
    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ InterfaceC6262s0 getDefaultInstanceForType();

    int getLastAcknowledgedBatchId();

    AbstractC6251n getLastStreamToken();

    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ boolean isInitialized();
}
