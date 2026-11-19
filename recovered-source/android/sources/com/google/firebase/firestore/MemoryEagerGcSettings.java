package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryEagerGcSettings implements MemoryGarbageCollectorSettings {

    public static class Builder {
        @NonNull
        public MemoryEagerGcSettings build() {
            return new MemoryEagerGcSettings();
        }

        private Builder() {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MemoryEagerGcSettings.class == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public String toString() {
        return "MemoryEagerGcSettings{}";
    }

    private MemoryEagerGcSettings() {
    }
}
