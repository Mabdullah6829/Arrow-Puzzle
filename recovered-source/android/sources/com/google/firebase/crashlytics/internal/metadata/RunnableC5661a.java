package com.google.firebase.crashlytics.internal.metadata;

import androidx.transition.C1750a;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import p063h.InterfaceC6362h;
import p065i.C6370c;
import p069k.C6429j;
import p069k.C6430k;
import p072l.InterfaceC6472g;
import p077p.C6484a;
import p081r.C6530i;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5661a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23619s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23620t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23621u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23622v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f23623w;

    public /* synthetic */ RunnableC5661a(FirestoreClient firestoreClient, Query query, List list, TaskCompletionSource taskCompletionSource) {
        this.f23619s = 1;
        this.f23621u = firestoreClient;
        this.f23622v = query;
        this.f23620t = list;
        this.f23623w = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23619s) {
            case 0:
                ((UserMetadata) this.f23621u).lambda$setNewSession$0((String) this.f23622v, (Map) this.f23623w, (List) this.f23620t);
                break;
            case 1:
                ((FirestoreClient) this.f23621u).lambda$runAggregateQuery$16((Query) this.f23622v, (List) this.f23620t, (TaskCompletionSource) this.f23623w);
                break;
            default:
                C6484a c6484a = (C6484a) this.f23621u;
                C6430k c6430k = (C6430k) this.f23622v;
                String str = c6430k.f24598a;
                InterfaceC6362h interfaceC6362h = (InterfaceC6362h) this.f23623w;
                C6429j c6429j = (C6429j) this.f23620t;
                c6484a.getClass();
                Logger logger = C6484a.f24684f;
                try {
                    InterfaceC6472g interfaceC6472gM12195a = c6484a.f24687c.m12195a(str);
                    if (interfaceC6472gM12195a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        interfaceC6362h.mo11229a(new IllegalArgumentException(str2));
                    } else {
                        ((C6530i) c6484a.f24689e).m12207l(new C1750a(c6484a, c6430k, ((C6370c) interfaceC6472gM12195a).m12157a(c6429j), 2));
                        interfaceC6362h.mo11229a(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    interfaceC6362h.mo11229a(e);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC5661a(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f23619s = i2;
        this.f23621u = obj;
        this.f23622v = obj2;
        this.f23623w = obj3;
        this.f23620t = obj4;
    }
}
