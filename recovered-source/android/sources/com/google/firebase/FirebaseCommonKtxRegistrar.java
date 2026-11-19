package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0063t;
import p000A0.AbstractC0069y;
import p058e0.AbstractC6306n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component componentBuild = Component.builder(Qualified.qualified(Background.class, AbstractC0063t.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0063t create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                AbstractC6452k.m12180d(obj, "get(...)");
                return AbstractC0069y.m106e((Executor) obj);
            }
        }).build();
        AbstractC6452k.m12180d(componentBuild, "build(...)");
        Component componentBuild2 = Component.builder(Qualified.qualified(Lightweight.class, AbstractC0063t.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0063t create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                AbstractC6452k.m12180d(obj, "get(...)");
                return AbstractC0069y.m106e((Executor) obj);
            }
        }).build();
        AbstractC6452k.m12180d(componentBuild2, "build(...)");
        Component componentBuild3 = Component.builder(Qualified.qualified(Blocking.class, AbstractC0063t.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0063t create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                AbstractC6452k.m12180d(obj, "get(...)");
                return AbstractC0069y.m106e((Executor) obj);
            }
        }).build();
        AbstractC6452k.m12180d(componentBuild3, "build(...)");
        Component componentBuild4 = Component.builder(Qualified.qualified(UiThread.class, AbstractC0063t.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0063t create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                AbstractC6452k.m12180d(obj, "get(...)");
                return AbstractC0069y.m106e((Executor) obj);
            }
        }).build();
        AbstractC6452k.m12180d(componentBuild4, "build(...)");
        return AbstractC6306n.m12120r(componentBuild, componentBuild2, componentBuild3, componentBuild4);
    }
}
