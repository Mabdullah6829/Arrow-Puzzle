package com.google.firebase.firestore;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PersistentCacheSettings implements LocalCacheSettings {
    private final long sizeBytes;

    public static class Builder {
        private long sizeBytes;

        @NonNull
        public PersistentCacheSettings build() {
            return new PersistentCacheSettings(this.sizeBytes);
        }

        @NonNull
        public Builder setSizeBytes(long j2) {
            this.sizeBytes = j2;
            return this;
        }

        private Builder() {
            this.sizeBytes = 104857600L;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && PersistentCacheSettings.class == obj.getClass() && this.sizeBytes == ((PersistentCacheSettings) obj).sizeBytes;
    }

    public long getSizeBytes() {
        return this.sizeBytes;
    }

    public int hashCode() {
        long j2 = this.sizeBytes;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.sizeBytes + '}';
    }

    private PersistentCacheSettings(long j2) {
        this.sizeBytes = j2;
    }
}
