package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.utils.C1110a;
import java.util.Comparator;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public interface Document {
    public static final Comparator<Document> KEY_COMPARATOR = new C1110a(4);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(Document document, Document document2) {
        return document.getKey().compareTo(document2.getKey());
    }

    SnapshotVersion getCreateTime();

    ObjectValue getData();

    @Nullable
    C0393Z0 getField(FieldPath fieldPath);

    DocumentKey getKey();

    SnapshotVersion getReadTime();

    SnapshotVersion getVersion();

    boolean hasCommittedMutations();

    boolean hasLocalMutations();

    boolean hasPendingWrites();

    boolean isFoundDocument();

    boolean isNoDocument();

    boolean isUnknownDocument();

    boolean isValidDocument();

    MutableDocument mutableCopy();
}
