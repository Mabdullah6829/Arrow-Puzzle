package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.ServerTimestamps;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class ServerTimestampOperation implements TransformOperation {
    private static final ServerTimestampOperation SHARED_INSTANCE = new ServerTimestampOperation();

    private ServerTimestampOperation() {
    }

    public static ServerTimestampOperation getInstance() {
        return SHARED_INSTANCE;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public C0393Z0 applyToLocalView(@Nullable C0393Z0 c0393z0, Timestamp timestamp) {
        return ServerTimestamps.valueOf(timestamp, c0393z0);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    @Nullable
    public C0393Z0 computeBaseValue(@Nullable C0393Z0 c0393z0) {
        return null;
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public C0393Z0 applyToRemoteDocument(@Nullable C0393Z0 c0393z0, C0393Z0 c0393z1) {
        return c0393z1;
    }
}
