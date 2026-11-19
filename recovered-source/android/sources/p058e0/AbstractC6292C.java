package p058e0;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;

/* JADX INFO: renamed from: e0.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6292C extends AbstractC0242F {
    /* JADX INFO: renamed from: r */
    public static LinkedHashSet m12076r(Set set, Set elements) {
        AbstractC6452k.m12181e(set, "<this>");
        AbstractC6452k.m12181e(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6318z.m12126t(set.size() + Integer.valueOf(elements.size()).intValue()));
        linkedHashSet.addAll(set);
        AbstractC6311s.m12124v(elements, linkedHashSet);
        return linkedHashSet;
    }
}
