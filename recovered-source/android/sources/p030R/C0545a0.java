package p030R;

import java.util.Comparator;
import p036U.C0828i;

/* JADX INFO: renamed from: R.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0545a0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2;
        AbstractC0543Z abstractC0543Z = (AbstractC0543Z) obj2;
        ((C0828i) ((AbstractC0543Z) obj)).getClass();
        int i3 = 3;
        try {
            Class.forName("android.app.Application", false, C0828i.class.getClassLoader());
            i2 = 8;
        } catch (Exception unused) {
            i2 = 3;
        }
        ((C0828i) abstractC0543Z).getClass();
        try {
            Class.forName("android.app.Application", false, C0828i.class.getClassLoader());
            i3 = 8;
        } catch (Exception unused2) {
        }
        return i2 - i3;
    }
}
