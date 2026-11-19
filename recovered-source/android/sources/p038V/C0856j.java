package p038V;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: V.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0856j implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2363a;

    /* JADX INFO: renamed from: b */
    public boolean f2364b;

    /* JADX INFO: renamed from: c */
    public String f2365c;

    public C0856j(ArrayList arrayList) {
        this.f2363a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = AbstractC0860n.f2383a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f2364b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f2363a;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.contains(list.get(i2))) {
                        String str = (String) list.get(i2);
                        this.f2365c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f2365c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f2365c = (String) objArr[0];
        return null;
    }
}
