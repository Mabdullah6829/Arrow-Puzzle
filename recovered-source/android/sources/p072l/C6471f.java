package p072l;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import p006D0.C0177l;

/* JADX INFO: renamed from: l.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6471f {

    /* JADX INFO: renamed from: a */
    public final C0177l f24652a;

    /* JADX INFO: renamed from: b */
    public final C6470e f24653b;

    /* JADX INFO: renamed from: c */
    public final HashMap f24654c;

    public C6471f(Context context, C6470e c6470e) {
        C0177l c0177l = new C0177l(context);
        this.f24654c = new HashMap();
        this.f24652a = c0177l;
        this.f24653b = c6470e;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC6472g m12195a(String str) {
        if (this.f24654c.containsKey(str)) {
            return (InterfaceC6472g) this.f24654c.get(str);
        }
        CctBackendFactory cctBackendFactoryM272d = this.f24652a.m272d(str);
        if (cctBackendFactoryM272d == null) {
            return null;
        }
        C6470e c6470e = this.f24653b;
        InterfaceC6472g interfaceC6472gCreate = cctBackendFactoryM272d.create(new C6467b(c6470e.f24649a, c6470e.f24650b, c6470e.f24651c, str));
        this.f24654c.put(str, interfaceC6472gCreate);
        return interfaceC6472gCreate;
    }
}
