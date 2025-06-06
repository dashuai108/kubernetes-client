
package io.fabric8.certmanager.api.model.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "crlDistributionPoints",
    "issuingCertificateURLs",
    "ocspServers",
    "secretName"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class CAIssuer implements Editable<CAIssuerBuilder>, KubernetesResource
{

    @JsonProperty("crlDistributionPoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> crlDistributionPoints = new ArrayList<>();
    @JsonProperty("issuingCertificateURLs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> issuingCertificateURLs = new ArrayList<>();
    @JsonProperty("ocspServers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> ocspServers = new ArrayList<>();
    @JsonProperty("secretName")
    private String secretName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CAIssuer() {
    }

    public CAIssuer(List<String> crlDistributionPoints, List<String> issuingCertificateURLs, List<String> ocspServers, String secretName) {
        super();
        this.crlDistributionPoints = crlDistributionPoints;
        this.issuingCertificateURLs = issuingCertificateURLs;
        this.ocspServers = ocspServers;
        this.secretName = secretName;
    }

    @JsonProperty("crlDistributionPoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getCrlDistributionPoints() {
        return crlDistributionPoints;
    }

    @JsonProperty("crlDistributionPoints")
    public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
        this.crlDistributionPoints = crlDistributionPoints;
    }

    @JsonProperty("issuingCertificateURLs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getIssuingCertificateURLs() {
        return issuingCertificateURLs;
    }

    @JsonProperty("issuingCertificateURLs")
    public void setIssuingCertificateURLs(List<String> issuingCertificateURLs) {
        this.issuingCertificateURLs = issuingCertificateURLs;
    }

    @JsonProperty("ocspServers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getOcspServers() {
        return ocspServers;
    }

    @JsonProperty("ocspServers")
    public void setOcspServers(List<String> ocspServers) {
        this.ocspServers = ocspServers;
    }

    @JsonProperty("secretName")
    public String getSecretName() {
        return secretName;
    }

    @JsonProperty("secretName")
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    @JsonIgnore
    public CAIssuerBuilder edit() {
        return new CAIssuerBuilder(this);
    }

    @JsonIgnore
    public CAIssuerBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
