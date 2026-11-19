package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0063t;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseKt {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseKt$coroutineDispatcher$1 */
    public static final class C55971<T> implements ComponentFactory {
        public static final C55971<T> INSTANCE = new C55971<>();

        @Override // com.google.firebase.components.ComponentFactory
        public final AbstractC0063t create(ComponentContainer componentContainer) {
            AbstractC6452k.m12184h();
            throw null;
        }
    }

    public static final FirebaseApp app(Firebase firebase, String name) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(name, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(name);
        AbstractC6452k.m12180d(firebaseApp, "getInstance(...)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<AbstractC0063t> coroutineDispatcher() {
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        AbstractC6452k.m12181e(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        AbstractC6452k.m12180d(firebaseApp, "getInstance(...)");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        AbstractC6452k.m12181e(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        AbstractC6452k.m12180d(options, "getOptions(...)");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(options, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options);
        AbstractC6452k.m12180d(firebaseAppInitializeApp, "initializeApp(...)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options, String name) {
        AbstractC6452k.m12181e(firebase, "<this>");
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(options, "options");
        AbstractC6452k.m12181e(name, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options, name);
        AbstractC6452k.m12180d(firebaseAppInitializeApp, "initializeApp(...)");
        return firebaseAppInitializeApp;
    }
}
