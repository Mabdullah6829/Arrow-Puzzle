package com.google.firebase.sessions.api;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.SharedSessionRepository;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class CrashEventReceiver {
    public static final CrashEventReceiver INSTANCE = new CrashEventReceiver();
    public static SharedSessionRepository sharedSessionRepository;

    private CrashEventReceiver() {
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: getSharedSessionRepository$com_google_firebase_firebase_sessions$annotations */
    public static /* synthetic */ void m11644x9ea6c4a6() {
    }

    public static final void notifyCrashOccurred() {
        try {
            if (sharedSessionRepository == null) {
                INSTANCE.setSharedSessionRepository$com_google_firebase_firebase_sessions(SharedSessionRepository.Companion.getInstance());
            }
            CrashEventReceiver crashEventReceiver = INSTANCE;
            if (crashEventReceiver.getSharedSessionRepository$com_google_firebase_firebase_sessions().isInForeground()) {
                crashEventReceiver.getSharedSessionRepository$com_google_firebase_firebase_sessions().appBackground();
            }
        } catch (Exception unused) {
        }
    }

    public final SharedSessionRepository getSharedSessionRepository$com_google_firebase_firebase_sessions() {
        SharedSessionRepository sharedSessionRepository2 = sharedSessionRepository;
        if (sharedSessionRepository2 != null) {
            return sharedSessionRepository2;
        }
        AbstractC6452k.m12185i("sharedSessionRepository");
        throw null;
    }

    public final void setSharedSessionRepository$com_google_firebase_firebase_sessions(SharedSessionRepository sharedSessionRepository2) {
        AbstractC6452k.m12181e(sharedSessionRepository2, "<set-?>");
        sharedSessionRepository = sharedSessionRepository2;
    }
}
