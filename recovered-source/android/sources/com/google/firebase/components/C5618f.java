package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.components.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5618f implements Deferred.DeferredHandler, ComponentRegistrarProcessor {
    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        OptionalProvider.lambda$static$0(provider);
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
