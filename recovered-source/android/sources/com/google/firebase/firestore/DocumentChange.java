package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public class DocumentChange {
    private final QueryDocumentSnapshot document;
    private final int newIndex;
    private final int oldIndex;
    private final Type type;

    public enum Type {
        ADDED,
        MODIFIED,
        REMOVED
    }

    @VisibleForTesting
    public DocumentChange(QueryDocumentSnapshot queryDocumentSnapshot, Type type, int i2, int i3) {
        this.type = type;
        this.document = queryDocumentSnapshot;
        this.oldIndex = i2;
        this.newIndex = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DocumentChange) {
            DocumentChange documentChange = (DocumentChange) obj;
            if (this.type.equals(documentChange.type) && this.document.equals(documentChange.document) && this.oldIndex == documentChange.oldIndex && this.newIndex == documentChange.newIndex) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public QueryDocumentSnapshot getDocument() {
        return this.document;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public int getOldIndex() {
        return this.oldIndex;
    }

    @NonNull
    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((this.document.hashCode() + (this.type.hashCode() * 31)) * 31) + this.oldIndex) * 31) + this.newIndex;
    }
}
