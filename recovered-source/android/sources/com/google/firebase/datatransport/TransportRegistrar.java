package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import p015J.C0322a;
import p063h.InterfaceC6361g;
import p065i.C6368a;
import p069k.C6440u;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6361g lambda$getComponents$0(ComponentContainer componentContainer) {
        C6440u.m12173b((Context) componentContainer.get(Context.class));
        return C6440u.m12172a().m12174c(C6368a.f24430f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6361g lambda$getComponents$1(ComponentContainer componentContainer) {
        C6440u.m12173b((Context) componentContainer.get(Context.class));
        return C6440u.m12172a().m12174c(C6368a.f24430f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6361g lambda$getComponents$2(ComponentContainer componentContainer) {
        C6440u.m12173b((Context) componentContainer.get(Context.class));
        return C6440u.m12172a().m12174c(C6368a.f24429e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(InterfaceC6361g.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new C0322a(0)).build(), Component.builder(Qualified.qualified(LegacyTransportBackend.class, InterfaceC6361g.class)).add(Dependency.required((Class<?>) Context.class)).factory(new C0322a(1)).build(), Component.builder(Qualified.qualified(TransportBackend.class, InterfaceC6361g.class)).add(Dependency.required((Class<?>) Context.class)).factory(new C0322a(2)).build(), LibraryVersionComponent.create(LIBRARY_NAME, "19.0.0"));
    }
}
