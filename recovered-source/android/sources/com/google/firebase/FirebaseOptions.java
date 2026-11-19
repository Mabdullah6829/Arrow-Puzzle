package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        @NonNull
        public Builder setApiKey(@NonNull String str) {
            Preconditions.m3542f(str, "ApiKey must be set.");
            this.apiKey = str;
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String str) {
            Preconditions.m3542f(str, "ApplicationId must be set.");
            this.applicationId = str;
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(@Nullable String str) {
            this.databaseUrl = str;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setGaTrackingId(@Nullable String str) {
            this.gaTrackingId = str;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(@Nullable String str) {
            this.gcmSenderId = str;
            return this;
        }

        @NonNull
        public Builder setProjectId(@Nullable String str) {
            this.projectId = str;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(@Nullable String str) {
            this.storageBucket = str;
            return this;
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }
    }

    @Nullable
    public static FirebaseOptions fromResource(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String strM3549a = stringResourceValueReader.m3549a(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(strM3549a)) {
            return null;
        }
        return new FirebaseOptions(strM3549a, stringResourceValueReader.m3549a(API_KEY_RESOURCE_NAME), stringResourceValueReader.m3549a(DATABASE_URL_RESOURCE_NAME), stringResourceValueReader.m3549a(GA_TRACKING_ID_RESOURCE_NAME), stringResourceValueReader.m3549a(GCM_SENDER_ID_RESOURCE_NAME), stringResourceValueReader.m3549a(STORAGE_BUCKET_RESOURCE_NAME), stringResourceValueReader.m3549a(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.m3535a(this.applicationId, firebaseOptions.applicationId) && Objects.m3535a(this.apiKey, firebaseOptions.apiKey) && Objects.m3535a(this.databaseUrl, firebaseOptions.databaseUrl) && Objects.m3535a(this.gaTrackingId, firebaseOptions.gaTrackingId) && Objects.m3535a(this.gcmSenderId, firebaseOptions.gcmSenderId) && Objects.m3535a(this.storageBucket, firebaseOptions.storageBucket) && Objects.m3535a(this.projectId, firebaseOptions.projectId);
    }

    @NonNull
    public String getApiKey() {
        return this.apiKey;
    }

    @NonNull
    public String getApplicationId() {
        return this.applicationId;
    }

    @Nullable
    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    @Nullable
    @KeepForSdk
    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    @Nullable
    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    @Nullable
    public String getProjectId() {
        return this.projectId;
    }

    @Nullable
    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m3536a(this.applicationId, "applicationId");
        toStringHelper.m3536a(this.apiKey, "apiKey");
        toStringHelper.m3536a(this.databaseUrl, "databaseUrl");
        toStringHelper.m3536a(this.gcmSenderId, "gcmSenderId");
        toStringHelper.m3536a(this.storageBucket, "storageBucket");
        toStringHelper.m3536a(this.projectId, "projectId");
        return toStringHelper.toString();
    }

    private FirebaseOptions(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.m3547k(!Strings.m3656a(str), "ApplicationId must be set.");
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }
}
