package p034T;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.G0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0652G0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f1457a = Logger.getLogger(AbstractC0652G0.class.getName());

    /* JADX INFO: renamed from: a */
    public static Object m1504a(JsonReader jsonReader) throws IOException {
        AbstractC0076b.m139n(jsonReader.hasNext(), "unexpected end of JSON");
        switch (AbstractC0649F0.f1443a[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(m1504a(jsonReader));
                }
                AbstractC0076b.m139n(jsonReader.peek() == JsonToken.END_ARRAY, "Bad token: " + jsonReader.getPath());
                jsonReader.endArray();
                return Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), m1504a(jsonReader));
                }
                AbstractC0076b.m139n(jsonReader.peek() == JsonToken.END_OBJECT, "Bad token: " + jsonReader.getPath());
                jsonReader.endObject();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException("Bad token: " + jsonReader.getPath());
        }
    }
}
