package p030R;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: R.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0576q {

    /* JADX INFO: renamed from: b */
    public static final C0576q f1225b = new C0576q(new C0572o(2), C0572o.f1219t);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f1226a = new ConcurrentHashMap();

    public C0576q(InterfaceC0574p... interfaceC0574pArr) {
        for (InterfaceC0574p interfaceC0574p : interfaceC0574pArr) {
            this.f1226a.put(interfaceC0574p.getMessageEncoding(), interfaceC0574p);
        }
    }
}
