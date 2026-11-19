package p017K;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0324a implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f652b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f653c;

    public /* synthetic */ C0324a(Object obj, String str, int i2) {
        this.f651a = i2;
        this.f652b = str;
        this.f653c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f651a) {
            case 0:
                return ComponentMonitor.lambda$processRegistrar$0(this.f652b, (Component) this.f653c, componentContainer);
            default:
                return LibraryVersionComponent.lambda$fromContext$0(this.f652b, (LibraryVersionComponent.VersionExtractor) this.f653c, componentContainer);
        }
    }
}
