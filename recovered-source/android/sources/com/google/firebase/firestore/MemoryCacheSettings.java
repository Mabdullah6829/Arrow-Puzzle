package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryCacheSettings implements LocalCacheSettings {
    private MemoryGarbageCollectorSettings gcSettings;

    public static class Builder {
        private MemoryGarbageCollectorSettings gcSettings;

        @NonNull
        public MemoryCacheSettings build() {
            return new MemoryCacheSettings(this.gcSettings);
        }

        @NonNull
        public Builder setGcSettings(@NonNull MemoryGarbageCollectorSettings memoryGarbageCollectorSettings) {
            this.gcSettings = memoryGarbageCollectorSettings;
            return this;
        }

        private Builder() {
            this.gcSettings = MemoryEagerGcSettings.newBuilder().build();
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
        if (obj == null || MemoryCacheSettings.class != obj.getClass()) {
            return false;
        }
        return getGarbageCollectorSettings().equals(((MemoryCacheSettings) obj).getGarbageCollectorSettings());
    }

    @NonNull
    public MemoryGarbageCollectorSettings getGarbageCollectorSettings() {
        return this.gcSettings;
    }

    public int hashCode() {
        return this.gcSettings.hashCode();
    }

    public String toString() {
        return "MemoryCacheSettings{gcSettings=" + getGarbageCollectorSettings() + "}";
    }

    private MemoryCacheSettings(MemoryGarbageCollectorSettings memoryGarbageCollectorSettings) {
        this.gcSettings = memoryGarbageCollectorSettings;
    }
}
