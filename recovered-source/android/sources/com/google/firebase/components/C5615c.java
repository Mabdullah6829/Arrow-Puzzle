package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.firebase.components.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5615c implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23542a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentRegistrar f23543b;

    public /* synthetic */ C5615c(ComponentRegistrar componentRegistrar, int i2) {
        this.f23542a = i2;
        this.f23543b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f23542a) {
            case 0:
                return ComponentRuntime.lambda$toProviders$1(this.f23543b);
            default:
                return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.f23543b);
        }
    }
}
