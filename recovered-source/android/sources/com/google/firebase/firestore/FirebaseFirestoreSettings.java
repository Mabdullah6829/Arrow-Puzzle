package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseFirestoreSettings {
    public static final long CACHE_SIZE_UNLIMITED = -1;
    static final long DEFAULT_CACHE_SIZE_BYTES = 104857600;
    public static final String DEFAULT_HOST = "firestore.googleapis.com";
    static final long MINIMUM_CACHE_BYTES = 1048576;
    private LocalCacheSettings cacheSettings;
    private final long cacheSizeBytes;
    private final String host;
    private final boolean persistenceEnabled;
    private final boolean sslEnabled;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FirebaseFirestoreSettings.class != obj.getClass()) {
            return false;
        }
        FirebaseFirestoreSettings firebaseFirestoreSettings = (FirebaseFirestoreSettings) obj;
        if (this.sslEnabled == firebaseFirestoreSettings.sslEnabled && this.persistenceEnabled == firebaseFirestoreSettings.persistenceEnabled && this.cacheSizeBytes == firebaseFirestoreSettings.cacheSizeBytes && this.host.equals(firebaseFirestoreSettings.host)) {
            return Objects.equals(this.cacheSettings, firebaseFirestoreSettings.cacheSettings);
        }
        return false;
    }

    public LocalCacheSettings getCacheSettings() {
        return this.cacheSettings;
    }

    @Deprecated
    public long getCacheSizeBytes() {
        LocalCacheSettings localCacheSettings = this.cacheSettings;
        if (localCacheSettings == null) {
            return this.cacheSizeBytes;
        }
        if (localCacheSettings instanceof PersistentCacheSettings) {
            return ((PersistentCacheSettings) localCacheSettings).getSizeBytes();
        }
        MemoryCacheSettings memoryCacheSettings = (MemoryCacheSettings) localCacheSettings;
        if (memoryCacheSettings.getGarbageCollectorSettings() instanceof MemoryLruGcSettings) {
            return ((MemoryLruGcSettings) memoryCacheSettings.getGarbageCollectorSettings()).getSizeBytes();
        }
        return -1L;
    }

    @NonNull
    public String getHost() {
        return this.host;
    }

    public int hashCode() {
        int iHashCode = ((((this.host.hashCode() * 31) + (this.sslEnabled ? 1 : 0)) * 31) + (this.persistenceEnabled ? 1 : 0)) * 31;
        long j2 = this.cacheSizeBytes;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        LocalCacheSettings localCacheSettings = this.cacheSettings;
        return i2 + (localCacheSettings != null ? localCacheSettings.hashCode() : 0);
    }

    @Deprecated
    public boolean isPersistenceEnabled() {
        LocalCacheSettings localCacheSettings = this.cacheSettings;
        return localCacheSettings != null ? localCacheSettings instanceof PersistentCacheSettings : this.persistenceEnabled;
    }

    public boolean isSslEnabled() {
        return this.sslEnabled;
    }

    @NonNull
    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.host + ", sslEnabled=" + this.sslEnabled + ", persistenceEnabled=" + this.persistenceEnabled + ", cacheSizeBytes=" + this.cacheSizeBytes + ", cacheSettings=" + this.cacheSettings) == null) {
            return "null";
        }
        return this.cacheSettings.toString() + "}";
    }

    private FirebaseFirestoreSettings(Builder builder) {
        this.host = builder.host;
        this.sslEnabled = builder.sslEnabled;
        this.persistenceEnabled = builder.persistenceEnabled;
        this.cacheSizeBytes = builder.cacheSizeBytes;
        this.cacheSettings = builder.cacheSettings;
    }

    public static final class Builder {
        private LocalCacheSettings cacheSettings;
        private long cacheSizeBytes;
        private String host;
        private boolean persistenceEnabled;
        private boolean sslEnabled;
        private boolean usedLegacyCacheSettings;

        public Builder() {
            this.usedLegacyCacheSettings = false;
            this.host = FirebaseFirestoreSettings.DEFAULT_HOST;
            this.sslEnabled = true;
            this.persistenceEnabled = true;
            this.cacheSizeBytes = FirebaseFirestoreSettings.DEFAULT_CACHE_SIZE_BYTES;
        }

        @NonNull
        public FirebaseFirestoreSettings build() {
            if (this.sslEnabled || !this.host.equals(FirebaseFirestoreSettings.DEFAULT_HOST)) {
                return new FirebaseFirestoreSettings(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        @Deprecated
        public long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        @NonNull
        public String getHost() {
            return this.host;
        }

        @Deprecated
        public boolean isPersistenceEnabled() {
            return this.persistenceEnabled;
        }

        public boolean isSslEnabled() {
            return this.sslEnabled;
        }

        @NonNull
        @Deprecated
        public Builder setCacheSizeBytes(long j2) {
            if (this.cacheSettings != null) {
                throw new IllegalStateException("New cache config API setLocalCacheSettings() is already used.");
            }
            if (j2 != -1 && j2 < FirebaseFirestoreSettings.MINIMUM_CACHE_BYTES) {
                throw new IllegalArgumentException("Cache size must be set to at least 1048576 bytes");
            }
            this.cacheSizeBytes = j2;
            this.usedLegacyCacheSettings = true;
            return this;
        }

        @NonNull
        public Builder setHost(@NonNull String str) {
            this.host = (String) Preconditions.checkNotNull(str, "Provided host must not be null.");
            return this;
        }

        @NonNull
        public Builder setLocalCacheSettings(@NonNull LocalCacheSettings localCacheSettings) {
            if (this.usedLegacyCacheSettings) {
                throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
            }
            if (!(localCacheSettings instanceof MemoryCacheSettings) && !(localCacheSettings instanceof PersistentCacheSettings)) {
                throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
            }
            this.cacheSettings = localCacheSettings;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setPersistenceEnabled(boolean z) {
            if (this.cacheSettings != null) {
                throw new IllegalStateException("New cache config API setLocalCacheSettings() is already used.");
            }
            this.persistenceEnabled = z;
            this.usedLegacyCacheSettings = true;
            return this;
        }

        @NonNull
        public Builder setSslEnabled(boolean z) {
            this.sslEnabled = z;
            return this;
        }

        public Builder(@NonNull FirebaseFirestoreSettings firebaseFirestoreSettings) {
            this.usedLegacyCacheSettings = false;
            Preconditions.checkNotNull(firebaseFirestoreSettings, "Provided settings must not be null.");
            this.host = firebaseFirestoreSettings.host;
            this.sslEnabled = firebaseFirestoreSettings.sslEnabled;
            this.persistenceEnabled = firebaseFirestoreSettings.persistenceEnabled;
            long j2 = firebaseFirestoreSettings.cacheSizeBytes;
            this.cacheSizeBytes = j2;
            if (!this.persistenceEnabled || j2 != FirebaseFirestoreSettings.DEFAULT_CACHE_SIZE_BYTES) {
                this.usedLegacyCacheSettings = true;
            }
            if (!this.usedLegacyCacheSettings) {
                this.cacheSettings = firebaseFirestoreSettings.cacheSettings;
            } else {
                Assert.hardAssert(firebaseFirestoreSettings.cacheSettings == null, "Given settings object mixes both cache config APIs, which is impossible.", new Object[0]);
            }
        }
    }
}
