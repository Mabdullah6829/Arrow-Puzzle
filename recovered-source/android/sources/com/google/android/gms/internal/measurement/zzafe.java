package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzafe {

    /* JADX INFO: renamed from: a */
    public static final char[] f22073a;

    static {
        char[] cArr = new char[80];
        f22073a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m9608a(StringBuilder sb, int i2, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m9608a(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9608a(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m9610c(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof zzacr) {
                sb.append(": \"");
                sb.append(zzafx.m9673a(((zzacr) obj).m9383q()));
                sb.append('\"');
                return;
            }
            if (obj instanceof zzadu) {
                sb.append(" {");
                m9609b((zzadu) obj, sb, i2 + 2);
                sb.append("\n");
                m9610c(i2, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i4 = i2 + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            m9608a(sb, i4, "key", entry.getKey());
            m9608a(sb, i4, "value", entry.getValue());
            sb.append("\n");
            m9610c(i2, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String strReplace2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < strReplace2.length(); i5++) {
            char cCharAt2 = strReplace2.charAt(i5);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = zzafx.m9673a(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb.append(strReplace);
                sb.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z3 = true;
                } else if (cCharAt2 == '\'') {
                    z2 = true;
                } else if (cCharAt2 == '\\') {
                    z = true;
                }
            }
        }
        if (z) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z3) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb.append(strReplace);
        sb.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX INFO: renamed from: b */
    public static void m9609b(zzadu zzaduVar, StringBuilder sb, int i2) {
        int i3;
        int i4;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzaduVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i3 = 3;
            if (i5 >= length) {
                break;
            }
            Method method3 = declaredMethods[i5];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i4 = i3;
            } else {
                i4 = i3;
                if (method2.getReturnType().equals(List.class)) {
                    m9608a(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), zzadu.m9562v(method2, zzaduVar, new Object[0]));
                }
                i3 = i4;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m9608a(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), zzadu.m9562v(method, zzaduVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM9562v = zzadu.m9562v(method4, zzaduVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) zzadu.m9562v(method5, zzaduVar, new Object[0])).booleanValue();
                    } else if (objM9562v instanceof Boolean) {
                        if (((Boolean) objM9562v).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objM9562v instanceof Integer) {
                        if (((Integer) objM9562v).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objM9562v instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objM9562v).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objM9562v instanceof Double)) {
                        if (objM9562v instanceof String) {
                            zEquals = objM9562v.equals("");
                        } else if (objM9562v instanceof zzacr) {
                            zEquals = objM9562v.equals(zzacr.f21972t);
                        } else if (!(objM9562v instanceof zzafc) ? !((objM9562v instanceof Enum) && ((Enum) objM9562v).ordinal() == 0) : objM9562v != ((zzafc) objM9562v).mo9565a()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objM9562v).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        m9608a(sb, i2, strSubstring, objM9562v);
                    }
                }
            }
            i3 = i4;
        }
        if (zzaduVar instanceof zzadr) {
            Iterator itM9543b = ((zzadr) zzaduVar).zzb.m9543b();
            if (itM9543b.hasNext()) {
                throw null;
            }
        }
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != null) {
            for (int i6 = 0; i6 < zzagaVar.f22122a; i6++) {
                m9608a(sb, i2, String.valueOf(zzagaVar.f22123b[i6] >>> 3), zzagaVar.f22124c[i6]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9610c(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f22073a, 0, i3);
            i2 -= i3;
        }
    }
}
