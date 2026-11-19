package com.google.firebase.firestore.proto;

import com.google.protobuf.InterfaceC6262s0;
import com.google.protobuf.InterfaceC6264t0;
import p022N.C0439s;

/* JADX INFO: loaded from: classes2.dex */
public interface MaybeDocumentOrBuilder extends InterfaceC6264t0 {
    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ InterfaceC6262s0 getDefaultInstanceForType();

    C0439s getDocument();

    MaybeDocument.DocumentTypeCase getDocumentTypeCase();

    boolean getHasCommittedMutations();

    NoDocument getNoDocument();

    UnknownDocument getUnknownDocument();

    boolean hasDocument();

    boolean hasNoDocument();

    boolean hasUnknownDocument();

    @Override // com.google.protobuf.InterfaceC6264t0
    /* synthetic */ boolean isInitialized();
}
