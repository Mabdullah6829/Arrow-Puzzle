package com.google.android.gms.signin;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class zad {

    /* JADX INFO: renamed from: a */
    public static final Api.AbstractClientBuilder f23194a;

    static {
        new Api.ClientKey();
        new Api.ClientKey();
        f23194a = new zaa();
        new zab();
        new Scope(1, "profile");
        new Scope(1, NotificationCompat.CATEGORY_EMAIL);
    }
}
