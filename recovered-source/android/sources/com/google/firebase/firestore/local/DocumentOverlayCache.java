package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Overlay;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public interface DocumentOverlayCache {
    @Nullable
    Overlay getOverlay(DocumentKey documentKey);

    Map<DocumentKey, Overlay> getOverlays(ResourcePath resourcePath, int i2);

    Map<DocumentKey, Overlay> getOverlays(String str, int i2, int i3);

    Map<DocumentKey, Overlay> getOverlays(SortedSet<DocumentKey> sortedSet);

    void removeOverlaysForBatchId(int i2);

    void saveOverlays(int i2, Map<DocumentKey, Mutation> map);
}
