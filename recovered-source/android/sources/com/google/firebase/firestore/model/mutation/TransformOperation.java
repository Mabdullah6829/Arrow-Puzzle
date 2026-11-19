package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public interface TransformOperation {
    C0393Z0 applyToLocalView(@Nullable C0393Z0 c0393z0, Timestamp timestamp);

    C0393Z0 applyToRemoteDocument(@Nullable C0393Z0 c0393z0, C0393Z0 c0393z1);

    @Nullable
    C0393Z0 computeBaseValue(@Nullable C0393Z0 c0393z0);
}
