package com.google.firebase.crashlytics.internal;

import androidx.privacysandbox.ads.adservices.java.internal.C1622a;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import p069k.C6430k;
import p079q.C6517h;
import p081r.C6527f;
import p081r.C6530i;
import p082s.InterfaceC6533a;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5636a implements Deferred.DeferredHandler, InterfaceC6533a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f23583s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23584t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23585u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23586v;

    public /* synthetic */ C5636a(String str, String str2, long j2, StaticSessionData staticSessionData) {
        this.f23584t = str;
        this.f23585u = str2;
        this.f23583s = j2;
        this.f23586v = staticSessionData;
    }

    @Override // p082s.InterfaceC6533a
    public Object execute() {
        C6517h c6517h = (C6517h) this.f23584t;
        Iterable iterable = (Iterable) this.f23585u;
        C6430k c6430k = (C6430k) this.f23586v;
        C6530i c6530i = (C6530i) c6517h.f24718c;
        c6530i.getClass();
        if (iterable.iterator().hasNext()) {
            c6530i.m12204h(new C1622a(6, c6530i, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C6530i.m12201n(iterable)));
        }
        c6530i.m12204h(new C6527f(c6517h.f24722g.m2719f() + this.f23583s, c6430k));
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.f23584t, (String) this.f23585u, this.f23583s, (StaticSessionData) this.f23586v, provider);
    }

    public /* synthetic */ C5636a(C6517h c6517h, Iterable iterable, C6430k c6430k, long j2) {
        this.f23584t = c6517h;
        this.f23585u = iterable;
        this.f23586v = c6430k;
        this.f23583s = j2;
    }
}
