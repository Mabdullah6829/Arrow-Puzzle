package p077p;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p069k.C6440u;
import p072l.C6471f;
import p079q.C6512c;
import p081r.InterfaceC6525d;
import p082s.InterfaceC6534b;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6484a implements InterfaceC6486c {

    /* JADX INFO: renamed from: f */
    public static final Logger f24684f = Logger.getLogger(C6440u.class.getName());

    /* JADX INFO: renamed from: a */
    public final C6512c f24685a;

    /* JADX INFO: renamed from: b */
    public final Executor f24686b;

    /* JADX INFO: renamed from: c */
    public final C6471f f24687c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6525d f24688d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6534b f24689e;

    public C6484a(Executor executor, C6471f c6471f, C6512c c6512c, InterfaceC6525d interfaceC6525d, InterfaceC6534b interfaceC6534b) {
        this.f24686b = executor;
        this.f24687c = c6471f;
        this.f24685a = c6512c;
        this.f24688d = interfaceC6525d;
        this.f24689e = interfaceC6534b;
    }
}
