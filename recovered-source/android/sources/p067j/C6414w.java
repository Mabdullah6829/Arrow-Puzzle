package p067j;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: j.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6414w {

    /* JADX INFO: renamed from: a */
    public final long f24551a;

    public C6414w(long j2) {
        this.f24551a = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C6414w m12163a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C6414w c6414w = new C6414w(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c6414w;
                    }
                    C6414w c6414w2 = new C6414w(jsonReader.nextLong());
                    jsonReader.close();
                    return c6414w2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6414w) && this.f24551a == ((C6414w) obj).f24551a;
    }

    public final int hashCode() {
        long j2 = this.f24551a;
        return ((int) ((j2 >>> 32) ^ j2)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f24551a + "}";
    }
}
