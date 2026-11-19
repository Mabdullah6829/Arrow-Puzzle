package com.google.firebase.messaging;

import com.google.firebase.Firebase;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        AbstractC6452k.m12181e(firebase, "<this>");
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        AbstractC6452k.m12180d(firebaseMessaging, "getInstance(...)");
        return firebaseMessaging;
    }

    public static final RemoteMessage remoteMessage(String to, InterfaceC6498l init) {
        AbstractC6452k.m12181e(to, "to");
        AbstractC6452k.m12181e(init, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(to);
        init.invoke(builder);
        RemoteMessage remoteMessageBuild = builder.build();
        AbstractC6452k.m12180d(remoteMessageBuild, "build(...)");
        return remoteMessageBuild;
    }
}
