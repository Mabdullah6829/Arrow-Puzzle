package p038V;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: V.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0860n {

    /* JADX INFO: renamed from: a */
    public static final String[] f2383a = new String[0];

    /* JADX INFO: renamed from: b */
    public static final Charset f2384b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static Object[] m1771a(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            for (Object obj2 : objArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }
}
