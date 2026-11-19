package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallationsKt {
    public static final FirebaseInstallations getInstallations(Firebase firebase) {
        AbstractC6452k.m12181e(firebase, "<this>");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        AbstractC6452k.m12180d(firebaseInstallations, "getInstance(...)");
        return firebaseInstallations;
    }

    public static final FirebaseInstallations installations(Firebase firebase, FirebaseApp app) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(app, "app");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(app);
        AbstractC6452k.m12180d(firebaseInstallations, "getInstance(...)");
        return firebaseInstallations;
    }
}
