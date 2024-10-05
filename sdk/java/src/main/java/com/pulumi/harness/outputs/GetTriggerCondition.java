// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.outputs.GetTriggerConditionOnWebhook;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTriggerCondition {
    /**
     * @return On webhook.
     * 
     */
    private List<GetTriggerConditionOnWebhook> onWebhooks;
    /**
     * @return Trigger condition.
     * 
     */
    private String triggerConditionType;

    private GetTriggerCondition() {}
    /**
     * @return On webhook.
     * 
     */
    public List<GetTriggerConditionOnWebhook> onWebhooks() {
        return this.onWebhooks;
    }
    /**
     * @return Trigger condition.
     * 
     */
    public String triggerConditionType() {
        return this.triggerConditionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTriggerConditionOnWebhook> onWebhooks;
        private String triggerConditionType;
        public Builder() {}
        public Builder(GetTriggerCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onWebhooks = defaults.onWebhooks;
    	      this.triggerConditionType = defaults.triggerConditionType;
        }

        @CustomType.Setter
        public Builder onWebhooks(List<GetTriggerConditionOnWebhook> onWebhooks) {
            if (onWebhooks == null) {
              throw new MissingRequiredPropertyException("GetTriggerCondition", "onWebhooks");
            }
            this.onWebhooks = onWebhooks;
            return this;
        }
        public Builder onWebhooks(GetTriggerConditionOnWebhook... onWebhooks) {
            return onWebhooks(List.of(onWebhooks));
        }
        @CustomType.Setter
        public Builder triggerConditionType(String triggerConditionType) {
            if (triggerConditionType == null) {
              throw new MissingRequiredPropertyException("GetTriggerCondition", "triggerConditionType");
            }
            this.triggerConditionType = triggerConditionType;
            return this;
        }
        public GetTriggerCondition build() {
            final var _resultValue = new GetTriggerCondition();
            _resultValue.onWebhooks = onWebhooks;
            _resultValue.triggerConditionType = triggerConditionType;
            return _resultValue;
        }
    }
}