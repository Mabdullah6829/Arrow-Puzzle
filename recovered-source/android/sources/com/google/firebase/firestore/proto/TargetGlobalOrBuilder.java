package com.google.firebase.firestore.proto;

import com.google.protobuf.C6197S0;
import com.google.protobuf.InterfaceC6262s0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: loaded from: classes2.dex */
public interface TargetGlobalOrBuilder extends InterfaceC6264t0 {
    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ InterfaceC6262s0 getDefaultInstanceForType();

    long getHighestListenSequenceNumber();

    int getHighestTargetId();

    C6197S0 getLastRemoteSnapshotVersion();

    int getTargetCount();

    boolean hasLastRemoteSnapshotVersion();

    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ boolean isInitialized();
}
