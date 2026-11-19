package p015J;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* JADX INFO: renamed from: J.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0322a implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f649a;

    public /* synthetic */ C0322a(int i2) {
        this.f649a = i2;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f649a) {
            case 0:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case 1:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            case 2:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
            case 3:
                return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
            case 4:
                return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
            case 5:
                return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
            case 6:
                return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
            case 7:
                return FirestoreRegistrar.lambda$getComponents$0(componentContainer);
            case 8:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            case 9:
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
            case 10:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
        }
    }
}
