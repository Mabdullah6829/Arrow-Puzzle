package com.google.firebase.firestore.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.BitSet;
import p030R.AbstractC0553e0;
import p030R.C0549c0;
import p030R.C0559h0;
import p030R.C0572o;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseClientGrpcMetadataProvider implements GrpcMetadataProvider {
    private static final AbstractC0553e0 GMP_APP_ID_HEADER;
    private static final AbstractC0553e0 HEART_BEAT_HEADER;
    private static final String HEART_BEAT_TAG = "fire-fst";
    private static final AbstractC0553e0 USER_AGENT_HEADER;
    private final FirebaseOptions firebaseOptions;
    private final Provider<HeartBeatInfo> heartBeatInfoProvider;
    private final Provider<UserAgentPublisher> userAgentPublisherProvider;

    static {
        C0572o c0572o = C0559h0.f1187d;
        BitSet bitSet = AbstractC0553e0.f1161d;
        HEART_BEAT_HEADER = new C0549c0("x-firebase-client-log-type", c0572o);
        USER_AGENT_HEADER = new C0549c0("x-firebase-client", c0572o);
        GMP_APP_ID_HEADER = new C0549c0("x-firebase-gmpid", c0572o);
    }

    public FirebaseClientGrpcMetadataProvider(@NonNull Provider<UserAgentPublisher> provider, @NonNull Provider<HeartBeatInfo> provider2, @Nullable FirebaseOptions firebaseOptions) {
        this.userAgentPublisherProvider = provider;
        this.heartBeatInfoProvider = provider2;
        this.firebaseOptions = firebaseOptions;
    }

    private void maybeAddGmpAppId(@NonNull C0559h0 c0559h0) {
        FirebaseOptions firebaseOptions = this.firebaseOptions;
        if (firebaseOptions == null) {
            return;
        }
        String applicationId = firebaseOptions.getApplicationId();
        if (applicationId.length() != 0) {
            c0559h0.m1310f(GMP_APP_ID_HEADER, applicationId);
        }
    }

    @Override // com.google.firebase.firestore.remote.GrpcMetadataProvider
    public void updateMetadata(@NonNull C0559h0 c0559h0) {
        if (this.heartBeatInfoProvider.get() == null || this.userAgentPublisherProvider.get() == null) {
            return;
        }
        int code = this.heartBeatInfoProvider.get().getHeartBeatCode(HEART_BEAT_TAG).getCode();
        if (code != 0) {
            c0559h0.m1310f(HEART_BEAT_HEADER, Integer.toString(code));
        }
        c0559h0.m1310f(USER_AGENT_HEADER, this.userAgentPublisherProvider.get().getUserAgent());
        maybeAddGmpAppId(c0559h0);
    }
}
