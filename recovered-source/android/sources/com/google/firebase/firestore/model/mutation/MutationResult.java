package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Preconditions;
import java.util.List;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class MutationResult {
    private final List<C0393Z0> transformResults;
    private final SnapshotVersion version;

    public MutationResult(SnapshotVersion snapshotVersion, List<C0393Z0> list) {
        this.version = (SnapshotVersion) Preconditions.checkNotNull(snapshotVersion);
        this.transformResults = list;
    }

    public List<C0393Z0> getTransformResults() {
        return this.transformResults;
    }

    public SnapshotVersion getVersion() {
        return this.version;
    }
}
