package com.google.firebase.installations;

import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    public static final class Builder extends InstallationTokenResult.Builder {
        private byte set$0;
        private String token;
        private long tokenCreationTimestamp;
        private long tokenExpirationTimestamp;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String str;
            if (this.set$0 == 3 && (str = this.token) != null) {
                return new AutoValue_InstallationTokenResult(str, this.tokenExpirationTimestamp, this.tokenCreationTimestamp);
            }
            StringBuilder sb = new StringBuilder();
            if (this.token == null) {
                sb.append(" token");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" tokenExpirationTimestamp");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" tokenCreationTimestamp");
            }
            throw new IllegalStateException(AbstractC1456a.m2446m("Missing required properties:", sb));
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j2) {
            this.tokenCreationTimestamp = j2;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j2) {
            this.tokenExpirationTimestamp = j2;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder() {
        }

        private Builder(InstallationTokenResult installationTokenResult) {
            this.token = installationTokenResult.getToken();
            this.tokenExpirationTimestamp = installationTokenResult.getTokenExpirationTimestamp();
            this.tokenCreationTimestamp = installationTokenResult.getTokenCreationTimestamp();
            this.set$0 = (byte) 3;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationTokenResult) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            if (this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        int iHashCode = (this.token.hashCode() ^ 1000003) * 1000003;
        long j2 = this.tokenExpirationTimestamp;
        long j3 = this.tokenCreationTimestamp;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", tokenCreationTimestamp=" + this.tokenCreationTimestamp + "}";
    }

    private AutoValue_InstallationTokenResult(String str, long j2, long j3) {
        this.token = str;
        this.tokenExpirationTimestamp = j2;
        this.tokenCreationTimestamp = j3;
    }
}
