package com.google.firebase.firestore.proto;

import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6197S0;
import com.google.protobuf.InterfaceC6262s0;
import com.google.protobuf.InterfaceC6264t0;
import p022N.C0368M0;
import p022N.C0372O0;
import p022N.C0376Q0;

/* JADX INFO: loaded from: classes2.dex */
public interface TargetOrBuilder extends InterfaceC6264t0 {
    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ InterfaceC6262s0 getDefaultInstanceForType();

    C0368M0 getDocuments();

    C6197S0 getLastLimboFreeSnapshotVersion();

    long getLastListenSequenceNumber();

    C0372O0 getPipelineQuery();

    C0376Q0 getQuery();

    AbstractC6251n getResumeToken();

    C6197S0 getSnapshotVersion();

    int getTargetId();

    Target.TargetTypeCase getTargetTypeCase();

    boolean hasDocuments();

    boolean hasLastLimboFreeSnapshotVersion();

    boolean hasPipelineQuery();

    boolean hasQuery();

    boolean hasSnapshotVersion();

    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ boolean isInitialized();
}
