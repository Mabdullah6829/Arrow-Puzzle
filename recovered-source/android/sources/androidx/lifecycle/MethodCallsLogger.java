package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    public boolean approveCall(String name, int i2) {
        AbstractC6452k.m12181e(name, "name");
        Integer num = this.calledMethods.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z = (iIntValue & i2) != 0;
        this.calledMethods.put(name, Integer.valueOf(i2 | iIntValue));
        return !z;
    }
}
