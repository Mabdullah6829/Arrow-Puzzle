package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1558a implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2797b;

    public /* synthetic */ C1558a(Object obj, int i2) {
        this.f2796a = i2;
        this.f2797b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f2796a) {
            case 0:
                return ((FragmentActivity) this.f2797b).lambda$init$0();
            case 1:
                return ((FragmentManager) this.f2797b).lambda$attachController$4();
            default:
                return SavedStateHandle.savedStateProvider$lambda$0((SavedStateHandle) this.f2797b);
        }
    }
}
