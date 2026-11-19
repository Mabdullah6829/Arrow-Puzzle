package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.components.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5617e implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23546s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23547t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23548u;

    public /* synthetic */ RunnableC5617e(int i2, Object obj, Object obj2) {
        this.f23546s = i2;
        this.f23548u = obj;
        this.f23547t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23546s) {
            case 0:
                ((OptionalProvider) this.f23548u).set((Provider) this.f23547t);
                break;
            case 1:
                ((LazySet) this.f23548u).add((Provider) this.f23547t);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) this.f23548u, (Event) this.f23547t);
                break;
        }
    }
}
