package com.google.firebase.components;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;

/* JADX INFO: renamed from: com.google.firebase.components.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5613a implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23539b;

    public /* synthetic */ C5613a(Object obj, int i2) {
        this.f23538a = i2;
        this.f23539b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f23538a) {
            case 0:
                return Component.lambda$of$2(this.f23539b, componentContainer);
            case 1:
                return Component.lambda$intoSet$4(this.f23539b, componentContainer);
            case 2:
                return Component.lambda$intoSet$3(this.f23539b, componentContainer);
            case 3:
                return Component.lambda$of$0(this.f23539b, componentContainer);
            case 4:
                return Component.lambda$of$1(this.f23539b, componentContainer);
            default:
                return ((CrashlyticsRegistrar) this.f23539b).buildCrashlytics(componentContainer);
        }
    }
}
