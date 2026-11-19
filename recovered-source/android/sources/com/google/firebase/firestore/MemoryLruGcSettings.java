package com.google.firebase.firestore;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryLruGcSettings implements MemoryGarbageCollectorSettings {
    private long sizeBytes;

    public static class Builder {
        private long sizeBytes;

        @NonNull
        public MemoryLruGcSettings build() {
            return new MemoryLruGcSettings(this.sizeBytes);
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
        return obj != null && MemoryLruGcSettings.class == obj.getClass() && this.sizeBytes == ((MemoryLruGcSettings) obj).sizeBytes;
    }

    public long getSizeBytes() {
        return this.sizeBytes;
    }

    public int hashCode() {
        long j2 = this.sizeBytes;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @NonNull
    public String toString() {
        return "MemoryLruGcSettings{cacheSize=" + getSizeBytes() + "}";
    }

    private MemoryLruGcSettings(long j2) {
        this.sizeBytes = j2;
    }
}
