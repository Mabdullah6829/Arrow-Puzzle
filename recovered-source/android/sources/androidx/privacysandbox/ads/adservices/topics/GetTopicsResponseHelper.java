package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC1632b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class GetTopicsResponseHelper {
    public static final GetTopicsResponseHelper INSTANCE = new GetTopicsResponseHelper();

    private GetTopicsResponseHelper() {
    }

    public final GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        AbstractC6452k.m12181e(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicM2634r = AbstractC1632b.m2634r(it.next());
            arrayList.add(new Topic(topicM2634r.getTaxonomyVersion(), topicM2634r.getModelVersion(), topicM2634r.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    @ExperimentalFeatures.Ext11OptIn
    public final GetTopicsResponse convertResponseWithEncryptedTopics$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        AbstractC6452k.m12181e(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicM2634r = AbstractC1632b.m2634r(it.next());
            arrayList.add(new Topic(topicM2634r.getTaxonomyVersion(), topicM2634r.getModelVersion(), topicM2634r.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            android.adservices.topics.EncryptedTopic encryptedTopicM2646d = AbstractC1634a.m2646d(it2.next());
            byte[] encryptedTopic = encryptedTopicM2646d.getEncryptedTopic();
            AbstractC6452k.m12180d(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicM2646d.getKeyIdentifier();
            AbstractC6452k.m12180d(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicM2646d.getEncapsulatedKey();
            AbstractC6452k.m12180d(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new EncryptedTopic(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new GetTopicsResponse(arrayList, arrayList2);
    }
}
