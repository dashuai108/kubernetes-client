
package io.fabric8.kubernetes.api.model;

import java.util.LinkedHashMap;
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
import io.sundr.builder.annotations.Buildable;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hard",
    "used"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder")
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class ResourceQuotaStatus implements Editable<ResourceQuotaStatusBuilder>, KubernetesResource
{

    @JsonProperty("hard")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Quantity> hard = new LinkedHashMap<>();
    @JsonProperty("used")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Quantity> used = new LinkedHashMap<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceQuotaStatus() {
    }

    public ResourceQuotaStatus(Map<String, Quantity> hard, Map<String, Quantity> used) {
        super();
        this.hard = hard;
        this.used = used;
    }

    @JsonProperty("hard")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, Quantity> getHard() {
        return hard;
    }

    @JsonProperty("hard")
    public void setHard(Map<String, Quantity> hard) {
        this.hard = hard;
    }

    @JsonProperty("used")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, Quantity> getUsed() {
        return used;
    }

    @JsonProperty("used")
    public void setUsed(Map<String, Quantity> used) {
        this.used = used;
    }

    @JsonIgnore
    public ResourceQuotaStatusBuilder edit() {
        return new ResourceQuotaStatusBuilder(this);
    }

    @JsonIgnore
    public ResourceQuotaStatusBuilder toBuilder() {
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
