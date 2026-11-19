package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.TargetOrPipeline;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Consumer;

/* JADX INFO: loaded from: classes2.dex */
interface TargetCache {
    void addMatchingKeys(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i2);

    void addTargetData(TargetData targetData);

    boolean containsKey(DocumentKey documentKey);

    void forEachTarget(Consumer<TargetData> consumer);

    long getHighestListenSequenceNumber();

    int getHighestTargetId();

    SnapshotVersion getLastRemoteSnapshotVersion();

    ImmutableSortedSet<DocumentKey> getMatchingKeysForTargetId(int i2);

    long getTargetCount();

    @Nullable
    TargetData getTargetData(TargetOrPipeline targetOrPipeline);

    void removeMatchingKeys(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i2);

    void removeMatchingKeysForTargetId(int i2);

    void removeTargetData(TargetData targetData);

    void setLastRemoteSnapshotVersion(SnapshotVersion snapshotVersion);

    void updateTargetData(TargetData targetData);
}
