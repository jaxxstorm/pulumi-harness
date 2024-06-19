// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class SloRequestNotificationRuleRefArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloRequestNotificationRuleRefArgs Empty = new SloRequestNotificationRuleRefArgs();

    /**
     * Enable or disable notification rule reference for the SLO.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable or disable notification rule reference for the SLO.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Notification rule reference for the SLO.
     * 
     */
    @Import(name="notificationRuleRef", required=true)
    private Output<String> notificationRuleRef;

    /**
     * @return Notification rule reference for the SLO.
     * 
     */
    public Output<String> notificationRuleRef() {
        return this.notificationRuleRef;
    }

    private SloRequestNotificationRuleRefArgs() {}

    private SloRequestNotificationRuleRefArgs(SloRequestNotificationRuleRefArgs $) {
        this.enabled = $.enabled;
        this.notificationRuleRef = $.notificationRuleRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloRequestNotificationRuleRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloRequestNotificationRuleRefArgs $;

        public Builder() {
            $ = new SloRequestNotificationRuleRefArgs();
        }

        public Builder(SloRequestNotificationRuleRefArgs defaults) {
            $ = new SloRequestNotificationRuleRefArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable or disable notification rule reference for the SLO.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable or disable notification rule reference for the SLO.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param notificationRuleRef Notification rule reference for the SLO.
         * 
         * @return builder
         * 
         */
        public Builder notificationRuleRef(Output<String> notificationRuleRef) {
            $.notificationRuleRef = notificationRuleRef;
            return this;
        }

        /**
         * @param notificationRuleRef Notification rule reference for the SLO.
         * 
         * @return builder
         * 
         */
        public Builder notificationRuleRef(String notificationRuleRef) {
            return notificationRuleRef(Output.of(notificationRuleRef));
        }

        public SloRequestNotificationRuleRefArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("SloRequestNotificationRuleRefArgs", "enabled");
            }
            if ($.notificationRuleRef == null) {
                throw new MissingRequiredPropertyException("SloRequestNotificationRuleRefArgs", "notificationRuleRef");
            }
            return $;
        }
    }

}
