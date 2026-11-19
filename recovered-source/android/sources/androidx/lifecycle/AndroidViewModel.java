package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        AbstractC6452k.m12181e(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        AbstractC6452k.m12179c(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
