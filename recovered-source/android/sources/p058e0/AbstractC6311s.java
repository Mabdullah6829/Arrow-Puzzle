package p058e0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: e0.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6311s extends AbstractC6310r {
    /* JADX INFO: renamed from: v */
    public static void m12124v(Iterable elements, AbstractCollection abstractCollection) {
        AbstractC6452k.m12181e(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
