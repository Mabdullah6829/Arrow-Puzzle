package androidx.work;

import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class InputMerger {
    private static final String TAG = Logger.tagWithPrefix("InputMerger");

    public static InputMerger fromClassName(String str) {
        try {
            return (InputMerger) Class.forName(str).newInstance();
        } catch (Exception e) {
            Logger.get().error(TAG, AbstractC0271e0.m398f("Trouble instantiating + ", str), e);
            return null;
        }
    }

    public abstract Data merge(List<Data> list);
}
