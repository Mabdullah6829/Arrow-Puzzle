package com.google.firebase.firestore.proto;

import com.google.protobuf.C6197S0;
import com.google.protobuf.InterfaceC6262s0;
import com.google.protobuf.InterfaceC6264t0;
import java.util.List;
import p022N.C0402c1;

/* JADX INFO: loaded from: classes2.dex */
public interface WriteBatchOrBuilder extends InterfaceC6264t0 {
    C0402c1 getBaseWrites(int i2);

    int getBaseWritesCount();

    List<C0402c1> getBaseWritesList();

    int getBatchId();

    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ InterfaceC6262s0 getDefaultInstanceForType();

    C6197S0 getLocalWriteTime();

    C0402c1 getWrites(int i2);

    int getWritesCount();

    List<C0402c1> getWritesList();

    boolean hasLocalWriteTime();

    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ boolean isInitialized();
}
