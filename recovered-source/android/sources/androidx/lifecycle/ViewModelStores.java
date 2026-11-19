package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ViewModelStores {
    private ViewModelStores() {
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelStore m2491of(FragmentActivity fragmentActivity) {
        return fragmentActivity.getViewModelStore();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelStore m2490of(Fragment fragment) {
        return fragment.getViewModelStore();
    }
}
