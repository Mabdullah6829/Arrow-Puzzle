package com.google.android.gms.internal.ads;

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
final class zzigb {

    /* JADX INFO: renamed from: a */
    public static final char[] f19840a;

    static {
        char[] cArr = new char[80];
        f19840a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m8370a(StringBuilder sb, int i2, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8370a(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8370a(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m8372c(i2, sb);
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
            if (obj instanceof zzidl) {
                sb.append(": \"");
                sb.append(zzigz.m8442a(((zzidl) obj).m8151a()));
                sb.append('\"');
                return;
            }
            if (obj instanceof zziep) {
                sb.append(" {");
                m8371b((zziep) obj, sb, i2 + 2);
                sb.append("\n");
                m8372c(i2, sb);
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
            m8370a(sb, i4, "key", entry.getKey());
            m8370a(sb, i4, "value", entry.getValue());
            sb.append("\n");
            m8372c(i2, sb);
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
                strReplace = zzigz.m8442a(strReplace2.getBytes(StandardCharsets.UTF_8));
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
    public static void m8371b(zziep zziepVar, StringBuilder sb, int i2) {
        int i3;
        int i4;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zziepVar.getClass().getDeclaredMethods();
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
                    m8370a(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), zziep.m8333q(method2, zziepVar, new Object[0]));
                }
                i3 = i4;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m8370a(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), zziep.m8333q(method, zziepVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM8333q = zziep.m8333q(method4, zziepVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) zziep.m8333q(method5, zziepVar, new Object[0])).booleanValue();
                    } else if (objM8333q instanceof Boolean) {
                        if (((Boolean) objM8333q).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objM8333q instanceof Integer) {
                        if (((Integer) objM8333q).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objM8333q instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objM8333q).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objM8333q instanceof Double)) {
                        if (objM8333q instanceof String) {
                            zEquals = objM8333q.equals("");
                        } else if (objM8333q instanceof zzidl) {
                            zEquals = objM8333q.equals(zzidl.f19719t);
                        } else if (!(objM8333q instanceof zzifz) ? !((objM8333q instanceof Enum) && ((Enum) objM8333q).ordinal() == 0) : objM8333q != ((zzifz) objM8333q).mo8340b()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objM8333q).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        m8370a(sb, i2, strSubstring, objM8333q);
                    }
                }
            }
            i3 = i4;
        }
        if (zziepVar instanceof zziel) {
            Iterator itM8313b = ((zziel) zziepVar).zza.m8313b();
            while (itM8313b.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM8313b.next();
                ((zziem) entry2.getKey()).getClass();
                StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 2);
                sb2.append("[0]");
                m8370a(sb, i2, sb2.toString(), entry2.getValue());
            }
        }
        zzihe zziheVar = zziepVar.zzt;
        if (zziheVar != null) {
            for (int i6 = 0; i6 < zziheVar.f19897a; i6++) {
                m8370a(sb, i2, String.valueOf(zziheVar.f19898b[i6] >>> 3), zziheVar.f19899c[i6]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8372c(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f19840a, 0, i3);
            i2 -= i3;
        }
    }
}
