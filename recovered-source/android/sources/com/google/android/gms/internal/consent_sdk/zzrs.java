package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzrs {

    /* JADX INFO: renamed from: a */
    public static final char[] f21777a;

    static {
        char[] cArr = new char[80];
        f21777a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m9236a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m9236a(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9236a(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m9237b(i2, sb);
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
        if (obj instanceof String) {
            sb.append(": \"");
            zzpm zzpmVar = zzpm.f21713t;
            sb.append(zzsk.m9277a(new zzpk(((String) obj).getBytes(zzqs.f21747a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzpm) {
            sb.append(": \"");
            sb.append(zzsk.m9277a((zzpm) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzqm) {
            sb.append(" {");
            m9238c((zzqm) obj, sb, i2 + 2);
            sb.append("\n");
            m9237b(i2, sb);
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
        m9236a(sb, i4, "key", entry.getKey());
        m9236a(sb, i4, "value", entry.getValue());
        sb.append("\n");
        m9237b(i2, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static void m9237b(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f21777a, 0, i3);
            i2 -= i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX INFO: renamed from: c */
    public static void m9238c(zzqm zzqmVar, StringBuilder sb, int i2) {
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzqmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m9236a(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), zzqm.m9219h(method2, zzqmVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m9236a(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), zzqm.m9219h(method, zzqmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM9219h = zzqm.m9219h(method4, zzqmVar, new Object[0]);
                    if (method5 == null) {
                        if (objM9219h instanceof Boolean) {
                            if (((Boolean) objM9219h).booleanValue()) {
                                m9236a(sb, i2, strSubstring, objM9219h);
                            }
                        } else if (objM9219h instanceof Integer) {
                            if (((Integer) objM9219h).intValue() != 0) {
                                m9236a(sb, i2, strSubstring, objM9219h);
                            }
                        } else if (objM9219h instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM9219h).floatValue()) != 0) {
                                m9236a(sb, i2, strSubstring, objM9219h);
                            }
                        } else if (!(objM9219h instanceof Double)) {
                            if (objM9219h instanceof String) {
                                zEquals = objM9219h.equals("");
                            } else if (objM9219h instanceof zzpm) {
                                zEquals = objM9219h.equals(zzpm.f21713t);
                            } else if (objM9219h instanceof zzrq) {
                                if (objM9219h != ((zzrq) objM9219h).zzl()) {
                                    m9236a(sb, i2, strSubstring, objM9219h);
                                }
                            } else if (!(objM9219h instanceof Enum) || ((Enum) objM9219h).ordinal() != 0) {
                                m9236a(sb, i2, strSubstring, objM9219h);
                            }
                            if (!zEquals) {
                                m9236a(sb, i2, strSubstring, objM9219h);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM9219h).doubleValue()) != 0) {
                            m9236a(sb, i2, strSubstring, objM9219h);
                        }
                    } else if (((Boolean) zzqm.m9219h(method5, zzqmVar, new Object[0])).booleanValue()) {
                        m9236a(sb, i2, strSubstring, objM9219h);
                    }
                }
            }
            i3 = 3;
        }
        if (zzqmVar instanceof zzqk) {
            Iterator itM9212b = ((zzqk) zzqmVar).zzb.m9212b();
            if (itM9212b.hasNext()) {
                throw null;
            }
        }
    }
}
